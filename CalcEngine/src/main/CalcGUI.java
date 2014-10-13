package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Creates JFrame 
public class CalcGUI extends JFrame {
	JButton Calc = new JButton("Calculate");
	JLabel InvestmentAmount = new JLabel("Investment Amount");
	JLabel Years = new JLabel("Years");
	JLabel AIR = new JLabel("Annual Interest Rate");
	JLabel FV = new JLabel("Future Value");
	JTextField Investment = new JTextField();
	JTextField years = new JTextField();
	JTextField AnnualIR = new JTextField();
	JTextField FutureValue = new JTextField();
	JPanel Panel = new JPanel();
	calcActionListener a = new calcActionListener();

	// Layout of JFrame is made
	public CalcGUI() {
		Calc.addActionListener(a);
		FutureValue.setEditable(false);
		setLayout(new BorderLayout());
		Panel.setLayout(new GridLayout(4, 2));
		Panel.add(InvestmentAmount);
		Panel.add(Investment);
		Panel.add(Years);
		Panel.add(years);
		Panel.add(AIR);
		Panel.add(AnnualIR);
		Panel.add(FV);
		Panel.add(FutureValue);
		add(Panel, BorderLayout.NORTH);
		add(Calc, BorderLayout.EAST);

		// JFrame size set and action for closing window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
	}

	// ActionListener for actions inside text boxes
	class calcActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double a = Double.parseDouble(Investment.getText());
			int b = Integer.parseInt(years.getText());
			double c = Double.parseDouble(AnnualIR.getText());
			double re = CalcEngine(a, b, c);
			String s = String.valueOf(re);
			FutureValue.setText(s);
		}

	}

	// CalcEngine class that handles the business logic
	public double CalcEngine(double investment, int year, double IR) {
		return Math.pow(1 + IR / 100, year) * investment;

	}
}
