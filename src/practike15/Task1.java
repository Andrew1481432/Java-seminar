package practike15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {

    JTextArea jta1 = new JTextArea(2,10);
    JTextArea jta2 = new JTextArea(2,10);
    JButton add = new JButton("+");
    JButton minus = new JButton("-");
    JButton multi = new JButton("*");
    JButton del = new JButton("/");

    public Task1() {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(jta1);
        panel.add(jta2);
        panel.add(add);
        panel.add(minus);
        panel.add(multi);
        panel.add(del);
        panel.setPreferredSize(new Dimension(100, 200));
        add(panel, BorderLayout.LINE_START);

        initListener();
    }

    private void initListener() {
        add.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent alert) {
                                      try {
                                          double x1 = Double.parseDouble(jta1.getText().trim());
                                          double x2 = Double.parseDouble(jta2.getText().trim());

                                          JOptionPane.showMessageDialog(null, "Result = "+(x1+x2), "TEST", JOptionPane.INFORMATION_MESSAGE);
                                      } catch (Exception e) {
                                          JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                                      }
                                  }
                              });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent alert) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = "+(x1-x2), "TEST", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent alert) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = "+(x1*x2), "TEST", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        del.addActionListener(alert -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                if(x2==0) {
                    JOptionPane.showMessageDialog(null, "Can't divide by zero!", "Alert", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(null, "Result = "+(x1/x2), "TEST", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        });
    }



    /**
     * Напишите программу калькулятор, используя пример в листинге
     * 15.6. Реализуйте помимо сложения вычитание, деление и умножение для двух
     * чисел, которые вводятся с клавиатуры.
     * @param args
     */
    public static void main(String[] args) {
        (new Task1()).setVisible(true);
    }

}
