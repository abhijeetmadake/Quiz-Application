import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  BasicElectronicsQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
String name;

    BasicElectronicsQuiz(String s) {
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
            label.setText("Q.1:What is the unit of electrical resistance?");
            radioButtons[0].setText("A) Ampere (A)");
            radioButtons[1].setText("B) Volt (V)");
            radioButtons[2].setText("C) Ohm (Ω)");
            radioButtons[3].setText("D) Watt (W)");
        }
        if (current == 1) {
            label.setText("Q.2:Which component is used to store electrical charge in a circuit?");
            radioButtons[0].setText("A) Resistor");
            radioButtons[1].setText("B) Capacitor");
            radioButtons[2].setText("C) Inductor");
            radioButtons[3].setText("D) Diode");
        }
        if (current == 2) {
            label.setText("Q.3:What does LED stand for in electronics?");
            radioButtons[0].setText("A) Light Emitting Diode");
            radioButtons[1].setText("B) Low Energy Device");
            radioButtons[2].setText("C) Light Emitting Detector");
            radioButtons[3].setText("D) Long Electrical Diode");
        }
        if (current == 3) {
            label.setText("Q.4:Which type of current flows in only one direction?");
            radioButtons[0].setText("A) AC");
            radioButtons[1].setText("B) DC");
            radioButtons[2].setText("C) Both AC and DC");
            radioButtons[3].setText("D) Neither AC nor DC");
        }
        if (current == 4) {
            label.setText("Q.5:What is the main function of a diode in a circuit?");
            radioButtons[0].setText("A) To regulate voltage");
            radioButtons[1].setText("B) To store electrical charge");
            radioButtons[2].setText("C) To amplify signals");
            radioButtons[3].setText("D) To allow current flow in one direction");
        }
        if (current == 5) {
            label.setText("Q.6:Which electronic component is used to amplify or switch electronic signals??");
            radioButtons[0].setText("A) Resistor");
            radioButtons[1].setText("B) Capacitor");
            radioButtons[2].setText("C) Transistor");
            radioButtons[3].setText("D) Inductor");
        }
        if (current == 6) {
            label.setText("Q.7:What is the unit of electrical current?");
            radioButtons[0].setText("A) Ohm (Ω)");
            radioButtons[1].setText("B) Volt (V)");
            radioButtons[2].setText("C) Ampere (A)");
            radioButtons[3].setText("D) Watt (W)");
        }
        if (current == 7) {
            label.setText("Q.8:Which component is used to protect circuits from sudden voltage spikes?");
            radioButtons[0].setText("A) Resistor");
            radioButtons[1].setText("B) Capacitor");
            radioButtons[2].setText("C) Diode");
            radioButtons[3].setText("D) Varistor");
        }
        if (current == 8) {
            label.setText("Q.9:What is the primary function of a transformer in an electrical circuit?");
            radioButtons[0].setText("A) To store electrical charge");
            radioButtons[1].setText("B) To regulate voltage");
            radioButtons[2].setText("C) To amplify signals");
            radioButtons[3].setText("D) To convert AC voltage to DC voltage");
        }
        if (current == 9) {
            label.setText("Q.10:What does PCB stand for in electronics?");
            radioButtons[0].setText("A) Primary Circuit Board");
            radioButtons[1].setText("B) Personal Computer Board");
            radioButtons[2].setText("C) Printed Circuit Board");
            radioButtons[3].setText("D) Plastic Component Board");
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
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[3].isSelected());
        }
        if (current == 5) {
            return (radioButtons[2].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[3].isSelected());
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