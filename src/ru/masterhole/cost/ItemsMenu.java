package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.11.2016.
 */
public class ItemsMenu {

    public static final int HEIGHT_BUTTON_DEFAULT = 33;
    public static final int WIDTH_BUTTON_DEFAULT = Panels.WIDTH_PANEL_MENU - 10;

    // список кнопок меню
    public static Map<String, JButton> buttonsMenu;

    // конструктор элементов меню
    public ItemsMenu() {

        // инициализация списка кнопок
        buttonsMenu = new HashMap<String, JButton>();

        // кладём кнопки в список элементов
        putButtonsToMap();
    }

    // функция устанавливает настройки по умолчанию
    public void loadDefaultSettings() {

        // отключаем фокус с нажатой кнопки
        offFocus(false);

        // отключить или включить обводки кнопок
        offBorderMainButton(false);
        offBorderOtherButton(false);

        // меняем курсор на сфокусированной кнопке
        setCursor();

        // уставнока цвета фона и надписей главных кнопок меню
        setColorMainButton(new Color(74,130,187),Color.white);
        setColorOtherButton(new Color(220,222,225),new Color(50,50,50));

        // установка предпочитаемого размера кнопок
        setPreferredSize(WIDTH_BUTTON_DEFAULT, HEIGHT_BUTTON_DEFAULT);

        // слушатель клика по кнопке
        addActionListener();
    }

    // функция меняет курсор при наведении на кнопку
    private void setCursor() {

        // устанавить для всех кнопок
        for (String key : buttonsMenu.keySet()){
            buttonsMenu.get(key).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }

    // функция отключает фокус нажатой кнопки
    private void offFocus(boolean choice) {

        // устанавить для всех кнопок
        for (String key : buttonsMenu.keySet()){
            buttonsMenu.get(key).setFocusPainted(choice);
        }
    }

    // функция отключает обводку главных кнопок
    private void offBorderMainButton(boolean choice) {
        buttonsMenu.get("Экраны").setBorderPainted(choice);
        buttonsMenu.get("Решётки перфорированные").setBorderPainted(choice);
        buttonsMenu.get("Люки").setBorderPainted(choice);
        buttonsMenu.get("Короба").setBorderPainted(choice);
        buttonsMenu.get("Решётки жалюзийные").setBorderPainted(choice);
        buttonsMenu.get("Люки перфорированные").setBorderPainted(choice);
    }

    // функция отключает обводку дополнительных кнопок
    private void offBorderOtherButton(boolean choice) {
        buttonsMenu.get("Решётки перфорированные встраиваемые").setBorderPainted(choice);
        buttonsMenu.get("Решётки перфорированные накладные").setBorderPainted(choice);
        buttonsMenu.get("Решётки перфорированные плоские").setBorderPainted(choice);
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setBorderPainted(choice);
        buttonsMenu.get("Решётки перфорированные выпуклые").setBorderPainted(choice);
        buttonsMenu.get("Люки встраиваемые").setBorderPainted(choice);
        buttonsMenu.get("Люки накладные").setBorderPainted(choice);
        buttonsMenu.get("Короба Г").setBorderPainted(choice);
        buttonsMenu.get("Короба П").setBorderPainted(choice);
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setBorderPainted(choice);
        buttonsMenu.get("Решётки жалюзийные накладные").setBorderPainted(choice);
        buttonsMenu.get("Люки перфорированные встраиваемые").setBorderPainted(choice);
        buttonsMenu.get("Люки перфорированные накладные").setBorderPainted(choice);
    }

    // функция добавляет кнопки в список кнопок
    private void putButtonsToMap() {
        buttonsMenu.put("Экраны", new JButton("Экраны для батарей"));

        buttonsMenu.put("Решётки перфорированные", new JButton("Решётки перфорированные"));
        buttonsMenu.put("Решётки перфорированные встраиваемые", new JButton("Встраиваемая"));
        buttonsMenu.put("Решётки перфорированные накладные", new JButton("Накладная"));
        buttonsMenu.put("Решётки перфорированные плоские", new JButton("Плоская"));
        buttonsMenu.put("Решётки перфорированные плоские с подгибом", new JButton("Плоская с подгибом"));
        buttonsMenu.put("Решётки перфорированные выпуклые", new JButton("Выпуклая"));

        buttonsMenu.put("Люки", new JButton("Люки ревизионные"));
        buttonsMenu.put("Люки встраиваемые", new JButton("Встраиваемый"));
        buttonsMenu.put("Люки накладные", new JButton("Накладной"));

        buttonsMenu.put("Короба", new JButton("Короба"));
        buttonsMenu.put("Короба Г", new JButton("Г-образный"));
        buttonsMenu.put("Короба П", new JButton("П-образный"));

        buttonsMenu.put("Решётки жалюзийные", new JButton("Решётки жалюзийные"));
        buttonsMenu.put("Решётки жалюзийные встраиваемые", new JButton("Встраиваемая"));
        buttonsMenu.put("Решётки жалюзийные накладные", new JButton("Накладная"));

        buttonsMenu.put("Люки перфорированные", new JButton("Люки перфорированные"));
        buttonsMenu.put("Люки перфорированные встраиваемые", new JButton("Встраиваемая"));
        buttonsMenu.put("Люки перфорированные накладные", new JButton("Накладная"));
    }

    // функция устанавливает цвет надписей и фона основных кнопок меню
    private void setColorMainButton(Color background, Color foreground) {
        buttonsMenu.get("Экраны").setBackground(background);
        buttonsMenu.get("Экраны").setForeground(foreground);
        buttonsMenu.get("Решётки перфорированные").setBackground(background);
        buttonsMenu.get("Решётки перфорированные").setForeground(foreground);
        buttonsMenu.get("Люки").setBackground(background);
        buttonsMenu.get("Люки").setForeground(foreground);
        buttonsMenu.get("Короба").setBackground(background);
        buttonsMenu.get("Короба").setForeground(foreground);
        buttonsMenu.get("Решётки жалюзийные").setBackground(background);
        buttonsMenu.get("Решётки жалюзийные").setForeground(foreground);
        buttonsMenu.get("Люки перфорированные").setBackground(background);
        buttonsMenu.get("Люки перфорированные").setForeground(foreground);
    }

    // функция устанавливает цвет надписей и фона основных кнопок меню
    private void setColorOtherButton(Color background, Color foreground) {

        // фон
        buttonsMenu.get("Решётки перфорированные встраиваемые").setBackground(background);
        buttonsMenu.get("Решётки перфорированные накладные").setBackground(background);
        buttonsMenu.get("Решётки перфорированные плоские").setBackground(background);
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setBackground(background);
        buttonsMenu.get("Решётки перфорированные выпуклые").setBackground(background);
        buttonsMenu.get("Люки встраиваемые").setBackground(background);
        buttonsMenu.get("Люки накладные").setBackground(background);
        buttonsMenu.get("Короба Г").setBackground(background);
        buttonsMenu.get("Короба П").setBackground(background);
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setBackground(background);
        buttonsMenu.get("Решётки жалюзийные накладные").setBackground(background);
        buttonsMenu.get("Люки перфорированные встраиваемые").setBackground(background);
        buttonsMenu.get("Люки перфорированные накладные").setBackground(background);

        // текст
        buttonsMenu.get("Решётки перфорированные встраиваемые").setForeground(foreground);
        buttonsMenu.get("Решётки перфорированные накладные").setForeground(foreground);
        buttonsMenu.get("Решётки перфорированные плоские").setForeground(foreground);
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setForeground(foreground);
        buttonsMenu.get("Решётки перфорированные выпуклые").setForeground(foreground);
        buttonsMenu.get("Люки встраиваемые").setForeground(foreground);
        buttonsMenu.get("Люки накладные").setForeground(foreground);
        buttonsMenu.get("Короба Г").setForeground(foreground);
        buttonsMenu.get("Короба П").setForeground(foreground);
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setForeground(foreground);
        buttonsMenu.get("Решётки жалюзийные накладные").setForeground(foreground);
        buttonsMenu.get("Люки перфорированные встраиваемые").setForeground(foreground);
        buttonsMenu.get("Люки перфорированные накладные").setForeground(foreground);
    }

    // функция слушателя клика по кнопке
    private void addActionListener() {
        for (String key : buttonsMenu.keySet()){
            buttonsMenu.get(key).addActionListener(new ClickButton());
        }
    }

    // функция добвляем кнопки на панель меню, скрывает невидимые кнопки
    public void addItemsToPanel(JPanel panel) {

        // добавляем кнопки
        panel.add(buttonsMenu.get("Экраны"));
        panel.add(buttonsMenu.get("Решётки перфорированные"));
        panel.add(buttonsMenu.get("Решётки перфорированные встраиваемые"));
        panel.add(buttonsMenu.get("Решётки перфорированные накладные"));
        panel.add(buttonsMenu.get("Решётки перфорированные плоские"));
        panel.add(buttonsMenu.get("Решётки перфорированные плоские с подгибом"));
        panel.add(buttonsMenu.get("Решётки перфорированные выпуклые"));
        panel.add(buttonsMenu.get("Люки"));
        panel.add(buttonsMenu.get("Люки встраиваемые"));
        panel.add(buttonsMenu.get("Люки накладные"));
        panel.add(buttonsMenu.get("Короба"));
        panel.add(buttonsMenu.get("Короба Г"));
        panel.add(buttonsMenu.get("Короба П"));
        panel.add(buttonsMenu.get("Решётки жалюзийные"));
        panel.add(buttonsMenu.get("Решётки жалюзийные встраиваемые"));
        panel.add(buttonsMenu.get("Решётки жалюзийные накладные"));
        panel.add(buttonsMenu.get("Люки перфорированные"));
        panel.add(buttonsMenu.get("Люки перфорированные встраиваемые"));
        panel.add(buttonsMenu.get("Люки перфорированные накладные"));

        // скрываем свёрнутые кнопки
        buttonsMenu.get("Решётки перфорированные встраиваемые").setVisible(false);
        buttonsMenu.get("Решётки перфорированные накладные").setVisible(false);
        buttonsMenu.get("Решётки перфорированные плоские").setVisible(false);
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setVisible(false);
        buttonsMenu.get("Решётки перфорированные выпуклые").setVisible(false);
        buttonsMenu.get("Люки встраиваемые").setVisible(false);
        buttonsMenu.get("Люки накладные").setVisible(false);
        buttonsMenu.get("Короба Г").setVisible(false);
        buttonsMenu.get("Короба П").setVisible(false);
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setVisible(false);
        buttonsMenu.get("Решётки жалюзийные накладные").setVisible(false);
        buttonsMenu.get("Люки перфорированные встраиваемые").setVisible(false);
        buttonsMenu.get("Люки перфорированные накладные").setVisible(false);
    }

    // функция устанавливает размер кнопок
    private void setPreferredSize(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : buttonsMenu.keySet()){
            buttonsMenu.get(key).setPreferredSize(size);
        }
    }

    // функция сворачивает или разворачивает меню кнопок решёток перфорировнных
    public static void setVisibleReshetkiPerfo() {

        // кнопки свёрнутые или нет
        boolean b = !buttonsMenu.get("Решётки перфорированные встраиваемые").isVisible();

        // устанавливаем видимость
        buttonsMenu.get("Решётки перфорированные встраиваемые").setVisible(b);
        buttonsMenu.get("Решётки перфорированные накладные").setVisible(b);
        buttonsMenu.get("Решётки перфорированные плоские").setVisible(b);
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setVisible(b);
        buttonsMenu.get("Решётки перфорированные выпуклые").setVisible(b);
    }

    // функция сворачивает или разворачивает меню кнопок люков
    public static void setVisibleHatch() {

        // кнопки свёрнутые или нет
        boolean b = !buttonsMenu.get("Люки встраиваемые").isVisible();

        // устанавливаем видимость
        buttonsMenu.get("Люки встраиваемые").setVisible(b);
        buttonsMenu.get("Люки накладные").setVisible(b);
    }

    // функция сворачивает или разворачивает меню кнопок коробов
    public static void setVisibleKorob() {

        // кнопки свёрнутые или нет
        boolean b = !buttonsMenu.get("Короба Г").isVisible();

        // устанавливаем видимость
        buttonsMenu.get("Короба Г").setVisible(b);
        buttonsMenu.get("Короба П").setVisible(b);
    }

    // функция сворачивает или разворачивает меню кнопок решёток жалюзийных
    public static void setVisibleReshetkiZaluz() {

        // кнопки свёрнутые или нет
        boolean b = !buttonsMenu.get("Решётки жалюзийные встраиваемые").isVisible();

        // устанавливаем видимость
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setVisible(b);
        buttonsMenu.get("Решётки жалюзийные накладные").setVisible(b);
    }

    // функция сворачивает или разворачивает меню кнопок люков перфорированных
    public static void setVisibleHatchPerfo() {

        // кнопки свёрнутые или нет
        boolean b = !buttonsMenu.get("Люки перфорированные встраиваемые").isVisible();

        // устанавливаем видимость
        buttonsMenu.get("Люки перфорированные встраиваемые").setVisible(b);
        buttonsMenu.get("Люки перфорированные накладные").setVisible(b);
    }
}
