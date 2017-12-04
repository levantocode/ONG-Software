package controller;

import model.Voluntario;
import model.DadosModel;


public class ControllerCadastroVoluntario {

    private DadosModel dadosModel;

    public ControllerCadastroVoluntario(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarVoluntario(String n, String w, String dn, String s, String r, String en, String t, String p, String di) {

        dadosModel.adicionarVoluntario(new Voluntario(n, w, dn, s, r, en, t, p, di) );
    }

}
