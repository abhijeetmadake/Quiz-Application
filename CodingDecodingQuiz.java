import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  CodingDecodingQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    CodingDecodingQuiz(String s) {
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
            label.setText("Q.1:In a certain code language, \"APPLE\" is written as \"QRRUJ.\" How is \"ORANGE\" written in that code?");
            radioButtons[0].setText("A) SNBQJI");
            radioButtons[1].setText("B) RMTBKF");
            radioButtons[2].setText("C) QNZJHC");
            radioButtons[3].setText("D) PMSAID");
        }
        if (current == 1) {
            label.setText("Q.2:If \"CAT\" is coded as \"FDE,\" how is \"DOG\" coded in that language?");
            radioButtons[0].setText("A) GPH");
            radioButtons[1].setText("B) FPF");
            radioButtons[2].setText("C) GQI");
            radioButtons[3].setText("D) EPH");
        }
        if (current == 2) {
            label.setText("Q.3:If \"SHARP\" is coded as \"PHRSO,\" what will \"PEACH\" be coded as?");
            radioButtons[0].setText("A) OACEP");
            radioButtons[1].setText("B) OAPEC");
            radioButtons[2].setText("C) OAPCE");
            radioButtons[3].setText("D) OACEK");
        }
        if (current == 3) {
            label.setText("Q.4:If \"BRAIN\" is coded as \"ASDQH,\" how is \"HEART\" coded in that language?");
            radioButtons[0].setText("A) EGTIP");
            radioButtons[1].setText("B) FGUIQ");
            radioButtons[2].setText("C) DFRHO");
            radioButtons[3].setText("D) FGUJR");
        }
        if (current == 4) {
            label.setText("Q.5:If \"WATER\" is coded as \"VZSDQ,\" what will \"FIRE\" be coded as?");
            radioButtons[0].setText("A) EHQC");
            radioButtons[1].setText("B) EHQD.");
            radioButtons[2].setText("C) EHDR");
            radioButtons[3].setText("D) EHRC");
        }
        if (current == 5) {
            label.setText("Q.6:In a certain code language, \"MANGO\" is written as \"RLTRN.\" How is \"LEMON\" written in that code?");
            radioButtons[0].setText("A) QHPNR");
            radioButtons[1].setText("B) QGONR");
            radioButtons[2].setText("C) QGPNR");
            radioButtons[3].setText("D) QHONR");
        }
        if (current == 6) {
            label.setText("Q.7:If \"HOUSE\" is coded as \"LWVXH,\" how is \"CAR\" coded in that language?");
            radioButtons[0].setText("A) FDU");
            radioButtons[1].setText("B) EZS");
            radioButtons[2].setText("C) FBV");
            radioButtons[3].setText("D) EBR");
        }
        if (current == 7) {
            label.setText("Q.8:If \"TABLE\" is coded as \"XBMCJ,\" how is \"CHAIR\" coded in that language?");
            radioButtons[0].setText("A) DGKCT");
            radioButtons[1].setText("B) CGJCT");
            radioButtons[2].setText("C) DGKCQ");
            radioButtons[3].setText("D) CGKCT");
        }
        if (current == 8) {
            label.setText("Q.9:If \"SMILE\" is coded as \"RLHOK,\" what is the code for \"LAUGH\" in the same language?");
            radioButtons[0].setText("A) OHXQE");
            radioButtons[1].setText("B) OIXQE");
            radioButtons[2].setText("C) OHXPF");
            radioButtons[3].setText("D) OIXQE");
        }
        if (current == 9) {
            label.setText("Q.10:In a certain code language, \"BRIGHT\" is written as \"FIHRTB.\" How is \"SUNNY\" written in that code?");
            radioButtons[0].setText("A) NNUYS");
            radioButtons[1].setText("B) UYNNC");
            radioButtons[2].setText("C) UYNSN.");
            radioButtons[3].setText("D) NUNYS");
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
            return (radioButtons[2].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[2].isSelected());
        }
        if (current == 5) {
            return (radioButtons[2].isSelected());
        }
        if (current == 6) {
            return (radioButtons[3].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[1].isSelected());
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