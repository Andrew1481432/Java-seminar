package practike16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BorderExample extends JFrame {

    final int ATTEMPTS_FINAL = 3;

    JPanel[] pnl = new JPanel[9];

    JTextField jta = new JTextField();
    JButton but = new JButton("Send");
    public BorderExample()  {

        super("Example");
        setLayout(new GridLayout(3,3));
        for(int i = 0; i < pnl.length; i++){
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(49, 209, 215));

            add(pnl[i]);
        }

        MouseListener action = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // NOOP
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // NOOP
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // NOOP
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JPanel jPanel = (JPanel) e.getSource();
                Color color = jPanel.getBackground();
                switch (color.getBlue()) {
                    case 61:
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
                        break;

                    case 62:
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
                        break;

                    case 63:
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
                        break;

                    case 64:
                        System.out.println("Добро пожаловать ЮАО");
                        //JOptionPane.showMessageDialog(null, "Добро пожаловать ЮАО");
                        break;

                    case 85:
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Округ не определен!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // NOOP
            }
        };

        pnl[1].setBackground(new Color(226, 18, 61)); // NORTH(сао)
        pnl[1].addMouseListener(action);
        pnl[3].setBackground(new Color(226, 18, 62)); // WEST(запад)
        pnl[3].addMouseListener(action);
        pnl[5].setBackground(new Color(226, 18, 63)); // EAST(восток)
        pnl[5].addMouseListener(action);
        pnl[7].setBackground(new Color(226, 18, 64)); // SOUTH(юг)
        pnl[7].addMouseListener(action);


        pnl[4].setBackground(new Color(20, 83, 85)); // CENTER(центр)
        pnl[4].addMouseListener(action);

        Font fnt = new Font("Times new 30 roman",Font.BOLD,20);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);

        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(jta, BorderLayout.CENTER);

        jta.setSize(2,20);
        pnl[7].add(but, BorderLayout.WEST);

        int randomNumber = (int) (Math.random() * 20);
        String randomNumberStr = Integer.toString(randomNumber);

        but.addMouseListener(new MouseListener() {
            int attempts = 0;

            public void mouseClicked(MouseEvent event) {
                if (jta.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Введите число!");
                    return;
                }

                attempts++;
                if (attempts == ATTEMPTS_FINAL)
                    System.exit(1);
                if (jta.getText().equals(randomNumberStr)) {
                    JOptionPane.showMessageDialog(null, "Вы угадали!\nПоздравляю!");
                } else {
                    System.out.println("DEBUG::"+randomNumberStr);
                    String msgNumber = "";
                    if(randomNumber > Integer.parseInt(jta.getText())) {
                        msgNumber = "Число больше!";
                    } else {
                        msgNumber = "Число меньше!";
                    }
                    JOptionPane.showMessageDialog(null, "Вы не угадали :( "+msgNumber+"\nОставшихся попыток: "+(ATTEMPTS_FINAL - attempts));
                }

            }
            public void mouseEntered(MouseEvent event) {

            }

            public void mouseExited(MouseEvent event) {

            }

            public void mousePressed(MouseEvent event) {

            }

            public void mouseReleased(MouseEvent event) {

            }
        });

        setSize(600,400);
    }

    public static void main(String[] args) {
        new BorderExample().setVisible(true);
    }

}
