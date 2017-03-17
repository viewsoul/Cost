package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hole on 15.11.2016.
 */
public class Cost {

    static void update() {

        String labelsTitleKey = "";

        for (String key : ItemsInput.labelsTitle.keySet()){
            if (ItemsInput.labelsTitle.get(key).isVisible()){
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

    static double getCostGruntovka(double cost){
        double x;
        if (ItemsInput.comboBoxInput.get("Грунтовка").getSelectedIndex() == 1) {
            x = (cost/100)*Constant.GRUNT;
        } else {
            x = 0;
        }
        return x;
    }

    static int getCostVirez() {
        return Constant.VIREZ;
    }

    static int getCostUpor() {
        return Constant.UPOR;
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

    /**
     *  Возвращает сумму наценки в рублях.
     * @param cost стоимость без наценки.
     */
    static double getCostNacenka(double cost) {
        // процент наценки
        double x;
        try {
            x = Double.parseDouble(ItemsInput.textFieldInput.get("Наценка").getText());
        } catch (NumberFormatException e) {
            x = 0;
        }
        cost = (cost/100)*x;
        return cost;
    }

    /**
     * возвращает сумму наценки в рублях
     * @param cost стоимость изделия в белом цвете
     * @param area площадь поверхности покраски
     */
    static double getCostColor(double cost, double area) {

        // хэшкод выбранного цвета в меню
        int color = ItemsInput.comboBoxInput.get("Цвет").getSelectedItem().hashCode();

        // индекс по умолчанию для белого цвета
        int indexColor = 0;

        // индекс выбранного цвета
        for (int i=0; i<Constant.COLOR.length; i++){
            if (Constant.COLOR[i][0]==color){
                indexColor = i;
                i = Constant.COLOR.length;
            }
        }
//        System.out.println("index в массиве: "+indexColor);

        // наценка по умолчанию
        int procent = 0;

            if (area >= 0 & area <0.5) {
                procent = Constant.COLOR[indexColor][1];
            }   else if (area >= 0.5 & area < 1) {
                procent = Constant.COLOR[indexColor][2];
            } else if (area >= 1) {
                procent = Constant.COLOR[indexColor][3];
            } else {
                cost = 0;
                System.err.println("Неверная площадь при расчёте покраски. S="+area);
            }
        cost = (cost/100)*procent;
        return cost;
    }


}
