package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * Created by hole on 15.11.2016.
 */
public class Cost {

    public static int costVirez = 120;
    public static int costUpor = 50;
    public static int procentGruntovka = 10;

    private static String labelsTitleKey;

    public static void update() {

        for (String key : ItemsInput.labelsTitle.keySet()){
            if (ItemsInput.labelsTitle.get(key).isVisible() == true){
                labelsTitleKey = key;
                break;
            }
        }

//        System.out.println("Вывод стоимости "+ItemsInput.labelsTitle.get(labelsTitleKey).getText());

        switch (labelsTitleKey) {
            case "Экраны":
                Ekran.cost();
                break;
            case "Решётки перфорированные встраиваемые":

                break;
            case "Решётки перфорированные накладные":

                break;
            case  "Решётки перфорированные плоские":

                break;
            case "Решётки перфорированные плоские с подгибом":

                break;
            case "Решётки перфорированные выпуклые":

                break;

            case "Люки встраиваемые":

                break;
            case "Люки накладные":

                break;

            case "Короба Г":

                break;
            case "Короба П":

                break;

            case "Решётки жалюзийные встраиваемые":

                break;
            case "Решётки жалюзийные накладные":

                break;


        }

    }

    public static void setCost(double cost) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ItemsOutput.labelsOutput.get("Вывод стоимости").setText(""+(int)cost);
            }
        });
    }

    public static double getCostGruntovka(double cost){
        double x;
        if (ItemsInput.comboBoxInput.get("Грунтовка").getSelectedIndex() == 1) {
            x = (cost/100)*procentGruntovka;
        } else {
            x = 0;
        }
        return x;
    }

    public static int getCostVirez() {
        return costVirez;
    }

    public static int getCostUpor() {
        return costUpor;
    }

    public static double getCostDoprab(double cost) {
        double x;
        try {
            x = Double.parseDouble(ItemsInput.textFieldInput.get("Дополнительные работы").getText());
        } catch (NumberFormatException e) {
            x = 0;
        }
        cost = (cost/100)*x;
        return cost;
    }

    public static double getCostNacenka(double cost) {
        double x;
        try {
            x = Double.parseDouble(ItemsInput.textFieldInput.get("Наценка").getText());
        } catch (NumberFormatException e) {
            x = 0;
        }
        cost = (cost/100)*x;
        return cost;
    }
}
