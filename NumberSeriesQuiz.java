import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  NumberSeriesQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    NumberSeriesQuiz(String s) {
        super(s);
        name=s;
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);

        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Submit");

        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);

        add(btnNext);
        add(btnResult);

        setData();

        label.setBounds(30, 40, 1500, 20);
        radioButtons[0].setBounds(50, 80, 1500, 20);
        radioButtons[1].setBounds(50, 110, 1500, 20);
        radioButtons[2].setBounds(50, 140, 1500, 20);
        radioButtons[3].setBounds(50, 170, 1500, 20);

        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    void setData() {
        radioButtons[4].setSelected(true);
        if (current == 0) {
            label.setText("Q.1:What is the next number in the series: 2, 5, 10, 17, 26, ...?");
            radioButtons[0].setText("A) 34");
            radioButtons[1].setText("B) 35");
            radioButtons[2].setText("C) 37");
            radioButtons[3].setText("D) 38");
        }
        if (current == 1) {
            label.setText("Q.2:What comes next in the series: 3, 6, 12, 24, ...?");
            radioButtons[0].setText("A) 36");
            radioButtons[1].setText("B) 48");
            radioButtons[2].setText("C) 30");
            radioButtons[3].setText("D) 46");
        }
        if (current == 2) {
            label.setText("Q.3:What is the next number in the series: 1, 4, 9, 16, 25, ...?");
            radioButtons[0].setText("A) 36");
            radioButtons[1].setText("B) 49");
            radioButtons[2].setText("C) 64");
            radioButtons[3].setText("D) 81");
        }
        if (current == 3) {
            label.setText("Q.4:What comes next in the series: 8, 17, 32, 57, ...?");
            radioButtons[0].setText("A) 88");
            radioButtons[1].setText("B) 90");
            radioButtons[2].setText("C) 93");
            radioButtons[3].setText("D) 100");
        }
        if (current == 4) {
            label.setText("Q.5:What is the next number in the series: 13, 25, 49, 97, ...?");
            radioButtons[0].setText("A) 185");
            radioButtons[1].setText("B) 193.");
            radioButtons[2].setText("C) 195");
            radioButtons[3].setText("D) 201");
        }
        if (current == 5) {
            label.setText("Q.6:What comes next in the series: 1, 4, 9, 16, 25, ...?");
            radioButtons[0].setText("A) 35");
            radioButtons[1].setText("B) 36");
            radioButtons[2].setText("C) 42");
            radioButtons[3].setText("D) 49");
        }
        if (current == 6) {
            label.setText("Q.7:What is the next number in the series: 5, 10, 20, 40, ...?");
            radioButtons[0].setText("A) 80");
            radioButtons[1].setText("B) 75");
            radioButtons[2].setText("C) 85");
            radioButtons[3].setText("D) 90");
        }
        if (current == 7) {
            label.setText("Q.8:What comes next in the series: 21, 24, 28, 33, ...?");
            radioButtons[0].setText("A) 39");
            radioButtons[1].setText("B) 40");
            radioButtons[2].setText("C) 41");
            radioButtons[3].setText("D) 42");
        }
        if (current == 8) {
            label.setText("Q.9:What is the next number in the series: 144, 121, 100, 81, ...?");
            radioButtons[0].setText("A) 62");
            radioButtons[1].setText("B) 64");
            radioButtons[2].setText("C) 72");
            radioButtons[3].setText("D) 49");
        }
        if (current == 9) {
            label.setText("Q.10:What comes next in the series: 2, 6, 12, 20, ...?");
            radioButtons[0].setText("A) 26");
            radioButtons[1].setText("B) 28");
            radioButtons[2].setText("C) 30.");
            radioButtons[3].setText("D) 32");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 1500, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[1].isSelected());
        }
        if (current == 1) {
            return (radioButtons[1].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[2].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[0].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[3].isSelected());
        }
        if (current == 9) {
            return (radioButtons[1].isSelected());
        }

        return false;
    }

   

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (checkAns())
                count = count + 1;
            current++;
            setData();
            if (current == 9) {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Submit");
            }

        }
        if (e.getActionCommand().equals("Submit"))

        {
            if (checkAns())
                count = count + 1;
            current++;
           new QuizResult(name);
           dispose();
        }
    }


} 