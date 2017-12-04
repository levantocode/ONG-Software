package view;

import controller.ControllerCadastroEvento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroEvento extends JFrame implements ActionListener {

    ControllerCadastroEvento controllerCadastroEvento;

    // Elements
    JLabel     lblDataEvento, lblHoraInicioEvento, lblHoraFimEvento, lblBrincadeirasEvento, lblLocalDeEvento;
    JTextField txtDataEvento, txtHoraInicioEvento, txtHoraFimEvento, txtBrincadeirasEvento, txtLocalDeEvento;
    JButton    btnCadastrar;

    // User's Data
    String usrDataEvento, usrHoraInicioEvento, usrHoraFimEvento, usrBrincadeirasEvento, usrLocalDeEvento;



    public CadastroEvento(ControllerCadastroEvento cce) {

        super("Cadastrar Evento");
        this.controllerCadastroEvento = cce;

        // Instancing Elements
        lblDataEvento         = new JLabel("Data do Evento");
        lblHoraInicioEvento   = new JLabel("Hora de Início");
        lblHoraFimEvento      = new JLabel("Hora de Fim");
        lblBrincadeirasEvento = new JLabel("Brincadeiras do Evento");
        lblLocalDeEvento      = new JLabel("Local do Evento");


        txtDataEvento         = new JTextField();
        txtHoraInicioEvento   = new JTextField();
        txtHoraFimEvento      = new JTextField();
        txtBrincadeirasEvento = new JTextField();
        txtLocalDeEvento      = new JTextField();

        btnCadastrar          = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);




        // Panel Dados
        JPanel pDados = new JPanel();
        pDados.setLayout(new GridLayout(5, 2) );

        pDados.add(lblDataEvento);            pDados.add(txtDataEvento);
        pDados.add(lblHoraInicioEvento);      pDados.add(txtHoraInicioEvento);
        pDados.add(lblHoraFimEvento);         pDados.add(txtHoraFimEvento);
        pDados.add(lblBrincadeirasEvento);    pDados.add(txtBrincadeirasEvento);
        pDados.add(lblLocalDeEvento);         pDados.add(txtLocalDeEvento);



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
        setSize(350, 175);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCadastrar) {

            String faltam   = "Estão faltando:";
            int    faltando = 0;

            this.usrDataEvento         = txtDataEvento.getText();
            this.usrHoraInicioEvento   = txtHoraInicioEvento.getText();
            this.usrHoraFimEvento      = txtHoraFimEvento.getText();
            this.usrBrincadeirasEvento = txtBrincadeirasEvento.getText();
            this.usrLocalDeEvento      = txtLocalDeEvento.getText();



            if (this.usrDataEvento.equals("") ) {

				faltam += " Data do Evento";
				faltando += 1;
			}

			if (this.usrHoraInicioEvento.equals("") ) {

				faltam += " Hora de Inicio do Evento";
				faltando += 1;
			}

			if (this.usrHoraFimEvento.equals("") ) {

				faltam += " Hora do Fim do Evento";
				faltando += 1;
			}

            if (this.usrBrincadeirasEvento.equals("") ) {

                faltam += " Brincadeiras do Evento";
                faltando += 1;
            }

            if (this.usrLocalDeEvento.equals("") ) {

                faltam += " Local Do Evento";
                faltando += 1;
            }

            if (faltando > 0) {

				JOptionPane.showMessageDialog(null, faltam);
			}

			else {

				controllerCadastroEvento.cadastrarEvento(this.usrDataEvento, this.usrHoraInicioEvento, this.usrHoraFimEvento, this.usrBrincadeirasEvento, this.usrLocalDeEvento, "economia");
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
			}
		}
	}
}
