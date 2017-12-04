package controller;

import model.Produto;
import model.DadosModel;


public class ControllerCadastroProduto {

    private DadosModel dadosModel;

    public ControllerCadastroProduto(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarProduto(String nome, String tipo, String descricao) {

        dadosModel.adicionarProduto(new Produto(nome, tipo, descricao) );
    }
}
