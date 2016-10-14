package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public class Teste {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		Peca peca = new Peca();
		pilha.insere(peca);
		
		Peca pecaRemovida = (Peca) pilha.remove();
		
		if(peca != pecaRemovida){
			System.out.println("Erro: a pe�a removida n�o � igual "+
		"a que foi inserida");
		}
		
		if(!pilha.vazia()){
			System.out.println("Erro: A pilha n�o est� vazia");
		}
	}

}
