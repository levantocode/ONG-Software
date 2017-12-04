package view;

import controller.ControllerCadastroProduto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroProduto extends JFrame implements ActionListener {

    ControllerCadastroProduto controllerCadastroProduto;

    // Elements
    JLabel     lblNome, lblTipo, lblDescricao;
    JTextField txtNome, txtTipo, txtDescricao;
    JButton    btnCadastrar;

    // User's Data
    String usrNome, usrTipo, usrDescricao;



    public CadastroProduto(ControllerCadastroProduto ccp) {

        super("Cadastrar Produto");
        this.controllerCadastroProduto = ccp;

        // Instancing Elements
        lblNome      = new JLabel("Nome");
        lblTipo      = new JLabel("Tipo");
        lblDescricao = new JLabel("Descrição");

        txtNome      = new JTextField();
        txtTipo      = new JTextField();
        txtDescricao = new JTextField();

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);




        // Panel Dados
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(3, 2) );

        pDados.add(lblNome);         pDados.add(txtNome);
        pDados.add(lblTipo);         pDados.add(txtTipo);
        pDados.add(lblDescricao);    pDados.add(txtDescricao);



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
        setSize(250, 105);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
            int    faltando = 0;

            this.usrNome      = txtNome.getText();
            this.usrTipo      = txtTipo.getText();
            this.usrDescricao = txtDescricao.getText();

            if (this.usrNome.equals("") ) {

				faltam += " Nome";
				faltando += 1;
			}

			if (this.usrTipo.equals("") ) {

				faltam += " Tipo";
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

				controllerCadastroProduto.cadastrarProduto(this.usrNome, this.usrTipo, this.usrDescricao);
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
			}
		}
	}
}
