import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.*;

class  CQuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
   static int count = 0;
   int current = 0, x = 1, y = 1, now = 0;
   String name;
    int m[] = new int[10];

    CQuizTest(String s) {
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
            label.setText("Q.1:Which of the following is the correct way to declare a function in C?");
            radioButtons[0].setText("A) void function();");
            radioButtons[1].setText("B) function (void);");
            radioButtons[2].setText("C) void function(void);");
            radioButtons[3].setText("D) function;");
        }
        if (current == 1) {
            label.setText("Q.2:Which header file is required for dynamic memory allocation in C?");
            radioButtons[0].setText("A) <stdlib.h>");
            radioButtons[1].setText("B) <stdio.h>");
            radioButtons[2].setText("C)  <math.h>");
            radioButtons[3].setText("D) <malloc.h>");
        }
        if (current == 2) {
            label.setText("Q.3:Which operator is used to access the value stored in a variable pointed by a pointer variable in C?");
            radioButtons[0].setText("A) *");
            radioButtons[1].setText("B) &");
            radioButtons[2].setText("C) ->");
            radioButtons[3].setText("D) ::");
        }
        if (current == 3) {
            label.setText("Q.4:Which of the following is not a valid keyword in C?");
            radioButtons[0].setText("A) auto");
            radioButtons[1].setText("B) case");
            radioButtons[2].setText("C) default");
            radioButtons[3].setText("D) function");
        }
        if (current == 4) {
            label.setText("Q.5:Which of the following is used to terminate a switch case in C?");
            radioButtons[0].setText("A) break;");
            radioButtons[1].setText("B) end;");
            radioButtons[2].setText("C) termineted");
            radioButtons[3].setText("D) exit");
        }
        if (current == 5) {
            label.setText("Q.6:Which symbol is used to define a preprocessor directive in C?");
            radioButtons[0].setText("A) &");
            radioButtons[1].setText("B) #");
            radioButtons[2].setText("C) $");
            radioButtons[3].setText("D) !");
        }
        if (current == 6) {
            label.setText("Q.7:Which of the following is the correct syntax for a multi-dimensional array declaration in C?");
            radioButtons[0].setText("A)int arr[][];");
            radioButtons[1].setText("B) int arr[][][];");
            radioButtons[2].setText("C) int arr[][];");
            radioButtons[3].setText("D) int arr[];");
        }
        if (current == 7) {
            label.setText("Q.8:Which function is used to allocate memory dynamically in C?");
            radioButtons[0].setText("A) alloc() ");
            radioButtons[1].setText("B) calloc()");
            radioButtons[2].setText("C) malloc()");
            radioButtons[3].setText("D) new()");
        }
        if (current == 8) {
            label.setText("Q.9:Which of the following is not a valid data type in C?");
            radioButtons[0].setText("A) float");
            radioButtons[1].setText("B) string");
            radioButtons[2].setText("C) char");
            radioButtons[3].setText("D) double");
        }
        if (current == 9) {
            label.setText("Q.10:Who's the father of c?");
            radioButtons[0].setText("A) James Gosling");
            radioButtons[1].setText("B) Dennis Ritchie");
            radioButtons[2].setText("C) Bjarne Stroustrup");
            radioButtons[3].setText("D) None of these");
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
            return (radioButtons[0].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[3].isSelected());
        }
        if (current == 4) {
            return (radioButtons[0].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
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