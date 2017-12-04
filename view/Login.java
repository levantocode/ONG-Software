package view;


import model.DadosModel;

// import controller.MainController;
import controller.ControllerLogin;
import controller.ControllerCadastroVoluntario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Login extends JFrame implements ActionListener {

	private DadosModel		dadosModel;
	private ControllerLogin controllerLogin;

	// Elements
	private JLabel 	   	   lblUsername, lblPassword;
	private JTextField 	   txtUsername;
	private JPasswordField pswPassword;
	private JButton    	   btnLogar, btnQuit;

	// User's Data
	private String		   usrUsername, usrPassword;



	public Login(ControllerLogin controller) {

		super("Um Sorriso a Mais");

		this.controllerLogin = controller;

		// Instancing Elements
		lblUsername = new JLabel("Username: ");
		lblPassword = new JLabel("Password: ");

		txtUsername = new JTextField();
		pswPassword = new JPasswordField();

		btnLogar    = new JButton("Login");
		btnQuit     = new JButton("Quit");



		// User's Panel
		JPanel pUser = new JPanel();
		pUser.setLayout(new GridLayout(3, 2));

		pUser.add(lblUsername);	   pUser.add(txtUsername);
		pUser.add(lblPassword);    pUser.add(pswPassword);



		// Button's Panel
		JPanel pButtons = new JPanel();
		pButtons.setLayout(new GridLayout(0, 2));

		pButtons.add(btnLogar);
		pButtons.add(btnQuit);



		// Contanier
		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		con.add(pUser,    BorderLayout.NORTH);
		con.add(pButtons, BorderLayout.SOUTH);



	 	// Action Listeners
		btnLogar.addActionListener(this);
		btnQuit.addActionListener(this);



		// JFrame Panel
		setSize(280, 105);
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}










	 public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnLogar) {

			this.dadosModel = new DadosModel();

			int checkLogin = controllerLogin.checkLogin(this.txtUsername.getText(), new String(this.pswPassword.getPassword() ) );



			if (1 == checkLogin ) {

				Login.super.dispose();
				JOptionPane.showMessageDialog(null, "Logado com Sucesso!");

				JanelaPrincipal janelaPrincipal = new JanelaPrincipal(dadosModel);
			}

			if (2 == checkLogin ) {

				JOptionPane.showMessageDialog(null, "Password Incorreto..");
			}

			if (3 == checkLogin) {

				JOptionPane.showMessageDialog(null, "Username Incorreto.");
			}
		}

		if (e.getSource() == btnQuit) {

			System.exit(0);
		}
	}










	// Gets
	public String getUsrUsername() {
		return this.usrUsername;
	}

	public String getUsrPassword() {
		return this.usrPassword;
	}

	public JButton getBtnLogar() {
		return this.btnLogar;
	}

	public JButton getBtnQuit() {
		return this.btnQuit;
	}



	// Sets
	public void setUsrUsername(String uu) {
		this.usrUsername = uu;
	}

	public void setUsrPassword(String up) {
		this.usrPassword = up;
	}
}
