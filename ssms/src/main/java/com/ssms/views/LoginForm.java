package com.ssms.views;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.ssms.utilities.GraphicUtility;

public class LoginForm {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	public LoginForm() {
		initComponents();
		createEvents();
	}

	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	private void createEvents() {
		// TODO Auto-generated method stub

	}

	private void initComponents() {
		frame = new JFrame();
		frame.setTitle("Member Login");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./resources/icons/lock.png"));
		frame.setBounds(100, 100, 370, 259);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(69, 84, 65, 21);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(69, 116, 65, 21);
		frame.getContentPane().add(lblPassword);

		txtUsername = new JTextField();
		txtUsername.setBounds(134, 84, 127, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(134, 116, 127, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(144, 161, 105, 23);
		frame.getContentPane().add(btnLogin);

		JLabel lblMemberLogin = new JLabel("SIGN IN");
		lblMemberLogin.setBounds(166, 42, 53, 21);
		frame.getContentPane().add(lblMemberLogin);
		GraphicUtility.setWindowPosition(frame);

	}

}
