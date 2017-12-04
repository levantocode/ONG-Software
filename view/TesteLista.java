package view;


import model.Produto;

import java.util.LinkedList;



public class TesteLista {

	public static void main(String[] args) {

		LinkedList<Produto> listaProduto = new LinkedList<Produto>();

		Produto p1 = new Produto("Pao",       "Lanche",    "Pao de Sal");
		Produto p2 = new Produto("Biscoito",  "Lanche",    "Pacote");
		Produto p3 = new Produto("Chocolate", "Sobremesa", "400g");
		Produto p4 = new Produto("Sorvete",   "Sobremesa", "Pitanguinha");

		listaProduto.add(p1);
		listaProduto.add(p2);
		listaProduto.add(p3);
		listaProduto.add(p4);

		for (int i=0; i < listaProduto.size(); i++) {
			System.out.println(listaProduto.get(i).getNome() );
		}
	}
}
