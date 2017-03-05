package ru.masterhole.cost;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Created by hole on 15.11.2016.
 */
public class EnterInput implements DocumentListener {

    private String textFiledKey;
    private String textFieldText;

    @Override
    public void insertUpdate(DocumentEvent e) {

        // устанавливаем новую стоимость
        updateTextField(e);

        // обновить стоимость
        Cost.update();

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

        // обновляем данные
        updateTextField(e);

        // обновить стоимость
        Cost.update();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }

    private void findKey(DocumentEvent e){
        for (String key : ItemsInput.textFieldInput.keySet()){
            if (ItemsInput.textFieldInput.get(key).getDocument().hashCode() == e.getDocument().hashCode()) {
                textFiledKey = key;
                break;
            }
        }
    }

    private void updateTextField(DocumentEvent e){

        // ищем ключ поля ввода
        findKey(e);

        // чистим ввод от ненужных символов
        textFieldText = ItemsInput.textFieldInput.get(textFiledKey).getText().replaceAll("[\\D]","");

        // обрезаем первые нули
        if (textFieldText.length()>1) {
            if (textFieldText.charAt(0) == '0') {
                textFieldText = textFieldText.substring(1,textFieldText.length());
            }
        }

        // обрезаем лишнее
        if (textFieldText.length()>4) {
            textFieldText = textFieldText.substring(0,4);
        }

        if (ItemsInput.textFieldInput.get(textFiledKey).getText().hashCode() != textFieldText.hashCode()) {
            SwingUtilities.invokeLater( new Runnable() {
                @Override
                public void run() {
                    ItemsInput.textFieldInput.get(textFiledKey).setText(textFieldText);
                }
            });
        }
    }
}
