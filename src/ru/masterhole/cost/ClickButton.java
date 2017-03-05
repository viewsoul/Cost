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


        String buttonKey = "";
        for (String key : ItemsMenu.buttonsMenu.keySet()){
            if (ItemsMenu.buttonsMenu.get(key).hashCode() == e.getSource().hashCode()) {
                buttonKey = key;
                break;
            }
        }

        // устанавливаем высоту панели, чтобы скрол поумолчанию исчез
        Panels.panelInput.setPreferredSize(new Dimension(Panels.panelInput.getWidth()-40,-1));
        // устанавливаем скрол на самый верх
        Panels.panelInputScroll.getVerticalScrollBar().setValue(0);

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
                Panels.panelInput.setPreferredSize(new Dimension(Panels.panelInput.getWidth()-40,505));
                break;
            case "Люки":
                ItemsMenu.setVisibleHatch();
                break;
            case "Люки встраиваемые":
                ItemsInput.setVisibleHatchVr();
                Panels.panelInput.setPreferredSize(new Dimension(Panels.panelInput.getWidth()-40,680));
                break;
            case "Люки накладные":
                ItemsInput.setVisibleHatchNakl();
                Panels.panelInput.setPreferredSize(new Dimension(Panels.panelInput.getWidth()-40,575));
                break;
            case "Короба":
                ItemsMenu.setVisibleKorob();
                break;
            case "Короба Г":
                ItemsInput.setVisibleKorobG();
                Panels.panelInput.setPreferredSize(new Dimension(Panels.panelInput.getWidth()-40,540));
                break;
            case "Короба П":
                ItemsInput.setVisibleKorobP();
                Panels.panelInput.setPreferredSize(new Dimension(Panels.panelInput.getWidth()-40,575));
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


        }

    }
}
