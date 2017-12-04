package model;

import java.util.Date;



public class Treineiro extends Voluntario {

	private String dataInicTrein;

	private String username, password;



	public Treineiro(Voluntario v, String usrn, String passw, String dataInicTrein) {

		super(v.getWhatsapp(), v.getNome(), v.getDtNasc(), v.getSexo(), v.getRg(), v.getEnd(), v.getTelefone(), v.getProbl(), v.getDataInscricao() );

		this.username      = usrn;
		this.password      = passw;
		this.dataInicTrein = dataInicTrein;
	}



	// Gets
	public String getDataInicTrein() {
		return this.dataInicTrein;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}



	// Sets
	public void setDataInicTrein(String dit) {
		this.dataInicTrein = dit;
	}

	public void setUsername(String u) {
		this.username = u;
	}

	public void setPassword(String p) {
		this.password = p;
	}
}
