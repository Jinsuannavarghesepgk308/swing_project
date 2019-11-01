package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double n1;
	double n2;
	double res;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi window = new bmi();
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
	public bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 64, 76, -54);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(50, 205, 50));
		panel_2.setBounds(40, 76, 336, 203);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHeightm.setBounds(23, 11, 65, 14);
		panel_2.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWeightkg.setBounds(23, 51, 75, 14);
		panel_2.add(lblWeightkg);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBmi.setBounds(23, 95, 46, 14);
		panel_2.add(lblBmi);
		
		JLabel label_2 = new JLabel();
		label_2.setBackground(new Color(255, 215, 0));
		label_2.setBounds(122, 95, 46, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setBackground(new Color(255, 255, 0));
		label_3.setBounds(214, 95, 46, 14);
		panel_2.add(label_3);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField_1.getText());
				double res=(n1/n2/n2)*10000;
				String ans=String.format("%.2f",res);
				label_2.setText(ans);
				if(res<18.5)
				{
					label_3.setText("Under Weight");
				}
				else if(res>18.5 &&res<24.5)
				{
					label_3.setText("Over Weight");
					
				}
				else
				{
					label_3.setText("Obese");
				}
			}
		});
		btnCalculate.setBounds(23, 149, 89, 23);
		panel_2.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnClear.setBounds(133, 149, 89, 23);
		panel_2.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(237, 149, 89, 23);
		panel_2.add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(131, 5, 122, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 48, 122, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(50, 205, 50));
		panel_3.setBounds(40, 289, 336, 164);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 60, 326, 23);
		panel_3.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(37, 9, 339, 56);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBodyMassIndex.setBounds(117, 11, 151, 34);
		panel_1.add(lblBodyMassIndex);
	}
}
