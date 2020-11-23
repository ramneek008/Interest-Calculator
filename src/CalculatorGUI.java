import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {
	JFrame f;
	JRadioButton rb1, rb2, rb3, rb4, rb5;
	JLabel l, l1, l2, l3, l4, l5;
	JTextField tf1, tf2, tf3, tf4;
	JButton b;
	CalculatorGUI(){
		f = new JFrame("Interest Calculator");
		f.getContentPane().setBackground(Color.BLACK);
		
		l = new JLabel("INTEREST CALCULATOR");
		l.setBounds(250,20,300,40);
		l.setFont(l.getFont().deriveFont(23.0f));
		l.setForeground(Color.ORANGE);
		f.add(l);
		
		l1 = new JLabel("Account Type:");
		l1.setBounds(70,100,200,30);
		l1.setFont(l1.getFont().deriveFont(19.0f));
		l1.setForeground(Color.CYAN);
		
		rb1 = new JRadioButton("FD Account");
		rb1.setBounds(380, 105, 120, 25);
		rb1.setFont(rb1.getFont().deriveFont(15.0f));
		rb2 = new JRadioButton("RD Account");
		rb2.setBounds(530, 105, 120, 25);
		rb2.setFont(rb2.getFont().deriveFont(15.0f));
		rb3 = new JRadioButton("SD Account");
		rb3.setBounds(230, 105, 120, 25);
		rb3.setFont(rb3.getFont().deriveFont(15.0f));
		
		rb1.setBackground(Color.LIGHT_GRAY);rb1.setForeground(Color.BLACK);
		rb2.setBackground(Color.LIGHT_GRAY);rb2.setForeground(Color.BLACK);
		rb3.setBackground(Color.LIGHT_GRAY);rb3.setForeground(Color.BLACK);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);bg.add(rb2);bg.add(rb3);
		f.add(rb1);f.add(rb2);f.add(rb3);
		
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);

		f.add(l1);		
		
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel("Interest Gained (in Rs.) :");
		
		l2.setBounds(170,180,150,30);
		l3.setBounds(170,220,150,30);
		l4.setBounds(170,260,150,30);
		l5.setBounds(170,300,180,30);
		f.add(l2);f.add(l3);f.add(l4);f.add(l5);
		
		l2.setFont(l2.getFont().deriveFont(15.0f));
		l3.setFont(l3.getFont().deriveFont(15.0f));
		l4.setFont(l4.getFont().deriveFont(15.0f));
		l5.setFont(l5.getFont().deriveFont(15.0f));
		l2.setForeground(Color.WHITE);l3.setForeground(Color.WHITE);l4.setForeground(Color.WHITE);l5.setForeground(Color.WHITE);
		
		l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
		
		tf1= new JTextField();
		tf2= new JTextField();
		tf3= new JTextField();
		tf4= new JTextField();
		
		tf1.setBounds(450,185,170,25);
		tf2.setBounds(450,225,170,25);
		tf3.setBounds(450,265,170,25);
		tf4.setBounds(450,305,170,25);
		tf4.setEditable(false);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);

		tf1.setFont(tf1.getFont().deriveFont(15.0f));
		tf2.setFont(tf2.getFont().deriveFont(15.0f));
		tf3.setFont(tf3.getFont().deriveFont(15.0f));
		tf4.setFont(tf4.getFont().deriveFont(15.0f));
		tf4.setForeground(Color.CYAN);
		tf4.setBackground(Color.DARK_GRAY);
		tf1.setVisible(false);tf2.setVisible(false);tf3.setVisible(false);tf4.setVisible(false);
		
		rb4 = new JRadioButton("Normal");
		rb5 = new JRadioButton("NRI");
		rb4.setBounds(450,230,80,25);
		rb5.setBounds(450,260,80,25);
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rb4);bg2.add(rb5);
		f.add(rb4);f.add(rb5);
		rb4.setVisible(false);rb5.setVisible(false);
		
		b = new JButton("Calculate");
		b.setBounds(340,380,120,30);
		b.setBackground(Color.ORANGE);
		b.setForeground(Color.BLACK);
		b.setFont(b.getFont().deriveFont(16.0f));
		f.add(b);
		b.setVisible(false);
		b.addActionListener(this);
		
		
		f.setSize(800,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b && rb1.isSelected()) {
			FDAccount fd = new FDAccount();
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			String s3 = tf3.getText();
			fd.setAmount(Double.parseDouble(s1));
			fd.setNoOfDays(Integer.parseInt(s2));
			fd.setAgeOfACHolder(Integer.parseInt(s3));
			double interest = fd.calculateInterest();
			String res = String.valueOf(interest);
			tf4.setText(res);
		}
		
		else if(e.getSource()==b && rb2.isSelected()) {
			RDAccount rd = new RDAccount();
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			String s3 = tf3.getText();
			rd.setMonthlyAmount(Double.parseDouble(s1));
			rd.setNoOfMonths(Integer.parseInt(s2));
			rd.setAge(Integer.parseInt(s3));
			double interest = rd.calculateInterest();
			String res= String.valueOf(interest);
			tf4.setText(res);
		}
		
		else if(e.getSource()==b && rb3.isSelected()) {
			SBAccount sb = new SBAccount();
			String s1 = tf1.getText();
			sb.setAmount(Double.parseDouble(s1));
			if(rb4.isSelected())
				sb.setAccountType("normal");
			else if(rb5.isSelected())
				sb.setAccountType("nri");
			double interest = sb.calculateInterest();
			String res = String.valueOf(interest);
			tf4.setText(res);
		}
		
		else if(rb1.isSelected()) {
			rb1.setForeground(Color.CYAN);rb1.setBackground(Color.darkGray);
			rb2.setBackground(Color.LIGHT_GRAY);rb2.setForeground(Color.BLACK);
			rb3.setBackground(Color.LIGHT_GRAY);rb3.setForeground(Color.BLACK);
			l2.setText("FD Amount :");
			l3.setText("No. of days :");
			l4.setText("Your age :");
			l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
			tf1.setVisible(true);tf2.setVisible(true);tf3.setVisible(true);tf4.setVisible(true);
			rb4.setVisible(false);rb5.setVisible(false);
			b.setVisible(true);
			tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");			
		}
		
		else if(rb2.isSelected()) {
			rb2.setForeground(Color.CYAN);rb2.setBackground(Color.darkGray);
			rb1.setBackground(Color.LIGHT_GRAY);rb1.setForeground(Color.BLACK);
			rb3.setBackground(Color.LIGHT_GRAY);rb3.setForeground(Color.BLACK);
			l2.setText("Monthly Amount :");
			l3.setText("No. of months :");
			l4.setText("Your age :");
			l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
			tf1.setVisible(true);tf2.setVisible(true);tf3.setVisible(true);tf4.setVisible(true);
			rb4.setVisible(false);rb5.setVisible(false);
			b.setVisible(true);
			tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");	
		}
		
		else if(rb3.isSelected()) {
			rb3.setForeground(Color.CYAN);rb3.setBackground(Color.darkGray);
			rb2.setBackground(Color.LIGHT_GRAY);rb2.setForeground(Color.BLACK);
			rb1.setBackground(Color.LIGHT_GRAY);rb1.setForeground(Color.BLACK);
			l2.setText("Average Amount :");
			l3.setText("Type of Account :");
			l2.setVisible(true);l3.setVisible(true);l4.setVisible(false);l5.setVisible(true);
			tf1.setVisible(true);tf2.setVisible(false);tf3.setVisible(false);tf4.setVisible(true);
			rb4.setVisible(true);rb5.setVisible(true);
			b.setVisible(true);
			tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");	
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculatorGUI();
	}

}
