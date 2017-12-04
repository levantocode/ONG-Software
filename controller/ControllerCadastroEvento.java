package controller;

import model.Evento;
import model.DadosModel;


public class ControllerCadastroEvento {

    private DadosModel dadosModel;

    public ControllerCadastroEvento(DadosModel dModel) {

        this.dadosModel = dModel;
    }

    public void cadastrarEvento(String data, String horaInicio, String horaFim, String brincadeiras, String localDeEvento, String economia) {

        dadosModel.adicionarEvento(new Evento(data, horaInicio, horaFim, brincadeiras, localDeEvento, economia) );
    }
}
