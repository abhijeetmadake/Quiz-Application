import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  DatabaseQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    DatabaseQuiz(String s) {
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
            label.setText("Q.1:What is a primary key in a database table?");
            radioButtons[0].setText("A) A key that uniquely identifies each row in the table");
            radioButtons[1].setText("B) A key that is used to establish relationships between tables");
            radioButtons[2].setText("C) A key that can contain duplicate values");
            radioButtons[3].setText("D) A key that is used to sort data in the table");
        }
        if (current == 1) {
            label.setText("Q.2:Which SQL keyword is used to retrieve data from a database table?");
            radioButtons[0].setText("A) SELECT");
            radioButtons[1].setText("B) INSERT");
            radioButtons[2].setText("C) UPDATE");
            radioButtons[3].setText("D) DELETE");
        }
        if (current == 2) {
            label.setText("Q.3:What is the purpose of the WHERE clause in SQL?");
            radioButtons[0].setText("A) To specify the columns to be retrieved from the table");
            radioButtons[1].setText("B) To specify the conditions for the rows to be retrieved from the table");
            radioButtons[2].setText("C) To specify the order of the rows to be retrieved from the table");
            radioButtons[3].setText("D) To specify the tables to be joined in the query");
        }
        if (current == 3) {
            label.setText("Q.4:Which SQL command is used to add new rows to a database table?");
            radioButtons[0].setText("A) SELECT");
            radioButtons[1].setText("B) INSERT");
            radioButtons[2].setText("C) UPDATE");
            radioButtons[3].setText("D) DELETE");
        }
        if (current == 4) {
            label.setText("Q.5:What is the purpose of the JOIN clause in SQL?");
            radioButtons[0].setText("A) To retrieve data from multiple tables based on a related column between them");
            radioButtons[1].setText("B) To group rows in a table based on the values of one or more columns");
            radioButtons[2].setText("C) To delete rows from a table based on specified conditions");
            radioButtons[3].setText("D) To modify existing rows in a table based on specified conditions");
        }
        if (current == 5) {
            label.setText("Q.6:What does the SQL command DROP TABLE do?");
            radioButtons[0].setText("A) Adds a new table to the database");
            radioButtons[1].setText("B) Modifies the structure of an existing table");
            radioButtons[2].setText("C) Deletes an existing table from the database");
            radioButtons[3].setText("D) Retrieves data from a table based on specified conditions");
        }
        if (current == 6) {
            label.setText("Q.7:Which SQL function is used to find the number of rows in a database table?");
            radioButtons[0].setText("A) COUNT()");
            radioButtons[1].setText("B) AVG()");
            radioButtons[2].setText("C) SUM()");
            radioButtons[3].setText("D) MAX()");
        }
        if (current == 7) {
            label.setText("Q.8:What is the purpose of the GROUP BY clause in SQL?");
            radioButtons[0].setText("A) To specify the conditions for the rows to be retrieved from the table");
            radioButtons[1].setText("B) To specify the order of the rows to be retrieved from the table");
            radioButtons[2].setText("C) To group rows in a table based on the values of one or more columns");
            radioButtons[3].setText("D)To retrieve data from multiple tables based on a related column between them");
        }
        if (current == 8) {
            label.setText("Q.9:At Which SQL command is used to change data in a database table?");
            radioButtons[0].setText("A) SELECT");
            radioButtons[1].setText("B) INSERT");
            radioButtons[2].setText("C) UPDATE");
            radioButtons[3].setText("D) DELETE");
        }
        if (current == 9) {
            label.setText("Q.10:What is the purpose of the ORDER BY clause in SQL?");
            radioButtons[0].setText("A) To specify the columns to be retrieved from the table");
            radioButtons[1].setText("B) To specify the conditions for the rows to be retrieved from the table");
            radioButtons[2].setText("C) To specify the order of the rows to be retrieved from the table");
            radioButtons[3].setText("D) To specify the tables to be joined in the query");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 1000, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[0].isSelected());
        }
        if (current == 1) {
            return (radioButtons[0].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[1].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[2].isSelected());
        }
        if (current == 6) {
            return (radioButtons[0].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[2].isSelected());
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