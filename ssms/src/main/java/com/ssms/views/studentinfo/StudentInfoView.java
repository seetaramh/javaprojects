package com.ssms.views.studentinfo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class StudentInfoView {

	private JFrame frame;

	public StudentInfoView() {
		initComponents();
		createEvents();
	}

	
	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfoView window = new StudentInfoView();
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
		
		JPanel panelStudentInfo = new JPanel();
		panelStudentInfo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelStudentInfo.setBounds(237, 31, 572, 423);
		frame.getContentPane().add(panelStudentInfo);
		
		JPanel panelNavigationStudentInfo = new JPanel();
		panelNavigationStudentInfo.setLayout(null);
		panelNavigationStudentInfo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelNavigationStudentInfo.setBounds(26, 64, 191, 355);
		frame.getContentPane().add(panelNavigationStudentInfo);
		
		JButton btnStudentDetails = new JButton("Student Details");
		btnStudentDetails.setBounds(33, 79, 127, 31);
		panelNavigationStudentInfo.add(btnStudentDetails);
		
		JButton btnStudentAdmission = new JButton("Student Admission");
		btnStudentAdmission.setBounds(33, 125, 127, 31);
		panelNavigationStudentInfo.add(btnStudentAdmission);
		
		JButton btnStudentReport = new JButton("Student Report");
		btnStudentReport.setBounds(33, 167, 127, 31);
		panelNavigationStudentInfo.add(btnStudentReport);
		
		JButton btnGuardianReport = new JButton("Guardian Report");
		btnGuardianReport.setBounds(33, 209, 127, 31);
		panelNavigationStudentInfo.add(btnGuardianReport);
		
		JButton btnStudentCategories = new JButton("Student Categories");
		btnStudentCategories.setBounds(33, 251, 127, 31);
		panelNavigationStudentInfo.add(btnStudentCategories);
		
		JButton btnStudentCredentials = new JButton("Student Credentials");
		btnStudentCredentials.setBounds(33, 293, 127, 31);
		panelNavigationStudentInfo.add(btnStudentCredentials);
		
		JLabel lblStudentInformation = new JLabel("Student Information");
		lblStudentInformation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStudentInformation.setBounds(10, 11, 161, 31);
		panelNavigationStudentInfo.add(lblStudentInformation);
		
		JSeparator separatorNavigator = new JSeparator();
		separatorNavigator.setForeground(Color.BLUE);
		separatorNavigator.setBounds(33, 53, 127, 2);
		panelNavigationStudentInfo.add(separatorNavigator);
		
	}
}
