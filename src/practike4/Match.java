package practike4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Match extends JFrame {
    JLabel LastScorer = new JLabel(), Result = new JLabel(), Winner = new JLabel();
    int re = 0, mil = 0;

    JButton JBRe = new JButton("Real Madrid"), JBMil = new JButton("AC Milan");
    JPanel[] pnl = new JPanel[3];
    JPanel[] pnl2 = new JPanel[3];

    public void updateScore(){
        Result.setText("Result: " + mil + "X" + re);
    }

    public void updateWinner(){
        if (mil > re){
            Winner.setText("Winner: AC Milan");
        } else if (mil == re){
            Winner.setText("Winner: DRAW");
        } else {
            Winner.setText("Winner: Real Madrid");
        }
    }

    public void updateLast(String last){
        LastScorer.setText("Last Scorer " + last);
    }

    Match() {
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(1, 3));

        for(int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[1].setLayout(new GridLayout(3, 1));
        for(int i = 0; i < pnl2.length; i++) {
            pnl2[i] = new JPanel();
            pnl[1].add(pnl2[i]);
        }

        updateScore();
        updateWinner();
        LastScorer.setText("Last Scorer:");

        JBMil.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;

                updateScore();
                updateWinner();
                updateLast("AC Milan");
            }
        });

        JBRe.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                re++;
                updateScore();
                updateWinner();
                updateLast("Real Madrid");
            }
        });

        JBMil.setPreferredSize(new Dimension(900, 600));
        Result.setPreferredSize(new Dimension(900, 200));
        JBRe.setPreferredSize(new Dimension(900, 600));
        LastScorer.setPreferredSize(new Dimension(900, 200));
        Winner.setPreferredSize(new Dimension(900, 200));

        Font font = new Font("Verdana", Font.PLAIN, 24);

        Result.setVerticalAlignment(JLabel.CENTER);
        Result.setHorizontalAlignment(JLabel.CENTER);

        Winner.setVerticalAlignment(JLabel.CENTER);
        Winner.setHorizontalAlignment(JLabel.CENTER);

        LastScorer.setVerticalAlignment(JLabel.CENTER);
        LastScorer.setHorizontalAlignment(JLabel.CENTER);

        Result.setForeground(Color.BLACK);
        JBRe.setForeground(Color.BLACK);
        JBMil.setForeground(Color.BLACK);
        LastScorer.setForeground(Color.BLACK);
        Winner.setForeground(Color.BLACK);

        Result.setFont(font);
        LastScorer.setFont(font);
        Winner.setFont(font);
        JBRe.setFont(font);
        JBMil.setFont(font);

        pnl[0].add(JBMil);
        pnl[2].add(JBRe);

        pnl2[0].add(Winner);
        pnl2[1].add(Result);
        pnl2[2].add(LastScorer);

        setSize(1200, 640);
    }

    public static void main(String[] args) {
        (new Match()).setVisible(true);
    }

}
