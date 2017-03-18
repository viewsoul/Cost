package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.11.2016.
 */

public class MainFrame {

    static int WIDTH_DEFAULT   = 1000;
    static int HEIGHT_DEFAULT  = 600;
    static JFrame frame;

    // конструктор окна
    MainFrame() {
        // инициализация фрейма
        frame = new JFrame();
    }

    void settingsDefault() {
        // установка заголовка окна
        frame.setTitle("Прайс-лист");

        // установка размеров окна
        setNewSize(WIDTH_DEFAULT, HEIGHT_DEFAULT);

        // схема расположения элементов на фрейме
        frame.setLayout(new BorderLayout());

        // действие по кнопке крестик
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // размещение окна в центре экрана
        frame.setLocationRelativeTo(null);

        // отобразить окно
        frame.setVisible(true);
    }

    private void setNewSize(int width, int height){
        Dimension size = new Dimension(width,height);
        frame.setSize(size);
        frame.setMinimumSize(size);
        frame.setPreferredSize(size);
//        frame.setMaximumSize(size);
    }
}
