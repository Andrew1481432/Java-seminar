package practike12;

import practike12.shapes.Rectangle;
import practike12.shapes.Round;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// awl дерево хабр


/**
 * 1. Создать окно, нарисовать в нем 20 случайных фигур, случайного
 * цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в
 * котором описаны свойства фигуры: цвет, позиция.
 *
 * 2. Создать окно, отобразить в нем картинку, путь к которой указан в
 * аргументах командной строки.
 *
 * 3. Создать окно, реализовать анимацию, с помощью картинки,
 * состоящей из нескольких кадров.
 */
public class BorderExample extends JFrame {

    private Timer timer = null;

    public BorderExample(){
        MouseClkd mouse = new MouseClkd();
        setLayout(new GridLayout());
        add(mouse);

        timer = new Timer(2000, e1 -> {
            if(!mouse.runTask) {
                repaint();
                System.out.println("Work Task for BorderExample");
            }
        });
        timer.start();
        setSize(800,500);
    }

    private static int getRandomCoords(int coords) {
        return (int) (Math.random() * coords) + 1;
    }

    /**
     * 1. Создать окно, нарисовать в нем 20 случайных фигур, случайного
     * цвета. Классы фигур должны наследоваться от абстрактного класса Shape, в
     * котором описаны свойства фигуры: цвет, позиция.
     *
     * @param g the specified Graphics window
     */
    public void paint(Graphics g) {
        int x = getRandomCoords(this.getWidth());
        int y = getRandomCoords(this.getHeight());
        new Round(getRandomColor(), x, y).execute(g);
        x = getRandomCoords(this.getWidth());
        y = getRandomCoords(this.getHeight());
        new Rectangle(getRandomColor(), x, y).execute(g);
    }

    private Color getRandomColor() {
        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }

    public static void main(String[]args){
        new BorderExample().setVisible(true);
    }

    static class MouseClkd extends JPanel {
        private int x;
        private int y;

        public boolean runTask = false;
        private Timer timer = null;

        public MouseClkd() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                        System.out.println("mouseClicked execute for MouseClkd");
                        runTask = true;
                        setForeground(Color.BLACK);

                        x = e.getX();
                        y = e.getY();

                        repaint();
                        if(timer != null) {
                            timer.restart();
                        } else {
                            timer = new Timer(5000, e1 -> {
                                if(runTask) {
                                    runTask = false;
                                    setForeground(Color.WHITE);
                                }
                            });
                            timer.start();
                        }
                }
            });
        }

        public void paint(Graphics g) {
            super.paint(g);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.white);
            g.drawString("(" + x + "," + y + ")", x, y);
        }
    }

}
