package model;



public class Brincadeira {

	private String nome, descricao;
	private int    qtdCriancas;



	public Brincadeira(String n, String d, int qc){

		this.nome 	     = n;
		this.descricao   = d;
		this.qtdCriancas = qc;
	}



	// Gets
	public String getNome(){
		return this.nome;
	}

	public String getDescricao(){
		return this.descricao;
	}

    public int getQtdCriancas(){
    	return this.qtdCriancas;
    }


    // Sets
    public void setNome(String n){
    	this.nome = n;
    }
    public void setQtdCriancas(int q){
    	this.qtdCriancas = q;
    }
    public void setDescricao(String d){
    	this.descricao = d;
    }
}
