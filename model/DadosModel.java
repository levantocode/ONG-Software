package model;


import model.Voluntario;
import model.Treineiro;
import model.Produto;
import model.Credito;
import model.Debito;
import model.LocalDeEvento;
import model.Brincadeira;
import model.Formacao;
import model.Evento;

import java.util.LinkedList;



public class DadosModel {

    // Lists
    private LinkedList<Voluntario>    listaVoluntario 	 = new LinkedList<Voluntario>();
    private LinkedList<Treineiro>     listaTreineiro 	 = new LinkedList<Treineiro>();

    private LinkedList<Produto> 	  listaProduto 	     = new LinkedList<Produto>();
    private LinkedList<Credito> 	  listaCredito 		 = new LinkedList<Credito>();
    private LinkedList<Debito> 		  listaDebito 		 = new LinkedList<Debito>();

    private	LinkedList<LocalDeEvento> listaLocalDeEvento = new LinkedList<LocalDeEvento>();
    private	LinkedList<Brincadeira>   listaBrincadeira   = new LinkedList<Brincadeira>();
    private	LinkedList<Formacao> 	  listaFormacao 	 = new LinkedList<Formacao>();
    private LinkedList<Evento> 	 	  listaEvento 		 = new LinkedList<Evento>();




    public DadosModel() {

        this.gerarDados();
    }


    // Methods ( Adicionar, Logar, Excluir, Gerdar Dados, Gets, GetTamanhoDaLista, Sets)

    ////Adicionar
    public void adicionarVoluntario(Voluntario v) {
        this.listaVoluntario.add(v);
    }

    public void adicionarTreineiro(Treineiro t) {
        this.listaTreineiro.add(t);
    }

    public void adicionarProduto(Produto p) {
        this.listaProduto.add(p);
    }

    public void adicionarCredito(Credito c) {
        this.listaCredito.add(c);
    }

    public void adicionarDebito(Debito d) {
        this.listaDebito.add(d);
    }

    public void adicionarLocalDeEvento(LocalDeEvento lde) {
        this.listaLocalDeEvento.add(lde);
    }

    public void adicionarBrincadeira(Brincadeira b) {
        this.listaBrincadeira.add(b);
    }

    public void adicionarFormacao(Formacao f) {
        this.listaFormacao.add(f);
    }

    public void adicionarEvento(Evento ev) {
        this.listaEvento.add(ev);
    }










    ////Logar
    /*public boolean logarTry(String usernameTry, String passwordTry) {

        for (int i=0; i < this.listaVoluntario.length(); i++) {

            if (this.listaVoluntario.get(i).getUsername().equals(usernameTry) ) {

                if (this.listaVoluntario.get(i).getPassword().equals(passwordTry) ) {

                    retrun true;
                }

                else {

                    return false;
                }
            }

            else {

                return false;
            }
        }
    }*/










    ////Remover
    public void removerVoluntario(Voluntario vo) {
        this.listaVoluntario.remove(vo);
    }

    public void removerProduto(Produto pr) {
        this.listaProduto.remove(pr);
    }

    public void removerCredito(Credito cr) {
        this.listaCredito.remove(cr);
    }

    public void removerDebito(Debito de) {
        this.listaDebito.remove(de);
    }

    public void removerLocalDeEvento(LocalDeEvento lodeev) {
        this.listaLocalDeEvento.remove(lodeev);
    }

    public void removerBrincadeira(Brincadeira br) {
        this.listaBrincadeira.remove(br);
    }

    public void removerFormacao(Formacao fo) {
        this.listaFormacao.remove(fo);
    }

    public void removerEvento(Evento eve) {
        this.listaEvento.remove(eve);
    }









    // Gerar Dados
    public void gerarDados() {

        // int w, String n, Date dn, String s, int r, String en, int t, String p, String u, String sn, Date di
        Voluntario voluntario1 = new Voluntario("91111-1111", "Mario", "15/07/1992", "Masculino", "11.111.111-1", "Rua 1", "Telefone1", "Problema1", "15/05/2017");
        Voluntario voluntario2 = new Voluntario("92222-2222", "Jonas", "03/11/1984", "Masculino", "22.222.222-2", "Rua 2", "Telefone2", "Problema2", "22/06/2017");
        Voluntario voluntario3 = new Voluntario("93333-3333", "Luiz", "24/01/1995", "Masculino", "33.333.333-3", "Rua 3", "Telefone3", "Problema3", "26/06/2017");
        Voluntario voluntario4 = new Voluntario("94444-4444", "Julia", "10/04/1993", "Feminino", "44.444.444-4", "Rua 4", "Telefone4", "Problema4", "03/09/2017");
        Voluntario voluntario5 = new Voluntario("95555-5555", "Rafaela", "16/09/1987", "Feminino", "55.555.555-5", "Rua 5", "Telefone5", "Problema5", "01/11/2017");

        this.adicionarVoluntario(voluntario1);
        this.adicionarVoluntario(voluntario2);
        this.adicionarVoluntario(voluntario3);
        this.adicionarVoluntario(voluntario4);
        this.adicionarVoluntario(voluntario5);










        Treineiro treineiro1 = new Treineiro(voluntario1, "contaTreineiro1", "senha1", "06/10/2017");
        Treineiro treineiro2 = new Treineiro(voluntario2, "contaTreineiro2", "senha2", "27/10/2017");
        Treineiro treineiro3 = new Treineiro(voluntario3, "contaTreineiro3", "senha3", "27/10/2017");

        this.adicionarTreineiro(treineiro1);
        this.adicionarTreineiro(treineiro2);
        this.adicionarTreineiro(treineiro3);










        Formacao formacao1 = new Formacao("18/02/2017", "19:00", "20:30", 32);
        Formacao formacao2 = new Formacao("11/03/2017", "18:00", "19:30", 40);
        Formacao formacao3 = new Formacao("08/04/2017", "18:30", "20:00", 35);
        Formacao formacao4 = new Formacao("13/05/2017", "19:30", "21:00", 62);
        Formacao formacao5 = new Formacao("10/06/2017", "19:30", "21:00", 27);
        Formacao formacao6 = new Formacao("08/07/2017", "18:00", "19:30", 56);

        this.adicionarFormacao(formacao1);
        this.adicionarFormacao(formacao2);
        this.adicionarFormacao(formacao3);
        this.adicionarFormacao(formacao4);
        this.adicionarFormacao(formacao5);
        this.adicionarFormacao(formacao6);










        Produto produto1 = new Produto("Cachorro-Quente", "Lanche", "Pão de Sal com Salcicha e Molho");
        Produto produto2 = new Produto("Bola de Futebol", "Brinquedo", "Bola de Futebol");
        Produto produto3 = new Produto("Capa Vermelha", "Fantasia", "Roupa para Teatro");
        Produto produto4 = new Produto("Sonho de Valse", "Doce", "Bom-bom de lembrancinha");
        Produto produto5 = new Produto("Lápis de Colorir", "Brinquedo", "Caixa com 20 Lápis de Colorir");

        this.adicionarProduto(produto1);
        this.adicionarProduto(produto2);
        this.adicionarProduto(produto3);
        this.adicionarProduto(produto4);
        this.adicionarProduto(produto5);










        Brincadeira brincadeira1 = new Brincadeira("Pular Corda", "Brincadeira de pular corda", 3);
        Brincadeira brincadeira2 = new Brincadeira("Boliche Pet", "Boliche com bola de tênis e garrafas pet", 6);
        Brincadeira brincadeira3 = new Brincadeira("Cavalinho", "Criança sobe nas costas do voluntário", 1);
        Brincadeira brincadeira4 = new Brincadeira("Dominó", "Jogo clássico de dominó", 2);

        this.adicionarBrincadeira(brincadeira1);
        this.adicionarBrincadeira(brincadeira2);
        this.adicionarBrincadeira(brincadeira3);
        this.adicionarBrincadeira(brincadeira4);










        LocalDeEvento localdeevento1 = new LocalDeEvento("São José dos Campos", "Centro", "Rua Um", "Em frente a loja tal");
        LocalDeEvento localdeevento2 = new LocalDeEvento("Mogi das Cruzes", "Bairro Dois", "Rua Dois", "Do lado do Posto Tal");

        this.adicionarLocalDeEvento(localdeevento1);
        this.adicionarLocalDeEvento(localdeevento2);










        Evento evento1 = new Evento("15/03/2017", "13:00", "17:00", "Cavalinho, Boliche", "localdeevento1", "economia");
        Evento evento2 = new Evento("27/04/2017", "14:00", "17:30", "Pular Corda, Cavalinho", "localdeevento2", "economiaa");
        Evento evento3 = new Evento("19/05/2017", "13:30", "17:30", "Desenho, Boliche", "localdeevento1", "economiaaa");

        this.adicionarEvento(evento1);
        this.adicionarEvento(evento2);
        this.adicionarEvento(evento3);










        Credito credito1 = new Credito("20/02/2016", "Doação da Vó de um Voluntário", 200);
        Credito credito2 = new Credito("27/05/2016", "Arrecadação no Semáforo", 1653);
        Credito credito3 = new Credito("02/02/2017", "Churrasco Beneficiente", 792);
        Credito credito4 = new Credito("14/03/2017", "Doação de uma Voluntária", 10);

        this.adicionarCredito(credito1);
        this.adicionarCredito(credito2);
        this.adicionarCredito(credito3);
        this.adicionarCredito(credito4);










        Debito debito1 = new Debito("20/02/2016", "produto", "Para a Formação dia Tal", 150);
        Debito debito2 = new Debito("27/05/2016", "produtoo", "Para o Evento dia Tal", 438);
        Debito debito3 = new Debito("02/02/2017", "produtooo", "Para Brincadeira Tal", 350);
        Debito debito4 = new Debito("14/03/2017", "produtoooo", "Figurino de Teatro", 90);

        this.adicionarDebito(debito1);
        this.adicionarDebito(debito2);
        this.adicionarDebito(debito3);
        this.adicionarDebito(debito4);
    }



















    // Gets
    public LinkedList<Voluntario> getListaVoluntario() {
        return this.listaVoluntario;
    }

    public LinkedList<Treineiro> getListaTreineiro() {
        return this.listaTreineiro;
    }

    public LinkedList<Produto> getListaProduto() {
        return this.listaProduto;
    }

    public LinkedList<Credito> getListaCredito() {
        return this.listaCredito;
    }

    public LinkedList<Debito> getListaDebito() {
        return this.listaDebito;
    }

    public LinkedList<LocalDeEvento> getListaLocalDeEvento() {
        return this.listaLocalDeEvento;
    }

    public LinkedList<Brincadeira> getListaBrincadeira() {
        return this.listaBrincadeira;
    }

    public LinkedList<Formacao> getListaFormacao() {
        return this.listaFormacao;
    }

    public LinkedList<Evento> getListaEvento() {
        return this.listaEvento;
    }




    //Get Tamanho Da Lista
    public int getTamanhoListaVoluntario() {
        return this.listaVoluntario.size();
    }

    public int getTamanhoListaTreineiro() {
        return this.listaTreineiro.size();
    }

    public int getTamanhoListaProduto() {
        return this.listaProduto.size();
    }

    public int getTamanhoListaCredito() {
        return this.listaCredito.size();
    }

    public int getTamanhoListaDebito() {
        return this.listaDebito.size();
    }

    public int getTamanhoListaLocalDeEvento() {
        return this.listaLocalDeEvento.size();
    }

    public int getTamanhoListaBrincadeira() {
        return this.listaBrincadeira.size();
    }

    public int getTamanhoListaFormacao() {
        return this.listaFormacao.size();
    }

    public int getTamanhoListaEvento() {
        return this.listaEvento.size();
    }











    // Sets

}
