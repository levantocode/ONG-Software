package model;



public class Produto {

	private String nome;
	private String tipo;
	private String descricao;



	public Produto(String nome, String tipo, String descricao){

		this.nome 	   = nome;
		this.tipo 	   = tipo;
		this.descricao = descricao;
	}




	// Gets
	public String getNome() {
		return this.nome;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getDescricao() {
		return this.descricao;
	}





	// Sets
	public void setNome(String n) {
		this.nome = n;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public void setDescricao(String d) {
		this.descricao = d;
	}
}
