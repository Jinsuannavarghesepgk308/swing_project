package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class celcius {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celcius window = new celcius();
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
	public celcius() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInput.setBounds(119, 28, 46, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInputScale.setBounds(10, 80, 78, 14);
		frame.getContentPane().add(lblInputScale);
		
		JRadioButton rdbtnCelcius = new JRadioButton("Celcius");
		rdbtnCelcius.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnCelcius.setBounds(0, 109, 109, 23);
		frame.getContentPane().add(rdbtnCelcius);
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFahrenheit.setBounds(0, 134, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnKelvin.setBounds(0, 160, 109, 23);
		frame.getContentPane().add(rdbtnKelvin);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOutputScale.setBounds(307, 81, 78, 14);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton rdbtnCelcius_1 = new JRadioButton("Celcius");
		rdbtnCelcius_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnCelcius_1.setBounds(303, 109, 109, 23);
		frame.getContentPane().add(rdbtnCelcius_1);
		
		JRadioButton rdbtnFahrenheit_1 = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFahrenheit_1.setBounds(303, 134, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit_1);
		
		JRadioButton rdbtnKelvin_1 = new JRadioButton("Kelvin");
		rdbtnKelvin_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnKelvin_1.setBounds(303, 161, 109, 23);
		frame.getContentPane().add(rdbtnKelvin_1);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOutput.setBounds(119, 219, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		textField = new JTextField();
		textField.setBounds(163, 27, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 217, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
