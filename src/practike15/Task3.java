package practike15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 extends JFrame {

    Task3() {
        super("Hello swing!");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initMenu();
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
    }

    /**
     * Функция создания меню
     * @return
     */
    private JMenu createMenuHelp() {
        // создадим выпадающее меню
        JMenu viewMenu = new JMenu("Help");
        // меню-флажки
        JMenuItem line  = new JMenuItem("Find action");
        JMenuItem grid  = new JMenuItem("? Help");

        // добавим все в меню
        viewMenu.add(line);
        viewMenu.add(grid);

        return viewMenu;
    }

    /**
     * Функция создания меню
     * @return
     */
    private JMenu createMenuFile() {
        // создадим выпадающее меню
        JMenu viewMenu = new JMenu("File");
        // меню-флажки
        JMenuItem line  = new JMenuItem("Save");
        JMenuItem grid  = new JMenuItem("Close");
        JMenuItem navig = new JMenuItem("About");

        // добавим все в меню
        viewMenu.add(line);
        viewMenu.add(grid);
        viewMenu.add(navig);

        return viewMenu;
    }

    private JMenu createMenuEdit() {
        // создадим выпадающее меню
        JMenu viewMenu = new JMenu("Edit");
        // меню-флажки
        JMenuItem line  = new JMenuItem("Refactor");
        JMenuItem grid  = new JMenuItem("Copy");
        JMenuItem navig = new JMenuItem("Paste");

        // добавим все в меню
        viewMenu.add(line);
        viewMenu.add(grid);
        viewMenu.add(navig);

        return viewMenu;
    }

    private void initMenu() {
        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createMenuFile());
        menuBar.add(createMenuEdit());
        menuBar.add(createMenuHelp());
        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);
        // Открытие окна
    }

    /**
     * Разработайте программу выбора меню как на рис. 15.8 ниже. Вам
     * понадобится JComboBox.
     * @param args
     */
    public static void main(String[] args) {
        (new Task3()).setVisible(true);
    }

}
