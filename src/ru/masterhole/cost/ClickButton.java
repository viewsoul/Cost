package ru.masterhole.cost;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hole on 09.11.2016.
 */
public class ClickButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        // ключ в списке кнопок
        String buttonKey = "";

        // ищем ключ для нжатой кнопке
        for (String key : ItemsMenu.buttonsMenu.keySet()){
            if (ItemsMenu.buttonsMenu.get(key).hashCode() == e.getSource().hashCode()) {
                buttonKey = key;
                break;
            }
        }

        // устанавливаем скрол на самый верх
        Panels.panelInputScroll.getVerticalScrollBar().setValue(0);

        // переключаемся по ключу и выполняем действие
        switch (buttonKey) {
            case "Экраны":
                ItemsInput.setVisibleEkran();
                break;
            case "Решётки перфорированные":
                ItemsMenu.setVisibleReshetkiPerfo();
                break;
            case "Решётки перфорированные встраиваемые":
                ItemsInput.setVisibleReshetkiPerfoVr();

                break;
            case "Решётки перфорированные накладные":
                ItemsInput.setVisibleReshetkiPerfoNakl();
                break;
            case  "Решётки перфорированные плоские":
                ItemsInput.setVisibleReshetkiPerfoPl();
                break;
            case "Решётки перфорированные плоские с подгибом":
                ItemsInput.setVisibleReshetkiPerfoPlspod();
                break;
            case "Решётки перфорированные выпуклые":
                ItemsInput.setVisibleReshetkiPerfoVipukl();
                break;
            case "Люки":
                ItemsMenu.setVisibleHatch();
                break;
            case "Люки встраиваемые":
                ItemsInput.setVisibleHatchVr();
                break;
            case "Люки накладные":
                ItemsInput.setVisibleHatchNakl();
                break;
            case "Короба":
                ItemsMenu.setVisibleKorob();
                break;
            case "Короба Г":
                ItemsInput.setVisibleKorobG();
                break;
            case "Короба П":
                ItemsInput.setVisibleKorobP();
                break;
            case "Решётки жалюзийные":
                ItemsMenu.setVisibleReshetkiZaluz();
                break;
            case "Решётки жалюзийные встраиваемые":
                ItemsInput.setVisibleReshetkiZaluzVr();
                break;
            case "Решётки жалюзийные накладные":
                ItemsInput.setVisibleReshetkiZaluzNakl();
                break;
            case "Люки перфорированные":
                ItemsMenu.setVisibleHatchPerfo();
                break;
            case "Люки перфорированные встраиваемые":
                ItemsInput.setVisibleHatchPerfoVr();
                break;
            case "Люки перфорированные накладные":
                ItemsInput.setVisibleHatchPerfoNakl();
                break;
            case "":
                System.out.println("Ключ кнопки не найден.");
                break;
        }
    }
}
