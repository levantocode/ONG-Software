package model;



public class LocalDeEvento {

	private String cidade;
	private String bairro;
	private String rua;
	private String pontoEncontro;



	public LocalDeEvento(String cidade, String bairro, String rua, String pontoEncontro) {
		this.cidade 	   = cidade;
		this.bairro 	   = bairro;
		this.rua 		   = rua;
		this.pontoEncontro = pontoEncontro;
	}



	// Gets
	public String getCidade() {
		return this.cidade;
	}

	public String getBairro() {
		return this.bairro;
	}

	public String getRua() {
		return this.rua;
	}

	public String getPontoEncontro() {
		return this.pontoEncontro;
	}



	// Sets
	public void setCidade(String c) {
		this.cidade = c;
	}

	public void setBairro(String b) {
		this.bairro = b;
	}

	public void setRua(String r) {
		this.rua = r;
	}

	public void setPontoEncontro(String pe) {
		this.pontoEncontro = pe;
	}

}
