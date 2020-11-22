import javax.swing.*;
import java.awt.event.*;


public class CalculatorGUI {
	JFrame f;
	CalculatorGUI(){
		f = new JFrame("Interest Calculator");
		
		JLabel l1 = new JLabel("Select account type:");
		l1.setBounds(210,20,150,30);
		
		JRadioButton rb1 = new JRadioButton("FD Account");
		rb1.setBounds(220, 50, 150, 30);
		JRadioButton rb2 = new JRadioButton("RD Account");
		rb2.setBounds(220, 75, 150, 30);
		JRadioButton rb3 = new JRadioButton("SD Account");
		rb3.setBounds(220, 100, 150, 30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);bg.add(rb2);bg.add(rb3);
		f.add(rb1);f.add(rb2);f.add(rb3);
		
		f.add(l1);
		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorGUI ob = new CalculatorGUI();
	}

}
