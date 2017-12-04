package model;

//import java.util.Date;



public class Credito {

	private String dataCredito;

	private String descCredito;
	private double valorCredito;



	public Credito(String d, String c, double v) {
		this.dataCredito  = d;
		this.descCredito  = c;
		this.valorCredito = v;
	}



	// Gets
	public String getDataCredito() {
		return this.dataCredito;
	}

	public String getDescCredito() {
		return this.descCredito;
	}

	public double getValorCredito() {
		return this.valorCredito;
	}



	// Sets
	public void setDataCredito(String d) {
		this.dataCredito = d;
	}

	public void setDescCredito(String c) {
		this.descCredito = c;
	}

	public void setValorCredito(double v) {
		this.valorCredito = v;
	}
}
