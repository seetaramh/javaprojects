package com.ssms.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class AdminView {

	private JFrame frame;

	public AdminView() {
		initComponents();
		createEvents();
	}

	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView window = new AdminView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void createEvents() {
		
	}

	private void initComponents() {
		frame = new JFrame();
		frame.setTitle("School Management System");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./resources/icons/books.png"));
		frame.setBounds(100, 100, 848, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(249, 31, 560, 423);
		frame.getContentPane().add(panel);
		
		JPanel panelNavigation = new JPanel();
		panelNavigation.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelNavigation.setBounds(29, 42, 191, 398);
		frame.getContentPane().add(panelNavigation);
		panelNavigation.setLayout(null);
		
		JButton btnFrontOffice = new JButton("Front Office");
		btnFrontOffice.setBounds(33, 79, 127, 31);
		panelNavigation.add(btnFrontOffice);
		
		JButton btnStudentInformation = new JButton("Student Information");
		btnStudentInformation.setBounds(33, 125, 127, 31);
		panelNavigation.add(btnStudentInformation);
		
		JButton btnHumanResources = new JButton("Human Resources");
		btnHumanResources.setBounds(33, 167, 127, 31);
		panelNavigation.add(btnHumanResources);
		
		JButton btnFeesCollection = new JButton("Fees Collection");
		btnFeesCollection.setBounds(33, 209, 127, 31);
		panelNavigation.add(btnFeesCollection);
		
		JButton btnAccounts = new JButton("Accounts");
		btnAccounts.setBounds(33, 251, 127, 31);
		panelNavigation.add(btnAccounts);
		
		JButton btnExamResults = new JButton("Exam Results");
		btnExamResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExamResults.setBounds(33, 293, 127, 31);
		panelNavigation.add(btnExamResults);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.setBounds(33, 335, 127, 31);
		panelNavigation.add(btnChangePassword);
		
		JLabel lblNavigations = new JLabel("Navigations");
		lblNavigations.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNavigations.setBounds(47, 11, 100, 31);
		panelNavigation.add(lblNavigations);
		
		JSeparator separatorNavigation = new JSeparator();
		separatorNavigation.setForeground(Color.BLUE);
		separatorNavigation.setBounds(33, 53, 127, 2);
		panelNavigation.add(separatorNavigation);
		
	}
}
