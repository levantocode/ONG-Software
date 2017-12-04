package controller;

import model.Debito;
import model.DadosModel;


public class ControllerCadastroDebito {

    private DadosModel dadosModel;

    public ControllerCadastroDebito(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarDebito(String d, String p, String s, double v) {

        dadosModel.adicionarDebito(new Debito(d, p, s, v) );
    }
}
