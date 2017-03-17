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

    // скролл для панели ввода данных
    public static JScrollPane panelInputScroll;

    // панель коробка для панели ввода со скролом и панели вывода
    public static JPanel boxInOut;

    // конструктор панелей
    public Panels() {

        // инициализация панелей
        panelMenu = new JPanel();
        panelInput = new JPanel();
        panelOutput = new JPanel();
//        System.out.println("Инициализация панелей.");

        // скролл для панели ввода
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

        // скролл только по вертикали
        panelInputScroll.setHorizontalScrollBarPolicy(panelInputScroll.HORIZONTAL_SCROLLBAR_NEVER);

        // компановка в коробке для панелей ввода вывода
        boxInOut.setLayout(new BorderLayout());

        // установка размеров панелей
        setSize(MainFrame.WIDTH_DEFAULT, WIDTH_PANEL_MENU,WIDTH_PANEL_INPUT);

        // установка фона панелей
        setColorDefault();
    }

    // функция установки цвета фона
    private void setColorDefault() {
        panelMenu.setBackground(Color.WHITE);
        panelInput.setBackground(Color.GRAY);
        panelOutput.setBackground(Color.DARK_GRAY);
    }

    // функция установки размеров панелей
    public void setSize(int width, int widthMenu, int widthPanelInput) {

        // размеры панели меню
        panelMenu.setMinimumSize(new Dimension(widthMenu,-1));
        panelMenu.setPreferredSize(new Dimension(widthMenu,-1));
        System.out.println("Ширина панели меню "+widthMenu);

        // размеры панели ввода данных
        panelInput.setPreferredSize(new Dimension(widthPanelInput,-1));
        System.out.println("Ширина панели ввода "+widthPanelInput);

        // размеры панели вывода данных
        panelOutput.setMinimumSize(new Dimension(width-widthMenu-widthPanelInput-40,-1));
        panelOutput.setPreferredSize(new Dimension(width-widthMenu-widthPanelInput-40,-1));
        System.out.println("Ширина панели вывода "+(width-widthMenu-widthPanelInput-40));
    }

    // функция добавления панелей на главный фрейм
    public void addToFrame(JFrame frame) {

        // добавляем панель меню на главный фрейм
        frame.add(panelMenu, BorderLayout.WEST);

        // добавляем коробку из панелей ввода и вывода на главный фрейм
        frame.add(boxInOut, BorderLayout.CENTER);

        // добавляем в панели коробки панели ввода и вывода
        boxInOut.add(panelInputScroll, BorderLayout.WEST);
        boxInOut.add(panelOutput, BorderLayout.CENTER);

        // оптимизируем расположение
//        frame.pack();
    }
}
