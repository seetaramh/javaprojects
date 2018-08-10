package com.ssms.views.examresults;

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
import javax.swing.JTextField;

public class ExamResultsView {

	private JFrame frame;
	private JTextField txtRegisterNo;

	public ExamResultsView() {
		initComponents();
		createEvents();
	}

	
	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamResultsView window = new ExamResultsView();
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
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(227, 42, 0, 390);
		frame.getContentPane().add(separator);
		
		JPanel panelExamResults = new JPanel();
		panelExamResults.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelExamResults.setBounds(31, 30, 764, 423);
		frame.getContentPane().add(panelExamResults);
		panelExamResults.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(145, 182, 99, 23);
		panelExamResults.add(btnSubmit);
		
		JLabel label = new JLabel("Exam Results");
		label.setBounds(280, 16, 105, 22);
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panelExamResults.add(label);
		
		JSeparator separatorExamResults = new JSeparator();
		separatorExamResults.setForeground(Color.BLUE);
		separatorExamResults.setBounds(269, 49, 140, 2);
		panelExamResults.add(separatorExamResults);
		
		txtRegisterNo = new JTextField();
		txtRegisterNo.setBounds(144, 134, 251, 23);
		panelExamResults.add(txtRegisterNo);
		txtRegisterNo.setColumns(10);
		
		JLabel lblEnterRegisterNumber = new JLabel("Enter Register Number:");
		lblEnterRegisterNumber.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblEnterRegisterNumber.setBounds(145, 96, 177, 25);
		panelExamResults.add(lblEnterRegisterNumber);
		
	}
}
