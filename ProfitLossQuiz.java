import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  ProfitLossQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    String name;
    int m[] = new int[10];

    ProfitLossQuiz(String s) {
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

        label.setBounds(30, 40, 800, 20);
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
            label.setText("Q.1:A shopkeeper sells an article at a profit of 25%. If the cost price of the article is $200, what is the selling price?");
            radioButtons[0].setText("A)  $220");
            radioButtons[1].setText("B) $225");
            radioButtons[2].setText("C) $250");
            radioButtons[3].setText("D) $275");
        }
        if (current == 1) {
            label.setText("Q.2:If the cost price of an item is $500 and it is sold at a loss of 20%, what is the selling price?");
            radioButtons[0].setText("A) $400");
            radioButtons[1].setText("B) $480");
            radioButtons[2].setText("C) $520");
            radioButtons[3].setText("D) $600");
        }
        if (current == 2) {
            label.setText("Q.3:A computer was bought for $800 and sold for $960. What is the percentage profit?");
            radioButtons[0].setText("A) 15%");
            radioButtons[1].setText("B) 20%");
            radioButtons[2].setText("C) 10%");
            radioButtons[3].setText("D) 30%");
        }
        if (current == 3) {
            label.setText("Q.4:If an article is sold at a loss of 20%, the selling price is $320. What is the cost price?");
            radioButtons[0].setText("A) $320");
            radioButtons[1].setText("B) $400");
            radioButtons[2].setText("C) $380");
            radioButtons[3].setText("D) $420");
        }
        if (current == 4) {
            label.setText("Q.5:A vendor bought 60 apples for $120 and sold 40 of them for $100. What is the profit percentage?");
            radioButtons[0].setText("A) 33.33%;");
            radioButtons[1].setText("B) 25%");
            radioButtons[2].setText("C) 50%");
            radioButtons[3].setText("D) 20%");
        }
        if (current == 5) {
            label.setText("Q.6:If the selling price is equal to the cost price, what is the percentage of profit or loss?");
            radioButtons[0].setText("A) 0%");
            radioButtons[1].setText("B) 50%");
            radioButtons[2].setText("C) 100%");
            radioButtons[3].setText("D) It cannot be determined");
        }
        if (current == 6) {
            label.setText("Q.7:If the cost price of an item is $400 and it is sold at a profit of 25%, what is the selling price?");
            radioButtons[0].setText("A) $400");
            radioButtons[1].setText("B) $450");
            radioButtons[2].setText("C) $500");
            radioButtons[3].setText("D) $525");
        }
        if (current == 7) {
            label.setText("Q.8:A car is sold for $7200 at a loss of 10%. What is the cost price of the car?");
            radioButtons[0].setText("A) $7200");
            radioButtons[1].setText("B) $8000");
            radioButtons[2].setText("C) $7500");
            radioButtons[3].setText("D) $800");
        }
        if (current == 8) {
            label.setText("Q.9:If the selling price is $800 and the profit percentage is 20%, what is the cost price?");
            radioButtons[0].setText("A) $640");
            radioButtons[1].setText("B) $680");
            radioButtons[2].setText("C) $720");
            radioButtons[3].setText("D) $840");
        }
        if (current == 9) {
            label.setText("Q.10:A mobile phone is sold at a loss of 15% for $850. What was the cost price of the mobile phone?");
            radioButtons[0].setText("A) $850");
            radioButtons[1].setText("B) $1000");
            radioButtons[2].setText("C) $875");
            radioButtons[3].setText("D) $900");
        }

        label.setBounds(30, 40, 800, 20);
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
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[3].isSelected());
        }
        if (current == 4) {
            return (radioButtons[3].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[3].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[1].isSelected());
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
            dispose();;
        }
    }

}