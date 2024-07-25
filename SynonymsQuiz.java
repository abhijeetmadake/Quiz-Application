import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  SynonymsQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    SynonymsQuiz(String s) {
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
            label.setText("Q.1:Which word is a synonym for \"happy\"?");
            radioButtons[0].setText("A) Sad");
            radioButtons[1].setText("B) Joyful");
            radioButtons[2].setText("C) Angry");
            radioButtons[3].setText("D) Tired");
        }
        if (current == 1) {
            label.setText("Q.2:Choose the synonym for \"big\"?");
            radioButtons[0].setText("A) Small");
            radioButtons[1].setText("B) Tiny");
            radioButtons[2].setText("C) Large");
            radioButtons[3].setText("D) Miniute");
        }
        if (current == 2) {
            label.setText("Q.3:What is a synonym for \"brave\"?");
            radioButtons[0].setText("A) Cowardly");
            radioButtons[1].setText("B) Fearful");
            radioButtons[2].setText("C) Courageous");
            radioButtons[3].setText("D)  Scared");
        }
        if (current == 3) {
            label.setText("Q.4:Which word is a synonym for \"beautiful\"?");
            radioButtons[0].setText("A) Ugly");
            radioButtons[1].setText("B) Pretty");
            radioButtons[2].setText("C) Plain");
            radioButtons[3].setText("D)  Hideous");
        }
        if (current == 4) {
            label.setText("Q.5:Select the synonym for \"angry\"?");
            radioButtons[0].setText("A) Happy");
            radioButtons[1].setText("B) Furious.");
            radioButtons[2].setText("C) Excited");
            radioButtons[3].setText("D) Content");
        }
        if (current == 5) {
            label.setText("Q.6:Choose the synonym for \"smart\"?");
            radioButtons[0].setText("A) Dull");
            radioButtons[1].setText("B) Clever");
            radioButtons[2].setText("C) Stupid");
            radioButtons[3].setText("D) Slow");
        }
        if (current == 6) {
            label.setText("Q.7:What is a synonym for \"fast\"?");
            radioButtons[0].setText("A) Slow");
            radioButtons[1].setText("B) Rapid");
            radioButtons[2].setText("C) Quick");
            radioButtons[3].setText("D) Leisurely");
        }
        if (current == 7) {
            label.setText("Q.8:Which word is a synonym for \"sad\"?");
            radioButtons[0].setText("A) Joyful");
            radioButtons[1].setText("B) Gloomy");
            radioButtons[2].setText("C) Happy");
            radioButtons[3].setText("D) Exiceted");
        }
        if (current == 8) {
            label.setText("Q.9:Choose the synonym for \"kind\"?");
            radioButtons[0].setText("A) Mean");
            radioButtons[1].setText("B) Rude");
            radioButtons[2].setText("C) Generous");
            radioButtons[3].setText("D) Cruel");
        }
        if (current == 9) {
            label.setText("Q.10:What is a synonym for \"quiet\"?");
            radioButtons[0].setText("A) Loud");
            radioButtons[1].setText("B) Noisy");
            radioButtons[2].setText("C) Silent.");
            radioButtons[3].setText("D) Talkative");
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
            return (radioButtons[2].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
        }
        if (current == 8) {
            return (radioButtons[2].isSelected());
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