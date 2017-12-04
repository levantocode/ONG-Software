package model;

import java.util.List;



public class Economia {

	private Credito credito;
	private Debito  debito;

	private double valorNaConta;

	private double resultado1 = 0;
	private double resultado2 = 0;



	public Economia(Credito c, Debito d, double v) {
		this.credito 	  = c;
		this.debito  	  = d;
		this.valorNaConta = v;
	}



	// Gets
	public Credito getCredito() {
		return this.credito;
	}

	public Debito getDebito() {
		return this.debito;
	}

	public double getValorConta() {
		return this.valorNaConta;
	}



	// Sets

	public void setCredito(Credito c) {
		this.credito = c;
	}

	public void setDebito(Debito d) {
		this.debito = d;
	}

	public void setValorNaConta(double v) {
		this.valorNaConta = v;
	}






	// Methods
	public double calcularEconomia(List<Credito> listaCredito, List<Debito> listaDebito) {
		for(Credito credito: listaCredito) {
			this.resultado1 += credito.getValorCredito();
		}

		for(Debito debito: listaDebito ) {
			this.resultado2 = this.resultado1 - debito.getValorDebito();
		}

		return this.resultado2;
	}
}
