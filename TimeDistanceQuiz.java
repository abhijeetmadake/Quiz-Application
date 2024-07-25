import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  TimeDistanceQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
   static int count = 0;
   int current = 0, x = 1, y = 1, now = 0;
   String name;
    int m[] = new int[10];

    TimeDistanceQuiz(String s) {
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
            label.setText("Q.1:A train travels at a speed of 60 km/h for the first hour, then increases its speed to 80 km/h for the next two hours. What is the total distance covered by the train?");
            radioButtons[0].setText("A) 100 km");
            radioButtons[1].setText("B) 160 km");
            radioButtons[2].setText("C) 200 km");
            radioButtons[3].setText("D) 240 km");
        }
        if (current == 1) {
            label.setText("Q.2:A car covers a distance of 300 km at a speed of 60 km/h. If the same distance is covered at a speed of 75 km/h, how much time does the car save?");
            radioButtons[0].setText("A) 1 hour");
            radioButtons[1].setText("B) 2 hours");
            radioButtons[2].setText("C) 3 hours");
            radioButtons[3].setText("D) 4 hours");
        }
        if (current == 2) {
            label.setText("Q.3Two friends start cycling from the same point in opposite directions. One cycles at a speed of 15 km/h, and the other cycles at a speed of 20 km/h. After how many hours will they be 85 km apart?");
            radioButtons[0].setText("A) 3 hours");
            radioButtons[1].setText("B) 4 hours");
            radioButtons[2].setText("C) 5 hours");
            radioButtons[3].setText("D) 6 hours");
        }
        if (current == 3) {
            label.setText("Q.4:A train travels a distance of 300 km in 5 hours. If it increases its speed by 20 km/h, how much time will it take to cover the same distance?");
            radioButtons[0].setText("A) 3 hours");
            radioButtons[1].setText("B) 4 hours");
            radioButtons[2].setText("C) 5 hours");
            radioButtons[3].setText("D) 6 hours");
        }
        if (current == 4) {
            label.setText("Q.5:A bus travels at a speed of 60 km/h for the first half of the distance and then at a speed of 40 km/h for the second half of the distance. What is the average speed of the bus for the entire journey?");
            radioButtons[0].setText("A) 45 km/h");
            radioButtons[1].setText("B) 48 km/h");
            radioButtons[2].setText("C) 50 km/h");
            radioButtons[3].setText("D) 52 km/h");
        }
        if (current == 5) {
            label.setText("Q.6:A man covers a certain distance at a speed of 15 km/h and returns at a speed of 10 km/h. What is his average speed for the entire journey?");
            radioButtons[0].setText("A) 12 km/h");
            radioButtons[1].setText("B) 12.5 km/h");
            radioButtons[2].setText("C) 13 km/h");
            radioButtons[3].setText("D) 13.5 km/h");
        }
        if (current == 6) {
            label.setText("Q.7:A train passes a pole in 15 seconds and a platform of length 150 meters in 25 seconds. What is the length of the train?");
            radioButtons[0].setText("A) 100 meters");
            radioButtons[1].setText("B) 150 meters");
            radioButtons[2].setText("C) 200 meters");
            radioButtons[3].setText("D) 250 meters");
        }
        if (current == 7) {
            label.setText("Q.8:A car travels a distance of 300 km at a certain speed. If it travels at 75% of that speed, how much more time does it take to cover the same distance?");
            radioButtons[0].setText("A) 1 hour");
            radioButtons[1].setText("B) 2 hours");
            radioButtons[2].setText("C) 3 hours");
            radioButtons[3].setText("D) 4 hours");
        }
        if (current == 8) {
            label.setText("Q.9:A cyclist travels from A to B at a speed of 10 km/h and returns from B to A at a speed of 15 km/h. What is the average speed for the round trip?");
            radioButtons[0].setText("A) 12 km/h");
            radioButtons[1].setText("B) 12.5 km/h");
            radioButtons[2].setText("C) 13 km/h");
            radioButtons[3].setText("D) 13.5 km/h");
        }
        if (current == 9) {
            label.setText("Q.10:A person covers a distance of 40 km at a speed of 10 km/h and returns at a speed of 20 km/h. What is the average speed for the entire journey?");
            radioButtons[0].setText("A) 12 km/h");
            radioButtons[1].setText("B) 15 km/h");
            radioButtons[2].setText("C) 16 km/h");
            radioButtons[3].setText("D) 18 km/h");
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
            return (radioButtons[0].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[2].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
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