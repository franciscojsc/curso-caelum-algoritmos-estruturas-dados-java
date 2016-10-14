package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TesteFilaParametrizada {

	public static void main(String[] args) {
		FilaParametrizada<Aluno> filaDeAlunos = new FilaParametrizada<Aluno>();

		Aluno aluno = new Aluno();

		filaDeAlunos.insere(aluno);

		Aluno alunoRemovido = filaDeAlunos.remove();

		if (aluno != alunoRemovido) {
			System.out.println("Erro: o aluno removido não é igual " + " ao que foi inserido");
		}

		if (!filaDeAlunos.vazia()) {
			System.out.println("Erro: A fila não está vazia");
		}

		FilaParametrizada<String> filaDeString = new FilaParametrizada<String>();

		filaDeString.insere("Diana");
		filaDeString.insere("Joaquim");

		System.out.println(filaDeString.remove());
		System.out.println(filaDeString.remove());

	}

}
