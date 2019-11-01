package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class studentrecord {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;
	double total;
	double avg;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentrecord window = new studentrecord();
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
	public studentrecord() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 960, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 433, 265);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setForeground(new Color(0, 0, 0));
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStudentid.setBounds(10, 39, 83, 25);
		panel.add(lblStudentid);
		
		JLabel lblSurName = new JLabel("Surname");
		lblSurName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSurName.setBounds(10, 90, 72, 25);
		panel.add(lblSurName);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 65, 72, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Course Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 115, 83, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalScore.setBounds(10, 172, 83, 14);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAverage.setBounds(10, 206, 72, 14);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRanking.setBounds(10, 240, 72, 14);
		panel.add(lblRanking);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 159, 159, 2);
		panel.add(separator);
		
		textField = new JTextField();
		textField.setBounds(101, 42, 112, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 68, 112, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 93, 112, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 170, 112, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(101, 204, 112, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 238, 112, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Maths");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(233, 45, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnglish.setBounds(233, 70, 46, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBiology.setBounds(233, 96, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblComputer.setBounds(233, 115, 63, 20);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChemistry.setBounds(233, 147, 72, 14);
		panel.add(lblChemistry);
		
		JLabel lblBiology_1 = new JLabel("Physics");
		lblBiology_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBiology_1.setBounds(233, 173, 63, 14);
		panel.add(lblBiology_1);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTamil.setBounds(233, 206, 63, 15);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMalayalam.setBounds(233, 241, 72, 14);
		panel.add(lblMalayalam);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyTyped(KeyEvent evt) {
				
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
				
			}
		});
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_7.setBounds(318, 42, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(318, 68, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(318, 93, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(318, 118, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(318, 145, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(318, 170, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(318, 200, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(318, 231, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "CS100", "CS101", "CS102", "CS103", "CS104", "CS105", "", "", ""}));
		comboBox.setBounds(103, 120, 110, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(453, 11, 466, 380);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(211, 54, -162, 2);
		panel_1.add(separator_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(142, 108, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(142, 266, 46, 14);
		panel_1.add(label_9);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(23, 31, 343, 291);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setForeground(new Color(0, 0, 255));
		btnClear.setBounds(159, 346, 89, 23);
		panel_1.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 402, 842, 81);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID","Course Code","Maths","English","Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"},
			},
			
			new String[] {
					"Student_ID","Course Code","Maths","English","Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"
			}
		));
		table.setBounds(10, 11, 855, 59);
		panel_2.add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tot1 = Double.parseDouble(textField_7.getText());
                double tot2 = Double.parseDouble(textField_8.getText());
                double tot3 = Double.parseDouble(textField_9.getText());
                double tot4 = Double.parseDouble(textField_10.getText());
                double tot5 = Double.parseDouble(textField_11.getText());
                double tot6 = Double.parseDouble(textField_12.getText());
                double tot7 = Double.parseDouble(textField_13.getText());
                double tot8 = Double.parseDouble(textField_14.getText());
                total = tot1+tot2+tot3+tot4+tot5+tot6+tot7+tot8;
                String c = String.format("%.2f", total);
                textField_4.setText(c);
                avg = total/8;
                String a = String.format("%.2f", avg);
                textField_5.setText(a);
                if(total>800)
                {
                    textField_6.setText("1");
                }
                else if(total>700 && total<800)
                {
                    textField_6.setText("2");
                }
                else if(total>600 && total<700)
                {
                    textField_6.setText("3");
                }
                else if(total>400 && total<600)
                {
                    textField_6.setText("4");
                }
                else if(total>100 && total<400)
                {
                    textField_6.setText("5");
                }
                else
                {
                    textField_6.setText("Fail");
                }
                DefaultTableModel model=(DefaultTableModel)table.getModel();
               model.addRow(new String[] {
                       textField.getText(),
                       (String) comboBox.getSelectedItem(),
                       textField_7.getText(),
                       textField_8.getText(),
                       textField_9.getText(),
                       textField_10.getText(),
                       textField_11.getText(),
                       textField_12.getText(),
                       textField_13.getText(),
                       textField_14.getText(),
                       textField_4.getText(),
                       textField_5.getText(),
                       textField_6.getText(),
		
		
		});
	}
});
btnAddReport.setForeground(new Color(34, 139, 34));
btnAddReport.setBounds(207, 511, 89, 37);
frame.getContentPane().add(btnAddReport);

JButton btnDelete = new JButton("Delete");
btnDelete.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model=(DefaultTableModel)table.getModel();
        try
        {
            int rownum = table.getSelectedRow();
            model.removeRow(rownum);
        }
        catch(Exception msg)
        {
            JOptionPane.showMessageDialog(null,"Please choose the particular row");
        }
		
	}
});
btnDelete.setForeground(new Color(255, 0, 0));
btnDelete.setBounds(307, 511, 89, 37);
frame.getContentPane().add(btnDelete);

JButton btnShowReport = new JButton("Show Report");
btnShowReport.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textArea.append("Student Report\n"+
				"Student Name:\t\t"+textField_1.getText()
				+textField_2.getText()
				+"\n===========================================================\t\t"
				+"\nMaths:\t\t"+textField_7.getText()
				+"\nEnglish:\t\t"+textField_8.getText()
				+"\nBiology:\t\t"+textField_9.getText()
				+"\nComputer:\t\t"+textField_10.getText()
				+"\nChemistry:\t\t"+textField_11.getText()
				+"\nPhysics:\t\t"+textField_12.getText()
				+"\nTamil:\t\t"+textField_13.getText()
				+"\nMalayalam:\t\t"+textField_14.getText()
				+"\n===========================================================\t\t"
				
		+"\nTotal score:\t\t"+textField_4.getText()+"\nAverage:\t\t"
		+textField_5.getText()+"\nRanking:\t\t"+textField_6.getText());

				}


			});
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						textField.getText(),
						(String) comboBox.getSelectedItem(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						textField_10.getText(),
						textField_11.getText(),
						textField_12.getText(),
						textField_13.getText(),
						textField_14.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText()
				
				
		
						
				
				
				
			
		});
		btnShowReport.setForeground(new Color(0, 0, 205));
		btnShowReport.setBounds(406, 511, 107, 37);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setForeground(new Color(255, 69, 0));
		btnExit.setBounds(524, 511, 89, 37);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				
				
			}
		});
		btnReset.setForeground(new Color(218, 112, 214));
		btnReset.setBounds(623, 511, 89, 37);
		frame.getContentPane().add(btnReset);
	}
}
