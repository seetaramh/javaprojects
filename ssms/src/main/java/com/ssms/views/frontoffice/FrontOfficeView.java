package com.ssms.views.frontoffice;

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

public class FrontOfficeView {

	private JFrame frame;

	public FrontOfficeView() {
		initComponents();
		createEvents();
	}


	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontOfficeView window = new FrontOfficeView();
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
		
		JPanel panelFrontOffice = new JPanel();
		panelFrontOffice.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelFrontOffice.setBounds(237, 31, 572, 423);
		frame.getContentPane().add(panelFrontOffice);
		
		JPanel panelNavigator = new JPanel();
		panelNavigator.setBounds(26, 71, 191, 350);
		frame.getContentPane().add(panelNavigator);
		panelNavigator.setLayout(null);
		panelNavigator.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JButton btnAdmissionEnquiry = new JButton("Admission Enquiry");
		btnAdmissionEnquiry.setBounds(28, 79, 136, 31);
		panelNavigator.add(btnAdmissionEnquiry);
		
		JLabel lblFontOffice = new JLabel("Font Office");
		lblFontOffice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFontOffice.setBounds(47, 11, 100, 31);
		panelNavigator.add(lblFontOffice);
		
		JSeparator separatorNavigator = new JSeparator();
		separatorNavigator.setForeground(Color.BLUE);
		separatorNavigator.setBounds(33, 53, 127, 2);
		panelNavigator.add(separatorNavigator);
		
		JButton btnVisitorBook = new JButton("Visitor Book");
		btnVisitorBook.setBounds(29, 121, 136, 31);
		panelNavigator.add(btnVisitorBook);
		
		JButton btnPhoneCallLog = new JButton("Phone Call Log");
		btnPhoneCallLog.setBounds(28, 163, 136, 31);
		panelNavigator.add(btnPhoneCallLog);
		
		JButton btnPostalDispatch = new JButton("Postal Dispatch");
		btnPostalDispatch.setBounds(28, 205, 136, 31);
		panelNavigator.add(btnPostalDispatch);
		
		JButton btnPostalReceive = new JButton("Postal Receive");
		btnPostalReceive.setBounds(29, 247, 136, 31);
		panelNavigator.add(btnPostalReceive);
		
		JButton btnComplaints = new JButton("Complaints");
		btnComplaints.setBounds(30, 289, 136, 31);
		panelNavigator.add(btnComplaints);
		
	}
	

}
