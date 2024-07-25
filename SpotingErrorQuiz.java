import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  SpotingErrorQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
String name;
    SpotingErrorQuiz(String s) {
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
            label.setText("Q.1:Choose the sentence with the error:");
            radioButtons[0].setText("A) She were dancing all night");
            radioButtons[1].setText("B) They has been waiting for hours.");
            radioButtons[2].setText("C) He can't believe what he seeing.");
            radioButtons[3].setText("D) The dog barked loudly.");
        }
        if (current == 1) {
            label.setText("Q.2:Identify the sentence with an error:");
            radioButtons[0].setText("A) Each of the students are doing their homework.");
            radioButtons[1].setText("B) Many people believes in superstitions.");
            radioButtons[2].setText("C) My sister don't like spicy food.");
            radioButtons[3].setText("D) The cat drinks milk every morning.");
        }
        if (current == 2) {
            label.setText("Q.3:Spot the error in the following sentence:");
            radioButtons[0].setText("A) The book laying on the table belongs to me.");
            radioButtons[1].setText("B) The flowers smells beautiful in the garden.");
            radioButtons[2].setText("C) She is looking forward to go on vacation.");
            radioButtons[3].setText("D) The birds sings melodiously in the morning.");
        }
        if (current == 3) {
            label.setText("Q.4:Find the incorrect sentence:");
            radioButtons[0].setText("A) We needs to finish this project by tomorrow.");
            radioButtons[1].setText("B) John and his brother goes to the gym every day.");
            radioButtons[2].setText("C) The sun sets in the west.");
            radioButtons[3].setText("D)  She were singing a song when I entered the room.");
        }
        if (current == 4) {
            label.setText("Q.5:Which sentence contains an error?");
            radioButtons[0].setText("A) He don't like to eat vegetables.");
            radioButtons[1].setText("B) The children were playing outside.");
            radioButtons[2].setText("C) She usually walks to work.");
            radioButtons[3].setText("D) They has already finished their homework.");
        }
        if (current == 5) {
            label.setText("Q.6:Choose the sentence with the error:");
            radioButtons[0].setText("A) The car is parked in front of the garage.");
            radioButtons[1].setText("B) My brother and sister are playing in the garden.");
            radioButtons[2].setText("C) Every student in the class has their own book.");
            radioButtons[3].setText("D) The teacher teached us a new lesson today.");
        }
        if (current == 6) {
            label.setText("Q.7:Spot the error:");
            radioButtons[0].setText("A) He goes to the gym every morning.");
            radioButtons[1].setText("B) She have two cats and a dog.");
            radioButtons[2].setText("C) They is going to the concert tonight.");
            radioButtons[3].setText("D) The sun rises in the east.");
        }
        if (current == 7) {
            label.setText("Q.8:Identify the incorrect sentence:");
            radioButtons[0].setText("A) She have been studying for the exam all week.");
            radioButtons[1].setText("B) The birds chirp happily in the morning");
            radioButtons[2].setText("C) John has already left for work.");
            radioButtons[3].setText("D) We is going to the movies tonight");
        }
        if (current == 8) {
            label.setText("Q.9:Spot the error:");
            radioButtons[0].setText("A) I have bought a new dress yesterday.");
            radioButtons[1].setText("B) The dog is barking loudly");
            radioButtons[2].setText("C) They have been waiting for you.");
            radioButtons[3].setText("D) He does not like coffee.");
        }
        if (current == 9) {
            label.setText("Q.10:Choose the sentence with the error:");
            radioButtons[0].setText("A) The flowers in the garden smells wonderful.");
            radioButtons[1].setText("B) My friend and I are going to the mall.");
            radioButtons[2].setText("C) The cat is sleeping on the sofa.");
            radioButtons[3].setText("D) She were singing a song when I called her.");
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
            return (radioButtons[0].isSelected());
        }
        if (current == 5) {
            return (radioButtons[3].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[0].isSelected());
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