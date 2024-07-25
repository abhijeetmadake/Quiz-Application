import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  HTMLQuizTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    HTMLQuizTest(String s) {
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
        radioButtons[0].setBounds(50, 80, 500, 20);
        radioButtons[1].setBounds(50, 110, 400, 20);
        radioButtons[2].setBounds(50, 140, 400, 20);
        radioButtons[3].setBounds(50, 170, 400, 20);

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
            label.setText("Q.1:What does HTML stand for?");
            radioButtons[0].setText("A) Hyperlink Text Markup Language");
            radioButtons[1].setText("B) Hypertext Transfer Markup Language");
            radioButtons[2].setText("C) Hyper Tool Markup Language");
            radioButtons[3].setText("D) Hypertext Markup Language");
        }
        if (current == 1) {
            label.setText("Q.2:Which tag is used to define a hyperlink in HTML?");
            radioButtons[0].setText("A) <link>");
            radioButtons[1].setText("B) <a>");
            radioButtons[2].setText("C) <hyperlink>");
            radioButtons[3].setText("D) <url>");
        }
        if (current == 2) {
            label.setText("Q.3:Which tag is used to define an unordered list in HTML?");
            radioButtons[0].setText("A) <ul>");
            radioButtons[1].setText("B) <ol>");
            radioButtons[2].setText("C) <li>");
            radioButtons[3].setText("D) <ul><li>");
        }
        if (current == 3) {
            label.setText("Q.4:What does the HTML <img> tag represent?");
            radioButtons[0].setText("A) Image");
            radioButtons[1].setText("B) Link");
            radioButtons[2].setText("C) Text");
            radioButtons[3].setText("D) Video");
        }
        if (current == 4) {
            label.setText("Q.5:Which HTML attribute is used to define inline styles?");
            radioButtons[0].setText("A) class;");
            radioButtons[1].setText("B) style");
            radioButtons[2].setText("C) id");
            radioButtons[3].setText("D) font");
        }
        if (current == 5) {
            label.setText("Q.6:What is the correct HTML element for inserting a line break?");
            radioButtons[0].setText("A) <br>");
            radioButtons[1].setText("B) <break>");
            radioButtons[2].setText("C) <lb>");
            radioButtons[3].setText("D) <newline>");
        }
        if (current == 6) {
            label.setText("Q.7:Which attribute is used to provide an advisory text about an element or its contents in HTML?");
            radioButtons[0].setText("A) tooltip");
            radioButtons[1].setText("B) title");
            radioButtons[2].setText("C) advisory");
            radioButtons[3].setText("D)  hint");
        }
        if (current == 7) {
            label.setText("Q.8:Which tag is used to define a table row in HTML?");
            radioButtons[0].setText("A) <td> ");
            radioButtons[1].setText("B) <tr>");
            radioButtons[2].setText("C) <th>");
            radioButtons[3].setText("D) <table>");
        }
        if (current == 8) {
            label.setText("Q.9:Which tag is used to define the document head in HTML?");
            radioButtons[0].setText("A) <head>");
            radioButtons[1].setText("B) <header>");
            radioButtons[2].setText("C) <title>");
            radioButtons[3].setText("D) <h1>");
        }
        if (current == 9) {
            label.setText("Q.10:What is the correct HTML for creating a drop-down list?");
            radioButtons[0].setText("A) <list>");
            radioButtons[1].setText("B) <dropdown>");
            radioButtons[2].setText("C) <select>");
            radioButtons[3].setText("D) <menu>");
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
            return (radioButtons[1].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
        }
        if (current == 8) {
            return (radioButtons[0].isSelected());
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