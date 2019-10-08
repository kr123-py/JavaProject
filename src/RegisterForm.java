import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.sql.*;

public class RegisterForm extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 510);
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(83, 31, 56, 16);
		getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(174, 28, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Full Name");
		lblName.setBounds(54, 66, 108, 16);
		getContentPane().add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 63, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Phone Number");
		lblNewLabel.setBounds(52, 94, 110, 16);
		getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 91, 116, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(62, 123, 56, 16);
		getContentPane().add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 126, 116, 22);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(174, 161, 116, 50);
		getContentPane().add(textArea);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(62, 183, 56, 16);
		getContentPane().add(lblAddress);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				    String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
				    String DB_URL = "sql_con";
				    Connection conn = null;
				    Statement stmt = null;
				    
				    try
				    {
				    	conn = DriverManager.getConnection(DB_URL, "system", "system");
				        System.out.println("Connected database successfully...");
				    }
				    catch(Exception ex)
				    {
				    	System.out.println(ex.toString());
				    }



			}
		});
		btnSubmit.setBounds(154, 240, 97, 25);
		getContentPane().add(btnSubmit);
	}
}
