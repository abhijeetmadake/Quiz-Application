import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class First extends JFrame implements ActionListener {

    JButton b1, b2;

    First() {
        Container c = getContentPane();
        c.setBackground(Color.red);
        c.setLayout(null);

        JLabel l1 = new JLabel("Welcome to Quiz");
        JLabel l2 = new JLabel("Exercise your brain with these interesting quizzes");

       // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("FristPageImage.jpeg"));
       // JLabel image = new JLabel(i1);
       // image.setBounds(0, 0, 600, 480);
        //add(image);

        b1 = new JButton("Login");
        b2 = new JButton("Sign in");

        Font f1 = new Font("arial", Font.BOLD, 30);
        Font f2 = new Font("arial", Font.BOLD, 20);
        l1.setBounds(150, 50, 400, 50);
        l1.setFont(f1);
        l2.setFont(f2);

        b1.setFont(f2);
        b2.setFont(f2);

        l2.setBounds(30,150, 500, 50);

        b1.setBounds(100, 250, 150, 30);
        b2.setBounds(300, 250, 150, 30);

        c.add(l1);
        c.add(l2);

        c.add(b1);
        c.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String result = e.getActionCommand();
        System.out.println(result);
        if (result.equals("Login")) {
            Login l = new Login();
        }
        if (result.equals("Sign in")) {
            SignIn si = new SignIn();
        }

    }

    public static void main(String[] args) {
        First obj = new First();
        obj.setSize(550, 400);
        obj.setVisible(true);
        obj.setTitle("Welcome to Quiz");
        obj.setLocationRelativeTo(null);
       // obj.setExtendedState(JFrame.MAXIMIZED_BOTH);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
