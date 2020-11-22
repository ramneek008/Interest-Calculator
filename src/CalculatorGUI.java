import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {
	JFrame f;
	JRadioButton rb1, rb2, rb3;
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1, tf2, tf3, tf4;
	JButton b;
	CalculatorGUI(){
		f = new JFrame("Interest Calculator");
		
		l1 = new JLabel("Select account type:");
		l1.setBounds(210,20,150,30);
		
		rb1 = new JRadioButton("FD Account");
		rb1.setBounds(220, 50, 150, 30);
		rb2 = new JRadioButton("RD Account");
		rb2.setBounds(220, 75, 150, 30);
		rb3 = new JRadioButton("SD Account");
		rb3.setBounds(220, 100, 150, 30);
		
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
		
		l2.setBounds(100,160,150,30);
		l3.setBounds(100,190,150,30);
		l4.setBounds(100,220,150,30);
		l5.setBounds(100,250,150,30);
		f.add(l2);f.add(l3);f.add(l4);f.add(l5);
		
		l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
		
		tf1= new JTextField();
		tf2= new JTextField();
		tf3= new JTextField();
		tf4= new JTextField();
		
		tf1.setBounds(300,165,150,25);
		tf2.setBounds(300,195,150,25);
		tf3.setBounds(300,225,150,25);
		tf4.setBounds(300,255,150,25);
		tf4.setEditable(false);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);
		
		tf1.setVisible(false);tf2.setVisible(false);tf3.setVisible(false);tf4.setVisible(false);
		
		b = new JButton("Calculate");
		b.setBounds(220,300,100,25);
		f.add(b);
		b.setVisible(false);
		b.addActionListener(this);
		
		
		f.setSize(600,400);
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
			double interest = sb.calculateInterest();
			String res = String.valueOf(interest);
			tf4.setText(res);
		}
		
		else if(rb1.isSelected()) {
			l2.setText("FD Amount :");
			l3.setText("No. of days :");
			l4.setText("Your age :");
			l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
			tf1.setVisible(true);tf2.setVisible(true);tf3.setVisible(true);tf4.setVisible(true);
			b.setVisible(true);
			tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");			
		}
		
		else if(rb2.isSelected()) {
			l2.setText("Monthly Amount :");
			l3.setText("No. of months :");
			l4.setText("Your age :");
			l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
			tf1.setVisible(true);tf2.setVisible(true);tf3.setVisible(true);tf4.setVisible(true);
			b.setVisible(true);
			tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");	
		}
		
		else if(rb3.isSelected()) {
			l2.setText("Average Amount :");
			l2.setVisible(true);l3.setVisible(false);l4.setVisible(false);l5.setVisible(true);
			tf1.setVisible(true);tf2.setVisible(false);tf3.setVisible(false);tf4.setVisible(true);
			b.setVisible(true);
			tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");	
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorGUI ob = new CalculatorGUI();
	}

}
