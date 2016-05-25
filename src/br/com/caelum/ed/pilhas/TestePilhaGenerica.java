package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public class TestePilhaGenerica {

	public static void main(String[] args) {
	
		PilhaParametrizada<Peca> pilhaPecas = new PilhaParametrizada<>();
		Peca peca = new Peca();
		pilhaPecas.insere(peca);
		
		Peca pecaRemovida =pilhaPecas.remove();
		
		if(peca != pecaRemovida){
			System.out.println("Erro: a pe�a removida n�o � igual "+
		" a que foi inserida");
		}
		
		if(!pilhaPecas.vazia()){
			System.out.println("Erro: A pilha n�o est� vazia");
		}
		
		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<>();
		
		pilhaDeString.insere("Junio");
		pilhaDeString.insere("Nize");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());
	}

}
