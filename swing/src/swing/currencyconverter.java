package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class currencyconverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	String op;
	String ans;
	double India=100.96;
	double United=302.96;
	String con;
	double result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyconverter window = new currencyconverter();
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
	public currencyconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 568, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(255, 255, 286, 449);
				textField.setBounds(10,0,247,49);
				
				
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(95, 0, 570, 449);
				textField.setBounds(10,0,532,49);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(240, 240, 768, 449);
				textField.setBounds(10,0,535,49);
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 0, 532, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		button.setBounds(10, 60, 45, 40);
		frame.getContentPane().add(button);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
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
		btnCe.setBounds(59, 60, 51, 40);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
			}
		});
		btnC.setBounds(117, 60, 45, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sqrt(num1);
                textField.setText(String.valueOf(num1));
				
			}
		});
		btnSqrt.setBounds(222, 60, 51, 40);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L..");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnL.setBounds(281, 60, 59, 40);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sin(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(352, 60, 59, 40);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSinh.setBounds(425, 60, 59, 40);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Mod";
				
			}
		});
		btnMod.setBounds(494, 60, 59, 40);
		frame.getContentPane().add(btnMod);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(10, 111, 45, 40);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(65, 111, 45, 40);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setBounds(117, 111, 45, 40);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("/");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_5.setBounds(169, 111, 45, 40);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("% ");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_6.setBounds(222, 111, 51, 40);
		frame.getContentPane().add(button_6);
		
		JButton btnPie = new JButton("pie");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=(3.14*num1);
                textField.setText(String.valueOf(num1));
				
				
				
				
			}
		});
		btnPie.setBounds(281, 111, 59, 40);
		frame.getContentPane().add(btnPie);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(352, 111, 59, 40);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnCosh.setBounds(425, 111, 59, 40);
		frame.getContentPane().add(btnCosh);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnLnx.setBounds(494, 111, 59, 40);
		frame.getContentPane().add(btnLnx);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(10, 162, 45, 40);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String Number=textField.getText()+button_8.getText();
			textField.setText(Number);
			}
		});
		button_8.setBounds(65, 162, 45, 40);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(117, 162, 45, 40);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_10.setBounds(169, 162, 45, 40);
		frame.getContentPane().add(button_10);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=(1/num1);
				textField.setText(String.valueOf(num1));
				
				
				
			}
		});
		btnx.setBounds(222, 162, 51, 40);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^Y";
				
				
			}
		});
		btnXy.setBounds(281, 162, 59, 40);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(352, 162, 59, 40);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(425, 162, 59, 40);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(null);
			}
		});
		btnC_1.setBounds(494, 162, 59, 40);
		frame.getContentPane().add(btnC_1);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(10, 213, 45, 40);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
				
			}
		});
		button_12.setBounds(65, 211, 45, 42);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		button_13.setBounds(117, 213, 45, 40);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_14.setBounds(169, 213, 45, 40);
		frame.getContentPane().add(button_14);
		
		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=num1*num1;
				textField.setText("");
			}
		});
		btnX.setBounds(281, 213, 59, 40);
		frame.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Cbr";
				
				
			}
		});
		btnCbr.setBounds(352, 213, 59, 40);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			num1=Double.parseDouble(textField.getText());
            num1=Math.round(num1);
            textField.setText(String.valueOf(num1));
				
				
			}
		});
		btnRund.setBounds(424, 213, 60, 40);
		frame.getContentPane().add(btnRund);
		
		JButton btnpie = new JButton("2*pie");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=(2*3.14*num1);
                textField.setText(String.valueOf(num1));
				
				
			}
		});
		btnpie.setBounds(494, 213, 59, 40);
		frame.getContentPane().add(btnpie);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_15.getText();
				textField.setText(Number);
			}
		});
		button_15.setBounds(10, 264, 100, 34);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_16.getText();
				textField.setText(Number);
			}
		});
		button_16.setBounds(117, 264, 45, 34);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("+");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_17.setBounds(169, 264, 45, 34);
		frame.getContentPane().add(button_17);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=num1*num1*num1;
				textField.setText("");
			}
		});
		btnX_1.setBounds(281, 264, 59, 34);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(352, 264, 59, 34);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
				
			}
		});
		btnHex.setBounds(423, 264, 59, 34);
		frame.getContentPane().add(btnHex);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
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
				if(op=="Cbr")
				{
					result=(num1/num2)*100;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(num1, num2);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="Mod")
				{
					result=Math.pow(num1, num2);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}



				
			}
		});
		button_18.setBounds(222, 213, 51, 85);
		frame.getContentPane().add(button_18);
		
		JButton btnOc = new JButton("Oc..");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
				
				
			}
		});
		btnOc.setBounds(494, 264, 59, 34);
		frame.getContentPane().add(btnOc);
		
		JPanel panel = new JPanel();
		panel.setBounds(560, 0, 188, 298);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrencyConverter.setBounds(25, 11, 153, 26);
		panel.add(lblCurrencyConverter);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selected...", "India", "United", ""}));
		comboBox.setBounds(51, 48, 110, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 79, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(51, 110, 86, 14);
		panel.add(label);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"));
				{
					String c=String.format("Rs %.2f", bp*India);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("United"));
				{
					String c=String.format("Rs %.2f", bp*United);
					label.setText(c);
				}
				
				
				
				
			}
		});
		btnConvert.setBounds(10, 173, 71, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				label.setText("");
			}
		});
		btnClear.setBounds(91, 173, 71, 23);
		panel.add(btnClear);
		
		JButton button_1 = new JButton("+/-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-"+num1);
				
			}
		});
		button_1.setBounds(169, 60, 48, 40);
		frame.getContentPane().add(button_1);
	}
}
