package controller;

import model.Formacao;
import model.DadosModel;


public class ControllerCadastroFormacao {

    private DadosModel dadosModel;

    public ControllerCadastroFormacao(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarFormacao(String d, String i, String f, int q) {

        dadosModel.adicionarFormacao(new Formacao(d, i, f, q) );
    }
}
