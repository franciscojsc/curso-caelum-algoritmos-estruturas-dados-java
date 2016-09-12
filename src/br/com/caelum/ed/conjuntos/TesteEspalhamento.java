package br.com.caelum.ed.conjuntos;

public class TesteEspalhamento {

	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		for (int i = 0; i < 100; i++) {
			conjunto.adiciona("" + i);
		}
		conjunto.imprimeTabela();
	}
}

