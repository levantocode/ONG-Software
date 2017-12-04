package view;

import controller.ControllerCadastroBrincadeira;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastroBrincadeira extends JFrame implements ActionListener {

    ControllerCadastroBrincadeira controllerCadastroBrincadeira;

    // Elements
    JLabel      lblNome, lblDescricao, lblQtdCriancas;
    JTextField  txtNome, txtDescricao, txtQtdCriancas;
    JButton     btnCadastrar;

    // User's Data
    String usrNome, usrDescricao, usrQtdCriancas;



    public CadastroBrincadeira(ControllerCadastroBrincadeira ccb) {

        super("Cadastrar Brincadeira");
        this.controllerCadastroBrincadeira = ccb;

        // Instancing Elements
        lblNome        = new JLabel("Nome da Brincadeira");
        lblDescricao   = new JLabel("Descricao");
        lblQtdCriancas = new JLabel("Quantidade de Crianças");

        txtNome        = new JTextField();
        txtDescricao   = new JTextField();
        txtQtdCriancas = new JTextField();

        btnCadastrar   = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);





        // Panel Dados
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(3, 2) );

        pDados.add(lblNome);           pDados.add(txtNome);
        pDados.add(lblDescricao);      pDados.add(txtDescricao);
        pDados.add(lblQtdCriancas);    pDados.add(txtQtdCriancas);



        // Button Panel
        JPanel pButton = new JPanel();
        pButton.setLayout(new BorderLayout() );

        pButton.add(btnCadastrar, BorderLayout.WEST);



        // Container
        Container con = getContentPane();
        con.setLayout(new BoxLayout(con, BoxLayout.PAGE_AXIS) );

        con.add(pDados);
        con.add(pButton);



        // JFrame Panel
        pack();
        setSize(350, 110);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
            int    faltando = 0;

            this.usrNome        = txtNome.getText();
            this.usrDescricao   = txtDescricao.getText();
            this.usrQtdCriancas = txtQtdCriancas.getText();



            if (this.usrNome.equals("") ) {

				faltam += " Nome";
				faltando += 1;
			}

			if (this.usrQtdCriancas.equals("") ) {

				faltam += " Quantidade de Crianças";
				faltando += 1;
			}

			if (this.usrDescricao.equals("") ) {

				faltam += " Descrição";
				faltando += 1;
			}

            if (faltando > 0) {

				JOptionPane.showMessageDialog(null, faltam);
			}

			else {

				controllerCadastroBrincadeira.cadastrarBrincadeira(this.usrNome, this.usrDescricao, Integer.parseInt(this.usrQtdCriancas) );
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
			}
		}
	}
}
