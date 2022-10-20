package practike12;

import javax.swing.*;
import java.awt.*;

public class Task2Example extends JFrame {


    Task2Example(String pathImage) {
        setTitle("Task2 Image");

        ImageIcon image = new ImageIcon(pathImage);
        JLabel label = new JLabel(image);
        JScrollPane scrollPane = new JScrollPane(label);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane, BorderLayout.CENTER);
        pack();
    }

    /*
     * 2. Создать окно, отобразить в нем картинку, путь к которой указан в
     * аргументах командной строки.
     */
    public static void main(String[] args) {
        if(args.length == 1) {
            (new Task2Example(args[0])).setVisible(true);
        } else {
            System.out.print("Укажите путь к картинке!");
        }
    }

}
