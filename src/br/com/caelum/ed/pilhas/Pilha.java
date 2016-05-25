package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.Peca;

public class Pilha {
	
	private List<Peca> pecas = new LinkedList<>();
	
	public void insere(Peca peca){
		this.pecas.add(peca);
	}
	
	

}
