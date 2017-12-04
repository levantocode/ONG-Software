package view;

import controller.ControllerCadastroLocalDeEvento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroLocalDeEvento extends JFrame implements ActionListener {

    ControllerCadastroLocalDeEvento controllerCadastroLocalDeEvento;

    // Elements
    JLabel     lblCidade, lblBairro, lblRua, lblPontoEncontro;
    JTextField txtCidade, txtBairro, txtRua, txtPontoEncontro;
    JButton    btnCadastrar;

    // User's Data
    String usrCidade, usrBairro, usrRua, usrPontoEncontro;



    public CadastroLocalDeEvento(ControllerCadastroLocalDeEvento cclde) {

        super("Cadastrar Local De Evento");
        this.controllerCadastroLocalDeEvento = cclde;

        // Instancing Elements
        lblCidade        = new JLabel("Cidade");
        lblBairro        = new JLabel("Bairro");
        lblRua           = new JLabel("Rua");
        lblPontoEncontro = new JLabel("Ponto de Encontro");

        txtCidade        = new JTextField();
        txtBairro        = new JTextField();
        txtRua           = new JTextField();
        txtPontoEncontro = new JTextField();

        btnCadastrar     = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);




        // Panel Dados
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(4, 2) );

        pDados.add(lblCidade);           pDados.add(txtCidade);
        pDados.add(lblBairro);           pDados.add(txtBairro);
        pDados.add(lblRua);              pDados.add(txtRua);
        pDados.add(lblPontoEncontro);    pDados.add(txtPontoEncontro);



        // Button Panel
        JPanel pButton = new JPanel();
        pButton.setLayout(new BorderLayout() );

        pButton.add(btnCadastrar, BorderLayout.WEST);



        // Container
        Container con = getContentPane();
        con.setLayout(new BoxLayout(con, BoxLayout.PAGE_AXIS) );

        con.add(pDados);
        con.add(pButton);


        // Frame Panel
        pack();
        setSize(300, 145);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e){
		if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
            int    faltando = 0;

            this.usrCidade        = txtCidade.getText();
            this.usrBairro        = txtBairro.getText();
            this.usrRua           = txtRua.getText();
            this.usrPontoEncontro = txtPontoEncontro.getText();



            if (this.usrCidade.equals("") ) {

				faltam   += " Cidade";
				faltando += 1;
			}

			if (this.usrBairro.equals("") ) {

				faltam   += " Bairro";
				faltando += 1;
			}

			if (this.usrRua.equals("") ) {

				faltam   += " Rua";
				faltando += 1;
			}

            if (this.usrPontoEncontro.equals("") ) {

                faltam   += " Ponto de Encontro";
                faltando += 1;
            }

            if (faltando > 0) {

				JOptionPane.showMessageDialog(null, faltam);
			}

			else {

				controllerCadastroLocalDeEvento.cadastrarLocalDeEvento(this.usrCidade, this.usrBairro, this.usrRua, this.usrPontoEncontro);
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
			}
        }
	}
}
