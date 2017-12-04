package model;

//import java.util.Date;



public class Formacao {

    private String data;

    private String horaInicio;
    private String horaFim;
    
    private int qtdPresente;



    public Formacao(String d, String i, String f, int q) {
        this.data        = d;
        this.horaInicio  = i;
        this.horaFim     = f;
        this.qtdPresente = q;
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

    public int getQtdPresente() {
        return this.qtdPresente;
    }



    // Sets
    public void setData(String d) {
        this.data = d;
    }

    public void setHoraInicio(String i) {
        this.horaInicio = i;
    }

    public void setHoraFim(String f) {
        this.horaFim = f;
    }

    public void setQtdPresente(int q) {
        this.qtdPresente = q;
    }
}
