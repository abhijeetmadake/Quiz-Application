import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

class QuizResult extends JFrame implements ActionListener {
    String name, email;
    JButton b1, b2;

    QuizResult(String test_name) {

        try {

            name = Login.user_namem;

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz_application",
                    "postgres", "ABHI");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from Register WHERE name='" + name + "'");
            if (rs.next()) {
                email = rs.getString(1);
                // System.out.println(email);
            }

            // Programing Quizes

            if (test_name == "C Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + CQuizTest.count + "')");

            if (test_name == "CSS Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + CSSQuizTest.count + "')");

            if (test_name == "CPP Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + CPPQuizTest.count + "')");

            if (test_name == "HTML Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + HTMLQuizTest.count + "')");

            if (test_name == "Java Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + JavaQuizTest.count + "')");

            if (test_name == "Python Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + PythonQuizTest.count + "')");

            // General Apptitude

            if (test_name == "Profit & Loss Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + ProfitLossQuiz.count + "')");

            if (test_name == "Time & Work Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + TimeWorkQuiz.count + "')");

            if (test_name == "Height & Distance Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + HeightDistanceQuiz.count + "')");

            if (test_name == "Time & Distance Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + TimeDistanceQuiz.count + "')");

            if (test_name == "Numbers Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + NumbersQuiz.count + "')");

            if (test_name == "Clock Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + ClockQuiz.count + "')");

            // Verbal Reasoning

            if (test_name == "Spoting error Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + SpotingErrorQuiz.count + "')");

            if (test_name == "Synonyms Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + SynonymsQuiz.count + "')");

            if (test_name == "Antonyms Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + AntonymsQuiz.count + "')");

            if (test_name == "Blood Relation Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + BloodRelationQuiz.count + "')");

            if (test_name == "Numbers Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + NumbersQuiz.count + "')");

            if (test_name == "Coding & Decoding Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + CodingDecodingQuiz.count + "')");

            // Techchincal MCQ

            if (test_name == "Networking Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + NetworkingQuiz.count + "')");

            if (test_name == "Database Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + DatabaseQuiz.count + "')");

            if (test_name == "Basic Electronics Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + BasicElectronicsQuiz.count + "')");

            if (test_name == "Digital Electronics Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + DigitalElectronicsQuiz.count + "')");

            if (test_name == "SQL Server Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + SQLServerQuiz.count + "')");

            if (test_name == "Software Testing Quiz")
                st.executeUpdate("insert into Result values('" + name + "','" + email + "','" + test_name + "','"
                        + SoftwareTestingQuiz.count + "')");

        } catch (Exception f) {
            System.out.println("Error occur 0 ");
        }

        // panel 1

        JPanel c = new JPanel();
        c.setSize(1920, 1080);
        this.add(c);
        c.setBackground(Color.LIGHT_GRAY);
        c.setLayout(null);

        // panel 2
        JPanel p = new JPanel();
        p.setSize(700, 800);
        p.setBackground(Color.orange);
        p.setVisible(true);
        p.setBounds(450, 200, 650, 350);// -----------------------panel set bound
        c.add(p);
        JLabel l = new JLabel("Quiz submited successfully!!");
        l.setForeground(Color.white);
        p.setLayout(null);
        l.setFont(new Font("cursior", Font.BOLD, 40));
        l.setBounds(50, 80, 700, 50);
        p.add(l);

        b1 = new JButton("Home Page");
        b1.setBounds(120, 200, 150, 50);
        b1.setBackground(Color.pink);
        p.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Result");
        b2.setBounds(350, 200, 150, 50);
        b2.setBackground(Color.pink);
        p.add(b2);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setTitle("Quiz Submitted");
        setVisible(true);
        setSize(600, 350);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            Main m1 = new Main();
            m1.setVisible(true);
        }
        if (e.getSource() == b2) {

            // String stname;
            try {
                Class.forName("org.postgresql.Driver");
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz_application",
                        "postgres", "ABHI");
                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery("select *from Result WHERE user_name='" + name + "'");
                if (rs.next()) {

                    String n = rs.getString(1);
                    // System.out.println(n);
                    String u_m = rs.getString(2);
                    String t_n = rs.getString(3);
                    int t_m = rs.getInt(4);
                    new QuizScore(n, u_m, t_n, t_m);
                    dispose();

                    // JOptionPane.showMessageDialog(this,"Student Name : "+rs.getString(1)
                    // +"\n user mail : "+rs.getString(2)+"\n Test Name :"+rs.getString(3)+"\n Test
                    // Mark :"+rs.getInt(4));
                }
            } catch (Exception v) {
                System.out.println("Error occur");
            }

        }
    }

}
