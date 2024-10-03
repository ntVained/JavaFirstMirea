package ru.mirea.task5.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballScore extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;
    private JButton buttonMilan = new JButton("AC Milan");
    private JButton buttonMadrid = new JButton("Real Madrid");
    private JLabel labelResult = new JLabel("Final score: 0 : 0");
    private JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
    private JLabel labelWinner = new JLabel("Result: DRAW");

    public FootballScore() {
        super("FIFA 2026");
        setSize(400, 100);
        setLayout(new FlowLayout());

        add(buttonMilan);
        add(buttonMadrid);
        add(labelResult);
        add(labelLastScorer);
        add(labelWinner);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                labelResult.setText("Result: " + scoreMilan + " : " + scoreMadrid);
                labelLastScorer.setText("Last Scorer: AC Milan");
                updateWinner();
            }
        });
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                labelResult.setText("Result: " + scoreMilan + " : " + scoreMadrid);
                labelLastScorer.setText("Last Scorer: Real Madrid");
                updateWinner();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void updateWinner() {
        if (scoreMilan > scoreMadrid) {
            labelWinner.setText("Result: Winner - AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            labelWinner.setText("Result: Winner - Real Madrid");
        } else {
            labelWinner.setText("Result: DRAW");
        }
    }
    public static void main(String[] args) {
        new FootballScore();
    }
}
