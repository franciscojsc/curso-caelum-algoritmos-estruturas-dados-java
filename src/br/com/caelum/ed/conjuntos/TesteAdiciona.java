package br.com.caelum.ed.conjuntos;

import java.util.List;

public class TesteAdiciona {

	public static void main(String[] args) {

		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		List<String> palavras = conjunto.pegaTodas();
		
		System.out.println("Antes de remover");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		conjunto.remove("Rafael");
		
		palavras = conjunto.pegaTodas();
		
		System.out.println("\nDepois de remover");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}
