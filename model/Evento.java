package model;

//import java.util.Date;



public class Evento {

	private String economia;

	private String data;

	private String horaInicio;
	private String horaFim;

	private String brincadeiras;
	private String localDeEvento;



	public Evento(String data, String horaInicio, String horaFim, String brincadeiras, String localDeEvento, String economia) {
		this.data 	  	   = data;
		this.horaInicio    = horaInicio;
		this.horaFim 	   = horaFim;
		this.brincadeiras  = brincadeiras;
		this.localDeEvento = localDeEvento;
		this.economia 	   = economia;
	}



	// Gets
	public String getData() {
		return this.data;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public String getHoraFim() {
		return this.horaFim;
	}

	public String getBrincadeiras() {
		return this.brincadeiras;
	}

	public String getLocalDeEvento() {
		return this.localDeEvento;
	}

	public String getEconomia() {
		return this.economia;
	}



	// Sets
	public void setData(String da) {
		this.data = da;
	}

	public void setHoraInicio(String hi) {
		this.horaInicio = hi;
	}

	public void setHoraFim(String hf) {
		this.horaFim = hf;
	}

	public void setBrincadeiras(String br) {
		this.brincadeiras = br;
	}

	public void setLocalEvento(String lde) {
		this.localDeEvento = lde;
	}

	public void setEconomia(String ec) {
		this.economia = ec;
	}
}
