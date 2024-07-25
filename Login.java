import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Login extends JFrame implements ActionListener {
	JTextField tf1;
	JButton b1, b2;
	JPasswordField tf2;
	static String user_namem;

	Login() {
		Container c = getContentPane();
		c.setBackground(Color.GRAY);
		c.setLayout(null);

		setSize(550, 400);
		setVisible(true);
		setTitle("LOG IN");
		setLocationRelativeTo(null);
		// setExtendedState(JFrame.MAXIMIZED_BOTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ImageIcon i1 = new
		// ImageIcon(ClassLoader.getSystemResource("LOGINFRAME2.jpg"));
		// JLabel image = new JLabel(i1);
		// image.setBounds(1, 1, 600, 550);
		// add(image);

		JLabel l1 = new JLabel("Login Form");
		JLabel l2 = new JLabel("Login Name");
		JLabel l3 = new JLabel("Password ");

		tf1 = new JTextField();
		tf2 = new JPasswordField();

		b1 = new JButton("Login");
		b2 = new JButton("CANCEL");
		Font f1 = new Font("arial", Font.BOLD, 30);
		Font f2 = new Font("arial", Font.BOLD, 20);
		l1.setBounds(170, 10, 400, 30);
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);

		tf1.setFont(f2);
		tf2.setFont(f2);

		b1.setFont(f2);
		b2.setFont(f2);

		l2.setBounds(50, 80, 500, 50);
		l3.setBounds(50, 160, 150, 30);

		tf1.setBounds(180, 80, 250, 40);
		tf2.setBounds(180, 160, 250, 40);

		b1.setBounds(100, 250, 125, 30);
		b2.setBounds(300, 250, 125, 30);

		c.add(l1);
		c.add(l2);
		c.add(tf1);
		c.add(l3);
		c.add(tf2);

		c.add(b1);
		c.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		String user_name = tf1.getText();
		String pass = tf2.getText();

		user_namem = user_name;

		if (e.getSource() == b1) {
			try {
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz_application",
						"postgres", "ABHI");

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(
						"select  from Register where name = '" + user_name + "' and password = '" + pass + "'");

				if (rs.next()) {
					Main obj = new Main();
					dispose();
				} else {
					JOptionPane.showMessageDialog(this, "Invalid User Name And Password : ");
				}

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