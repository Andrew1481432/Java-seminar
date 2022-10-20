package practike12;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 3. Создать окно, реализовать анимацию, с помощью картинки,
 * состоящей из нескольких кадров.
 */
public class AnimationTask3 extends JFrame implements ActionListener{

    ImageIcon images[];
    int totalImages = 10, currentImage = 0, animationDelay = 1000;
    Timer animationTimer;
    public AnimationTask3() {
        images = new ImageIcon[totalImages];

        for (int i = 0; i < images.length; ++i)
            images[i] = new ImageIcon("resources/images/java"+i+".png");

        startAnimation();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (images[currentImage].getImageLoadStatus() == MediaTracker.COMPLETE) {
            images[currentImage].paintIcon(this, g, 0, 0);
            currentImage = (currentImage + 1) % totalImages;
        }
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void startAnimation() {
        if (animationTimer == null) {
            currentImage = 0;
            animationTimer = new Timer(animationDelay, this);
            animationTimer.start();
        } else if (!animationTimer.isRunning())
            animationTimer.restart();
    }

    public void stopAnimation() {
        animationTimer.stop();
    }
    public static void main(String args[]) {
        AnimationTask3 anim = new AnimationTask3();
        anim.setSize(300,300);
        anim.setVisible(true);
    }

}
