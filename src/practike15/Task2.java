package practike15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame {

    Task2() {
        setSize(300,300);
        setLayout(new FlowLayout());
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        String[] str = {"Australia", "China", "England", "Russia"};
        JComboBox comboBox = new JComboBox(str);
        final JLabel label = new JLabel(" ");
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                label.setText(item);
            }
        };
        panel.add(comboBox);
        panel.add(label);
        comboBox.addActionListener(actionListener);
        add(panel, BorderLayout.LINE_START);
    }

    /**
     * Разработайте программу выбора меню как на рис. 15.8 ниже. Вам
     * понадобится JComboBox.
     * @param args
     */
    public static void main(String[] args) {
        (new Task2()).setVisible(true);
    }

}
