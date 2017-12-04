package controller;


import view.Login;
import view.CadastroVoluntario;

import model.DadosModel;
// import model.Voluntario;

import java.util.LinkedList;



public class ControllerLogin {

    private DadosModel dadosModel;



    public ControllerLogin(DadosModel dm) {
        this.dadosModel = dm;
    }

    //Methods ( checkLogin )

    ////checkLogin
    public int checkLogin(String uName, String uPassword) {

        for (int i=0; i < dadosModel.getTamanhoListaTreineiro(); i++) {

            if (dadosModel.getListaTreineiro().get(i).getUsername().equals(uName) ) {

                if (dadosModel.getListaTreineiro().get(i).getPassword().equals(uPassword) ) {

                    return 1;
                }

                return 2;
            }
        }

        return 3;
    }
}
