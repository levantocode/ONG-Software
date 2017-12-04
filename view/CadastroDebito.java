package view;

import controller.ControllerCadastroDebito;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroDebito extends JFrame implements ActionListener {

    ControllerCadastroDebito controllerCadastroDebito;

    // Elements
    JLabel      lblValorDebito, lblDataDebito, lblDescDebito, lblProduto;

    JTextField  txtValorDebito, txtDataDebito, txtDescDebito, txtProduto;

    JButton     btnCadastrar, btnCancelar;

    // User's Data
    String usrDataDebito, usrDescDebito, usrProduto, usrValorDebito;



    public CadastroDebito(ControllerCadastroDebito ccd) {

        super("Cadastrar Débito");
        this.controllerCadastroDebito = ccd;

        // Instancing Elements
        lblDataDebito   = new JLabel("Data");
        lblDescDebito   = new JLabel("Descricao");
        lblProduto      = new JLabel("Produto");
        lblValorDebito  = new JLabel("Valor");

        txtDataDebito   = new JTextField();
        txtDescDebito   = new JTextField();
        txtProduto      = new JTextField();
        txtValorDebito  = new JTextField();

        btnCadastrar    = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);





        // Panel Dados
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(4, 2) );

        pDados.add(lblDataDebito);     pDados.add(txtDataDebito);
        pDados.add(lblDescDebito);     pDados.add(txtDescDebito);
        pDados.add(lblProduto);        pDados.add(txtProduto);
        pDados.add(lblValorDebito);    pDados.add(txtValorDebito);



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
        setSize(300, 140);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
            int    faltando = 0;

            this.usrDataDebito  = txtDataDebito.getText();
            this.usrDescDebito  = txtDescDebito.getText();
            this.usrProduto     = txtProduto.getText();
            this.usrValorDebito = txtValorDebito.getText();



            if (this.usrValorDebito.equals("") ) {

				faltam += " Valor Débito";
				faltando += 1;
			}

			if (this.usrDataDebito.equals("") ) {

				faltam += " Data";
				faltando += 1;
			}

			if (this.usrDescDebito.equals("") ) {

				faltam += " Descrição";
				faltando += 1;
			}

            if (this.usrProduto.equals("") ) {

                faltam += " Produto";
                faltando += 1;
            }

            if (faltando > 0) {

				JOptionPane.showMessageDialog(null, faltam);
			}

			else {

				controllerCadastroDebito.cadastrarDebito(this.usrDataDebito, this.usrDescDebito, this.usrProduto, Double.parseDouble(txtValorDebito.getText() ) );
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
			}
		}
    }
}
