package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona(0,"Paulo");
		lista.adiciona(0,"Camila");
		
		System.out.println(lista);
	}

}
