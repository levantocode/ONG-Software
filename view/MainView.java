package view;

import controller.*;

import model.DadosModel;

public class MainView {

	public static void main(String[] args) {

		DadosModel dadosModel = new DadosModel();

		ControllerLogin controllerLogin = new ControllerLogin(dadosModel);

		Login janelaLogin = new Login(controllerLogin);

		// CadastroVoluntario    janelaCadastroVoluntario    = new CadastroVoluntario();
		// CadastroFormacao      janelaCadastroFormacao      = new CadastroFormacao();
		// CadastroBrincadeira   janelaCadastroBrincadeira   = new CadastroBrincadeira();
	 	// CadastroDebito        janelaCadastroDebito        = new CadastroDebito();
	    // CadastroCredito       janelaCadastroCredito       = new CadastroCredito();
		// CadastroProduto       janelaCadastroProduto       = new CadastroProduto();
		// CadastroLocalDeEvento janelaCadastroLocalDeEvento = new CadastroLocalDeEvento();
		// CadastroEvento        janelaCadastroEvento        = new CadastroEvento();
	}
}
