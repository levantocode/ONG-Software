package controller;

import model.Brincadeira;
import model.DadosModel;


public class ControllerCadastroBrincadeira {

    private DadosModel dadosModel;

    public ControllerCadastroBrincadeira(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarBrincadeira(String n, String d, int qc) {

        dadosModel.adicionarBrincadeira(new Brincadeira(n, d, qc) );
    }
}
