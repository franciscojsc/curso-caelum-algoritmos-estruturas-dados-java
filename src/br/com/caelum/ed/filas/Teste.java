package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class Teste {

	public static void main(String[] args) {

		Fila fila = new Fila();
		
		Aluno aluno = new Aluno();
		fila.insere(aluno);
		
		Aluno alunoRemovido = fila.remove();
		
		if(aluno != alunoRemovido){
			System.out.println("Erro: o aluno removido n�o � "+
		" igual ao que foi inserido");
		}
		
		if(!fila.vazia()){
			System.out.println("Erro: A fila n�o est� vazia");
		}
	}

}
