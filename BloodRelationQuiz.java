import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  BloodRelationQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    BloodRelationQuiz(String s) {
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
            label.setText("Q.1:What is the relationship of your father's sister to you?");
            radioButtons[0].setText("A) Aunt");
            radioButtons[1].setText("B) Sister");
            radioButtons[2].setText("C) Cousin");
            radioButtons[3].setText("D) Niece");
        }
        if (current == 1) {
            label.setText("Q.2:If Jane's mother is your aunt, what is your relationship to Jane?");
            radioButtons[0].setText("A) Cousin");
            radioButtons[1].setText("B) Nephew/Niece");
            radioButtons[2].setText("C) Sister/Brother");
            radioButtons[3].setText("D) None of the above");
        }
        if (current == 2) {
            label.setText("Q.3:If Bob is Sarah's son, and Sarah is your mother, what is Bob's relationship to you?");
            radioButtons[0].setText("A) Brother");
            radioButtons[1].setText("B) Nephew");
            radioButtons[2].setText("C) Son");
            radioButtons[3].setText("D) Cousin");
        }
        if (current == 3) {
            label.setText("Q.4:What is the relationship between your father's brother and you?");
            radioButtons[0].setText("A) Uncle");
            radioButtons[1].setText("B) Father");
            radioButtons[2].setText("C) Brother");
            radioButtons[3].setText("D) Cousin");
        }
        if (current == 4) {
            label.setText("Q.5:If Peter's sister is your mother, what is Peter's relationship to you?");
            radioButtons[0].setText("A) Cousin");
            radioButtons[1].setText("B) Brother.");
            radioButtons[2].setText("C) Nephew");
            radioButtons[3].setText("D) Uncle");
        }
        if (current == 5) {
            label.setText("Q.6:If Alex's father is your father's brother, what is Alex's relationship to you?");
            radioButtons[0].setText("A) Cousin");
            radioButtons[1].setText("B) Nephew");
            radioButtons[2].setText("C) Brother");
            radioButtons[3].setText("D) Son");
        }
        if (current == 6) {
            label.setText("Q.7:If Mia is your sister's daughter, what is Mia's relationship to you?");
            radioButtons[0].setText("A) Niece");
            radioButtons[1].setText("B) Sister");
            radioButtons[2].setText("C) Daughter");
            radioButtons[3].setText("D) Aunt");
        }
        if (current == 7) {
            label.setText("Q.8:What is the relationship between your father's mother and you?");
            radioButtons[0].setText("A) Grandmother");
            radioButtons[1].setText("B) Mother");
            radioButtons[2].setText("C) Aunt");
            radioButtons[3].setText("D) Sister");
        }
        if (current == 8) {
            label.setText("Q.9:If Steve's father is your father's son, what is Steve's relationship to you?");
            radioButtons[0].setText("A) Brother");
            radioButtons[1].setText("B) Nephew");
            radioButtons[2].setText("C) Cousin");
            radioButtons[3].setText("D) Son");
        }
        if (current == 9) {
            label.setText("Q.10:What is the relationship between your mother's father and you?");
            radioButtons[0].setText("A) Grandfather");
            radioButtons[1].setText("B) Father");
            radioButtons[2].setText("C) Uncle.");
            radioButtons[3].setText("D) Brother");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 1500, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[0].isSelected());
        }
        if (current == 1) {
            return (radioButtons[0].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
        }
        if (current == 8) {
            return (radioButtons[1].isSelected());
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