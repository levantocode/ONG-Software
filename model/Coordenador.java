package model;

import model.DadosModel;

import java.util.Date;



public class Coordenador extends Treineiro {

	private DadosModel dadosModel;

	private String dataInicCord;



	public Coordenador(DadosModel dm, String w, String n, String dn, String s, String r, String en, String t, String p, String u, String sn, String di, String dataInicTrein, Voluntario voluntario, String dataInicCord) {
		super(w, n, dn, s, r, en, t, p, u, sn, di, dataInicTrein, voluntario);

		this.dadosModel   = dm;

		this.dataInicCord = dataInicCord;
	}





	// Gets
	public String getDataInicCord() {
		return this.dataInicCord;
	}



	// Sets
	public void setDataInicCord(String dataInicCord) {
		this.dataInicCord = dataInicCord;
	}









	// Methods ( Cadastrar & Excluir )

	//// Cadastrar
	public void cadastrarVoluntario(Voluntario v) {
		dadosModel.adicionarVoluntario(v);
	}

	public void cadastrarTreineiro(Treineiro t) {
		dadosModel.adicionarTreineiro(t);
	}

	public void cadastrarProduto(Produto p) {
		dadosModel.adicionarProduto(p);
	}

	public void cadastrarCredito(Credito c) {
		dadosModel.adicionarCredito(c);
	}

	public void cadastrarDebito(Debito d) {
		dadosModel.adicionarDebito(d);
	}

	public void cadastrarLocalDeEvento(LocalDeEvento lde) {
		dadosModel.adicionarLocalDeEvento(lde);
	}

	public void cadastrarBrincadeira(Brincadeira b) {
		dadosModel.adicionarBrincadeira(b);
	}

	public void cadastrarFormacao(Formacao f) {
		dadosModel.adicionarFormacao(f);
	}

	public void cadastrarEvento(Evento ev) {
		dadosModel.adicionarEvento(ev);
	}





	//// Excluir
	public void excluirVoluntario(Voluntario vo) {
		dadosModel.removerVoluntario(vo);
	}

	public void excluirProduto(Produto pr) {
		dadosModel.removerProduto(pr);
	}

	public void excluirCredito(Credito cr) {
		dadosModel.removerCredito(cr);
	}

	public void excluirDebito(Debito de) {
		dadosModel.removerDebito(de);
	}

	public void excluirLocalDeEvento(LocalDeEvento lodeev) {
		dadosModel.removerLocalDeEvento(lodeev);
	}

	public void excluirBrincadeira(Brincadeira br) {
		dadosModel.removerBrincadeira(br);
	}

	public void excluirFormacao(Formacao fo) {
		dadosModel.removerFormacao(fo);
	}

	public void excluirEvento(Evento eve) {
		dadosModel.removerEvento(eve);
	}
}
