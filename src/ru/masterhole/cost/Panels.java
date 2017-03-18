package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.11.2016.
 */
public class Panels {

    // размер панели меню
    public static final int WIDTH_PANEL_MENU = 240;
    public static final int WIDTH_PANEL_INPUT = 480;

    // панели меню, ввода и вывода данных
    public static JPanel panelMenu;
    public static JPanel panelInput;
    public static JPanel panelOutput;

    // скролл для панели меню и ввода данных
    public static JScrollPane panelMenuScroll;
    public static JScrollPane panelInputScroll;

    // панель коробка для панели ввода со скролом и панели вывода
    public static JPanel boxInOut;

    // конструктор панелей
    Panels() {

        // инициализация панелей
        panelMenu = new JPanel();
        panelInput = new JPanel();
        panelOutput = new JPanel();
//        System.out.println("Инициализация панелей.");

        // добавляем скроллы
        panelMenuScroll = new JScrollPane(panelMenu);
        panelInputScroll = new JScrollPane(panelInput);

        // панель-корбка для панелей ввода вывода
        boxInOut = new JPanel();
    }

    // функция загрузки настроек панелей
    public void loadDefaultSettings() {

        // схема компановки элементов
        panelMenu.setLayout(new FlowLayout());
        panelInput.setLayout(new FlowLayout());
        panelOutput.setLayout(new FlowLayout());

        // компановка в коробке для панелей ввода вывода
        boxInOut.setLayout(new BorderLayout());

        // установка размеров панелей
        setSize(MainFrame.WIDTH_DEFAULT, WIDTH_PANEL_MENU,WIDTH_PANEL_INPUT);

        // скролл только по вертикали
        Panels.panelInputScroll.setHorizontalScrollBarPolicy(Panels.panelInputScroll.HORIZONTAL_SCROLLBAR_NEVER);
        Panels.panelInputScroll.setVerticalScrollBarPolicy(Panels.panelInputScroll.VERTICAL_SCROLLBAR_AS_NEEDED);
        Panels.panelMenuScroll.setHorizontalScrollBarPolicy(Panels.panelMenuScroll.HORIZONTAL_SCROLLBAR_NEVER);

        // установка фона панелей
        panelMenu.setBackground(Color.WHITE);
        panelInput.setBackground(Color.GRAY);
        panelOutput.setBackground(Color.DARK_GRAY);
    }

    // функция установки размеров панелей
    private void setSize(int width, int widthMenu, int widthPanelInput) {

        // размеры панели меню
        panelMenu.setPreferredSize(new Dimension(widthMenu,MainFrame.HEIGHT_DEFAULT));

        // размеры панели ввода данных
        panelInput.setPreferredSize(new Dimension(widthPanelInput,MainFrame.HEIGHT_DEFAULT));

        // размеры панели вывода данных
        panelOutput.setPreferredSize(new Dimension(width-widthMenu-widthPanelInput-40,MainFrame.HEIGHT_DEFAULT));
    }

    // функция добавления панелей на главный фрейм
    void add(JFrame frame) {

        // добавляем панель меню на главный фрейм
        frame.add(panelMenuScroll, BorderLayout.WEST);

        // добавляем коробку из панелей ввода и вывода на главный фрейм
        frame.add(boxInOut, BorderLayout.CENTER);

        // добавляем в панели коробки панели ввода и вывода
        boxInOut.add(panelInputScroll, BorderLayout.WEST);
        boxInOut.add(panelOutput, BorderLayout.CENTER);
    }
}
