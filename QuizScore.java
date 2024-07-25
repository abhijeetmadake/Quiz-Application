import java.awt.*;

import javax.swing.*;

class QuizScore extends JFrame {
    QuizScore(String name, String email, String test_name, int marks) {
        Container c = getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setTitle("Quiz Score");
        setVisible(true);
        setSize(600, 350);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Pannel
        JPanel p6 = new JPanel();
        p6.setLayout(null);
        p6.setSize(700, 800);
        p6.setBackground(Color.orange);
        p6.setVisible(true);
        p6.setBounds(370, 100, 800, 600);

        JLabel l1 = new JLabel("Quiz Score");
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(new Font("arial", Font.BOLD, 40));
        l1.setBounds(280, 30, 800, 50);
        p6.add(l1);

        JLabel l2 = new JLabel("Studend Name  :" + name);
        l2.setForeground(Color.DARK_GRAY);
        l2.setFont(new Font("arial", Font.BOLD, 28));
        l2.setBounds(20, 150, 500, 50);
        p6.add(l2);

        JLabel l3 = new JLabel("Email                 :" + email);
        l3.setForeground(Color.DARK_GRAY);

        l3.setFont(new Font("arial", Font.BOLD, 28));
        l3.setBounds(20, 200, 700, 50);
        p6.add(l3);

        JLabel l4 = new JLabel("Quiz Name        :" + test_name);
        l4.setForeground(Color.DARK_GRAY);

        l4.setFont(new Font("arial", Font.BOLD, 28));
        l4.setBounds(20, 250, 500, 50);
        p6.add(l4);

        JLabel l5 = new JLabel("Quiz Marks       :" + marks);
        l5.setForeground(Color.DARK_GRAY);

        l5.setFont(new Font("arial", Font.BOLD, 28));
        l5.setBounds(20, 300, 500, 50);
        p6.add(l5);

        c.add(p6);

    }

}