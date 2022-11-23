package practike16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 extends JFrame {

    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JTextField jta3 = new JTextField(10);
    JButton button = new JButton("Check pass");

    Task3(){
        super("Password app");
        setResizable(false);
        setLayout(new FlowLayout());
        setSize(250,155);

        // создаем надпись 1
        add(new JLabel("Service:"));
        add(jta1);

        add(new JLabel("User name:"));
        add(jta2);

        add(new JLabel("Password:"));
        add(jta3);

        // добавляем кнопку
        add(button);

        initListener();
    }
    private void initListener() {
        button.addActionListener(alert -> {
            if(jta3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter pass!", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String text = jta3.getText();
            if(practike14.Task7.checkPass(text)) {
                JOptionPane.showMessageDialog(null, "Пароль корректный!", "CORRECT PASS", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Пароль некорректный!", "Not correct password", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new Task3().setVisible(true);
    }

}
