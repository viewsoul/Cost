package ru.masterhole.cost;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by viewsoul on 09.11.2016.
 */
public class Panels {

    public static JPanel panelMenu;
    public static JPanel panelInput;
    public static JScrollPane panelInputScroll;
    public static JPanel panelOutput;

    public static void loadDefault() {
        if(panelMenu == null){
            panelMenu = new JPanel(new FlowLayout());
            // System.out.println("Инициализация панели меню.");
        } else { System.out.println("Панель меню уже была инициализирована.");}

        if(panelInput == null){
            panelInput = new JPanel(new FlowLayout());
        } else { System.out.println("Панель ввода уже была инициализирована.");}

        if (panelInputScroll == null){
            panelInputScroll = new JScrollPane(panelInput);
        }

        panelInputScroll.setHorizontalScrollBarPolicy(panelInputScroll.HORIZONTAL_SCROLLBAR_NEVER);

        if(panelOutput == null){
            panelOutput = new JPanel(new FlowLayout());
        } else { System.out.println("Панель вывода уже была инициализирована.");}

        int width = Window.frame.getWidth();

        Dimension sizeMenu = new Dimension(width/4,-1);
        Dimension sizeInput = new Dimension(width/2-40,-1);
        Dimension sizeOutput = new Dimension(width/4,-1);

        panelMenu.setMinimumSize(sizeMenu);
        panelMenu.setPreferredSize(sizeMenu);
        panelMenu.setBackground(Color.WHITE);

        panelInput.setPreferredSize(sizeInput);
        panelInput.setBackground(Color.WHITE);

        panelOutput.setMinimumSize(sizeOutput);
        panelOutput.setPreferredSize(sizeOutput);
        panelOutput.setBackground(Color.DARK_GRAY);

        Window.frame.add(panelMenu,BorderLayout.WEST);
        Window.frame.add(panelInputScroll,BorderLayout.CENTER);
        Window.frame.add(panelOutput,BorderLayout.EAST);

        Window.frame.pack();
    }
}
