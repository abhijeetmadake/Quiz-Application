import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  DigitalElectronicsQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    DigitalElectronicsQuiz(String s) {
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
        radioButtons[0].setBounds(50, 80, 1000, 20);
        radioButtons[1].setBounds(50, 110, 1000, 20);
        radioButtons[2].setBounds(50, 140, 1000, 20);
        radioButtons[3].setBounds(50, 170, 1000, 20);

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
            label.setText("Q.1:Which logic gate performs the AND operation?");
            radioButtons[0].setText("A) OR gate");
            radioButtons[1].setText("B) NOT gate");
            radioButtons[2].setText("C) AND gate");
            radioButtons[3].setText("D) XOR gate");
        }
        if (current == 1) {
            label.setText("Q.2:What is the binary equivalent of the decimal number 10?");
            radioButtons[0].setText("A) 1001");
            radioButtons[1].setText("B) 1001");
            radioButtons[2].setText("C) 1100");
            radioButtons[3].setText("D) 1110");
        }
        if (current == 2) {
            label.setText("Q.3:Which of the following is a universal logic gate?");
            radioButtons[0].setText("A) OR gate");
            radioButtons[1].setText("B) NOT gate");
            radioButtons[2].setText("C) AND gate");
            radioButtons[3].setText("D) NOR gate");
        }
        if (current == 3) {
            label.setText("Q.4:In a digital circuit, what is the role of a flip-flop?");
            radioButtons[0].setText("A) To perform arithmetic operations");
            radioButtons[1].setText("B) To store a single bit of data");
            radioButtons[2].setText("C) To generate clock signals");
            radioButtons[3].setText("D) To amplify analog signals");
        }
        if (current == 4) {
            label.setText("Q.5:Which logic gate produces an output of 1 only when both inputs are 0?");
            radioButtons[0].setText("A) OR gate");
            radioButtons[1].setText("B) NOT gate");
            radioButtons[2].setText("C) AND gate");
            radioButtons[3].setText("D) XOR gate");
        }
        if (current == 5) {
            label.setText("Q.6:What is the octal equivalent of the binary number 101101?");
            radioButtons[0].setText("A) 53");
            radioButtons[1].setText("B) 65");
            radioButtons[2].setText("C) 45");
            radioButtons[3].setText("D) 71");
        }
        if (current == 6) {
            label.setText("Q.7:What is the function of a decoder in digital electronics?");
            radioButtons[0].setText("A) Converts analog signals to digital signals");
            radioButtons[1].setText("B) Converts digital signals to analog signals");
            radioButtons[2].setText("C) Converts binary information into a specific output code");
            radioButtons[3].setText("D) Converts octal numbers into hexadecimal numbers");
        }
        if (current == 7) {
            label.setText("Q.8:What does TTL stand for in digital electronics?");
            radioButtons[0].setText("A) Transistor-Transistor Logic");
            radioButtons[1].setText("B) Time-to-Live");
            radioButtons[2].setText("C) Transmission Test Level");
            radioButtons[3].setText("D) Total Transaction Loss");
        }
        if (current == 8) {
            label.setText("Q.9:Which logic gate produces an output of 1 when either input is 1, but not both?");
            radioButtons[0].setText("A) OR gate");
            radioButtons[1].setText("B) NOT gate");
            radioButtons[2].setText("C) AND gate");
            radioButtons[3].setText("D) XOR gate");
        }
        if (current == 9) {
            label.setText("Q.10:What is the function of a multiplexer (MUX) in digital electronics?");
            radioButtons[0].setText("A) To combine multiple digital signals into one");
            radioButtons[1].setText("B) To amplify digital signals");
            radioButtons[2].setText("C) To generate clock signals");
            radioButtons[3].setText("D) To decode binary information");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 1000, 20);
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
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
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