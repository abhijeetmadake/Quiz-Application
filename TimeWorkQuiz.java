import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  TimeWorkQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    String name;
    int m[] = new int[10];

    TimeWorkQuiz(String s) {
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
            label.setText("Q.1:A can complete a work in 15 days and B can complete the same work in 10 days. In how many days will they together complete the work?");
            radioButtons[0].setText("A) 5 days");
            radioButtons[1].setText("B) 6 days");
            radioButtons[2].setText("C) 7 days");
            radioButtons[3].setText("D) 8 days");
        }
        if (current == 1) {
            label.setText("Q.2:If A can complete a work in 12 days and B can complete the same work in 18 days, in how many days will they together complete the work?");
            radioButtons[0].setText("A) 5 days");
            radioButtons[1].setText("B) 6 days");
            radioButtons[2].setText("C) 7 days");
            radioButtons[3].setText("D) 8 days");
        }
        if (current == 2) {
            label.setText("Q.3:A and B together can complete a work in 8 days. If A alone can complete the work in 12 days, then in how many days can B alone complete the work?");
            radioButtons[0].setText("A) 16 days");
            radioButtons[1].setText("B) 24 days");
            radioButtons[2].setText("C) 32 days");
            radioButtons[3].setText("D) 36 days");
        }
        if (current == 3) {
            label.setText("Q.4:A takes twice as much time as B to complete a work. If both A and B together can complete the work in 6 days, then in how many days can B alone complete the work?");
            radioButtons[0].setText("A) 9 days");
            radioButtons[1].setText("B) 12 days");
            radioButtons[2].setText("C) 15 days");
            radioButtons[3].setText("D) 18 days");
        }
        if (current == 4) {
            label.setText("Q.5:A, B, and C can complete a work together in 4 days. If A alone can complete the work in 12 days, then in how many days can B and C together complete the work?");
            radioButtons[0].setText("A) 2 days");
            radioButtons[1].setText("B) 3 days");
            radioButtons[2].setText("C) 4 days");
            radioButtons[3].setText("D) 5 days");
        }
        if (current == 5) {
            label.setText("Q.6:A and B can complete a work together in 20 days. They started the work together but after 5 days, A left and B completed the remaining work in 15 days. In how many days A alone can complete the work?");
            radioButtons[0].setText("A) 30 days");
            radioButtons[1].setText("B) 40 days");
            radioButtons[2].setText("C) 50 days");
            radioButtons[3].setText("D) 60 days");
        }
        if (current == 6) {
            label.setText("Q.7:A, B, and C together can complete a work in 12 days. If A and B together can complete the work in 18 days, then in how many days can C alone complete the work?");
            radioButtons[0].setText("A) 24 days");
            radioButtons[1].setText("B) 36 days");
            radioButtons[2].setText("C) 48 days");
            radioButtons[3].setText("D) 72 days");
        }
        if (current == 7) {
            label.setText("Q.8:A and B together can complete a work in 8 days, while B and C together can complete the same work in 12 days. If A alone can complete the work in 16 days, then in how many days can C alone complete the work?");
            radioButtons[0].setText("A) 18 days");
            radioButtons[1].setText("B) 20 days");
            radioButtons[2].setText("C) 24 days");
            radioButtons[3].setText("D) 30 days");
        }
        if (current == 8) {
            label.setText("Q.9:A, B, and C together can complete a work in 10 days. If A can complete the work in 20 days, then in how many days can B and C together complete the work?");
            radioButtons[0].setText("A) 4 days");
            radioButtons[1].setText("B) 5 days");
            radioButtons[2].setText("C) 6 days");
            radioButtons[3].setText("D) 8 days");
        }
        if (current == 9) {
            label.setText("Q.10:A can complete a work in 30 days, while B can complete the same work in 40 days. If they work together for 6 days and then A leaves, in how many more days will B alone complete the remaining work?");
            radioButtons[0].setText("A) 5 days");
            radioButtons[1].setText("B) 6 days");
            radioButtons[2].setText("C) 7 days");
            radioButtons[3].setText("D) 8 days");
        }

        label.setBounds(30, 40, 1500, 20);
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
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
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
            return (radioButtons[0].isSelected());
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