import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SignIn extends JFrame implements ActionListener {
	JTextField tf1, tf3, tf4, tf5, tf6;
	JButton b1, b2;
	JPasswordField tf2;

	SignIn() {
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(null);

		setSize(550, 400);
		setVisible(true);
		setTitle("SIGN IN");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel l1 = new JLabel("SIGN IN");
		JLabel l2 = new JLabel("USER NAME");
		JLabel l3 = new JLabel("PASSWORD");
		JLabel l4 = new JLabel("MAIL");

		tf1 = new JTextField();
		tf2 = new JPasswordField();
		tf3 = new JTextField();

		b1 = new JButton("SAVE");
		b2 = new JButton("CANCEL");

		Font f1 = new Font("arial", Font.BOLD, 30);
		Font f2 = new Font("arial", Font.BOLD, 20);
		l1.setBounds(200, 20, 400, 50);
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);

		tf1.setFont(f2);
		tf2.setFont(f2);
		tf3.setFont(f2);

		b1.setFont(f2);
		b2.setFont(f2);

		l2.setBounds(100, 100, 150, 30);
		l3.setBounds(100, 160, 150, 30);
		l4.setBounds(100, 210, 150, 30);

		tf1.setBounds(250, 100, 200, 30);
		tf2.setBounds(250, 160, 200, 30);
		tf3.setBounds(250, 210, 200, 30);

		b1.setBounds(100, 300, 125, 30);
		b2.setBounds(300, 300, 125, 30);

		c.add(l1);
		c.add(l2);
		c.add(tf1);
		c.add(l3);
		c.add(tf2);
		c.add(l4);
		c.add(tf3);

		c.add(b1);
		c.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		String user_name = tf1.getText();
		String pass = tf2.getText();
		String mail = tf3.getText();

		if (e.getSource() == b1) {
			try {

				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz_application",
						"postgres", "ABHI");

				Statement st = con.createStatement();
				st.executeUpdate("insert into SignIn values('" + user_name + "','" + pass + "','" + mail + "')");

				JOptionPane.showMessageDialog(this, "SignIn Successfully : ");

				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				con.close();

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(this, "Exception : " + e1);
			}
		}
		if (e.getSource() == b2) {
			dispose();
		}
	}
}
