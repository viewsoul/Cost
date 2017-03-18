package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.11.2016.
 */
class ButtonsController {

    private static final int SIZE_BORDER_WIDTH = 5;
    private static final int SIZE_BORDER_HEIGHT = 5;
    private static final int HEIGHT_BUTTON_DEFAULT = 33;
    private static final int WIDTH_BUTTON_DEFAULT = Panels.WIDTH_PANEL_MENU - 2*SIZE_BORDER_WIDTH;

    // функция добавляет и настраивает кнопки на панели меню
    void add(JPanel panel) {

        // для каждой кнопки
        for (Buttons buttons : Buttons.values()){
            // применить настройки кнопки по умолчанию
            settingDefault(buttons);
            // добавить кнопку на панель
            panel.add(buttons.getButton());
        }

        // настройки скролла
        settingScroll(panel);
    }

    // проверить нужен ли скролл для кнопок меню
    private static void settingScroll(JPanel panel) {

        // количество отображваемых кнопок
        int count = 0;

        // рассчитываем количество отображвемых кнопок
        for (Buttons buttons : Buttons.values()){
            if (buttons.getButton().isVisible()) {
                count++;
            }
        }

        // рассчитываем необходимую высоту панели меню
        int height = (HEIGHT_BUTTON_DEFAULT+SIZE_BORDER_HEIGHT)*count+SIZE_BORDER_HEIGHT;

        // текущая ширина панели, она же необходимая
        int width = (int) panel.getPreferredSize().getWidth();

        // устанавливаем небходимые высоту и ширину панели
        panel.setPreferredSize(new Dimension(width,height));

        // текущая высота фрейма
        int heightFrame = (int)MainFrame.frame.getPreferredSize().getHeight();

        // необходимый размер плюс одна несуществующая кнопка (для скролла)
        int heightWithScroll = height+HEIGHT_BUTTON_DEFAULT;

        // сравним текщую высоту фрейма с необходимым размером + одна кнопка
        if (heightFrame<=heightWithScroll){
            // скролл надо
            Panels.panelMenuScroll.setVerticalScrollBarPolicy(Panels.panelMenuScroll.VERTICAL_SCROLLBAR_AS_NEEDED);
        }
        else {
            // скролл ненадо
            Panels.panelMenuScroll.setVerticalScrollBarPolicy(Panels.panelMenuScroll.VERTICAL_SCROLLBAR_NEVER);
        }
    }

    // функция устанавливает настройки по умолчанию
    private void settingDefault(Buttons buttons) {

            // даём названия
            buttons.getButton().setText(buttons.getTitle());

            // меняем курсор на сфокусированной кнопке
            buttons.getButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // отключаем фокус с нажатой кнопки
            buttons.getButton().setFocusPainted(false);

            // отключаем обводки кнопок
            buttons.getButton().setBorderPainted(false);

            // настройки для главных и свёрнутых кнопок
            if (buttons.getBranch()==1) {
                // устанавливаем цвет фона и текста на главные кнопки
                buttons.getButton().setBackground(new Color(74,130,187));
                buttons.getButton().setForeground(Color.white);//
            } else if (buttons.getBranch()==2) {
                // устанавливаем цвет фона и текста на дополнительные кнопки
                buttons.getButton().setBackground(new Color(220,222,225));
                buttons.getButton().setForeground(new Color(50,50,50));

                // свернуть кнопки
                buttons.getButton().setVisible(false);
            }

            // устанавливаем размер кнопок
            buttons.getButton().setPreferredSize(new Dimension(WIDTH_BUTTON_DEFAULT, HEIGHT_BUTTON_DEFAULT));

            // слушатель клика по кнопке
            buttons.getButton().addActionListener(new ClickButtons());

    }

    // функция сворачивает или разворачивает меню кнопок решёток перфорировнных
    static void setVisibleReshetkiPerfo() {

        // кнопки свёрнутые или нет
        boolean b = !Buttons.RESH_PERFO_VSTR.getButton().isVisible();

        // устанавливаем видимость
        Buttons.RESH_PERFO_VSTR.getButton().setVisible(b);
        Buttons.RESH_PERFO_NAKL.getButton().setVisible(b);
        Buttons.RESH_PERFO_PL.getButton().setVisible(b);
        Buttons.RESH_PERFO_PL_SPOD.getButton().setVisible(b);
        Buttons.RESH_PERFO_VIPKL.getButton().setVisible(b);

        // проверить нужен ли скролл
        settingScroll(Panels.panelMenu);

    }

    // функция сворачивает или разворачивает меню кнопок люков
    static void setVisibleHatch() {

        // кнопки свёрнутые или нет
        boolean b = !Buttons.HATCH_VSTR.getButton().isVisible();

        // устанавливаем видимость
        Buttons.HATCH_VSTR.getButton().setVisible(b);
        Buttons.HATCH_NAKL.getButton().setVisible(b);

        // проверить нужен ли скролл
        settingScroll(Panels.panelMenu);
    }

    // функция сворачивает или разворачивает меню кнопок коробов
    static void setVisibleKorob() {

        // кнопки свёрнутые или нет
        boolean b = !Buttons.KOROB_G.getButton().isVisible();

        // устанавливаем видимость
        Buttons.KOROB_G.getButton().setVisible(b);
        Buttons.KOROB_P.getButton().setVisible(b);

        // проверить нужен ли скролл
        settingScroll(Panels.panelMenu);
    }

    // функция сворачивает или разворачивает меню кнопок решёток жалюзийных
    static void setVisibleReshetkiZaluz() {

        // кнопки свёрнутые или нет
        boolean b = !Buttons.RESH_ZALUZ_VSTR.getButton().isVisible();

        // устанавливаем видимость
        Buttons.RESH_ZALUZ_VSTR.getButton().setVisible(b);
        Buttons.RESH_ZALUZ_NAKL.getButton().setVisible(b);

        // проверить нужен ли скролл
        settingScroll(Panels.panelMenu);
    }

    // функция сворачивает или разворачивает меню кнопок люков перфорированных
    static void setVisibleHatchPerfo() {

        // кнопки свёрнутые или нет
        boolean b = !Buttons.HATCH_PERFO_VSTR.getButton().isVisible();

        // устанавливаем видимость
        Buttons.HATCH_PERFO_VSTR.getButton().setVisible(b);
        Buttons.HATCH_PERFO_NAKL.getButton().setVisible(b);

        // проверить нужен ли скролл
        settingScroll(Panels.panelMenu);
    }
}