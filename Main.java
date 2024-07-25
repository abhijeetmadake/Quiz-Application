import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4, b5, b6;

	Main() {
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		setSize(550, 400);
		setVisible(true);
		setTitle("HOME PAGE");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Categories title panel
		JPanel p7 = new JPanel();
		p7.setSize(1920, 10);
		p7.setBackground(Color.DARK_GRAY);
		p7.setVisible(true);

		JLabel l7 = new JLabel("HOME PAGE");
		l7.setForeground(Color.red);
		p7.setLayout(null);
		l7.setFont(new Font("arial", Font.BOLD, 25));
		l7.setBounds(700, 10, 200, 50);
		p7.add(l7);

		JButton b7 = new JButton("Start");
		b7.setBounds(120, 180, 150, 50);
		p7.add(b7);

		p7.setBounds(0, 0, 1920, 60);// -----------------------panel bound
		c.add(p7);

		// 1st pannel
		JPanel p1 = new JPanel();
		p1.setSize(400, 250);
		p1.setBackground(Color.lightGray);
		p1.setVisible(true);

		JLabel l1 = new JLabel("Programming");
		l1.setForeground(Color.white);
		p1.setLayout(null);
		l1.setFont(new Font("arial", Font.BOLD, 25));
		l1.setBounds(120, 20, 200, 50);
		p1.add(l1);

		b1 = new JButton("Select Quiz ");
		b1.setBounds(120, 180, 150, 50);
		// b1.setBackground(Color.yellow);
		p1.add(b1);
		b1.addActionListener(this);

		p1.setBounds(50, 150, 400, 250);// -----------------------panel
		c.add(p1);

		// 2nd pannel
		JPanel p2 = new JPanel();
		p2.setSize(400, 250);
		p2.setBackground(Color.DARK_GRAY);
		p2.setVisible(true);

		JLabel l2 = new JLabel("General Aptitude");
		l2.setForeground(Color.white);
		p2.setLayout(null);
		l2.setFont(new Font("arial", Font.BOLD, 25));
		l2.setBounds(100, 20, 200, 50);
		p2.add(l2);

		b2 = new JButton("Select Quiz ");
		b2.setBounds(120, 180, 150, 50);
		// b2.setBackground(Color.yellow);
		p2.add(b2);
		b2.addActionListener(this);

		p2.setBounds(50, 480, 400, 250);// -----------------------panel
		c.add(p2);

		// 3rd pannel
		JPanel p3 = new JPanel();
		p3.setSize(400, 250);
		p3.setBackground(Color.orange);
		p3.setVisible(true);

		JLabel l3 = new JLabel("Verbal and Reasoning");
		l3.setForeground(Color.white);
		p3.setLayout(null);
		l3.setFont(new Font("arial", Font.BOLD, 25));
		l3.setBounds(80, 20, 300, 50);
		p3.add(l3);

		b3 = new JButton("Select Quiz ");
		b3.setBounds(120, 180, 150, 50);
		// b3.setBackground(Color.yellow);
		p3.add(b3);
		b3.addActionListener(this);

		p3.setBounds(570, 150, 400, 250);// -----------------------panel
		c.add(p3);

		// 4th pannel
		JPanel p4 = new JPanel();
		p4.setSize(400, 250);
		p4.setBackground(Color.gray);
		p4.setVisible(true);

		JLabel l4 = new JLabel("Technical MCQs");
		l4.setForeground(Color.white);
		p4.setLayout(null);
		l4.setFont(new Font("arial", Font.BOLD, 25));
		l4.setBounds(100, 20, 200, 50);
		p4.add(l4);

		b4 = new JButton("Select Quiz ");
		b4.setBounds(120, 180, 150, 50);
		// b4.setBackground(Color.yellow);
		p4.add(b4);
		b4.addActionListener(this);

		p4.setBounds(570, 480, 400, 250);// -----------------------panel
		c.add(p4);

		// 5th pannel
		JPanel p5 = new JPanel();
		p5.setSize(400, 250);
		p5.setBackground(Color.cyan);
		p5.setVisible(true);

		JLabel l5 = new JLabel("General Knowledge");
		l5.setForeground(Color.white);
		p5.setLayout(null);
		l5.setFont(new Font("arial", Font.BOLD, 25));
		l5.setBounds(80, 20, 300, 50);
		p5.add(l5);

		b5 = new JButton("Select Quiz ");
		b5.setBounds(120, 180, 150, 50);
		// b5.setBackground(Color.yellow);
		p5.add(b5);
		b5.addActionListener(this);

		p5.setBounds(1080, 150, 400, 250);// -----------------------panel
		c.add(p5);

		// 6th pannel
		JPanel p6 = new JPanel();
		p6.setSize(400, 250);
		p6.setBackground(Color.red);
		p6.setVisible(true);

		JLabel l6 = new JLabel("Medical Science");
		l6.setForeground(Color.white);
		p6.setLayout(null);
		l6.setFont(new Font("arial", Font.BOLD, 25));
		l6.setBounds(100, 20, 200, 50);
		p6.add(l6);

		b6 = new JButton("Select Quiz ");
		b6.setBounds(120, 180, 150, 50);
		// b6.setBackground(Color.gray);
		p6.add(b6);
		b6.addActionListener(this);

		p6.setBounds(1080, 480, 400, 250);// -----------------------panel set bound
		c.add(p6);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			new Programming();
		}
		if (e.getSource() == b2) {
			new GeneralAptitude();
		}
		if (e.getSource() == b3) {
			new VerbalReasoning();
		}
		if (e.getSource() == b4) {
			new TechnicalMCQs();
		}
		if (e.getSource() == b5) {
			new GK();
		}
		if (e.getSource() == b6) {
			new MedicalScience();
		}

	}

}