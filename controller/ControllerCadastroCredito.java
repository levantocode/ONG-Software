package controller;

import model.Credito;
import model.DadosModel;


public class ControllerCadastroCredito {

    private DadosModel dadosModel;

    public ControllerCadastroCredito(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarCredito(String d, String c, double v) {

        dadosModel.adicionarCredito(new Credito(d, c, v) );
    }
}
