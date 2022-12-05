package practike16;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {

    Task2(){
        setSize(720, 480);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea();
        ta.setRows(10);
        ta.setColumns(20);

        ta.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        String[] colors = {"Черный", "Красный", "Синий"};
        JComboBox<String> cols = new JComboBox<>(colors);
        cols.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(f);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> ta.setFont(new Font(f[fonts.getSelectedIndex()], Font.PLAIN, 12)));

        cols.addItemListener(e -> {
            Color c;
            switch (cols.getSelectedIndex()){
                case 1:
                    c = Color.RED;
                    break;
                case 2:
                    c = Color.BLUE;
                    break;
                default:
                    c = Color.BLACK;
            }
            ta.setForeground(c);
        });

        add(cols);
        add(fonts);
        add(ta);

    }

    public static void main(String[] args) {
        new Task2().setVisible(true);
    }

}
