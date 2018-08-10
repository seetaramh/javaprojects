package com.ssms.views.accounts;

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

public class AccountsView {

	private JFrame frame;

	public AccountsView() {
		initComponents();
		createEvents();
	}

	public void show() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountsView window = new AccountsView();
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

		JPanel panelHrInfo = new JPanel();
		panelHrInfo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelHrInfo.setBounds(237, 31, 572, 423);
		frame.getContentPane().add(panelHrInfo);

		JPanel panelHr = new JPanel();
		panelHr.setLayout(null);
		panelHr.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelHr.setBounds(26, 66, 191, 355);
		frame.getContentPane().add(panelHr);

		JButton btnAddIncome = new JButton("Add Income");
		btnAddIncome.setBounds(33, 79, 127, 31);
		panelHr.add(btnAddIncome);

		JButton btnSearchIncome = new JButton("Search Income");
		btnSearchIncome.setBounds(33, 125, 127, 31);
		panelHr.add(btnSearchIncome);

		JButton btnIncomeHead = new JButton("Income Head");
		btnIncomeHead.setBounds(33, 167, 127, 31);
		panelHr.add(btnIncomeHead);

		JButton btnAddExpense = new JButton("Add Expense");
		btnAddExpense.setBounds(33, 209, 127, 31);
		panelHr.add(btnAddExpense);

		JButton btnSearchExpense = new JButton("Search Expense");
		btnSearchExpense.setBounds(33, 251, 127, 31);
		panelHr.add(btnSearchExpense);

		JButton btnExpenseHead = new JButton("Expense Head");
		btnExpenseHead.setBounds(33, 293, 127, 31);
		panelHr.add(btnExpenseHead);

		JLabel lblStudentInformation = new JLabel("Human Resource");
		lblStudentInformation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStudentInformation.setBounds(33, 11, 141, 31);
		panelHr.add(lblStudentInformation);

		JSeparator separatorNavigation = new JSeparator();
		separatorNavigation.setForeground(Color.BLUE);
		separatorNavigation.setBounds(33, 53, 127, 2);
		panelHr.add(separatorNavigation);

	}
}
