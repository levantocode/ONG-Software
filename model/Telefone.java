package model;



public class Telefone {

    private int telefonePai;
    private int telefoneMae;
    private int telefoneOutros;



    public Telefone(int p, int m, int o) {
        this.telefonePai    = p;
        this.telefoneMae    = m;
        this.telefoneOutros = o;
    }



    // Gets
    public int getTelefonPai() {
        return this.telefonePai;
    }

    public int getTelefoneMae() {
        return this.telefoneMae;
    }

    public int getTelefoneOutros() {
        return this.telefoneOutros;
    }



    // Sets
    public void setTelefonePai(int p) {
        this.telefonePai = p;
    }

    public void setTelefoneMae(int m) {
        this.telefoneMae = m;
    }

    public void setTelefoneOutros(int o) {
        this.telefoneOutros = o;
    }
}
