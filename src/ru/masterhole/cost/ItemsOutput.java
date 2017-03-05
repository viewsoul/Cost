package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hole on 15.11.2016.
 */
public class ItemsOutput {
    public static Map<String, JLabel> labelsOutput;

    public static void loadDefault() {
        if (labelsOutput == null){
            labelsOutput = new HashMap<String, JLabel>();
            System.out.println("Инициализация надписей панели вывода.");
        } else { System.out.println("Надписи панели вввода уже были инициализированы.");}

        labelsOutput.put("Стоимость", new JLabel("Стоимость"));
        labelsOutput.put("Вывод стоимости", new JLabel("0 руб."));

        int width = (int) Panels.panelOutput.getPreferredSize().getWidth()/2 - 8;
        int height = 30;

        setSizeLabels(width,height);
        setForegroundLabels(Color.white);
        addDefault();
    }

    private static void setForegroundLabels(Color foreground) {
        labelsOutput.get("Стоимость").setForeground(foreground);
        labelsOutput.get("Вывод стоимости").setForeground(foreground);
    }

    private static void addDefault() {
        Panels.panelOutput.add(labelsOutput.get("Стоимость"));
        Panels.panelOutput.add(labelsOutput.get("Вывод стоимости"));

        Window.frame.pack();
    }

    private static void setSizeLabels(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : labelsOutput.keySet()){
            labelsOutput.get(key).setPreferredSize(size);
        }
    }
}
