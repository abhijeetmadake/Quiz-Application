import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  NumbersQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    NumbersQuiz(String s) {
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
        radioButtons[0].setBounds(50, 80, 450, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[3].setBounds(50, 170, 200, 20);

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
            label.setText("Q.1:What is the next number in the sequence: 2, 5, 10, 17, ...?");
            radioButtons[0].setText("A) 24");
            radioButtons[1].setText("B) 26");
            radioButtons[2].setText("C) 29");
            radioButtons[3].setText("D) 32");
        }
        if (current == 1) {
            label.setText("Q.2:What is the product of the first five prime numbers?");
            radioButtons[0].setText("A) 110");
            radioButtons[1].setText("B) 210");
            radioButtons[2].setText("C) 231");
            radioButtons[3].setText("D) 300");
        }
        if (current == 2) {
            label.setText("Q.3:What is the sum of the first 20 odd numbers?");
            radioButtons[0].setText("A) 200");
            radioButtons[1].setText("B) 400");
            radioButtons[2].setText("C) 500");
            radioButtons[3].setText("D) 600");
        }
        if (current == 3) {
            label.setText("Q.4:If a number is divisible by both 3 and 5, then it must also be divisible by?");
            radioButtons[0].setText("A) 7");
            radioButtons[1].setText("B) 8");
            radioButtons[2].setText("C) 10");
            radioButtons[3].setText("D) 12");
        }
        if (current == 4) {
            label.setText("Q.5:Which of the following numbers is a perfect square?`");
            radioButtons[0].setText("A)81");
            radioButtons[1].setText("B) 98");
            radioButtons[2].setText("C) 105");
            radioButtons[3].setText("D) 114");
        }
        if (current == 5) {
            label.setText("Q.6:What is the next number in the sequence: 2, 6, 12, 20, ...?");
            radioButtons[0].setText("A) 24");
            radioButtons[1].setText("B) 28");
            radioButtons[2].setText("C) 32");
            radioButtons[3].setText("D) 36");
        }
        if (current == 6) {
            label.setText("Q.7:What is the smallest prime number greater than 50?");
            radioButtons[0].setText("A) 51");
            radioButtons[1].setText("B) 53");
            radioButtons[2].setText("C) 55");
            radioButtons[3].setText("D) 57");
        }
        if (current == 7) {
            label.setText("Q.8:If the sum of two consecutive integers is 45, what are the two integers?");
            radioButtons[0].setText("A) 21 and 24");
            radioButtons[1].setText("B) 22 and 23");
            radioButtons[2].setText("C) 23 and 24");
            radioButtons[3].setText("D) 24 and 25");
        }
        if (current == 8) {
            label.setText("Q.9:What is the next number in the sequence: 1, 1, 2, 3, 5, 8, 13, ...?");
            radioButtons[0].setText("A) 18");
            radioButtons[1].setText("B) 21");
            radioButtons[2].setText("C) 23");
            radioButtons[3].setText("D) 34");
        }
        if (current == 9) {
            label.setText("Q.10:Which of the following numbers is a perfect square?");
            radioButtons[0].setText("A) 64");
            radioButtons[1].setText("B) 72");
            radioButtons[2].setText("C) 81");
            radioButtons[3].setText("D) 90");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[2].isSelected());
        }
        if (current == 1) {
            return (radioButtons[1].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[3].isSelected());
        }
        if (current == 3) {
            return (radioButtons[2].isSelected());
        }
        if (current == 4) {
            return (radioButtons[0].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[3].isSelected());
        }
        if (current == 9) {
            return (radioButtons[0].isSelected());
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