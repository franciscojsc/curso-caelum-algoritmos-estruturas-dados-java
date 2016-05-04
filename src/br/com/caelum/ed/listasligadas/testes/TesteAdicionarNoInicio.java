package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.AlunoLista;
import br.com.caelum.ed.listasligadas.ListaLigada;

public class TesteAdicionarNoInicio {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();
		AlunoLista aluno = new AlunoLista();
		
		lista.adicionarNoComeco(aluno);
	}

}
