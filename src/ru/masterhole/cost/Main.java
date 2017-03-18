package ru.masterhole.cost;

/**
 * Автор: Павел "viewsoul" Фетисов
 * Дата создания: 09.11.2016.
 */
public class Main {

    public static void main (String[] args){

        // инициализация главного фрейма
        MainFrame mainFrame = new MainFrame();
        // загрузка настроек главного фрейма
        mainFrame.settingsDefault();

        // инициализация трёх панелей
        Panels panels = new Panels();
        // загрузка настроек трёх панелей
        panels.loadDefaultSettings();
        // добавление трёх панелей на главный фрейм
        panels.add(MainFrame.frame);

        // инициализация кнопок для панели меню
        ButtonsController controllerMenu = new ButtonsController();
        // добавление кнопок на панель меню
        controllerMenu.add(Panels.panelMenu);

        // инициализация элементов ввода для панели ввода
        ItemsInput itemsInput = new ItemsInput();

        // загрузка настроек элементов ввода
        itemsInput.loadDefaultSettings();

        // добавление элементов на панель ввода
        itemsInput.addItemsToPanel(Panels.panelInput);

        ItemsOutput itemsOutput = new ItemsOutput();
        itemsOutput.loadDefault();
    }
}
