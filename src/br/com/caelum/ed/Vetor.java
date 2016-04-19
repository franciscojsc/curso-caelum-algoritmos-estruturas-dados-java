package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		if (posicao <= alunos.length && posicao >= 0) {
			alunos[posicao] = aluno;
		}
	}

	public Aluno pega(int posicao) {
		return alunos[posicao];
	}

	public void remove(int posicao) {
		alunos[posicao] = null;
	}

	public boolean contem(Aluno aluno) {
		boolean verifica = false;

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].equals(aluno)) {
				verifica = true;
				break;
			} else {
				verifica = false;
			}
		}
		return verifica;
	}

	public int tamanho() {
		int tam = 0;

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				tam++;
			}
		}
		return tam;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}
}
