import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class Login {

	private JFrame frame;
	private JTextField txtUser;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		JLabel UerName = new JLabel("User Name");
		UerName.setFont(new Font("Arial", Font.BOLD, 17));
		UerName.setBounds(94, 74, 100, 16);
		frame.getContentPane().add(UerName);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Arial", Font.BOLD, 16));
		Password.setBounds(94, 113, 100, 16);
		frame.getContentPane().add(Password);
		
		txtUser = new JTextField();
		txtUser.setBounds(216, 72, 116, 22);
		frame.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(216, 113, 116, 22);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
				String Username=txtUser.getText();
				String Password=txtPassword.getText();
				if(Username.equals("Demo")&&Password.equals("Demo123"))
				{
					Welcome objwelcome=new Welcome();
					//objwelcome.setVisible(true);
					JLabel lblWel= new JLabel();
					lblWel.setText("Message"+Username);
					objwelcome.getContentPane().add(lblWel);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username and password", "Error", JOptionPane.ERROR_MESSAGE);
					
				
				}
			}
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnLogin.setBounds(154, 169, 97, 25);
		frame.getContentPane().add(btnLogin);
	}
}
