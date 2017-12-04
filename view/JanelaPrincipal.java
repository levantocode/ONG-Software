package view;


//import model.DadosModel;
import model.*;
import view.*;
import controller.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.LinkedList;



public class JanelaPrincipal extends JFrame implements ActionListener {

    DadosModel dadosModel;



    //Singleton
	private static JanelaPrincipal uniqueInstance;

	public static synchronized JanelaPrincipal getInstance(DadosModel dModel) {

		if (uniqueInstance == null) {
			uniqueInstance = new JanelaPrincipal(dModel);
		}

		return uniqueInstance;
	}
	//Singleton




    //private CadastroVoluntario uniqueInstance;
    private String cadastroVoluntarioOpen    = "No";
    private String cadastroFormacaoOpen      = "No";
    private String cadastroProdutoOpen       = "No";
    private String cadastroBrincadeiraOpen   = "No";
    private String cadastroLocalDeEventoOpen = "No";
    private String cadastroEventoOpen        = "No";
    private String cadastroCreditoOpen       = "No";
    private String cadastroDebitoOpen        = "No";
    //private String cadastroEconomiaOpen = "No";

    // Elements
    //// JLabels
    JLabel lblTabelaVoluntario;
    JLabel lblTabelaFormacao;
    JLabel lblTabelaProduto;
    JLabel lblTabelaBrincadeiras;
    JLabel lblTabelaLocalDeEvento;
    JLabel lblTabelaEvento;
    JLabel lblTabelaCredito;
    JLabel lblTabelaDebito;



    //// JButtons
    //////Cadastrar
    JButton btnCadastrarVoluntario;
    JButton btnCadastrarFormacao;
    JButton btnCadastrarProduto;
    JButton btnCadastrarBrincadeira;
    JButton btnCadastrarLocalDeEvento;
    JButton btnCadastrarEvento;
    JButton btnCadastrarCredito;
    JButton btnCadastrarDebito;




    //// Tables & ScrollPanes
    JTable jtbListaVoluntario;
    JTable jtbListaFormacao;
    JTable jtbListaProduto;
    JTable jtbListaBrincadeiras;
    JTable jtbListaLocalDeEvento;
    JTable jtbListaEvento;
    JTable jtbListaCredito;
    JTable jtbListaDebito;

    JScrollPane jspListaVoluntario;
    JScrollPane jspListaFormacao;
    JScrollPane jspListaProduto;
    JScrollPane jspListaBrincadeiras;
    JScrollPane jspListaLocalDeEvento;
    JScrollPane jspListaEvento;
    JScrollPane jspListaCredito;
    JScrollPane jspListaDebito;





    public JanelaPrincipal(DadosModel dModel) {

        super("Janela Principal");
        this.dadosModel = dModel;



        // Container
        Container con = getContentPane();
        con.setLayout(new BorderLayout() );





        // Instancing Buttons
        this.btnCadastrarVoluntario    = new JButton("Cadastrar Voluntário");
        this.btnCadastrarFormacao      = new JButton("Cadastrar Formação");
        this.btnCadastrarProduto       = new JButton("Cadastrar Produto");
        this.btnCadastrarBrincadeira   = new JButton("Cadastrar Brincadeira");
        this.btnCadastrarLocalDeEvento = new JButton("Cadastrar LocalDeEvento");
        this.btnCadastrarEvento        = new JButton("Cadastrar Evento");
        this.btnCadastrarCredito       = new JButton("Cadastrar Crédito");
        this.btnCadastrarDebito        = new JButton("Cadastrar Débito");

        // Add Action Listeners
        this.btnCadastrarVoluntario.addActionListener(this);
        this.btnCadastrarFormacao.addActionListener(this);
        this.btnCadastrarProduto.addActionListener(this);
        this.btnCadastrarBrincadeira.addActionListener(this);
        this.btnCadastrarLocalDeEvento.addActionListener(this);
        this.btnCadastrarEvento.addActionListener(this);
        this.btnCadastrarCredito.addActionListener(this);
        this.btnCadastrarDebito.addActionListener(this);








        //Abas

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();



        //// Creating Abas
        JPanel pVoluntario    = (JPanel) makePanelVoluntario();
        JPanel pFormacao      = (JPanel) makePanelFormacao();
        JPanel pProduto       = (JPanel) makePanelProduto();
        JPanel pBrincadeiras  = (JPanel) makePanelBrincadeiras();
        JPanel pLocalDeEvento = (JPanel) makePanelLocalDeEvento();
        JPanel pEvento        = (JPanel) makePanelEvento();
        JPanel pCredito       = (JPanel) makePanelCredito();
        JPanel pDebito        = (JPanel) makePanelDebito();
        //JPanel pEconomia      = (JPanel) makePanelVoluntario();




        pVoluntario.add(this.btnCadastrarVoluntario,       BorderLayout.PAGE_END);
        pFormacao.add(this.btnCadastrarFormacao,           BorderLayout.PAGE_END);
        pProduto.add(this.btnCadastrarProduto,             BorderLayout.PAGE_END);
        pBrincadeiras.add(this.btnCadastrarBrincadeira,    BorderLayout.PAGE_END);
        pLocalDeEvento.add(this.btnCadastrarLocalDeEvento, BorderLayout.PAGE_END);
        pEvento.add(this.btnCadastrarEvento,               BorderLayout.PAGE_END);
        pCredito.add(this.btnCadastrarCredito,             BorderLayout.PAGE_END);
        pDebito.add(this.btnCadastrarDebito,               BorderLayout.PAGE_END);




        ////Voluntario
        tabbedPane.addTab("Voluntário", null, pVoluntario);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);


        ////Formacao
        tabbedPane.addTab("Formação", null, pFormacao);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);


        ////Produto
        tabbedPane.addTab("Produto", null, pProduto);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);


        ////Brincadeiras
        tabbedPane.addTab("Brincadeiras", null, pBrincadeiras);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);


        ////LocalDeEvento
        tabbedPane.addTab("Local De Evento", null, pLocalDeEvento);
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);


        ////Evento
        tabbedPane.addTab("Evento", null, pEvento);
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_6);


        ////Credito
        tabbedPane.addTab("Credito", null, pCredito);
        tabbedPane.setMnemonicAt(6, KeyEvent.VK_7);


        ////Debito
        tabbedPane.addTab("Debito", null, pDebito);
        tabbedPane.setMnemonicAt(7, KeyEvent.VK_8);


        ////Economia
        //tabbedPane.addTab("Economia", null, pEconomia);
        //tabbedPane.setMnemonicAt(8, KeyEvent.VK_9);


        // Add Aba
        con.add(tabbedPane);










        // Frame Principal
        pack();
        setSize(1000, 500);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }










    protected JComponent makePanelVoluntario() {

        JPanel mpVoluntario = new JPanel(false);
        mpVoluntario.setLayout(new BorderLayout() );



        this.lblTabelaVoluntario = new JLabel("Tabela Voluntario", JLabel.CENTER);
        this.lblTabelaVoluntario.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableVoluntario();





        mpVoluntario.add(this.lblTabelaVoluntario, BorderLayout.PAGE_START);
        mpVoluntario.add(this.jspListaVoluntario,  BorderLayout.CENTER);



        return mpVoluntario;
    }



    protected JComponent makePanelFormacao() {

        JPanel mpFormacao = new JPanel(false);
        mpFormacao.setLayout(new BorderLayout() );



        this.lblTabelaFormacao = new JLabel("Tabela Formação", JLabel.CENTER);
        this.lblTabelaFormacao.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableFormacao();

        mpFormacao.add(this.lblTabelaFormacao, BorderLayout.PAGE_START);
        mpFormacao.add(this.jspListaFormacao);



        return mpFormacao;
    }



    protected JComponent makePanelProduto() {

        JPanel mpProduto = new JPanel(false);
        mpProduto.setLayout(new BorderLayout() );



        this.lblTabelaProduto = new JLabel("Tabela Produto", JLabel.CENTER);
        this.lblTabelaProduto.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableProduto();

        mpProduto.add(this.lblTabelaProduto, BorderLayout.PAGE_START);
        mpProduto.add(this.jspListaProduto);



        return mpProduto;
    }



    protected JComponent makePanelBrincadeiras() {

        JPanel mpBrincadeiras = new JPanel(false);
        mpBrincadeiras.setLayout(new BorderLayout() );



        this.lblTabelaBrincadeiras = new JLabel("Tabela Brincadeiras", JLabel.CENTER);
        this.lblTabelaBrincadeiras.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableBrincadeiras();

        mpBrincadeiras.add(this.lblTabelaBrincadeiras, BorderLayout.PAGE_START);
        mpBrincadeiras.add(this.jspListaBrincadeiras);



        return mpBrincadeiras;
    }



    protected JComponent makePanelLocalDeEvento() {

        JPanel    mpLocalDeEvento = new JPanel(false);
        mpLocalDeEvento.setLayout(new BorderLayout() );



        this.lblTabelaLocalDeEvento = new JLabel("Tabela Local De Evento", JLabel.CENTER);
        this.lblTabelaLocalDeEvento.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableLocalDeEvento();

        mpLocalDeEvento.add(this.lblTabelaLocalDeEvento, BorderLayout.PAGE_START);
        mpLocalDeEvento.add(this.jspListaLocalDeEvento);



        return mpLocalDeEvento;
    }



    protected JComponent makePanelEvento() {

        JPanel    mpEvento = new JPanel(false);
        mpEvento.setLayout(new BorderLayout() );



        this.lblTabelaEvento = new JLabel("Tabela Evento", JLabel.CENTER);
        this.lblTabelaEvento.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableEvento();

        mpEvento.add(this.lblTabelaEvento, BorderLayout.PAGE_START);
        mpEvento.add(this.jspListaEvento);



        return mpEvento;
    }



    protected JComponent makePanelCredito() {

        JPanel    mpCredito = new JPanel(false);
        mpCredito.setLayout(new BorderLayout() );



        this.lblTabelaCredito = new JLabel("Tabela Crédito", JLabel.CENTER);
        this.lblTabelaCredito.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableCredito();

        mpCredito.add(this.lblTabelaCredito, BorderLayout.PAGE_START);
        mpCredito.add(this.jspListaCredito);



        return mpCredito;
    }



    protected JComponent makePanelDebito() {

        JPanel    mpDebito = new JPanel(false);
        mpDebito.setLayout(new BorderLayout() );



        this.lblTabelaDebito = new JLabel("Tabela Débito", JLabel.CENTER);
        this.lblTabelaDebito.setFont(new Font("Sans-Serif", Font.BOLD, 25) );

        this.createTableDebito();

        mpDebito.add(this.lblTabelaDebito, BorderLayout.PAGE_START);
        mpDebito.add(this.jspListaDebito);



        return mpDebito;
    }



    protected JComponent makePanelEconomia() {

        JPanel mpEconomia = new JPanel(false);
        mpEconomia.setLayout(new GridLayout(1, 1));



        //this.lblTabelaEconomia = new JLabel("Tabela Economia");
        //mpEconomia.add(this.lblTabelaEconomia, BorderLayout.PAGE_START);

        this.createTableVoluntario();
        mpEconomia.add(this.jspListaVoluntario);



        return mpEconomia;
    }










    private void createTableVoluntario() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaVoluntario()][10];

        for (int i=0; i < dadosModel.getTamanhoListaVoluntario(); i++) {

            String ctWhatsapp      = dadosModel.getListaVoluntario().get(i).getWhatsapp();
            String ctNome          = dadosModel.getListaVoluntario().get(i).getNome();
            String ctDtNasc        = dadosModel.getListaVoluntario().get(i).getDtNasc();
            String ctSexo          = dadosModel.getListaVoluntario().get(i).getSexo();
            String ctRg            = dadosModel.getListaVoluntario().get(i).getRg();
            String ctEnd           = dadosModel.getListaVoluntario().get(i).getEnd();
            String ctTelefone      = dadosModel.getListaVoluntario().get(i).getTelefone();
            String ctProbl         = dadosModel.getListaVoluntario().get(i).getProbl();
            String ctDataInscricao = dadosModel.getListaVoluntario().get(i).getDataInscricao();

            String[] dadosVoluntario = { ctWhatsapp,
                                         ctNome,
                                         ctDtNasc,
                                         ctSexo,
                                         ctRg,
                                         ctEnd,
                                         ctTelefone,
                                         ctProbl,
                                         ctDataInscricao };

                tableDados[i] = dadosVoluntario;
            }



            String[] columnNames = { "Whatsapp",
                                     "Nome",
                                     "Data Nascimento",
                                     "Sexo",
                                     "RG",
                                     "Endereço",
                                     "Telefone",
                                     "Problema",
                                     "Data de Inscrição" };



        this.jtbListaVoluntario = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaVoluntario.setRowSelectionAllowed(false);
        //this.jtbListaVoluntario.setPreferredSize(new Dimension(350, 60) );
        //jtbListaFormacao.setPreferredScrollableViewportSize(new Dimension(1000, 100) );


        jspListaVoluntario = new JScrollPane(jtbListaVoluntario);
        //this.jspListaVoluntario.setPreferredSize(new Dimension(350, 190));
    }




    private void createTableFormacao() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaFormacao()][10];

        for (int i=0; i < dadosModel.getTamanhoListaFormacao(); i++) {

            String ctData        = dadosModel.getListaFormacao().get(i).getData();
            String ctHoraInicio  = dadosModel.getListaFormacao().get(i).getHoraInicio();
            String ctHoraFim     = dadosModel.getListaFormacao().get(i).getHoraFim();
            String ctQtdPresente = Integer.toString(dadosModel.getListaFormacao().get(i).getQtdPresente() );

            String[] dadosFormacao = { ctData,
                                       ctHoraInicio,
                                       ctHoraFim,
                                       ctQtdPresente };

                tableDados[i] = dadosFormacao;
            }



            String[] columnNames = { "Data",
                                     "Hora Início",
                                     "Hora Término",
                                     "Quantidade Presente" };



        this.jtbListaFormacao = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaFormacao.setRowSelectionAllowed(false);

        jspListaFormacao = new JScrollPane(jtbListaFormacao);

    }



    private void createTableProduto() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaProduto()][10];

        for (int i=0; i < dadosModel.getTamanhoListaProduto(); i++) {

            String ctNome      = dadosModel.getListaProduto().get(i).getNome();
            String ctTipo      = dadosModel.getListaProduto().get(i).getTipo();
            String ctDescricao = dadosModel.getListaProduto().get(i).getDescricao();


            String[] dadosProduto = { ctNome,
                                      ctTipo,
                                      ctDescricao };

                tableDados[i] = dadosProduto;
            }



            String[] columnNames = { "Nome",
                                     "Tipo",
                                     "Descricao" };



        this.jtbListaProduto = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaProduto.setRowSelectionAllowed(false);

        jspListaProduto = new JScrollPane(jtbListaProduto);
    }



    private void createTableBrincadeiras() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaBrincadeira()][10];

        for (int i=0; i < dadosModel.getTamanhoListaBrincadeira(); i++) {

            String ctNome        = dadosModel.getListaBrincadeira().get(i).getNome();
            String ctDescricao   = dadosModel.getListaBrincadeira().get(i).getDescricao();
            String ctQtdCriancas = Integer.toString(dadosModel.getListaBrincadeira().get(i).getQtdCriancas() );



            String[] dadosBrincadeira = { ctNome,
                                          ctDescricao,
                                          ctQtdCriancas };


                tableDados[i] = dadosBrincadeira;
            }



            String[] columnNames = { "Nome",
                                     "Descrição",
                                     "Quantidade de Crianças" };



        this.jtbListaBrincadeiras = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaBrincadeiras.setRowSelectionAllowed(false);

        jspListaBrincadeiras = new JScrollPane(jtbListaBrincadeiras);
    }



    private void createTableLocalDeEvento() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaLocalDeEvento()][10];

        for (int i=0; i < dadosModel.getTamanhoListaLocalDeEvento(); i++) {

            String ctCidade        = dadosModel.getListaLocalDeEvento().get(i).getCidade();
            String ctBairro        = dadosModel.getListaLocalDeEvento().get(i).getBairro();
            String ctRua           = dadosModel.getListaLocalDeEvento().get(i).getRua();
            String ctPontoEncontro = dadosModel.getListaLocalDeEvento().get(i).getPontoEncontro();

            String[] dadosLocalDeEvento = { ctCidade,
                                            ctBairro,
                                            ctRua,
                                            ctPontoEncontro };

                tableDados[i] = dadosLocalDeEvento;
            }



            String[] columnNames = { "Cidade",
                                     "Bairro",
                                     "Rua",
                                     "Ponto de Encontro" };



        this.jtbListaLocalDeEvento = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaLocalDeEvento.setRowSelectionAllowed(false);

        jspListaLocalDeEvento = new JScrollPane(jtbListaLocalDeEvento);
    }



    private void createTableEvento() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaEvento()][10];

        for (int i=0; i < dadosModel.getTamanhoListaEvento(); i++) {

            String ctData          = dadosModel.getListaEvento().get(i).getData();
            String ctHoraInicio    = dadosModel.getListaEvento().get(i).getHoraInicio();
            String ctHoraFim       = dadosModel.getListaEvento().get(i).getHoraFim();
            String ctBrincadeiras  = dadosModel.getListaEvento().get(i).getBrincadeiras();
            String ctLocalDeEvento = dadosModel.getListaEvento().get(i).getLocalDeEvento();
            String ctEconomia      = dadosModel.getListaEvento().get(i).getEconomia();

            String[] dadosEvento = { ctData,
                                     ctHoraInicio,
                                     ctHoraFim,
                                     ctBrincadeiras,
                                     ctLocalDeEvento,
                                     ctEconomia };

                tableDados[i] = dadosEvento;
            }

            String[] columnNames = { "Data",
                                     "Hora Início",
                                     "Hora Termino",
                                     "Brincadeiras",
                                     "Local de Evento",
                                     "Economia" };



        this.jtbListaEvento = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaEvento.setRowSelectionAllowed(false);

        jspListaEvento = new JScrollPane(jtbListaEvento);
    }



    private void createTableCredito() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaCredito()][10];

        for (int i=0; i < dadosModel.getTamanhoListaCredito(); i++) {

            String ctData  = dadosModel.getListaCredito().get(i).getDataCredito();
            String ctDesc  = dadosModel.getListaCredito().get(i).getDescCredito();
            String ctValor = "R$ " + Double.toString(dadosModel.getListaCredito().get(i).getValorCredito() );

            String[] dadosCredito = { ctData,
                                      ctDesc,
                                      ctValor };

                tableDados[i] = dadosCredito;
            }



            String[] columnNames = { "Data",
                                     "Descricao",
                                     "Valor" };



        this.jtbListaCredito = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaCredito.setRowSelectionAllowed(false);

        jspListaCredito = new JScrollPane(jtbListaCredito);
    }



    private void createTableDebito() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaDebito()][10];

        for (int i=0; i < dadosModel.getTamanhoListaDebito(); i++) {

            String ctData      = dadosModel.getListaDebito().get(i).getDataDebito();
            String ctProduto   = dadosModel.getListaDebito().get(i).getProduto();
            String ctDescricao = dadosModel.getListaDebito().get(i).getDescDebito();
            String ctValor     = "R$ " + Double.toString(dadosModel.getListaDebito().get(i).getValorDebito() );

            String[] dadosDebito = { ctData,
                                     ctProduto,
                                     ctDescricao,
                                     ctValor };

                tableDados[i] = dadosDebito;
            }



            String[] columnNames = { "Data",
                                     "Produto",
                                     "Descricao",
                                     "Valor" };



        this.jtbListaDebito = new JTable(tableDados, columnNames) {
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
        jtbListaDebito.setRowSelectionAllowed(false);

        jspListaDebito = new JScrollPane(jtbListaDebito);
    }



    /*private void createTableEconomia() {

        // JTable
        String[][] tableDados = new String[dadosModel.getTamanhoListaEconomia()][10];

        for (int i=0; i < dadosModel.getTamanhoListaEconomia(); i++) {

            String[] dadosEconomia = { dadosModel.getListaEconomia().get(i).get/**///(),
                                       /*dadosModel.getListaEconomia().get(i).get/**///(),
                                       /*dadosModel.getListaEconomia().get(i).get/**///(),
                                       /*dadosModel.getListaEconomia().get(i).get/**///() };

                /*tableDados[i] = dadosEconomia;
            }



            String[] columnNames = { "Whatsapp",
                                     "Nome",
                                     "Data Nascimento",
                                     "Sexo" };



        this.jtbListaEconomia = new JTable(tableDados, columnNames);
        jspListaEconomia      = new JScrollPane(jtbListaEconomia);
    }*/










    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.btnCadastrarVoluntario) {
            /* SINGLETON
            ControllerCadastroVoluntario ccv = new ControllerCadastroVoluntario();
            CadastroVoluntario.getInstance(ccv);
            */ //SINGLETON

            if (this.cadastroVoluntarioOpen.equals("No") ) {

                ControllerCadastroVoluntario ccv = new ControllerCadastroVoluntario(dadosModel);
                CadastroVoluntario jcv = new CadastroVoluntario(ccv);
                this.cadastroVoluntarioOpen = "Yes";

                jcv.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroVoluntarioOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro já está aberta :)");
            }

            //this.uniqueInstance = new CadastroVoluntario(ccv);
        }





        if (e.getSource() == this.btnCadastrarFormacao) {

            if (this.cadastroFormacaoOpen.equals("No") ) {

                ControllerCadastroFormacao ccf = new ControllerCadastroFormacao(dadosModel);
                CadastroFormacao jcf = new CadastroFormacao(ccf);
                this.cadastroFormacaoOpen = "Yes";

                jcf.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroFormacaoOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Formação já está aberta :)");
            }
        }





        if (e.getSource() == this.btnCadastrarProduto) {

            if (this.cadastroProdutoOpen.equals("No") ) {

                ControllerCadastroProduto ccp = new ControllerCadastroProduto(dadosModel);
                CadastroProduto jcp = new CadastroProduto(ccp);
                this.cadastroProdutoOpen = "Yes";

                jcp.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroProdutoOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Produto já está aberta :)");
            }
        }





        if (e.getSource() == this.btnCadastrarBrincadeira) {

            if (this.cadastroBrincadeiraOpen.equals("No") ) {

                ControllerCadastroBrincadeira ccb = new ControllerCadastroBrincadeira(dadosModel);
                CadastroBrincadeira jcb = new CadastroBrincadeira(ccb);
                this.cadastroBrincadeiraOpen = "Yes";

                jcb.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroBrincadeiraOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Brincadeira já está aberta :)");
            }
        }





        if (e.getSource() == this.btnCadastrarLocalDeEvento) {

            if (this.cadastroLocalDeEventoOpen.equals("No") ) {

                ControllerCadastroLocalDeEvento cclde = new ControllerCadastroLocalDeEvento(dadosModel);
                CadastroLocalDeEvento jclde = new CadastroLocalDeEvento(cclde);
                this.cadastroLocalDeEventoOpen = "Yes";

                jclde.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroLocalDeEventoOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Local De Evento já está aberta :)");
            }
        }





        if (e.getSource() == this.btnCadastrarEvento) {

            if (this.cadastroEventoOpen.equals("No") ) {

                ControllerCadastroEvento cce = new ControllerCadastroEvento(dadosModel);
                CadastroEvento jce = new CadastroEvento(cce);
                this.cadastroEventoOpen = "Yes";

                jce.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroEventoOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Evento já está aberta :)");
            }
        }





        if (e.getSource() == this.btnCadastrarCredito ) {

            if (this.cadastroCreditoOpen.equals("No") ) {

                ControllerCadastroCredito ccc = new ControllerCadastroCredito(dadosModel);
                CadastroCredito jcc = new CadastroCredito(ccc);
                this.cadastroCreditoOpen = "Yes";

                jcc.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroCreditoOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Credito já está aberta :)");
            }
        }





        if (e.getSource() == this.btnCadastrarDebito) {

            if (this.cadastroDebitoOpen.equals("No") ) {

                ControllerCadastroDebito ccd = new ControllerCadastroDebito(dadosModel);
                CadastroDebito jcd = new CadastroDebito(ccd);
                this.cadastroDebitoOpen = "Yes";

                jcd.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        cadastroDebitoOpen = "No";
                    }
                } );
            }

            else {

                JOptionPane.showMessageDialog(null, "Janela Cadastro Debito já está aberta :)");
            }
        }
    }
}
