import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  CPPQuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
String name;

    CPPQuizTest(String s) {
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
            label.setText("Q.1:What is the correct syntax to declare a variable in C++?");
            radioButtons[0].setText("A) var int x;");
            radioButtons[1].setText("B) integer x;");
            radioButtons[2].setText("C) int x;");
            radioButtons[3].setText("D)  x = int;");
        }
        if (current == 1) {
            label.setText("Q.2:In C++, which keyword is used to define a class?");
            radioButtons[0].setText("A)  class");
            radioButtons[1].setText("B) Class");
            radioButtons[2].setText("C)  ClassDef");
            radioButtons[3].setText("D) define");
        }
        if (current == 2) {
            label.setText("Q.3:What is the correct way to allocate memory for an array in C++?");
            radioButtons[0].setText("A) int arr = new int[10];");
            radioButtons[1].setText("B) int *arr = malloc(10 * sizeof(int));");
            radioButtons[2].setText("C) int arr[10];");
            radioButtons[3].setText("D) int *arr = new int[10];");
        }
        if (current == 3) {
            label.setText("Q.4:What is the correct syntax to declare a reference variable in C++?");
            radioButtons[0].setText("A) int &ref = x;");
            radioButtons[1].setText("B) ref int x;");
            radioButtons[2].setText("C) int ref = &x;");
            radioButtons[3].setText("D) &int ref = x;");
        }
        if (current == 4) {
            label.setText("Q.5:Which of the following is not a valid storage class in C++?");
            radioButtons[0].setText("A) auto;");
            radioButtons[1].setText("B) static");
            radioButtons[2].setText("C) dynamic");
            radioButtons[3].setText("D) register");
        }
        if (current == 5) {
            label.setText("Q.6:Which operator is used to access the member functions and variables of an object in C++?");
            radioButtons[0].setText("A) .");
            radioButtons[1].setText("B) ->");
            radioButtons[2].setText("C) ::");
            radioButtons[3].setText("D) :");
        }
        if (current == 6) {
            label.setText("Q.7:Which of the following correctly defines a constant in C++?");
            radioButtons[0].setText("A) #define PI 3.14");
            radioButtons[1].setText("B) #define PI 3.14");
            radioButtons[2].setText("C) const float PI = 3.14;");
            radioButtons[3].setText("D) float PI = const 3.14;");
        }
        if (current == 7) {
            label.setText("Q.8:Which of the following operators is used for dynamic memory allocation in C++?");
            radioButtons[0].setText("A) new ");
            radioButtons[1].setText("B) alloc");
            radioButtons[2].setText("C) malloc");
            radioButtons[3].setText("D) allocate");
        }
        if (current == 8) {
            label.setText("Q.9:Which of the following is not a valid access specifier in C++?");
            radioButtons[0].setText("A) public");
            radioButtons[1].setText("B) protected");
            radioButtons[2].setText("C) private");
            radioButtons[3].setText("D) friend");
        }
        if (current == 9) {
            label.setText("Q.10:What does the \"typeid\" operator return in C++?");
            radioButtons[0].setText("A) Size of a data type");
            radioButtons[1].setText("B) Address of a variable");
            radioButtons[2].setText("C) Type information of an object");
            radioButtons[3].setText("D) Value of a variable");
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
            return (radioButtons[3].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[2].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[3].isSelected());
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
            dispose();;
        }
    }

}