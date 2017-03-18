package ru.masterhole.cost;

import javax.swing.*;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 17.03.2017.
 */
public enum Buttons {
    EKRAN               (new JButton(),1,"Экраны для батарей"),
    RESH_PERFO          (new JButton(),1,"Решётки перфорированные"),
    RESH_PERFO_VSTR     (new JButton(),2,"Встраиваемые"),
    RESH_PERFO_NAKL     (new JButton(),2,"Накладные"),
    RESH_PERFO_PL       (new JButton(),2,"Плоские"),
    RESH_PERFO_PL_SPOD  (new JButton(),2,"Плоские с подгибом"),
    RESH_PERFO_VIPKL    (new JButton(),2,"Выпуклые"),
    HATCH               (new JButton(),1,"Люки"),
    HATCH_VSTR          (new JButton(),2,"Встраиваемые"),
    HATCH_NAKL          (new JButton(),2,"Накладные"),
    KOROB               (new JButton(),1,"Короба"),
    KOROB_G             (new JButton(),2,"Г-образные"),
    KOROB_P             (new JButton(),2,"П-образные"),
    RESH_ZALUZ          (new JButton(),1,"Решётки жалюзийные"),
    RESH_ZALUZ_VSTR     (new JButton(),2,"Встраиваемые"),
    RESH_ZALUZ_NAKL     (new JButton(),2,"Вакладные"),
    HATCH_PERFO         (new JButton(),1,"Люки перфорированные"),
    HATCH_PERFO_VSTR    (new JButton(),2,"Встраиваемые"),
    HATCH_PERFO_NAKL    (new JButton(),2,"Накладные");

    // кнопка меню
    private JButton button;
    // если раздел то 1, если подраздел то 2
    private int branch;
    // название кнопки
    private String title;

    // конструктор
    Buttons(JButton button, int branch, String title) {
        this.button = button;
        this.branch = branch;
        this.title = title;
    }

    public JButton getButton() {
        return button;
    }

    public int getBranch() {
        return branch;
    }

    public String getTitle() {
        return title;
    }
}
