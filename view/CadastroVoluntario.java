package view;

import view.JanelaPrincipal;

import controller.ControllerCadastroVoluntario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroVoluntario extends JFrame implements ActionListener {

	private ControllerCadastroVoluntario controllerCadastroVoluntario;



	/*/Singleton
	private static CadastroVoluntario uniqueInstance;

	public static synchronized CadastroVoluntario getInstance(ControllerCadastroVoluntario ccv) {

		if (uniqueInstance == null) {
			uniqueInstance = new CadastroVoluntario(ccv);
		}

		return uniqueInstance;
	}
	*///Singleton




	// Elements
	private JLabel 		   lblNome, lblWhatsapp, lblDataNasc, lblSexo, lblRG;
	private JLabel         lblEndereco, lblTelefone, lblProblemas;

	private JTextField	   txtNome, txtWhatsapp, txtDataNasc, txtSexo, txtRG;
	private JTextField     txtEndereco, txtTelefone;

	private JTextArea      jtaProblemas;
	private JButton		   btnCadastrar, btnCancelar;

	// User's Data
	private String usrNome, usrWhatsapp, usrDataNasc, usrSexo, usrRG;
	private String usrEndereco, usrTelefone, usrProblemas;




	public CadastroVoluntario(ControllerCadastroVoluntario controller) {

		super("Cadastrar");
		this.controllerCadastroVoluntario = controller;

		// Instancing Elements
		lblNome		 = new JLabel("Nome ");
		lblWhatsapp  = new JLabel("Whatsapp ");
		lblDataNasc  = new JLabel("Data de Nascimento ");
		lblSexo      = new JLabel("Sexo ");
		lblRG		 = new JLabel("RG ");
		lblEndereco  = new JLabel("Endereço ");
		lblTelefone  = new JLabel("Telefone ");
		lblProblemas = new JLabel("Problemas Pessoais:");

		txtNome		 = new JTextField();
		txtWhatsapp  = new JTextField();
		txtDataNasc  = new JTextField();
		txtSexo 	 = new JTextField();
		txtRG		 = new JTextField();
		txtEndereco  = new JTextField();
		txtTelefone  = new JTextField();
		jtaProblemas = new JTextArea(5, 1);

		btnCadastrar = new JButton("Cadastrar");
		btnCancelar  = new JButton("Cancelar");



		// Basic Info Panel
		JPanel pBasicInfo = new JPanel();
		pBasicInfo.setLayout(new GridLayout(5, 2));

		pBasicInfo.add(lblNome);		pBasicInfo.add(txtNome);
		pBasicInfo.add(lblWhatsapp);	pBasicInfo.add(txtWhatsapp);
		pBasicInfo.add(lblDataNasc);	pBasicInfo.add(txtDataNasc);
		pBasicInfo.add(lblSexo);   		pBasicInfo.add(txtSexo);
		pBasicInfo.add(lblRG);			pBasicInfo.add(txtRG);



		// Contact Info Panel
		JPanel pContactInfo = new JPanel();
		pContactInfo.setLayout(new GridLayout(2, 2));

		pContactInfo.add(lblEndereco);	pContactInfo.add(txtEndereco);
		pContactInfo.add(lblTelefone);	pContactInfo.add(txtTelefone);



		// Label Panel
		JPanel pLblProblems = new JPanel();
		pLblProblems.setLayout(new GridLayout(0, 2));

		pLblProblems.add(lblProblemas);



		// Problems Panel
		JPanel pProblems  = new JPanel();
		pProblems.setLayout(new GridLayout(1, 0));

		JScrollPane jspProblems = new JScrollPane(jtaProblemas);
		pProblems.add(jspProblems);

		jtaProblemas.setWrapStyleWord(true);
		jtaProblemas.setLineWrap(true);



		// Buttons Panel
		JPanel pButtons = new JPanel();
		pButtons.setLayout(new GridLayout(0, 2));

		pButtons.add(btnCadastrar);    //pButtons.add(btnCancelar);

		btnCadastrar.addActionListener(this);
		//btnCancelar.addActionListener(this);



		// Creating Container
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.PAGE_AXIS));

		con.add(pBasicInfo);
		con.add(Box.createRigidArea(new Dimension(0, 5)));
		con.add(pContactInfo);
		con.add(Box.createRigidArea(new Dimension(0, 30)));
		con.add(pLblProblems);
		con.add(pProblems);
		con.add(Box.createRigidArea(new Dimension(0, 10)));
		con.add(pButtons);



		// JFrame Panel
		pack();
		setSize(350, 400);
		setResizable(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}



	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCadastrar) {

			String faltam   = "Estão faltando:";
			int    faltando = 0;

			this.usrNome 	  = txtNome.getText();
			this.usrWhatsapp  = txtWhatsapp.getText();
			this.usrDataNasc  = txtDataNasc.getText();
			this.usrRG        = txtRG.getText();
			this.usrSexo      = txtSexo.getText();
			this.usrEndereco  = txtEndereco.getText();
			this.usrTelefone  = txtTelefone.getText();
			this.usrProblemas = jtaProblemas.getText();


			if (this.usrNome.equals("") ) {

				faltam += " Nome";
				faltando += 1;
			}

			if (this.usrWhatsapp.equals("") ) {

				faltam += " Whatsapp";
				faltando += 1;
			}

			if (this.usrDataNasc.equals("") ) {

				faltam += " Data de Nascimento";
				faltando += 1;
			}

			if (this.usrRG.equals("") ) {

				faltam += " RG";
				faltando += 1;
			}

			if (this.usrSexo.equals("") ) {

				faltam += " Sexo";
				faltando += 1;
			}

			if (this.usrEndereco.equals("") ) {

				faltam += " Endereco";
				faltando += 1;
			}

			if (this.usrTelefone.equals("") ) {

				faltam += " Telefone";
				faltando += 1;
			}


			if (faltando > 0) {

				JOptionPane.showMessageDialog(null, faltam);
			}

			else {

				controllerCadastroVoluntario.cadastrarVoluntario(this.usrNome, this.usrWhatsapp, this.usrDataNasc, this.usrRG, this.usrSexo, this.usrEndereco, this.usrTelefone, this.usrProblemas, "hoje");
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
			}
		}

		/*if (e.getSource() == btnCancelar) {

			CadastroVoluntario.super.dispose();
		}*/
	}
}
