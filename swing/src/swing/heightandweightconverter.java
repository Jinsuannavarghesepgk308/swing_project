package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class heightandweightconverter {

	private JFrame frame;
    private JTextField textField;
    
	double n1;
	double n2;
	double r1;
	double r2;
	String ans1;
	String ans2;
	private JTextField textField_2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heightandweightconverter window = new heightandweightconverter();
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
	public heightandweightconverter() {
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
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAbout.setBounds(49, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeight.setBounds(10, 83, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWeight.setBounds(10, 125, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel label = new JLabel("");
		label.setBounds(197, 113, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(215, 84, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(226, 126, 46, 14);
		frame.getContentPane().add(label_2);
		textField_2.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField_2.getText());
				r1=(n1/3.2808);
				r2=(n2/2.2046);
				ans1=String.format("%.2f m",r1);
			    ans2=String.format("%.0f kg",r2);
				label_1.setText(ans1);
				label_2.setText(ans2);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOk.setBounds(69, 190, 112, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancel.setBounds(197, 190, 112, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsMeasurement.setBounds(84, 55, 97, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMetric.setBounds(226, 55, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		textField = new JTextField();
		textField.setBounds(66, 81, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 123, 112, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
	}
}
