package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class TesteLinearVSConstante {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		long inicio =System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo em segundos = "+ tempo);

	}

}
