package com.ssms.views;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LoginForm extends JPanel {

	  private static final long serialVersionUID = 1L;
	  private JTextArea usernameTxt;
	  private JLabel usernameLbl;
	  private JTextArea pwdTxt;
	  private JLabel pwdLbl;
	  private JButton loginBtn;
	  private JButton cancelBtn;

	  public LoginForm() {
	      //construct components
	      usernameTxt = new JTextArea (5, 5);
	      usernameLbl = new JLabel ("UserName:");
	      pwdTxt = new JTextArea (5, 5);
	      pwdLbl = new JLabel ("Password:");
	      loginBtn = new JButton ("Login");
	      cancelBtn = new JButton ("Cancel");

	      //adjust size and set layout
	      setPreferredSize (new Dimension (402, 261));
	      setLayout (null);

	      //add components
	      add (usernameTxt);
	      add (usernameLbl);
	      add (pwdTxt);
	      add (pwdLbl);
	      add (loginBtn);
	      add (cancelBtn);

	      //set component bounds (only needed by Absolute Positioning)
	      usernameTxt.setBounds (145, 70, 180, 30);
	      usernameLbl.setBounds (55, 70, 75, 25);
	      pwdTxt.setBounds (145, 110, 180, 30);
	      pwdLbl.setBounds (55, 110, 80, 25);
	      loginBtn.setBounds (90, 180, 105, 40);
	      cancelBtn.setBounds (215, 180, 120, 40);
	  }
	
	  public void showLogin() {
	      JFrame frame = new JFrame ("Login");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().add (new MyPanel());
	      frame.pack();
	      frame.setVisible (true);
	  }
	
}
