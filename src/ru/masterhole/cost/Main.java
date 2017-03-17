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
        mainFrame.loadDefaultSettings();

        // инициализация трёх панелей
        Panels panels = new Panels();
        // загрузка настроек трёх панелей
        panels.loadDefaultSettings();
        // добавление трёх панелей на главный фрейм
        panels.addToFrame(MainFrame.frame);

        // инициализация элементов меню
        ItemsMenu itemsMenu = new ItemsMenu();
        // загрузка настроек элементов меню
        itemsMenu.loadDefaultSettings();
        // добавление элементов меню на панель меню
        itemsMenu.addItemsToPanel(Panels.panelMenu);

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
