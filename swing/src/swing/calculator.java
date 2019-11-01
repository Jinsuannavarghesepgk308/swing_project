package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double result;
	double num1;
	double num2;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 358, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(3, 41, 229, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(10, 96, 46, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(66, 96, 46, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(122, 96, 46, 23);
		frame.getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(10, 130, 46, 23);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_5 = new JButton("5");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBounds(66, 130, 46, 23);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(122, 130, 46, 23);
		frame.getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(178, 96, 46, 23);
		frame.getContentPane().add(button_3);
		
			
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
			
		button_7.setBounds(178, 130, 46, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_8.setBounds(10, 164, 46, 23);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_9 = new JButton("8");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_9.setBounds(66, 164, 46, 23);
		frame.getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
				
			}
		});
		
		JButton button_10 = new JButton("9");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_10.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent e) {
						String Number=textField.getText()+button_10.getText();
						textField.setText(Number);
						
					}
				});
			
		
		button_10.setBounds(122, 164, 46, 23);
		frame.getContentPane().add(button_10);
		
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_11.setBounds(178, 164, 46, 23);
		frame.getContentPane().add(button_11);
		
		
		JButton button_12 = new JButton("0");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_12.setBounds(10, 195, 46, 23);
		frame.getContentPane().add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_13.setBounds(66, 195, 46, 23);
		frame.getContentPane().add(button_13);
		
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="^")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				
				
				
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_14.setBounds(122, 195, 46, 23);
		frame.getContentPane().add(button_14);
		
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_15.setBounds(178, 195, 46, 23);
		frame.getContentPane().add(button_15);
		
		
		JButton btnC = new JButton("C");
		btnC.setBackground(UIManager.getColor("ToolBar.dockingForeground"));
		btnC.setForeground(Color.BLACK);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnC.setBounds(10, 229, 46, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
					
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnB.setBounds(66, 229, 46, 23);
		frame.getContentPane().add(btnB);
		
		JButton button_17 = new JButton("%");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_17.setBounds(178, 229, 46, 23);
		frame.getContentPane().add(button_17);
	}

}
