import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  CSSQuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    CSSQuizTest(String s) {
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

        label.setBounds(30, 40, 450, 20);
        radioButtons[0].setBounds(50, 80, 600, 20);
        radioButtons[1].setBounds(50, 110, 600, 20);
        radioButtons[2].setBounds(50, 140, 600, 20);
        radioButtons[3].setBounds(50, 170, 600, 20);

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
            label.setText("Q.1:Which of the following is not a valid CSS selector?");
            radioButtons[0].setText("A) .class-name");
            radioButtons[1].setText("B) #id");
            radioButtons[2].setText("C) //element");
            radioButtons[3].setText("D) element");
        }
        if (current == 1) {
            label.setText("Q.2:Which CSS property is used to change the text color of an element?");
            radioButtons[0].setText("A) font-style");
            radioButtons[1].setText("B) text-color");
            radioButtons[2].setText("C) color");
            radioButtons[3].setText("D) font-color");
        }
        if (current == 2) {
            label.setText("Q.3:In CSS, what property is used to control the spacing between lines of text within an element?");
            radioButtons[0].setText("A) line-spacing");
            radioButtons[1].setText("B) spacing");
            radioButtons[2].setText("C) line-height");
            radioButtons[3].setText("D) text-spacing");
        }
        if (current == 3) {
            label.setText("Q.4:Which CSS property is used to set the background color of an element?");
            radioButtons[0].setText("A) background-color");
            radioButtons[1].setText("B) bg-color");
            radioButtons[2].setText("C) color-background");
            radioButtons[3].setText("D) background");
        }
        if (current == 4) {
            label.setText("Q.5:How can you include comments in CSS?");
            radioButtons[0].setText("A) /* This is a comment */");
            radioButtons[1].setText("B) // This is a comment");
            radioButtons[2].setText("C) <!-- This is a comment -->");
            radioButtons[3].setText("D) ' This is a comment");
        }
       

        if (current == 5) {
            label.setText("Q.6: Which CSS property is used to set the width of an element?");
            radioButtons[0].setText("A) size");
            radioButtons[1].setText("B) width");
            radioButtons[2].setText("C) element-width");
            radioButtons[3].setText("D) dimension");
        }
        if (current == 6) {
            label.setText("Q.7:What is the default value of the position property in CSS?");
            radioButtons[0].setText("A) relative");
            radioButtons[1].setText("B) fixed");
            radioButtons[2].setText("C) absolute");
            radioButtons[3].setText("D) static");
        }
        if (current == 7) {
            label.setText("Q.8:Which CSS property is used to add shadows to text?");
            radioButtons[0].setText("A) shadow ");
            radioButtons[1].setText("B) text-shadow");
            radioButtons[2].setText("C) text-effect");
            radioButtons[3].setText("D) shadow-text");
        }
        if (current == 8) {
            label.setText("Q.9:Which of the following CSS units represents a percentage of the viewport width?");
            radioButtons[0].setText("A) px");
            radioButtons[1].setText("B) vw");
            radioButtons[2].setText("C) em");
            radioButtons[3].setText("D) %");
        }
        if (current == 9) {
            label.setText("Q.10:What does CSS stand for?");
            radioButtons[0].setText("A) Cascading Style Script");
            radioButtons[1].setText("B) Creative Style Sheets");
            radioButtons[2].setText("C) Cascading Style Sheets");
            radioButtons[3].setText("D) Computer Style Sheets");
        }

        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[2].isSelected());
        }
        if (current == 1) {
            return (radioButtons[2].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[0].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[3].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
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