import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  JavaQuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
   static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    String name;
    int m[] = new int[10];

    JavaQuizTest(String s) {
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
            label.setText("Q.1:Which of the following is not a primitive data type in Java?");
            radioButtons[0].setText("A) byte");
            radioButtons[1].setText("B) int");
            radioButtons[2].setText("C) float");
            radioButtons[3].setText("D) string");
        }
        if (current == 1) {
            label.setText("Q.2:Which method is used to allocate memory for an object in Java?");
            radioButtons[0].setText("A) new");
            radioButtons[1].setText("B) alloc");
            radioButtons[2].setText("C) malloc");
            radioButtons[3].setText("D) allocate");
        }
        if (current == 2) {
            label.setText("Q.3:Which keyword is used to define a constant in Java?");
            radioButtons[0].setText("A) final");
            radioButtons[1].setText("B) static");
            radioButtons[2].setText("C) const");
            radioButtons[3].setText("D) constant");
        }
        if (current == 3) {
            label.setText("Q.4:What is the default value of an instance variable in Java?");
            radioButtons[0].setText("A) 0");
            radioButtons[1].setText("B) null");
            radioButtons[2].setText("C) false");
            radioButtons[3].setText("D) Depends on the data type");
        }
        if (current == 4) {
            label.setText("Q.5:Which of the following is not a valid identifier in Java?");
            radioButtons[0].setText("A) _variableName;");
            radioButtons[1].setText("B) 2ndVariable");
            radioButtons[2].setText("C) variable_Name");
            radioButtons[3].setText("D) $variableName");
        }
       

        if (current == 5) {
            label.setText("Q.6: Which keyword is used to define a subclass in Java?");
            radioButtons[0].setText("A) extends");
            radioButtons[1].setText("B) super");
            radioButtons[2].setText("C) class");
            radioButtons[3].setText("D) sub");
        }
        if (current == 6) {
            label.setText("Q.7:What is the access level of a class member if no access modifier is specified?");
            radioButtons[0].setText("A) public");
            radioButtons[1].setText("B) protected");
            radioButtons[2].setText("C) private");
            radioButtons[3].setText("D) default (package-private)");
        }
        if (current == 7) {
            label.setText("Q.8:Which of the following is a valid declaration of a two-dimensional array in Java?");
            radioButtons[0].setText("A) int[][] arr = new int[3,3]; ");
            radioButtons[1].setText("B) int[][] arr = new int[3][3];");
            radioButtons[2].setText("C) int[3][3] arr;");
            radioButtons[3].setText("D) int arr[][] = new int[3][3];");
        }
        if (current == 8) {
            label.setText("Q.9:Which keyword is used to explicitly throw an exception in Java?");
            radioButtons[0].setText("A) try");
            radioButtons[1].setText("B) throw");
            radioButtons[2].setText("C) throws");
            radioButtons[3].setText("D) catch");
        }
        if (current == 9) {
            label.setText("Q.10:What is the size of an int variable in Java?");
            radioButtons[0].setText("A) 8 bits");
            radioButtons[1].setText("B) 16 bits");
            radioButtons[2].setText("C) 32 bits");
            radioButtons[3].setText("D) 64 bits");
        }

        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[3].isSelected());
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
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[3].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
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
            dispose(); 
        }
    }

}