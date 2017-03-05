package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;

/**
 * Created by viewsoul on 09.11.2016.
 */
public class Window extends JFrame{

    public static JFrame frame;

    public static void loadDefault() {

        if (frame == null){
            frame = new JFrame();
            System.out.println("Инициализация фрейма.");
        } else { System.out.println("Фрейм уже был инициализирован.");}

        frame.setTitle("Прайс-лист");

        int width = 950;
        int height = 705;
        frame.setSize(width, height);

        Dimension size = new Dimension(width,height);
        frame.setMinimumSize(size);
        frame.setPreferredSize(size);
        frame.setMaximumSize(size);

//        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void setNewSize(int width, int height){
        frame.setSize(width, height);
        Dimension size = new Dimension(width,height);
        frame.setMinimumSize(size);
        frame.setPreferredSize(size);
        frame.setMaximumSize(size);
    }
}
