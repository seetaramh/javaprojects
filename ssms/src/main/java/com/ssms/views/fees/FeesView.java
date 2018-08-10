package com.ssms.views.fees;

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

public class FeesView {

	private JFrame frame;

	public FeesView() {
		initComponents();
		createEvents();
	}

	public void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeesView window = new FeesView();
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

		JPanel panelFeesCollectionControls = new JPanel();
		panelFeesCollectionControls.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelFeesCollectionControls.setBounds(237, 31, 572, 423);
		frame.getContentPane().add(panelFeesCollectionControls);

		JPanel panelFeesNavigation = new JPanel();
		panelFeesNavigation.setBounds(26, 95, 191, 227);
		frame.getContentPane().add(panelFeesNavigation);
		panelFeesNavigation.setLayout(null);
		panelFeesNavigation.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		JButton btnCollectFees = new JButton("Collect Fees");
		btnCollectFees.setBounds(28, 79, 136, 31);
		panelFeesNavigation.add(btnCollectFees);

		JLabel lblFessCollection = new JLabel("Fees Collection");
		lblFessCollection.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFessCollection.setBounds(37, 11, 127, 31);
		panelFeesNavigation.add(lblFessCollection);

		JSeparator separatorNavigation = new JSeparator();
		separatorNavigation.setForeground(Color.BLUE);
		separatorNavigation.setBounds(33, 53, 127, 2);
		panelFeesNavigation.add(separatorNavigation);

		JButton btnSearchFeesPymt = new JButton("Search Fees Payment");
		btnSearchFeesPymt.setBounds(29, 121, 136, 31);
		panelFeesNavigation.add(btnSearchFeesPymt);

		JButton btnSearchDueFees = new JButton("Search Due Fees");
		btnSearchDueFees.setBounds(28, 163, 136, 31);
		panelFeesNavigation.add(btnSearchDueFees);

	}


}
