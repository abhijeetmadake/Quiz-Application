import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  AntonymsQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    AntonymsQuiz(String s) {
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
            label.setText("Q.1:Which word is an antonym for \"hot\"?");
            radioButtons[0].setText("A) Warm");
            radioButtons[1].setText("B) cold");
            radioButtons[2].setText("C) Scorching");
            radioButtons[3].setText("D) Boiling");
        }
        if (current == 1) {
            label.setText("Q.2:Choose the antonym for \"happy\"?");
            radioButtons[0].setText("A) Sad");
            radioButtons[1].setText("B) Joyful");
            radioButtons[2].setText("C) Content");
            radioButtons[3].setText("D) Elated");
        }
        if (current == 2) {
            label.setText("Q.3:What is an antonym for \"fast\"?");
            radioButtons[0].setText("A) Slow");
            radioButtons[1].setText("B) Rapid");
            radioButtons[2].setText("C) Quick");
            radioButtons[3].setText("D) Swift");
        }
        if (current == 3) {
            label.setText("Q.4:Select the antonym for \"dark\"?");
            radioButtons[0].setText("A) Gloomy");
            radioButtons[1].setText("B) Bright");
            radioButtons[2].setText("C) Shadowy");
            radioButtons[3].setText("D)  Murky");
        }
        if (current == 4) {
            label.setText("Q.5:Choose the antonym for \"big\"?");
            radioButtons[0].setText("A) Small");
            radioButtons[1].setText("B) Giant.");
            radioButtons[2].setText("C) Huge");
            radioButtons[3].setText("D) Massive");
        }
        if (current == 5) {
            label.setText("Q.6:What is an antonym for \"beautiful\"?");
            radioButtons[0].setText("A) Ugly");
            radioButtons[1].setText("B) Pretty");
            radioButtons[2].setText("C) Attractive");
            radioButtons[3].setText("D) Lovely");
        }
        if (current == 6) {
            label.setText("Q.7:Select the antonym for \"strong\"?");
            radioButtons[0].setText("A) Powerful");
            radioButtons[1].setText("B) Mighty");
            radioButtons[2].setText("C) Weak");
            radioButtons[3].setText("D) Robust");
        }
        if (current == 7) {
            label.setText("Q.8:Choose the antonym for \"soft\"?");
            radioButtons[0].setText("A) Smooth");
            radioButtons[1].setText("B) Tender");
            radioButtons[2].setText("C) Hard");
            radioButtons[3].setText("D) Gentle");
        }
        if (current == 8) {
            label.setText("Q.9:What is an antonym for \"noisy\"?");
            radioButtons[0].setText("A) Loud");
            radioButtons[1].setText("B) Quiet");
            radioButtons[2].setText("C) Rambunctious");
            radioButtons[3].setText("D) Boisterous");
        }
        if (current == 9) {
            label.setText("Q.10:Select the antonym for \"young\"?");
            radioButtons[0].setText("A) New");
            radioButtons[1].setText("B) Fresh");
            radioButtons[2].setText("C) Old.");
            radioButtons[3].setText("D) Youthful");
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
            return (radioButtons[0].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[0].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[1].isSelected());
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