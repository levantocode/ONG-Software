package model;

//import java.util.Date;



public class Debito {

	private String dataDebito;

	private String produto;

	private String descDebito;

	private double valorDebito;



	public Debito(String d, String p, String s, double v) {
		this.dataDebito  = d;
		this.produto 	 = p;
		this.descDebito  = s;
		this.valorDebito = v;
	}



	// Gets
	public String getDataDebito() {
		return this.dataDebito;
	}

	public String getProduto() {
		return this.produto;
	}

	public String getDescDebito() {
		return this.descDebito;
	}

	public double getValorDebito() {
		return this.valorDebito;
	}



	// Sets

	public void setDataDebito(String d) {
		this.dataDebito = d;
	}

	public void setProduto(String p) {
		this.produto = p;
	}

	 public void setDescDebito(String s) {
		 this.descDebito = s;
	 }

	 public void setValorDebito(double v) {
		 this.valorDebito = v;
	 }
}
