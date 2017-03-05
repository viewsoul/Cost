package ru.masterhole.cost;

import java.awt.event.ActionEvent;

/**
 * Created by hole on 17.11.2016.
 */
public class choiceItems implements java.awt.event.ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String comboBoxKey = "";
        for (String key : ItemsInput.comboBoxInput.keySet()){
            if (ItemsInput.comboBoxInput.get(key).hashCode() == e.getSource().hashCode()) {
                comboBoxKey = key;
                break;
            }
        }

        Cost.update();

//        System.out.println("выбран "+comboBoxKey+" "+ItemsInput.comboBoxInput.get(comboBoxKey).getSelectedIndex());
    }
}
