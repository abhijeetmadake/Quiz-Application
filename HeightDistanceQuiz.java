import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  HeightDistanceQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    HeightDistanceQuiz(String s) {
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
            label.setText("Q.1:Two buildings stand on either side of a road. From the top of one building, the angle of elevation to the top of the other is 30°. If the height of the first building is 20 meters and the distance between the buildings is 20√3 meters,second Building?");
            radioButtons[0].setText("A) 20 meters");
            radioButtons[1].setText("B) 30 meters");
            radioButtons[2].setText("C) 40 meters");
            radioButtons[3].setText("D) 50 meters");
        }
        if (current == 1) {
            label.setText("Q.2:From the top of a vertical pole 40 meters high, the angle of elevation of a point on the ground is 30°. What is the distance of the point from the base of the pole?");
            radioButtons[0].setText("A) 20 meters");
            radioButtons[1].setText("B) 30 meters");
            radioButtons[2].setText("C) 40 meters");
            radioButtons[3].setText("D) 50 meters");
        }
        if (current == 2) {
            label.setText("Q.3:A flagstaff stands on the top of a building. From a point on the ground, the angle of elevation of the top of the flagstaff is 60° and the angle of depression of the bottom of the flagstaff is 30°. If the height of the building is 30 meters,height flagstaff?");
            radioButtons[0].setText("A) 15 meters");
            radioButtons[1].setText("B) 20 meters");
            radioButtons[2].setText("C) 25 meters");
            radioButtons[3].setText("D) 30 meters");
        }
        if (current == 3) {
            label.setText("Q.4:The angle of elevation of the top of a tower from a point is 30°. After walking 20 meters towards the tower, the angle of elevation becomes 60°. What is the height of the tower?");
            radioButtons[0].setText("A) 10 meters");
            radioButtons[1].setText("B) 20 meters");
            radioButtons[2].setText("C) 30 meters");
            radioButtons[3].setText("D) 40 meters");
        }
        if (current == 4) {
            label.setText("Q.5:From the top of a vertical tower, the angle of depression of a point P on the ground is 45°. If the height of the tower is 60 meters,distance between the top of the tower and point P?");
            radioButtons[0].setText("A) 30 meters");
            radioButtons[1].setText("B) 60 meters");
            radioButtons[2].setText("C) 90 meters");
            radioButtons[3].setText("D) 120 meters");
        }
        if (current == 5) {
            label.setText("Q.6:A vertical pole of a certain length casts a shadow 15 meters long when the sun's altitude is 45°. Find the length of the pole?");
            radioButtons[0].setText("A) 15 meters");
            radioButtons[1].setText("B) 20 meters");
            radioButtons[2].setText("C) 30 meters");
            radioButtons[3].setText("D) 45 meters");
        }
        if (current == 6) {
            label.setText("Q.7:A tree casts a shadow 15 meters long when the angle of elevation of the sun is 45°. What is the height of the tree?");
            radioButtons[0].setText("A)  15 meters");
            radioButtons[1].setText("B) 20 meters");
            radioButtons[2].setText("C) 30 meters");
            radioButtons[3].setText("D) 45 meters");
        }
        if (current == 7) {
            label.setText("Q.8:From the top of a hill, the angle of depression of a car parked at the foot of the hill is 30°. If the height of the hill is 50 meters, what is the horizontal distance between the car and the top of the hill?");
            radioButtons[0].setText("A) 25 meters");
            radioButtons[1].setText("B) 25√3 meters");
            radioButtons[2].setText("C) 50 meters");
            radioButtons[3].setText("D) 50√3 meters");
        }
        if (current == 8) {
            label.setText("Q.9:Two towers of heights 40 meters and 60 meters respectively are situated on level ground. From the top of the shorter tower, the angle of elevation to the top of the taller tower is 30°.distance between the towers?");
            radioButtons[0].setText("A) 40 meters");
            radioButtons[1].setText("B) 60 meters");
            radioButtons[2].setText("C) 80 meters");
            radioButtons[3].setText("D) 100 meters");
        }
        if (current == 9) {
            label.setText("Q.10:A ladder leans against a wall making an angle of 60° with the ground. If the foot of the ladder is 4√3 meters away from the wall, what is the length of the ladder?");
            radioButtons[0].setText("A) 4 meters");
            radioButtons[1].setText("B) 8 meters");
            radioButtons[2].setText("C) 12 meters");
            radioButtons[3].setText("D) 16 meters");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
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
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[1].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[2].isSelected());
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