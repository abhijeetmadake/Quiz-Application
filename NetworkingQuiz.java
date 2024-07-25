import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class  NetworkingQuiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    static int count = 0;
    int current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    String name;

    NetworkingQuiz(String s) {
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
        radioButtons[0].setBounds(50, 80, 800, 20);
        radioButtons[1].setBounds(50, 110, 800, 20);
        radioButtons[2].setBounds(50, 140, 800, 20);
        radioButtons[3].setBounds(50, 170, 800, 20);

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
            label.setText("Q.1:What does TCP/IP stand for in computer networking?");
            radioButtons[0].setText("A) Technical Control Protocol/Internet Protocol");
            radioButtons[1].setText("B) Transmission Control Protocol/Internet Protocol");
            radioButtons[2].setText("C) Transfer Control Protocol/Internet Protocol");
            radioButtons[3].setText("D) Terminal Control Protocol/Internet Protocol");
        }
        if (current == 1) {
            label.setText("Q.2:Which device is used to connect multiple computers in a LAN and forward data packets based on MAC addresses?");
            radioButtons[0].setText("A) Router");
            radioButtons[1].setText("B) Switch");
            radioButtons[2].setText("C) Modem");
            radioButtons[3].setText("D) Hub");
        }
        if (current == 2) {
            label.setText("Q.3:What is the maximum data transmission speed of Gigabit Ethernet?");
            radioButtons[0].setText("A) 10 Mbps");
            radioButtons[1].setText("B) 100 Mbps");
            radioButtons[2].setText("C) 1 Gbps");
            radioButtons[3].setText("D) 10 Gbps");
        }
        if (current == 3) {
            label.setText("Q.4:Which protocol is used to transfer files between a client and a server over a network?");
            radioButtons[0].setText("A) HTTP");
            radioButtons[1].setText("B) FTP");
            radioButtons[2].setText("C) SMTP");
            radioButtons[3].setText("D) TCP");
        }
        if (current == 4) {
            label.setText("Q.5:What is the purpose of DHCP in networking?");
            radioButtons[0].setText("A) To translate domain names to IP addresses");
            radioButtons[1].setText("B) To assign unique IP addresses to devices on a network");
            radioButtons[2].setText("C) To establish secure connections between devices");
            radioButtons[3].setText("D) To route data packets between different networks");
        }
        if (current == 5) {
            label.setText("Q.6:Which networking device operates at the Network Layer of the OSI model?");
            radioButtons[0].setText("A) Router");
            radioButtons[1].setText("B) Switch");
            radioButtons[2].setText("C) Hub");
            radioButtons[3].setText("D) Repeater");
        }
        if (current == 6) {
            label.setText("Q.7:What does DNS stand for in computer networking?");
            radioButtons[0].setText("A)  Domain Name System");
            radioButtons[1].setText("B) Data Network Service");
            radioButtons[2].setText("C) Digital Network Security");
            radioButtons[3].setText("D) Dynamic Network Server");
        }
        if (current == 7) {
            label.setText("Q.8:Which protocol is used for sending email messages over the Internet?");
            radioButtons[0].setText("A) HTTP");
            radioButtons[1].setText("B) SMTP");
            radioButtons[2].setText("C) FTP");
            radioButtons[3].setText("D) TCP");
        }
        if (current == 8) {
            label.setText("Q.9:What is the purpose of NAT in networking?");
            radioButtons[0].setText("A) To translate public IP addresses to private IP addresses");
            radioButtons[1].setText("B) To assign IP addresses to devices on a network");
            radioButtons[2].setText("C) To route data packets between different networks");
            radioButtons[3].setText("D) To establish secure connections between devices");
        }
        if (current == 9) {
            label.setText("Q.10:Which networking device connects multiple network segments and forwards data based on IP addresses?");
            radioButtons[0].setText("A) Router");
            radioButtons[1].setText("B) Switch");
            radioButtons[2].setText("C) Hub");
            radioButtons[3].setText("D) Bridge");
        }

        label.setBounds(30, 40, 1500, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 800, 20);
        }

    }

    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[1].isSelected());
        }
        if (current == 1) {
            return (radioButtons[1].isSelected());// jo option barobar ahe tyaachi index radio buttons selected madhi
                                                  // takaychi
        }
        if (current == 2) {
            return (radioButtons[2].isSelected());
        }
        if (current == 3) {
            return (radioButtons[1].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[0].isSelected());
        }
        if (current == 7) {
            return (radioButtons[1].isSelected());
        }
        if (current == 8) {
            return (radioButtons[0].isSelected());
        }
        if (current == 9) {
            return (radioButtons[3].isSelected());
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