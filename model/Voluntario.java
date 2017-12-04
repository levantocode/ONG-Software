package model;

import java.util.Date;



public class Voluntario {

    private String nome;
    private String    whatsapp;
    private String    dtNasc;
    private String sexo;
    private String    rg;
    private String end;
    private String    telefone;
    private String probl;
    private String   dataInscricao;



    public Voluntario(String n, String w, String dn, String s, String r, String en, String t, String p, String di) {
        this.nome          = n;
        this.whatsapp      = w;
        this.dtNasc        = dn;
        this.sexo          = s;
        this.rg            = r;
        this.end           = en;
        this.telefone      = t;
        this.probl         = p;
        this.dataInscricao = di;
    }



    // Methods




    // Gets
    public String getWhatsapp() {
        return this.whatsapp;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDtNasc() {
        return this.dtNasc;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getRg() {
        return this.rg;
    }

    public String getEnd() {
        return this.end;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getProbl() {
        return this.probl;
    }

    public String getDataInscricao() {
        return this.dataInscricao;
    }



    // Sets
    public void setWhatsapp(String w) {
        this.whatsapp = w;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setDtData(String dn) {
        this.dtNasc = dn;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public void setRg(String r) {
        this.rg = r;
    }

    public void setEnd(String e) {
        this.end = e;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public void setProbl(String p) {
        this.probl = p;
    }

    public void setDataInscricao(String di) {
        this.dataInscricao = di;
    }
}
