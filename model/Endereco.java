package model;



public class Endereco {

    private String bairro;
    private String rua;

    private int numRes;
    private int telefone;



    public Endereco(String b, String r, int n, int t) {
        this.bairro   = b;
        this.rua      = r;
	    this.numRes   = n;
        this.telefone = t;
    }



    // Gets
    public String getBairro() {
        return this.bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumRes() {
        return this.numRes;
    }

    public int getTelefone() {
        return this.telefone;
    }



    // Sets
    public void setBairro(String b) {
        this.bairro = b;
    }

    public void setRua(String r) {
        this.rua = r;
    }

    public void setNumRes(int n) {
        this.numRes = n;
    }

    public void setTelefone(int t) {
        this.telefone = t;
    }
}
