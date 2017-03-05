package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viewsoul on 09.11.2016.
 */
public class ItemsMenu {

    public static Map<String, JButton> buttonsMenu;

    public static void loadDefault() {
        if (buttonsMenu == null){
            buttonsMenu = new HashMap<String, JButton>();
            System.out.println("Инициализация кнопок меню.");
        } else { System.out.println("Кнопки меню уже были инициализированы.");}

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

        buttonsMenu.get("Экраны").setBorderPainted(false);
        buttonsMenu.get("Решётки перфорированные").setBorderPainted(false);
        buttonsMenu.get("Люки").setBorderPainted(false);
        buttonsMenu.get("Короба").setBorderPainted(false);
        buttonsMenu.get("Решётки жалюзийные").setBorderPainted(false);
        buttonsMenu.get("Люки перфорированные").setBorderPainted(false);

        int width = (int) Panels.panelMenu.getPreferredSize().getWidth() - 10;
        setPreferredSize(width,30);
        setColor(new Color(74,130,187),Color.white);
        addActionListener();
        addDefault();

    }

    private static void setColor(Color background, Color foreground) {
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

    private static void addActionListener() {
        for (String key : buttonsMenu.keySet()){
            buttonsMenu.get(key).addActionListener(new ClickButton());

        }
    }

    private static void addDefault() {

        Panels.panelMenu.add(buttonsMenu.get("Экраны"));

        Panels.panelMenu.add(buttonsMenu.get("Решётки перфорированные"));

        Panels.panelMenu.add(buttonsMenu.get("Решётки перфорированные встраиваемые"));
        buttonsMenu.get("Решётки перфорированные встраиваемые").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Решётки перфорированные накладные"));
        buttonsMenu.get("Решётки перфорированные накладные").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Решётки перфорированные плоские"));
        buttonsMenu.get("Решётки перфорированные плоские").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Решётки перфорированные плоские с подгибом"));
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Решётки перфорированные выпуклые"));
        buttonsMenu.get("Решётки перфорированные выпуклые").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Люки"));

        Panels.panelMenu.add(buttonsMenu.get("Люки встраиваемые"));
        buttonsMenu.get("Люки встраиваемые").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Люки накладные"));
        buttonsMenu.get("Люки накладные").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Короба"));

        Panels.panelMenu.add(buttonsMenu.get("Короба Г"));
        buttonsMenu.get("Короба Г").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Короба П"));
        buttonsMenu.get("Короба П").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Решётки жалюзийные"));

        Panels.panelMenu.add(buttonsMenu.get("Решётки жалюзийные встраиваемые"));
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Решётки жалюзийные накладные"));
        buttonsMenu.get("Решётки жалюзийные накладные").setVisible(false);

        Panels.panelMenu.add(buttonsMenu.get("Люки перфорированные"));

        Window.frame.pack();
    }

    private static void setPreferredSize(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : buttonsMenu.keySet()){
            buttonsMenu.get(key).setPreferredSize(size);
            // System.out.println("Ширина кнопки "+buttonsMenu.get(key).getText()+" "+buttonsMenu.get(key).getPreferredSize());
        }
    }

    public static void setVisibleReshetkiPerfo() {
        boolean b = true;
        if (buttonsMenu.get("Решётки перфорированные встраиваемые").isVisible() == true) {
            b = false;
        }
        buttonsMenu.get("Решётки перфорированные встраиваемые").setVisible(b);
        buttonsMenu.get("Решётки перфорированные накладные").setVisible(b);
        buttonsMenu.get("Решётки перфорированные плоские").setVisible(b);
        buttonsMenu.get("Решётки перфорированные плоские с подгибом").setVisible(b);
        buttonsMenu.get("Решётки перфорированные выпуклые").setVisible(b);
    }

    public static void setVisibleHatch() {
        boolean b = true;
        if (buttonsMenu.get("Люки встраиваемые").isVisible() == true) {
            b = false;
        }
        buttonsMenu.get("Люки встраиваемые").setVisible(b);
        buttonsMenu.get("Люки накладные").setVisible(b);
    }

    public static void setVisibleKorob() {
        boolean b = true;
        if (buttonsMenu.get("Короба Г").isVisible() == true) {
            b = false;
        }
        buttonsMenu.get("Короба Г").setVisible(b);
        buttonsMenu.get("Короба П").setVisible(b);
    }

    public static void setVisibleReshetkiZaluz() {
        boolean b = true;
        if (buttonsMenu.get("Решётки жалюзийные встраиваемые").isVisible() == true) {
            b = false;
        }
        buttonsMenu.get("Решётки жалюзийные встраиваемые").setVisible(b);
        buttonsMenu.get("Решётки жалюзийные накладные").setVisible(b);
    }
}
