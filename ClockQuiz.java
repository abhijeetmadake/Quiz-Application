import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  ClockQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
String name;
    ClockQuiz(String s) {
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
            label.setText("Q.1:At what time between 3 and 4 o'clock will the hour and minute hands of a clock be perpendicular to each other?");
            radioButtons[0].setText("A) 3:10");
            radioButtons[1].setText("B) 3:15");
            radioButtons[2].setText("C) 3:20");
            radioButtons[3].setText("D) 3:30");
        }
        if (current == 1) {
            label.setText("Q.2:How many times do the minute and hour hands of a clock overlap in a 12-hour period?");
            radioButtons[0].setText("A) 11");
            radioButtons[1].setText("B) 12");
            radioButtons[2].setText("C) 22");
            radioButtons[3].setText("D) 24");
        }
        if (current == 2) {
            label.setText("Q.3:What is the angle between the hour and minute hands of a clock at 9:20?");
            radioButtons[0].setText("A) 50°");
            radioButtons[1].setText("B) 60°");
            radioButtons[2].setText("C) 70°");
            radioButtons[3].setText("D) 80°");
        }
        if (current == 3) {
            label.setText("Q.4:If the time is 3:15, what is the acute angle between the hour and minute hands of the clock?");
            radioButtons[0].setText("A) 20°");
            radioButtons[1].setText("B) 30°");
            radioButtons[2].setText("C) 40°");
            radioButtons[3].setText("D) 45°");
        }
        if (current == 4) {
            label.setText("Q.5:How many times in a day do the hands of a clock form a straight line but not coincide?");
            radioButtons[0].setText("A) 20");
            radioButtons[1].setText("B) 22");
            radioButtons[2].setText("C) 24");
            radioButtons[3].setText("D) 26");
        }
        if (current == 5) {
            label.setText("Q.6:If the time is 8:30, what is the reflex angle between the hour and minute hands of the clock?");
            radioButtons[0].setText("A) 150°");
            radioButtons[1].setText("B) 160°");
            radioButtons[2].setText("C) 170°");
            radioButtons[3].setText("D) 180°");
        }
        if (current == 6) {
            label.setText("Q.7:At what time between 4 and 5 o'clock will the minute hand of a clock be exactly on the hour hand?");
            radioButtons[0].setText("A) 4:12 1/11");
            radioButtons[1].setText("B) 4:13 1/11");
            radioButtons[2].setText("C) 4:14 2/11");
            radioButtons[3].setText("D) 4:15");
        }
        if (current == 7) {
            label.setText("Q.8:If a clock loses 5 minutes every hour, by how much does it lose in a day?");
            radioButtons[0].setText("A) 1 hour");
            radioButtons[1].setText("B) 2 hours");
            radioButtons[2].setText("C) 3 hours");
            radioButtons[3].setText("D) 4 hours");
        }
        if (current == 8) {
            label.setText("Q.9:At what time will the hour and minute hands of a clock be coincident for the first time after 12 o'clock?");
            radioButtons[0].setText("A) 1:05 5/11");
            radioButtons[1].setText("B) 1:06 5/11");
            radioButtons[2].setText("C) 1:07 5/11");
            radioButtons[3].setText("D) 1:08 5/11");
        }
        if (current == 9) {
            label.setText("Q.10:If the time is 5:30, what is the angle between the hour and minute hands of the clock?");
            radioButtons[0].setText("A) 135°");
            radioButtons[1].setText("B) 150°");
            radioButtons[2].setText("C) 165°");
            radioButtons[3].setText("D) 180°");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[1].isSelected());
        }
        if (current == 1) {
            return (radioButtons[0].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[3].isSelected());
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
            return (radioButtons[0].isSelected());
        }
        if (current == 9) {
            return (radioButtons[2].isSelected());
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