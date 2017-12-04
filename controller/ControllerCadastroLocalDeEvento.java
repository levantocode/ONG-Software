package controller;

import model.LocalDeEvento;
import model.DadosModel;


public class ControllerCadastroLocalDeEvento {

    private DadosModel dadosModel;

    public ControllerCadastroLocalDeEvento(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarLocalDeEvento(String cidade, String bairro, String rua, String pontoEncontro) {

        dadosModel.adicionarLocalDeEvento(new LocalDeEvento(cidade, bairro, rua, pontoEncontro) );
    }
}
