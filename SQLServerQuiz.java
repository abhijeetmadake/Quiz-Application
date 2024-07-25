import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  SQLServerQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    SQLServerQuiz(String s) {
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
            label.setText("Q.1:Which of the following is NOT a data type in SQL Server?");
            radioButtons[0].setText("A) VARCHAR");
            radioButtons[1].setText("B) INTEGER");
            radioButtons[2].setText("C) DATE");
            radioButtons[3].setText("D) BOOLEAN");
        }
        if (current == 1) {
            label.setText("Q.2:What is the purpose of the SELECT statement in SQL Server?");
            radioButtons[0].setText("A) To insert new records into a table");
            radioButtons[1].setText("B) To update existing records in a table");
            radioButtons[2].setText("C) To retrieve data from a database table");
            radioButtons[3].setText("D) To delete records from a table");
        }
        if (current == 2) {
            label.setText("Q.3:Which SQL keyword is used to add new records to a database table?");
            radioButtons[0].setText("A) INSERT");
            radioButtons[1].setText("B) UPDATE");
            radioButtons[2].setText("C) DELETE");
            radioButtons[3].setText("D) MODIFY");
        }
        if (current == 3) {
            label.setText("Q.4:What does the SQL function COUNT(*) do in SQL Server?");
            radioButtons[0].setText("A) Counts the number of rows in a table");
            radioButtons[1].setText("B) Counts the number of distinct values in a column");
            radioButtons[2].setText("C) Counts the number of NULL values in a column");
            radioButtons[3].setText("D) Counts the number of characters in a string");
        }
        if (current == 4) {
            label.setText("Q.5:What is the purpose of the WHERE clause in SQL Server?");
            radioButtons[0].setText("A) To specify the columns to be retrieved from the table");
            radioButtons[1].setText("B) To specify the conditions for the rows to be retrieved from the table");
            radioButtons[2].setText("C) To specify the order of the rows to be retrieved from the table");
            radioButtons[3].setText("D) To specify the tables to be joined in the query");
        }
        if (current == 5) {
            label.setText("Q.6:Which SQL command is used to remove a table from the database?");
            radioButtons[0].setText("A) REMOVE TABLE");
            radioButtons[1].setText("B) DELETE TABLE");
            radioButtons[2].setText("C) DROP TABLE");
            radioButtons[3].setText("D) ERASE TABLE");
        }
        if (current == 6) {
            label.setText("Q.7:What is the purpose of the ORDER BY clause in SQL Server?");
            radioButtons[0].setText("A) To specify the columns to be retrieved from the table");
            radioButtons[1].setText("B) To specify the conditions for the rows to be retrieved from the table");
            radioButtons[2].setText("C) To specify the order of the rows to be retrieved from the table");
            radioButtons[3].setText("D) To specify the tables to be joined in the query");
        }
        if (current == 7) {
            label.setText("Q.8:Which SQL command is used to modify data in a table in SQL Server?");
            radioButtons[0].setText("A) MODIFY");
            radioButtons[1].setText("B) CHANGE");
            radioButtons[2].setText("C) UPDATE");
            radioButtons[3].setText("D) ALTER");
        }
        if (current == 8) {
            label.setText("Q.9:What is the purpose of the GROUP BY clause in SQL Server?");
            radioButtons[0].setText("A)To specify the conditions for the rows to be retrieved from the table");
            radioButtons[1].setText("B) To group rows in a table based on the values of one or more columns");
            radioButtons[2].setText("C) To retrieve data from multiple tables based on a related column between them");
            radioButtons[3].setText("D) To specify the order of the rows to be retrieved from the table");
        }
        if (current == 9) {
            label.setText("Q.10:Which SQL command is used to retrieve data from multiple tables in SQL Server?");
            radioButtons[0].setText("A) JOIN");
            radioButtons[1].setText("B) UNION");
            radioButtons[2].setText("C) MERGE");
            radioButtons[3].setText("D) COMBINE");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 1000, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[3].isSelected());
        }
        if (current == 1) {
            return (radioButtons[2].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
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
            return (radioButtons[2].isSelected());
        }
        if (current == 6) {
            return (radioButtons[2].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[2].isSelected());
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