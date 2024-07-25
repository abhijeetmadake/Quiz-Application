import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Register extends JFrame implements ActionListener {
	JTextField tf1, tf2;
	JPasswordField tf3, tf4;
	JButton b1, b2;

	Register() {

		Container c = getContentPane();
		c.setLayout(null);

		JLabel l1 = new JLabel("Register Form");
		l1.setForeground(Color.red);
		JLabel l2 = new JLabel("EMAIL ID");
		l2.setForeground(Color.darkGray);
		JLabel l3 = new JLabel("NAME");
		l3.setForeground(Color.darkGray);
		JLabel l4 = new JLabel("PASSWORD");
		l4.setForeground(Color.darkGray);
		JLabel l5 = new JLabel("CONFIRM PASS");
		l5.setForeground(Color.darkGray);

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JPasswordField();
		tf4 = new JPasswordField();

		b1 = new JButton("SAVE");
		b2 = new JButton("LOGIN");

		Font f1 = new Font("arial", Font.BOLD, 20);
		Font f2 = new Font("arial", Font.BOLD, 18);
		Font f3 = new Font("arial", Font.BOLD, 40);
		l1.setBounds(530, 20, 400, 50);
		l1.setFont(f1);

		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);

		tf1.setFont(f2);
		tf2.setFont(f2);
		tf3.setFont(f2);
		tf4.setFont(f2);

		b1.setFont(f2);
		b2.setFont(f2);

		l2.setBounds(480, 90, 180, 30);
		l3.setBounds(480, 150, 180, 30);
		l4.setBounds(480, 210, 180, 30);
		l5.setBounds(480, 270, 200, 30);

		tf1.setBounds(480, 120, 260, 30);
		tf2.setBounds(480, 180, 260, 30);
		tf3.setBounds(480, 240, 260, 30);
		tf4.setBounds(480, 300, 260, 30);

		b1.setBounds(500, 350, 100, 25);

		b2.setBounds(615, 350, 100, 25);

		c.add(l1);
		c.add(l2);
		c.add(tf1);
		c.add(l3);
		c.add(tf2);
		c.add(l4);
		c.add(tf3);
		c.add(l5);
		c.add(tf4);

		c.add(b1);
		c.add(b2);

		JPanel b3 = new JPanel();
		b3.setLayout(new BorderLayout());
		b3.setBackground(Color.darkGray);
		b3.setBounds(0, 0, 420, 412);

		ImageIcon icon1 = new ImageIcon("Register_Photo.jpg");
		JLabel lb = new JLabel();
		lb.setFont(f3);
		lb.setIcon(icon1);
		lb.setForeground(Color.pink);
		b3.add(lb);
		c.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String emailid = tf1.getText();
		String user_name1 = tf2.getText();
		String password = tf3.getText();
		String password2 = tf4.getText();
		Login.user_namem = user_name1;

		if (e.getSource() == b2) {
			Login l = new Login();
			dispose();
		}

		if (e.getSource() == b1) {
			if (emailid.equals("") || user_name1.equals("") || password.equals("") || password2.equals("")) {
				JOptionPane.showMessageDialog(this, "Please Fill All Information");
			} else {
				if (password.equals(password2)) {
					try {

						Class.forName("org.postgresql.Driver");
						Connection con = DriverManager.getConnection(
								"jdbc:postgresql://localhost:5432/quiz_application",
								"postgres", "ABHI");

						Statement st = con.createStatement();
						st.executeUpdate("insert into Register values('" + emailid + "','" + user_name1 + "','"
								+ password + "')");

						JOptionPane.showMessageDialog(this, "Register Successfully : ");
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						con.close();

					} catch (Exception e1) {
						JOptionPane.showMessageDialog(this, "This Email Id All Ready Exist..");
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(this, "Please Enter correct Password");
					tf3.setText("");
					tf4.setText("");
				}
			}
		}

	}

	public static void main(String args[]) {
		Register obj = new Register();
		obj.setSize(800, 450);
		obj.setVisible(true);
		obj.setTitle("Register Form");
		obj.setLocationRelativeTo(null);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}