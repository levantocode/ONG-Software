package view;

import controller.ControllerCadastroCredito;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastroCredito extends JFrame implements ActionListener {

    ControllerCadastroCredito controllerCadastroCredito;

    // Elements
    JLabel      lblValorCredito, lblDataCredito, lblDescCredito;
    JTextField  txtValorCredito, txtDataCredito, txtDescCredito;
    JButton     btnCadastrar;

    // User's Data
    String usrDataCredito, usrDescCredito, usrValorCredito;



    public CadastroCredito(ControllerCadastroCredito ccc) {

        super("Cadastrar Crédito");
        this.controllerCadastroCredito = ccc;

        // Instancing Elements
        lblDataCredito   = new JLabel("Data");
        lblDescCredito   = new JLabel("Descricao");
        lblValorCredito  = new JLabel("Valor");

        txtDataCredito   = new JTextField();
        txtDescCredito   = new JTextField();
        txtValorCredito  = new JTextField();

        btnCadastrar    = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);





        // Panel Dados
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(3, 2) );

        pDados.add(lblDataCredito);     pDados.add(txtDataCredito);
        pDados.add(lblDescCredito);     pDados.add(txtDescCredito);
        pDados.add(lblValorCredito);    pDados.add(txtValorCredito);



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
        setSize(250, 110);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
            int    faltando = 0;

            this.usrDataCredito  = txtDataCredito.getText();
            this.usrDescCredito  = txtDescCredito.getText();
            this.usrValorCredito = txtValorCredito.getText();




            if (this.usrDataCredito.equals("") ) {

                faltam += " Data";
                faltando += 1;
            }

            if (this.usrDescCredito.equals("") ) {

                faltam += " Descrição";
                faltando += 1;
            }

            if (this.usrValorCredito.equals("") ) {

                faltam += " Valor Crédito";
                faltando += 1;
            }

            if (faltando > 0) {

                JOptionPane.showMessageDialog(null, faltam);
            }

            else {

                controllerCadastroCredito.cadastrarCredito(this.usrDataCredito, this.usrDescCredito, Double.parseDouble(txtValorCredito.getText() ) );
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
            }
		}
	}
}
