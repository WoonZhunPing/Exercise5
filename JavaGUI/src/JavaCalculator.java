import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaCalculator {

	private JFrame Calculator;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCalculator window = new JavaCalculator();
					window.Calculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculator = new JFrame();
		Calculator.setBounds(100, 100, 717, 516);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(10, 50, 330, 70);
		Calculator.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(350, 50, 343, 70);
		Calculator.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		btnNewButton_1 = new JButton("Plus / +");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 , ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid value");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(82, 140, 182, 98);
		Calculator.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Minus / -");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 , ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid value");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_2.setBounds(430, 150, 170, 80);
		Calculator.getContentPane().add(btnNewButton_2);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(238, 366, 299, 98);
		Calculator.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(82, 367, 146, 78);
		Calculator.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton3 = new JButton("Mutiply / x");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2 , ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid value");
				}
			}
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton3.setBounds(89, 276, 182, 80);
		Calculator.getContentPane().add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Divide / \u00F7");
		btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2 , ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 / num2;
					textFieldAns.setText(Double.toString(ans));
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid value");
				}
			}
		});
		btnNewButton4.setBounds(430, 265, 191, 91);
		Calculator.getContentPane().add(btnNewButton4);
	}
}
