package view;

import controller.ControllerCadastroFormacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroFormacao extends JFrame implements ActionListener {

    ControllerCadastroFormacao controllerCadastroFormacao;

    // Elements
    private JLabel     lblData, lblHoraInicio, lblHoraFim, lblQtdPresente;
    private JTextField txtData, txtHoraInicio, txtHoraFim, txtQtdPresente;
    private JButton    btnCadastrar;

    // User's Data
    private String usrData, usrHoraInicio, usrHoraFim, usrQtdPresente;



    public CadastroFormacao(ControllerCadastroFormacao ccf) {

        super("Cadastrar Formação");
        this.controllerCadastroFormacao = ccf;

        // Instancing Elements
        lblData        = new JLabel("Data");
        lblHoraInicio  = new JLabel("Hora de Início");
        lblHoraFim     = new JLabel("Hora de Termino");
        lblQtdPresente = new JLabel("Quantidade Presente");

        txtData        = new JTextField();
        txtHoraInicio  = new JTextField();
        txtHoraFim     = new JTextField();
        txtQtdPresente = new JTextField();

        btnCadastrar   = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);





        // Dados Panel
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(4, 2) );

        pDados.add(lblData);           pDados.add(txtData);
        pDados.add(lblHoraInicio);     pDados.add(txtHoraInicio);
        pDados.add(lblHoraFim);        pDados.add(txtHoraFim);
        pDados.add(lblQtdPresente);    pDados.add(txtQtdPresente);


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
        setSize(325, 145);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
			int    faltando = 0;

            this.usrData 	   = txtData.getText();
			this.usrHoraInicio  = txtHoraInicio.getText();
			this.usrHoraFim	   = txtHoraFim.getText();
			this.usrQtdPresente = txtQtdPresente.getText();

			if (this.usrData.equals("") ) {

                faltam   += "Data";
                faltando += 1;
            }

            if (this.usrHoraInicio.equals("") ) {

                faltam   += "Hora de Início";
                faltando += 1;
            }

            if (this.usrHoraFim.equals("") ) {

                faltam   += "Hora Fim";
                faltando += 1;
            }

            if (this.usrQtdPresente.equals("") ) {

                faltam   += "Quantidade Presente";
                faltando += 1;
            }

            if (faltando > 0) {

                JOptionPane.showMessageDialog(null, faltam);
            }

            else {

                controllerCadastroFormacao.cadastrarFormacao(this.usrData, this.usrHoraInicio, this.usrHoraFim, Integer.valueOf(this.usrQtdPresente) );
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
            }
        }
    }
}
