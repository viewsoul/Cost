package ru.masterhole.cost;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Автор: Павел "hole" Фетисов
 * Дата создания: 09.11.2016.
 */
public class ItemsInput {

    public static final int WIDTH_ITEMS_DEFAULT     = Panels.WIDTH_PANEL_INPUT - 10 - 40;
    public static final int WIDTH_2X_ITEMS_DEFAULT  = WIDTH_ITEMS_DEFAULT/2 - 8 - 20;
    public static final int HEIGHT_ITEMS_DEFAULT    = 30;

    // заголовки контента
    public static Map<String, JLabel> labelsTitle;

    // названия элементов ввода
    public static Map<String, JLabel> labelsInput;

    // полня ввода
    public static Map<String, JTextField> textFieldInput;

    // списки
    public static Map<String, JComboBox> comboBoxInput;


    // конструктор
    public ItemsInput() {

        // инициализация заголовков панели ввода
        labelsTitle = new HashMap<String, JLabel>();
        System.out.println("Инициализация заголовков панели ввода.");

        // заполняем список заголовков
        putLabelsTitle();
        System.out.println("Загрузка заголовков панели ввода.");

        // инициализация подписей элементов ввода и выбора
        labelsInput = new HashMap<String, JLabel>();

        // заполнение списка подписей элементов ввода и выбора
        putLabelsInput();

        // инициализация списка выпадающих списков
        comboBoxInput = new HashMap<String, JComboBox>();

        // заполнение списка выпадающих списков
        putComboBox();

        // инициализация списка инпутов
        textFieldInput = new HashMap<String, JTextField>();

        // заполнение списка элементов ввода
        putTextField();
    }

    // загрузка настроек по умолчанию
    public void loadDefaultSettings() {

        // размеры заголовков
        setSizeLabelsTitle(WIDTH_ITEMS_DEFAULT,HEIGHT_ITEMS_DEFAULT);

        // размеры подписей элементов ввода и выбора
        setSizeLabelsInput(WIDTH_2X_ITEMS_DEFAULT,HEIGHT_ITEMS_DEFAULT);

        // шрифт и размер букв у заголовков
        setFontLabelTitle(new Font(null,Font.BOLD,14));

        // размеры списков выбора
        setSizeComboBox(WIDTH_2X_ITEMS_DEFAULT,HEIGHT_ITEMS_DEFAULT);

        // размеры полей ввода
        setSizeTextField(WIDTH_2X_ITEMS_DEFAULT,HEIGHT_ITEMS_DEFAULT);

        // установка слушателей в элементы ввода и выбора
        setListener();

        // скрыть все элементы
        setVisible(false);
    }

    // функция заполнения списка элементов ввода
    private void putTextField() {
        textFieldInput.put("Длина", new JTextField());
        textFieldInput.put("Высота", new JTextField());
        textFieldInput.put("Глубина", new JTextField());
        textFieldInput.put("Высота вторая", new JTextField());
        textFieldInput.put("Выпуклость", new JTextField());
        textFieldInput.put("Дополнительные работы", new JTextField());
        textFieldInput.put("Наценка", new JTextField());
    }

    // функция заполнения список выпадающих списков
    private void putComboBox() {
        comboBoxInput.put("Размер", new JComboBox());
        comboBoxInput.get("Размер").addItem("Посадочный");
        comboBoxInput.get("Размер").addItem("Габаритый");
        comboBoxInput.get("Размер").setSelectedIndex(0);

        comboBoxInput.put("Бок левый", new JComboBox());
        comboBoxInput.get("Бок левый").addItem("Открытый");
        comboBoxInput.get("Бок левый").addItem("Перфорированный");
        comboBoxInput.get("Бок левый").addItem("Глухой");
        comboBoxInput.get("Бок левый").setSelectedIndex(0);

        comboBoxInput.put("Бок правый", new JComboBox());
        comboBoxInput.get("Бок правый").addItem("Открытый");
        comboBoxInput.get("Бок правый").addItem("Перфорированный");
        comboBoxInput.get("Бок правый").addItem("Глухой");
        comboBoxInput.get("Бок правый").setSelectedIndex(0);

        comboBoxInput.put("Перфорация", new JComboBox());
        comboBoxInput.get("Перфорация").addItem("Круг");
        comboBoxInput.get("Перфорация").addItem("Квадрат 5-8");
        comboBoxInput.get("Перфорация").addItem("Квадрат 3-5");
        comboBoxInput.get("Перфорация").addItem("Цветок");
        comboBoxInput.get("Перфорация").setSelectedIndex(0);

        comboBoxInput.put("Рамка", new JComboBox());
        comboBoxInput.get("Рамка").addItem("10");
        comboBoxInput.get("Рамка").addItem("15");
        comboBoxInput.get("Рамка").addItem("20");
        comboBoxInput.get("Рамка").addItem("25");
        comboBoxInput.get("Рамка").addItem("30");
        comboBoxInput.get("Рамка").addItem("35");
        comboBoxInput.get("Рамка").addItem("40");
        comboBoxInput.get("Рамка").addItem("45");
        comboBoxInput.get("Рамка").addItem("50");
        comboBoxInput.get("Рамка").addItem("55");
        comboBoxInput.get("Рамка").addItem("60");
        comboBoxInput.get("Рамка").addItem("65");
        comboBoxInput.get("Рамка").addItem("70");
        comboBoxInput.get("Рамка").setSelectedIndex(0);

        comboBoxInput.put("Рамка от жалюзийной встраиваемой", new JComboBox());
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("25");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("30");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("35");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("40");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("45");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("50");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("55");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("60");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("65");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").addItem("70");
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").setSelectedIndex(1);

        comboBoxInput.put("Рамка с подгибом", new JComboBox());
        comboBoxInput.get("Рамка с подгибом").addItem("Нет");
        comboBoxInput.get("Рамка с подгибом").addItem("Да");
        comboBoxInput.get("Рамка с подгибом").setSelectedIndex(0);

        comboBoxInput.put("Рамка плиточная", new JComboBox());
        comboBoxInput.get("Рамка плиточная").addItem("Нет");
        comboBoxInput.get("Рамка плиточная").addItem("Да");
        comboBoxInput.get("Рамка плиточная").setSelectedIndex(0);

        comboBoxInput.put("Ребро", new JComboBox());
        comboBoxInput.get("Ребро").addItem("10");
        comboBoxInput.get("Ребро").addItem("15");
        comboBoxInput.get("Ребро").addItem("20");
        comboBoxInput.get("Ребро").addItem("25");
        comboBoxInput.get("Ребро").addItem("30");
        comboBoxInput.get("Ребро").addItem("35");
        comboBoxInput.get("Ребро").addItem("40");
        comboBoxInput.get("Ребро").addItem("45");
        comboBoxInput.get("Ребро").addItem("50");
        comboBoxInput.get("Ребро").addItem("55");
        comboBoxInput.get("Ребро").addItem("60");
        comboBoxInput.get("Ребро").addItem("65");
        comboBoxInput.get("Ребро").addItem("70");
        comboBoxInput.get("Ребро").setSelectedIndex(0);

        comboBoxInput.put("Двухдверный", new JComboBox());
        comboBoxInput.get("Двухдверный").addItem("Нет");
        comboBoxInput.get("Двухдверный").addItem("Да");
        comboBoxInput.get("Двухдверный").setSelectedIndex(0);

        comboBoxInput.put("Усилитель", new JComboBox());
        comboBoxInput.get("Усилитель").addItem("0");
        comboBoxInput.get("Усилитель").addItem("1");
        comboBoxInput.get("Усилитель").addItem("2");
        comboBoxInput.get("Усилитель").addItem("3");
        comboBoxInput.get("Усилитель").addItem("4");
        comboBoxInput.get("Усилитель").addItem("5");
        comboBoxInput.get("Усилитель").addItem("6");
        comboBoxInput.get("Усилитель").addItem("7");
        comboBoxInput.get("Усилитель").addItem("8");
        comboBoxInput.get("Усилитель").addItem("9");
        comboBoxInput.get("Усилитель").addItem("10");
        comboBoxInput.get("Усилитель").setSelectedIndex(0);

        comboBoxInput.put("Вырезы", new JComboBox());
        comboBoxInput.get("Вырезы").addItem("0");
        comboBoxInput.get("Вырезы").addItem("1");
        comboBoxInput.get("Вырезы").addItem("2");
        comboBoxInput.get("Вырезы").addItem("3");
        comboBoxInput.get("Вырезы").addItem("4");
        comboBoxInput.get("Вырезы").addItem("5");
        comboBoxInput.get("Вырезы").addItem("6");
        comboBoxInput.get("Вырезы").addItem("7");
        comboBoxInput.get("Вырезы").addItem("8");
        comboBoxInput.get("Вырезы").addItem("9");
        comboBoxInput.get("Вырезы").addItem("10");
        comboBoxInput.get("Вырезы").setSelectedIndex(0);

        comboBoxInput.put("Отверстия", new JComboBox());
        comboBoxInput.get("Отверстия").addItem("0");
        comboBoxInput.get("Отверстия").addItem("1");
        comboBoxInput.get("Отверстия").addItem("2");
        comboBoxInput.get("Отверстия").addItem("3");
        comboBoxInput.get("Отверстия").addItem("4");
        comboBoxInput.get("Отверстия").addItem("5");
        comboBoxInput.get("Отверстия").addItem("6");
        comboBoxInput.get("Отверстия").addItem("7");
        comboBoxInput.get("Отверстия").addItem("8");
        comboBoxInput.get("Отверстия").addItem("9");
        comboBoxInput.get("Отверстия").addItem("10");
        comboBoxInput.get("Отверстия").addItem("11");
        comboBoxInput.get("Отверстия").addItem("12");
        comboBoxInput.get("Отверстия").addItem("13");
        comboBoxInput.get("Отверстия").addItem("14");
        comboBoxInput.get("Отверстия").addItem("15");
        comboBoxInput.get("Отверстия").addItem("16");
        comboBoxInput.get("Отверстия").setSelectedIndex(0);

        comboBoxInput.put("Ручка мебельная", new JComboBox());
        comboBoxInput.get("Ручка мебельная").addItem("0");
        comboBoxInput.get("Ручка мебельная").addItem("1");
        comboBoxInput.get("Ручка мебельная").addItem("2");
        comboBoxInput.get("Ручка мебельная").addItem("3");
        comboBoxInput.get("Ручка мебельная").addItem("4");
        comboBoxInput.get("Ручка мебельная").addItem("5");
        comboBoxInput.get("Ручка мебельная").addItem("6");
        comboBoxInput.get("Ручка мебельная").setSelectedIndex(0);

        comboBoxInput.put("Магнит", new JComboBox());
        comboBoxInput.get("Магнит").addItem("0");
        comboBoxInput.get("Магнит").addItem("1");
        comboBoxInput.get("Магнит").addItem("2");
        comboBoxInput.get("Магнит").addItem("3");
        comboBoxInput.get("Магнит").addItem("4");
        comboBoxInput.get("Магнит").addItem("5");
        comboBoxInput.get("Магнит").addItem("6");
        comboBoxInput.get("Магнит").addItem("7");
        comboBoxInput.get("Магнит").addItem("8");
        comboBoxInput.get("Магнит").addItem("9");
        comboBoxInput.get("Магнит").addItem("10");
        comboBoxInput.get("Магнит").addItem("11");
        comboBoxInput.get("Магнит").addItem("12");
        comboBoxInput.get("Магнит").addItem("13");
        comboBoxInput.get("Магнит").addItem("14");
        comboBoxInput.get("Магнит").addItem("15");
        comboBoxInput.get("Магнит").addItem("16");
        comboBoxInput.get("Магнит").setSelectedIndex(0);

        comboBoxInput.put("Замок", new JComboBox());
        comboBoxInput.get("Замок").addItem("0");
        comboBoxInput.get("Замок").addItem("1");
        comboBoxInput.get("Замок").addItem("2");
        comboBoxInput.get("Замок").addItem("3");
        comboBoxInput.get("Замок").addItem("4");
        comboBoxInput.get("Замок").addItem("5");
        comboBoxInput.get("Замок").addItem("6");
        comboBoxInput.get("Замок").addItem("7");
        comboBoxInput.get("Замок").addItem("8");
        comboBoxInput.get("Замок").setSelectedIndex(0);

        comboBoxInput.put("Нажимной механизм", new JComboBox());
        comboBoxInput.get("Нажимной механизм").addItem("0");
        comboBoxInput.get("Нажимной механизм").addItem("1");
        comboBoxInput.get("Нажимной механизм").addItem("2");
        comboBoxInput.get("Нажимной механизм").addItem("3");
        comboBoxInput.get("Нажимной механизм").addItem("4");
        comboBoxInput.get("Нажимной механизм").addItem("5");
        comboBoxInput.get("Нажимной механизм").addItem("6");
        comboBoxInput.get("Нажимной механизм").addItem("7");
        comboBoxInput.get("Нажимной механизм").addItem("8");
        comboBoxInput.get("Нажимной механизм").setSelectedIndex(0);

        comboBoxInput.put("Шпингалет", new JComboBox());
        comboBoxInput.get("Шпингалет").addItem("0");
        comboBoxInput.get("Шпингалет").addItem("1");
        comboBoxInput.get("Шпингалет").addItem("2");
        comboBoxInput.get("Шпингалет").addItem("3");
        comboBoxInput.get("Шпингалет").addItem("4");
        comboBoxInput.get("Шпингалет").setSelectedIndex(0);

        comboBoxInput.put("Упоры", new JComboBox());
        comboBoxInput.get("Упоры").addItem("0");
        comboBoxInput.get("Упоры").addItem("1");
        comboBoxInput.get("Упоры").addItem("2");
        comboBoxInput.get("Упоры").addItem("3");
        comboBoxInput.get("Упоры").addItem("4");
        comboBoxInput.get("Упоры").addItem("5");
        comboBoxInput.get("Упоры").addItem("6");
        comboBoxInput.get("Упоры").addItem("7");
        comboBoxInput.get("Упоры").addItem("8");
        comboBoxInput.get("Упоры").addItem("9");
        comboBoxInput.get("Упоры").addItem("10");
        comboBoxInput.get("Упоры").setSelectedIndex(0);

        comboBoxInput.put("Уголок", new JComboBox());
        comboBoxInput.get("Уголок").addItem("0");
        comboBoxInput.get("Уголок").addItem("10");
        comboBoxInput.get("Уголок").addItem("15");
        comboBoxInput.get("Уголок").addItem("20");
        comboBoxInput.get("Уголок").addItem("25");
        comboBoxInput.get("Уголок").addItem("30");
        comboBoxInput.get("Уголок").addItem("35");
        comboBoxInput.get("Уголок").addItem("40");
        comboBoxInput.get("Уголок").addItem("45");
        comboBoxInput.get("Уголок").addItem("50");
        comboBoxInput.get("Уголок").addItem("55");
        comboBoxInput.get("Уголок").setSelectedItem("15");

        comboBoxInput.put("Радиус", new JComboBox());
        comboBoxInput.get("Радиус").addItem("Нет");
        comboBoxInput.get("Радиус").addItem("Да");
        comboBoxInput.get("Радиус").setSelectedIndex(0);

        comboBoxInput.put("Грунтовка", new JComboBox());
        comboBoxInput.get("Грунтовка").addItem("Нет");
        comboBoxInput.get("Грунтовка").addItem("Да");
        comboBoxInput.get("Грунтовка").setSelectedIndex(0);

        // меню выбора цвета
        comboBoxInput.put("Цвет", new JComboBox());
        comboBoxInput.get("Цвет").addItem(Text.WHITE);
        comboBoxInput.get("Цвет").addItem(Text.COLOR);
        comboBoxInput.get("Цвет").addItem(Text.MATE_WHITE);
        comboBoxInput.get("Цвет").addItem(Text.MATE_COLOR);
        comboBoxInput.get("Цвет").addItem(Text.ANTIK);
        comboBoxInput.get("Цвет").addItem(Text.METALIK);
        comboBoxInput.get("Цвет").addItem(Text.CHROM);
        comboBoxInput.get("Цвет").addItem(Text.GOLD);
        comboBoxInput.get("Цвет").setSelectedIndex(0);

        comboBoxInput.put("Упаковка", new JComboBox());
        comboBoxInput.get("Упаковка").addItem("Стрейч-плёнка");
        comboBoxInput.get("Упаковка").addItem("Гофрокартон");
        comboBoxInput.get("Упаковка").setSelectedIndex(0);
    }

    // функция заполняет список подписей элементов ввода и выбора
    private void putLabelsInput() {
        labelsInput.put("Длина", new JLabel("Длина"));
        labelsInput.put("Высота", new JLabel("Высота"));
        labelsInput.put("Глубина", new JLabel("Глубина"));
        labelsInput.put("Высота вторая", new JLabel("Высота"));
        labelsInput.put("Бок левый", new JLabel("Бок левый"));
        labelsInput.put("Бок правый", new JLabel("Бок правый"));
        labelsInput.put("Перфорация", new JLabel("Перфорация"));
        labelsInput.put("Вырезы", new JLabel("Вырезы"));
        labelsInput.put("Упоры", new JLabel("Упоры"));
        labelsInput.put("Грунтовка", new JLabel("Грунтовка"));
        labelsInput.put("Цвет", new JLabel("Цвет"));
        labelsInput.put("Дополнительные работы", new JLabel("Дополнительные работы"));
        labelsInput.put("Упаковка", new JLabel("Упаковка"));
        labelsInput.put("Наценка", new JLabel("Наценка"));

        labelsInput.put("Размер", new JLabel("Размер"));
        labelsInput.put("Рамка", new JLabel("Рамка"));
        labelsInput.put("Рамка плиточная", new JLabel("Рамка плиточная"));
        labelsInput.put("Рамка с подгибом", new JLabel("Рамка с подгибом"));
        labelsInput.put("Ребро", new JLabel("Ребро"));
        labelsInput.put("Отверстия", new JLabel("Отверстия"));
        labelsInput.put("Выпуклость", new JLabel("Выпуклость"));

        labelsInput.put("Двухдверный", new JLabel("Двухдверный"));
        labelsInput.put("Усилитель", new JLabel("Усилитель"));
        labelsInput.put("Ручка мебельная", new JLabel("Ручка мебельная"));
        labelsInput.put("Магнит", new JLabel("Магнит"));
        labelsInput.put("Замок", new JLabel("Замок"));
        labelsInput.put("Нажимной механизм", new JLabel("Нажимной механизм"));
        labelsInput.put("Шпингалет", new JLabel("Шпингалет"));

        labelsInput.put("Уголок", new JLabel("Уголок"));
        labelsInput.put("Радиус", new JLabel("Радиус"));
    }

    // функция заполняет список заголовков панели ввода
    private void putLabelsTitle() {
        // заголовки
        labelsTitle.put("Экраны", new JLabel("Экраны для батарей"));
        labelsTitle.put("Решётки перфорированные встраиваемые", new JLabel("Решётки перфорированные встраиваемые"));
        labelsTitle.put("Решётки перфорированные накладные", new JLabel("Решётки перфорированные накладные"));
        labelsTitle.put("Решётки перфорированные плоские", new JLabel("Решётки перфорированные плоские"));
        labelsTitle.put("Решётки перфорированные плоские с подгибом", new JLabel("Решётки перфорированные плоские с подгибом"));
        labelsTitle.put("Решётки перфорированные выпуклые", new JLabel("Решётки перфорированные выпуклые"));
        labelsTitle.put("Люки", new JLabel("Люки ревизинные"));
        labelsTitle.put("Люки встраиваемые", new JLabel("Люки ревизинные встраиваемые"));
        labelsTitle.put("Люки накладные", new JLabel("Люки ревизинные накладные"));
        labelsTitle.put("Короба Г", new JLabel("Короба Г-образные"));
        labelsTitle.put("Короба П", new JLabel("Короба П-образные"));
        labelsTitle.put("Решётки жалюзийные встраиваемые", new JLabel("Решётки жалюзийные встраиваемые"));
        labelsTitle.put("Решётки жалюзийные накладные", new JLabel("Решётки жалюзийные накладные"));
        labelsTitle.put("Люки перфорированные встраиваемые", new JLabel("Люки перфорированные встраиваемые"));
        labelsTitle.put("Люки перфорированные накладные", new JLabel("Люки перфорированные накладные"));
        labelsTitle.put("Решётки НЕО2 плоские", new JLabel("Решётки НЕО2 плоские"));
        labelsTitle.put("Решётки НЕО2 выпуклые", new JLabel("Решётки НЕО2 выпуклые"));
        labelsTitle.put("Люки жалюзийные встраиваемые", new JLabel("Люки жалюзийные встраиваемые"));
        labelsTitle.put("Люки жалюзийные накладные", new JLabel("Люки жалюзийные накладные"));
        labelsTitle.put("Решётки оцинкованные жалюзийные встраиваемые", new JLabel("Решётки оцинкованные жалюзийные встраиваемые"));
        labelsTitle.put("Решётки оцинкованные жалюзийные накладные", new JLabel("Решётки оцинкованные жалюзийные накладные"));
    }

    // функция устанавливает слушателей для полей и списков
    private void setListener() {

        // слушатели для полей ввода
        for (String key : textFieldInput.keySet()){
            textFieldInput.get(key).getDocument().addDocumentListener(new EnterInput());
        }

        // слушатели для списоков выбора
        for (String key : comboBoxInput.keySet()) {
            comboBoxInput.get(key).addActionListener(new ChoiceItems());
        }
    }

    // функция устанавливает шрифт для заголовков
    private void setFontLabelTitle(Font font) {
        for (String key : labelsTitle.keySet()){
            labelsTitle.get(key).setFont(font);
        }
    }

    // функция устанавливает размеры полей ввода
    private void setSizeTextField(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : textFieldInput.keySet()){
            textFieldInput.get(key).setPreferredSize(size);
        }
    }

    // функция устанавливает размер списков выбора
    private void setSizeComboBox(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : comboBoxInput.keySet()){
            comboBoxInput.get(key).setPreferredSize(size);
        }
    }

    // функция устанавливает размеры подписей элементов ввода и выбора
    private void setSizeLabelsInput(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : labelsInput.keySet()){
            labelsInput.get(key).setPreferredSize(size);
        }
    }

    // функция устанавливает размеры заголовков
    private void setSizeLabelsTitle(int width, int height) {
        Dimension size = new Dimension(width,height);
        for (String key : labelsTitle.keySet()){
            labelsTitle.get(key).setPreferredSize(size);
        }
    }

    // функция добавляет элементы на панель
    public void addItemsToPanel(JPanel panel) {

        // заголовки
        for (String key : labelsTitle.keySet()){
            panel.add(labelsTitle.get(key));
        }

        // подписи и элементы ввода и выбора
        panel.add(labelsInput.get("Размер"));
        panel.add(comboBoxInput.get("Размер"));
        panel.add(labelsInput.get("Длина"));
        panel.add(textFieldInput.get("Длина"));
        panel.add(labelsInput.get("Высота"));
        panel.add(textFieldInput.get("Высота"));
        panel.add(labelsInput.get("Глубина"));
        panel.add(textFieldInput.get("Глубина"));
        panel.add(labelsInput.get("Высота вторая"));
        panel.add(textFieldInput.get("Высота вторая"));
        panel.add(labelsInput.get("Выпуклость"));
        panel.add(textFieldInput.get("Выпуклость"));
        panel.add(labelsInput.get("Рамка"));
        panel.add(comboBoxInput.get("Рамка"));
        panel.add(comboBoxInput.get("Рамка от жалюзийной встраиваемой"));
        panel.add(labelsInput.get("Рамка с подгибом"));
        panel.add(comboBoxInput.get("Рамка с подгибом"));
        panel.add(labelsInput.get("Рамка плиточная"));
        panel.add(comboBoxInput.get("Рамка плиточная"));
        panel.add(labelsInput.get("Ребро"));
        panel.add(comboBoxInput.get("Ребро"));
        panel.add(labelsInput.get("Двухдверный"));
        panel.add(comboBoxInput.get("Двухдверный"));
        panel.add(labelsInput.get("Усилитель"));
        panel.add(comboBoxInput.get("Усилитель"));
        panel.add(labelsInput.get("Бок левый"));
        panel.add(comboBoxInput.get("Бок левый"));
        panel.add(labelsInput.get("Бок правый"));
        panel.add(comboBoxInput.get("Бок правый"));
        panel.add(labelsInput.get("Перфорация"));
        panel.add(comboBoxInput.get("Перфорация"));
        panel.add(labelsInput.get("Уголок"));
        panel.add(comboBoxInput.get("Уголок"));
        panel.add(labelsInput.get("Радиус"));
        panel.add(comboBoxInput.get("Радиус"));
        panel.add(labelsInput.get("Вырезы"));
        panel.add(comboBoxInput.get("Вырезы"));
        panel.add(labelsInput.get("Отверстия"));
        panel.add(comboBoxInput.get("Отверстия"));
        panel.add(labelsInput.get("Магнит"));
        panel.add(comboBoxInput.get("Магнит"));
        panel.add(labelsInput.get("Ручка мебельная"));
        panel.add(comboBoxInput.get("Ручка мебельная"));
        panel.add(labelsInput.get("Замок"));
        panel.add(comboBoxInput.get("Замок"));
        panel.add(labelsInput.get("Нажимной механизм"));
        panel.add(comboBoxInput.get("Нажимной механизм"));
        panel.add(labelsInput.get("Шпингалет"));
        panel.add(comboBoxInput.get("Шпингалет"));
        panel.add(labelsInput.get("Упоры"));
        panel.add(comboBoxInput.get("Упоры"));
        panel.add(labelsInput.get("Грунтовка"));
        panel.add(comboBoxInput.get("Грунтовка"));
        panel.add(labelsInput.get("Цвет"));
        panel.add(comboBoxInput.get("Цвет"));
        panel.add(labelsInput.get("Дополнительные работы"));
        panel.add(textFieldInput.get("Дополнительные работы"));
        panel.add(labelsInput.get("Упаковка"));
        panel.add(comboBoxInput.get("Упаковка"));
        panel.add(labelsInput.get("Наценка"));
        panel.add(textFieldInput.get("Наценка"));
    }

    // функция отвечает за отображение всех элементов панели ввода
    public static void setVisible(boolean b) {
        for (String key : labelsTitle.keySet()){
            labelsTitle.get(key).setVisible(b);
        }
        for (String key : labelsInput.keySet()){
            labelsInput.get(key).setVisible(b);
        }
        for (String key : textFieldInput.keySet()){
            textFieldInput.get(key).setVisible(b);
        }
        for (String key : comboBoxInput.keySet()){
            comboBoxInput.get(key).setVisible(b);
        }
    }

    // функция отображает только элементы для расчёта экранов
    public static void setVisibleEkran() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Экраны").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Глубина").setVisible(true);
        textFieldInput.get("Глубина").setVisible(true);

        labelsInput.get("Бок левый").setVisible(true);
        comboBoxInput.get("Бок левый").setVisible(true);

        labelsInput.get("Бок правый").setVisible(true);
        comboBoxInput.get("Бок правый").setVisible(true);

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Упоры").setVisible(true);
        comboBoxInput.get("Упоры").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток перфорированных встраиваемых
    public static void setVisibleReshetkiPerfoVr() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки перфорированные встраиваемые").setVisible(true);

        labelsInput.get("Размер").setVisible(true);
        comboBoxInput.get("Размер").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setSelectedItem("15");

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("15");

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток перфорированных накладных
    public static void setVisibleReshetkiPerfoNakl() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки перфорированные накладные").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка плиточная").setVisible(true);
        comboBoxInput.get("Рамка плиточная").setVisible(true);
        comboBoxInput.get("Рамка плиточная").setSelectedItem("Нет");

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("15");

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток перфорированных плоских
    public static void setVisibleReshetkiPerfoPl() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки перфорированные плоские").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setSelectedItem("20");

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток перфорированных плоских с подгибом рамки
    public static void setVisibleReshetkiPerfoPlspod() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки перфорированные плоские с подгибом").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setSelectedItem("25");

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток перфорированных выпуклых
    public static void setVisibleReshetkiPerfoVipukl() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки перфорированные выпуклые").setVisible(true);

        labelsInput.get("Размер").setVisible(true);
        comboBoxInput.get("Размер").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Выпуклость").setVisible(true);
        textFieldInput.get("Выпуклость").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setSelectedItem("15");

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("15");

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта люков встраиваемых
    public static void setVisibleHatchVr() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Люки встраиваемые").setVisible(true);

        labelsInput.get("Размер").setVisible(true);
        comboBoxInput.get("Размер").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setSelectedItem("20");

        labelsInput.get("Рамка с подгибом").setVisible(true);
        comboBoxInput.get("Рамка с подгибом").setVisible(true);
        comboBoxInput.get("Рамка с подгибом").setSelectedIndex(0);

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("20");

        labelsInput.get("Двухдверный").setVisible(true);
        comboBoxInput.get("Двухдверный").setVisible(true);
        comboBoxInput.get("Двухдверный").setSelectedIndex(0);

        labelsInput.get("Усилитель").setVisible(true);
        comboBoxInput.get("Усилитель").setVisible(true);
        comboBoxInput.get("Усилитель").setSelectedIndex(0);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Магнит").setVisible(true);
        comboBoxInput.get("Магнит").setVisible(true);

        labelsInput.get("Ручка мебельная").setVisible(true);
        comboBoxInput.get("Ручка мебельная").setVisible(true);

        labelsInput.get("Замок").setVisible(true);
        comboBoxInput.get("Замок").setVisible(true);

        labelsInput.get("Шпингалет").setVisible(true);
        comboBoxInput.get("Шпингалет").setVisible(true);

        labelsInput.get("Замок").setVisible(true);
        comboBoxInput.get("Замок").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);

    }

    // функция отображает только элементы для расчёта люков накладных
    public static void setVisibleHatchNakl() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Люки накладные").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("20");

        labelsInput.get("Двухдверный").setVisible(true);
        comboBoxInput.get("Двухдверный").setVisible(true);
        comboBoxInput.get("Двухдверный").setSelectedIndex(0);

        labelsInput.get("Усилитель").setVisible(true);
        comboBoxInput.get("Усилитель").setVisible(true);
        comboBoxInput.get("Усилитель").setSelectedIndex(0);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Магнит").setVisible(true);
        comboBoxInput.get("Магнит").setVisible(true);

        labelsInput.get("Ручка мебельная").setVisible(true);
        comboBoxInput.get("Ручка мебельная").setVisible(true);

        labelsInput.get("Замок").setVisible(true);
        comboBoxInput.get("Замок").setVisible(true);

        labelsInput.get("Шпингалет").setVisible(true);
        comboBoxInput.get("Шпингалет").setVisible(true);

        labelsInput.get("Замок").setVisible(true);
        comboBoxInput.get("Замок").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта коробов Г-образных
    public static void setVisibleKorobG() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Короба Г").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Глубина").setVisible(true);
        textFieldInput.get("Глубина").setVisible(true);

        labelsInput.get("Уголок").setVisible(true);
        comboBoxInput.get("Уголок").setVisible(true);

        labelsInput.get("Радиус").setVisible(true);
        comboBoxInput.get("Радиус").setVisible(true);

        labelsInput.get("Бок левый").setVisible(true);
        comboBoxInput.get("Бок левый").setVisible(true);

        labelsInput.get("Бок правый").setVisible(true);
        comboBoxInput.get("Бок правый").setVisible(true);

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Упоры").setVisible(true);
        comboBoxInput.get("Упоры").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта коробов П-образных
    public static void setVisibleKorobP() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Короба П").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Глубина").setVisible(true);
        textFieldInput.get("Глубина").setVisible(true);

        labelsInput.get("Высота вторая").setVisible(true);
        textFieldInput.get("Высота вторая").setVisible(true);

        labelsInput.get("Уголок").setVisible(true);
        comboBoxInput.get("Уголок").setVisible(true);

        labelsInput.get("Радиус").setVisible(true);
        comboBoxInput.get("Радиус").setVisible(true);

        labelsInput.get("Бок левый").setVisible(true);
        comboBoxInput.get("Бок левый").setVisible(true);

        labelsInput.get("Бок правый").setVisible(true);
        comboBoxInput.get("Бок правый").setVisible(true);

        labelsInput.get("Перфорация").setVisible(true);
        comboBoxInput.get("Перфорация").setVisible(true);

        labelsInput.get("Вырезы").setVisible(true);
        comboBoxInput.get("Вырезы").setVisible(true);

        labelsInput.get("Упоры").setVisible(true);
        comboBoxInput.get("Упоры").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток жалюзийных встраиваемых
    public static void setVisibleReshetkiZaluzVr() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки жалюзийные встраиваемые").setVisible(true);

        labelsInput.get("Размер").setVisible(true);
        comboBoxInput.get("Размер").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").setVisible(true);
        comboBoxInput.get("Рамка от жалюзийной встраиваемой").setSelectedItem("30");

        labelsInput.get("Рамка с подгибом").setVisible(true);
        comboBoxInput.get("Рамка с подгибом").setVisible(true);
        comboBoxInput.get("Рамка с подгибом").setSelectedIndex(0);

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("20");

        labelsInput.get("Усилитель").setVisible(true);
        comboBoxInput.get("Усилитель").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    // функция отображает только элементы для расчёта решёток жалюзийных накладных
    public static void setVisibleReshetkiZaluzNakl() {

        // скрыть все элементы
        setVisible(false);

        labelsTitle.get("Решётки жалюзийные накладные").setVisible(true);

        labelsInput.get("Длина").setVisible(true);
        textFieldInput.get("Длина").setVisible(true);

        labelsInput.get("Высота").setVisible(true);
        textFieldInput.get("Высота").setVisible(true);

        labelsInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setVisible(true);
        comboBoxInput.get("Рамка").setSelectedItem("20");

        labelsInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setVisible(true);
        comboBoxInput.get("Ребро").setSelectedItem("20");

        labelsInput.get("Усилитель").setVisible(true);
        comboBoxInput.get("Усилитель").setVisible(true);

        labelsInput.get("Отверстия").setVisible(true);
        comboBoxInput.get("Отверстия").setVisible(true);

        labelsInput.get("Грунтовка").setVisible(true);
        comboBoxInput.get("Грунтовка").setVisible(true);

        labelsInput.get("Цвет").setVisible(true);
        comboBoxInput.get("Цвет").setVisible(true);

        labelsInput.get("Дополнительные работы").setVisible(true);
        textFieldInput.get("Дополнительные работы").setVisible(true);

        labelsInput.get("Упаковка").setVisible(true);
        comboBoxInput.get("Упаковка").setVisible(true);

        labelsInput.get("Наценка").setVisible(true);
        textFieldInput.get("Наценка").setVisible(true);
    }

    public static void setVisibleHatchPerfoVr() {

    }

    public static void setVisibleHatchPerfoNakl() {

    }
}
