package swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Sample1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double n1;
	double n2;
	double r1;
	double r2;
	String ans1;
	String ans2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample1 window = new Sample1();
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
	public Sample1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter v.Beta 0.1 2.1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(231, 89, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(231, 137, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(74, 193, 96, 23);
		frame.getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField_1.getText());
				r1=(n1/3.2808);
				r2=(n2/2.2046);
				ans1=String.format("%.2f m",r1);
			    ans2=String.format("%.0f kg",r2);
				label.setText(ans1);
				label_1.setText(ans2);
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(216, 193, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(74, 86, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 134, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(10, 89, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(10, 137, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setBounds(88, 61, 89, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(231, 64, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(51, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
	}

}
