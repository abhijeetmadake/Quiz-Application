import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class PythonQuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
     int current = 0, x = 1, y = 1, now = 0;
    String name;
    int m[] = new int[10];

    PythonQuizTest(String s) {
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
            label.setText("Q.1:Who's the father of python? ");
            radioButtons[0].setText("A) James Gosling");
            radioButtons[1].setText("B) Guido van Rossum\r\n");
            radioButtons[2].setText("C) Bjarne Stroustrup");
            radioButtons[3].setText("D) None of these");
        }
        if (current == 1) {
            label.setText("Q.2:Which of the following is not a valid data type in Python?");
            radioButtons[0].setText("A) int");
            radioButtons[1].setText("B) str");
            radioButtons[2].setText("C) array");
            radioButtons[3].setText("D) tuple");
        }
        if (current == 2) {
            label.setText("Q.3:Which keyword is used to defined a function in oython?");
            radioButtons[0].setText("A) func");
            radioButtons[1].setText("B) define");
            radioButtons[2].setText("C) function");
            radioButtons[3].setText("D) def");
        }
        if (current == 3) {
            label.setText("Q.4:Which of the following is used to check if two variables refer to the same object in memory?");
            radioButtons[0].setText("A) is");
            radioButtons[1].setText("B) ==");
            radioButtons[2].setText("C) eq");
            radioButtons[3].setText("D) equal");
        }
        if (current == 4) {
            label.setText("Q.5:Which data structure in Python is ordered and immutable?");
            radioButtons[0].setText("A) list");
            radioButtons[1].setText("B) tuple");
            radioButtons[2].setText("C) dictionary");
            radioButtons[3].setText("D) set");
        }
        if (current == 5) {
            label.setText("Q.6:What does the range() function in Python return?");
            radioButtons[0].setText("A) A list of integer");
            radioButtons[1].setText("B) A sequence of numbers");
            radioButtons[2].setText("C) A dictionary");
            radioButtons[3].setText("D) A tuple");
        }
        if (current == 6) {
            label.setText("Q.7:In Python, which keyword is used to define a conditional statement?");
            radioButtons[0].setText("A) then");
            radioButtons[1].setText("B) condition");
            radioButtons[2].setText("C) if");
            radioButtons[3].setText("D) when");
        }
        if (current == 7) {
            label.setText("Q.8:Which of the following methods can be used to remove an item from a list in Python ?");
            radioButtons[0].setText("A) pop() ");
            radioButtons[1].setText("B) delete()");
            radioButtons[2].setText("C) remove()");
            radioButtons[3].setText("D) erase()");
        }
        if (current == 8) {
            label.setText("Q.9:Which of the following is used to create a comment in Python?");
            radioButtons[0].setText("A) //");
            radioButtons[1].setText("B) --");
            radioButtons[2].setText("C) #");
            radioButtons[3].setText("D) //");
        }
        if (current == 9) {
            label.setText("Q.10:Which of the following is the correct way to comment multiple lines in Python?");
            radioButtons[0].setText("A) /comment/");
            radioButtons[1].setText("B) #comment#");
            radioButtons[2].setText("C) //comment");
            radioButtons[3].setText("D) '''comment'''");
        }

        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
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
            return (radioButtons[3].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
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
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[2].isSelected());
        }
        if (current == 9) {
            return (radioButtons[3].isSelected());
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