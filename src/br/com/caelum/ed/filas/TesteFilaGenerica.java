package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TesteFilaGenerica {

	public static void main(String[] args) {

		FilaGenerica filaDeAlunos = new FilaGenerica();

		Aluno aluno = new Aluno();
		filaDeAlunos.insere(aluno);

		Object alunoRemovido = filaDeAlunos.remove();

		if (aluno != alunoRemovido) {
			System.out.println("Erro: o aluno removido n�o � " + " igual ao que foi inserido");
		}

		if (!filaDeAlunos.vazia()) {
			System.out.println("Erro: A fila n�o est� vazia");
		}
	}

}
