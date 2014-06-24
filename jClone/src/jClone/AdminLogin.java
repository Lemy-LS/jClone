package jClone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class AdminLogin {

	private JFrame frame;
	private JTextField UsernameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.textHighlight, 5));
		panel.setBounds(10, 11, 414, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight));
		panel_1.setBounds(109, 11, 176, 33);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblAdministratorLogin = new JLabel("Administrator Login");
		panel_1.add(lblAdministratorLogin);
		lblAdministratorLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAdministratorLogin.setBackground(SystemColor.inactiveCaption);
		lblAdministratorLogin.setForeground(SystemColor.textHighlight);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(81, 90, 66, 14);
		panel.add(lblUsername);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setFont(new Font("Tahoma", Font.ITALIC, 11));
		UsernameTextField.setText("(input your username here)");
		UsernameTextField.setBounds(139, 87, 146, 20);
		panel.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(81, 123, 66, 14);
		panel.add(lblPassword);
		
		JFormattedTextField frmtdtxtfldinputYourPassword = new JFormattedTextField();
		frmtdtxtfldinputYourPassword.setText("(Input your password here)");
		frmtdtxtfldinputYourPassword.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frmtdtxtfldinputYourPassword.setBounds(139, 120, 146, 20);
		panel.add(frmtdtxtfldinputYourPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(162, 154, 89, 23);
		panel.add(btnLogin);
	}
}
