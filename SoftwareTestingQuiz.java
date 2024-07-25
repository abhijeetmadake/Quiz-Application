import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  SoftwareTestingQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    SoftwareTestingQuiz(String s) {
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
            label.setText("Q.1:What is the main purpose of software testing?");
            radioButtons[0].setText("A) To ensure the software meets user requirements");
            radioButtons[1].setText("B) To identify defects or bugs in the software");
            radioButtons[2].setText("C) To improve the performance of the software");
            radioButtons[3].setText("D) To develop new features for the software");
        }
        if (current == 1) {
            label.setText("Q.2:Which testing technique focuses on testing individual units or components of the software?");
            radioButtons[0].setText("A) Integration testing");
            radioButtons[1].setText("B) System testing");
            radioButtons[2].setText("C) Unit testing");
            radioButtons[3].setText("D) Acceptance testing");
        }
        if (current == 2) {
            label.setText("Q.3:What is regression testing?");
            radioButtons[0].setText("A) Testing performed to verify if new features work as expected");
            radioButtons[1].setText("B) Testing performed to verify if changes in the software have introduced new defects");
            radioButtons[2].setText("C) Testing performed to verify if the software meets user requirements");
            radioButtons[3].setText("D) Testing performed to verify the overall functionality of the software");
        }
        if (current == 3) {
            label.setText("Q.4:Which testing technique involves testing the entire system as a whole?");
            radioButtons[0].setText("A) Unit testing");
            radioButtons[1].setText("B) Integration testing");
            radioButtons[2].setText("C) System testing");
            radioButtons[3].setText("D) Acceptance testing");
        }
        if (current == 4) {
            label.setText("Q.5:What is the purpose of smoke testing?");
            radioButtons[0].setText("A) To verify if the software meets user requirements");
            radioButtons[1].setText("B) To identify defects or bugs in the software");
            radioButtons[2].setText("C) To test the critical functionalities of the software");
            radioButtons[3].setText("D) To test the software on different operating systems");
        }
        if (current == 5) {
            label.setText("Q.6:What is the primary goal of acceptance testing?");
            radioButtons[0].setText("A) To identify defects or bugs in the software");
            radioButtons[1].setText("B) To verify if the software meets user requirements");
            radioButtons[2].setText("C) To test individual units or components of the software");
            radioButtons[3].setText("D) To test the entire system as a whole");
        }
        if (current == 6) {
            label.setText("Q.7:Which testing technique involves testing the software's ability to recover from failures?");
            radioButtons[0].setText("A) Recovery testing");
            radioButtons[1].setText("B) Load testing");
            radioButtons[2].setText("C) Stress testing");
            radioButtons[3].setText("D) Performance testing");
        }
        if (current == 7) {
            label.setText("Q.8:What is the purpose of load testing?");
            radioButtons[0].setText("A) To test the software's ability to recover from failures");
            radioButtons[1].setText("B) To test the software's performance under normal");
            radioButtons[2].setText("C) To test the software's performance under peak load conditions");
            radioButtons[3].setText("D) To test the software's functionality against unexpected inputs");
        }
        if (current == 8) {
            label.setText("Q.9:Which testing technique involves testing the software's behavior under extreme conditions?");
            radioButtons[0].setText("A)Load testing");
            radioButtons[1].setText("B) Stress testing");
            radioButtons[2].setText("C) Recovery testing");
            radioButtons[3].setText("D) Regression testing");
        }
        if (current == 9) {
            label.setText("Q.10:What is the purpose of usability testing?");
            radioButtons[0].setText("A) To identify defects or bugs in the software");
            radioButtons[1].setText("B) To test the software's performance under peak load conditions");
            radioButtons[2].setText("C) To evaluate the software's ease of use from an end-user perspective");
            radioButtons[3].setText("D) To test the software's ability to recover from failures");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 1000, 20);
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
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[2].isSelected());
        }
        if (current == 4) {
            return (radioButtons[2].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[0].isSelected());
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