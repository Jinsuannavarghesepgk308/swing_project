package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ticketbooking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	String va=" ";
    String Ac=" ";
    String non=" ";
   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(356, 81, 401, 342);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 51, 46, 14);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(91, 50, 106, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(10, 114, 46, 14);
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblFrom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 108, 106, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(10, 152, 46, 14);
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblTo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 150, 106, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(10, 194, 46, 14);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblDate);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 191, 106, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(10, 231, 46, 14);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(89, 229, 108, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(255, 124, 113, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(265, 108, 81, 14);
		lblTicketNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblTicketNo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(255, 164, 113, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(265, 150, 46, 14);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblPrice);
		
		textField_7 = new JTextField();
		textField_7.setBounds(255, 210, 113, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(265, 195, 46, 14);
		lblRoute.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblRoute);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirm.setBounds(170, 284, 108, 23);
		panel.add(btnConfirm);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(247, 11, 332, 45);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketBooking.setBounds(75, 11, 227, 23);
		panel_1.add(lblTicketBooking);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(20, 124, 315, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(349, 124, 0, 280);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(349, 112, 0, 311);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(356, 112, -10, 288);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(20, 362, 1, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(0, 0, 0));
		separator_5.setBounds(20, 351, 315, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(345, 374, 1, -248);
		frame.getContentPane().add(separator_6);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName_1.setBounds(20, 99, 46, 14);
		frame.getContentPane().add(lblName_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(122, 98, 137, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JRadioButton std = new JRadioButton("Standard");
		std.setFont(new Font("Tahoma", Font.BOLD, 12));
		std.setBounds(20, 142, 101, 23);
		frame.getContentPane().add(std);
		
		JRadioButton firstclass = new JRadioButton("First Class");
		firstclass.setFont(new Font("Tahoma", Font.BOLD, 12));
		firstclass.setBounds(20, 168, 94, 23);
		frame.getContentPane().add(firstclass);
		
		JRadioButton single = new JRadioButton("Single Ticket");
		single.setFont(new Font("Tahoma", Font.BOLD, 12));
		single.setBounds(119, 142, 120, 23);
		frame.getContentPane().add(single);
		
		JRadioButton adult = new JRadioButton("Adult");
		adult.setFont(new Font("Tahoma", Font.BOLD, 12));
		adult.setBounds(263, 142, 72, 23);
		frame.getContentPane().add(adult);
		
		JRadioButton child = new JRadioButton("Child");
		child.setFont(new Font("Tahoma", Font.BOLD, 12));
		child.setBounds(263, 168, 87, 23);
		frame.getContentPane().add(child);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andra Pradesh", "Madhya Pradesh", "Gujarat", "Goa"}));
		comboBox.setBounds(20, 199, 78, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tamil Nadu", "Kerala", "Karnataka"}));
		comboBox_1.setBounds(108, 199, 101, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2.setBounds(219, 199, 105, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(new Color(0, 0, 0));
		separator_7.setBounds(20, 230, 320, 2);
		frame.getContentPane().add(separator_7);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTax.setBounds(20, 246, 46, 14);
		frame.getContentPane().add(lblTax);
		
		textField_9 = new JTextField();
		textField_9.setBounds(123, 243, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setFont(new Font("Tahoma", Font.BOLD, 12));
		sleeper.setBounds(186, 168, 86, 23);
		frame.getContentPane().add(sleeper);
		
		JLabel subtotal = new JLabel("Sub Total");
		subtotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		subtotal.setBounds(20, 281, 78, 14);
		frame.getContentPane().add(subtotal);
		
		textField_10 = new JTextField();
		textField_10.setBounds(123, 278, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel total = new JLabel("Total");
		total.setFont(new Font("Tahoma", Font.BOLD, 12));
		total.setBounds(20, 322, 46, 14);
		frame.getContentPane().add(total);
		
		textField_11 = new JTextField();
		textField_11.setBounds(123, 320, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				textField.setText(textField_8.getText());
				String a=(String)comboBox.getSelectedItem();
				textField_1.setText(a);
				String b=(String)comboBox_1.getSelectedItem();
				textField_2.setText(b);
				//Time
                Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_4.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_3.setText(tdate.format(timer.getTime()));
                double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
                
                int num;
    			String s="";
    			num=1325;
    			s=s+num+1325;
    			textField_5.setText(s);
    			textField_7.setText("Any");
    			double t=0;
    			String m="";
    			if(single.isSelected()) {
    				t=t+500;
    			}
    			else
    			{
    				t=t+300;
    			}
    			if(sleeper.isSelected())
    			{
    				t=t+500;
    				
    			}
    			else
    			{
    				t=t+300;
    			}
    			m=m+t;
    			textField_10.setText(m);
    			double[]tot=new double[15];
    			double tot1 = Double.parseDouble(textField_9.getText());
    			double tot2 = Double.parseDouble(textField_10.getText());
    			double tot3 = (tot1+tot2);
    			String total=String.format("%.2f",tot3);
    			textField_11.setText(total);


    			
			}
		});
                
               btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTotal.setBounds(20, 381, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
			
			
			
			}
			
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(133, 381, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(241, 381, 89, 23);
		frame.getContentPane().add(btnExit);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No. of seat", "Time", "Date", "AC/Non AC", "Price"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Booking No", "From", "To", "No. of seat", "Time", "Date", "AC/Non AC", "Price"
			}
		));
		table.setBounds(20, 489, 728, 117);
		frame.getContentPane().add(table);
		
		JRadioButton ac = new JRadioButton("AC");
		ac.setFont(new Font("Tahoma", Font.BOLD, 12));
		ac.setBounds(116, 168, 58, 23);
		frame.getContentPane().add(ac);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(10, 467, 747, 174);
		frame.getContentPane().add(panel_2);
		
		
	}
		}
