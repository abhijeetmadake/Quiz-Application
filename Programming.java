import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Programming extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5,b6;

	Programming() {
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		setSize(550, 400);
		setVisible(true);
		setTitle("PROGRAMING");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//Categories title panel
		JPanel p7 = new JPanel();
		p7.setSize(1920, 10);
		p7.setBackground(Color.DARK_GRAY);
		p7.setVisible(true);

		JLabel l7 = new JLabel("PROGRAMING");
		l7.setForeground(Color.red);
		p7.setLayout(null);
		l7.setFont(new Font("arial", Font.BOLD, 25));
		l7.setBounds(700, 10, 200, 50);
		p7.add(l7);

		p7.setBounds(0, 0, 1920, 60);// -----------------------panel bound
		c.add(p7);

		// 1st pannel
		JPanel p1 = new JPanel();
		p1.setSize(400, 250);
		p1.setBackground(Color.lightGray);
		p1.setVisible(true);

		JLabel l1 = new JLabel("Python");
		l1.setForeground(Color.white);
		p1.setLayout(null);
		l1.setFont(new Font("arial", Font.BOLD, 40));
		l1.setBounds(130, 10, 250, 80);
		p1.add(l1);

        JLabel lb1=new JLabel("10 Questions covering the basics of python");
        lb1.setForeground(Color.white);
        lb1.setFont(new Font("arial", Font.BOLD, 16));
		lb1.setBounds(40, 100, 350, 50);
        p1.add(lb1);


		b1 = new JButton("Start Quiz ");
		b1.setBounds(120, 180, 150, 50);
		p1.add(b1);
		b1.addActionListener(this);


		p1.setBounds(50, 150, 400, 250);// -----------------------panel
		c.add(p1);



		// 2nd pannel
		JPanel p2 = new JPanel();
		p2.setSize(400, 250);
		p2.setBackground(Color.blue);
		p2.setVisible(true);

		JLabel l2 = new JLabel("Java");
		l2.setForeground(Color.white);
		p2.setLayout(null);
		l2.setFont(new Font("arial", Font.BOLD, 40));
		l2.setBounds(150, 10, 250, 80);
		p2.add(l2);

        JLabel lb2=new JLabel("10 Questions covering the basics of Java");
        lb2.setForeground(Color.white);
        lb2.setFont(new Font("arial", Font.BOLD, 16));
		lb2.setBounds(40, 100, 350, 50);
        p2.add(lb2);



		b2 = new JButton("Start Quiz ");
		b2.setBounds(120, 180, 150, 50);
		p2.add(b2);
		b2.addActionListener(this);

		p2.setBounds(50, 480, 400, 250);// -----------------------panel
		c.add(p2);

		// 3rd pannel
		JPanel p3 = new JPanel();
		p3.setSize(400, 250);
		p3.setBackground(Color.red);
		p3.setVisible(true);

		JLabel l3 = new JLabel("C");
		l3.setForeground(Color.white);
		p3.setLayout(null);
		l3.setFont(new Font("arial", Font.BOLD, 40));
		l3.setBounds(170, 10, 250, 80);
		p3.add(l3);

        JLabel lb3=new JLabel("10 Questions covering the basics of C");
        lb3.setForeground(Color.white);
        lb3.setFont(new Font("arial", Font.BOLD, 16));
		lb3.setBounds(40, 100, 350, 50);
        p3.add(lb3);

		b3 = new JButton("Start Quiz ");
		b3.setBounds(120, 180, 150, 50);
		p3.add(b3);
		b3.addActionListener(this);

		p3.setBounds(570, 150, 400, 250);// -----------------------panel
		c.add(p3);

		// 4th pannel
		JPanel p4 = new JPanel();
		p4.setSize(400, 250);
		p4.setBackground(Color.cyan);
		p4.setVisible(true);

		JLabel l4 = new JLabel("C++");
		l4.setForeground(Color.white);
		p4.setLayout(null);
		l4.setFont(new Font("arial", Font.BOLD, 40));
		l4.setBounds(150, 10, 250, 80);
		p4.add(l4);

        JLabel lb4=new JLabel("10 Questions covering the basics of C++");
        lb4.setForeground(Color.white);
        lb4.setFont(new Font("arial", Font.BOLD, 16));
		lb4.setBounds(40, 100, 350, 50);
        p4.add(lb4);

		b4 = new JButton("Start Quiz ");
		b4.setBounds(120, 180, 150, 50);
		p4.add(b4);
		b4.addActionListener(this);

		p4.setBounds(570, 480, 400, 250);// -----------------------panel
		c.add(p4);

		// 5th pannel
		JPanel p5 = new JPanel();
		p5.setSize(400, 250);
		p5.setBackground(Color.gray);
		p5.setVisible(true);

		JLabel l5 = new JLabel("HTML");
		l5.setForeground(Color.white);
		p5.setLayout(null);
		l5.setFont(new Font("arial", Font.BOLD, 40));
		l5.setBounds(140, 10, 250, 80);
		p5.add(l5);

        JLabel lb5=new JLabel("10 Questions covering the basics of HTML");
        lb5.setForeground(Color.white);
        lb5.setFont(new Font("arial", Font.BOLD, 16));
		lb5.setBounds(40, 100, 350, 50);
        p5.add(lb5);



		b5 = new JButton("Start Quiz ");
		b5.setBounds(120, 180, 150, 50);
		p5.add(b5);
		b5.addActionListener(this);

		p5.setBounds(1080, 150, 400, 250);// -----------------------panel
		c.add(p5);

		// 6th pannel
		JPanel p6 = new JPanel();
		p6.setSize(400, 250);
		p6.setBackground(Color.orange);
		p6.setVisible(true);

		JLabel l6 = new JLabel("CSS");
		l6.setForeground(Color.white);
		p6.setLayout(null);
		l6.setFont(new Font("arial", Font.BOLD, 40));
		l6.setBounds(150, 10, 250, 80);
		p6.add(l6);

        JLabel lb6=new JLabel("10 Questions covering the basics of CSS");
        lb6.setForeground(Color.white);
        lb6.setFont(new Font("arial", Font.BOLD, 16));
		lb6.setBounds(40, 100, 350, 50);
        p6.add(lb6);

		b6 = new JButton("Start Quiz ");
		b6.setBounds(120, 180, 150, 50);
		p6.add(b6);
		b6.addActionListener(this);

		p6.setBounds(1080, 480, 400, 250);// -----------------------panel set bound
		c.add(p6);

	}
	public void actionPerformed(ActionEvent e) {
		
		
	    if(e.getSource()==b1)
		{
        new PythonQuizTest("Python Quiz");
		}
		if(e.getSource()==b2)
		{
          new JavaQuizTest("Java Quiz");
		}
		if(e.getSource()==b3)
		{
          new CQuizTest("C Quiz");
		}
		if(e.getSource()==b4)
		{
          new CPPQuizTest("CPP Quiz");
		}
		if(e.getSource()==b5)
		{
          new HTMLQuizTest("HTML Quiz");
		}
		if(e.getSource()==b6)
		{
          new CSSQuizTest("CSS Quiz");
		}


	}

	
}