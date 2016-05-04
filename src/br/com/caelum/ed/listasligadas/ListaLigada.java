package br.com.caelum.ed.listasligadas;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;

	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;

		if (this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}

		totalDeElementos++;
	}
	
	public void adiciona(Object elemento) {
		
		if (this.totalDeElementos == 0) {
		    this.adicionaNoComeco(elemento);
		}else{
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		
		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		}else if(posicao == this.totalDeElementos){
			this.adiciona(elemento);
		}else{
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(anterior.getProxima(), elemento);
			anterior.setProxima(nova);
			this.totalDeElementos++;
		}
		
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao){
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição não existe");
		}
		
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		
		return atual;
	}
	
	public Object pega(int posicao){
		return this.pegaCelula(posicao).getElemento();
	}
	
	public String toString(){
		
		if(this.totalDeElementos == 0){
			return"[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		for (int i = 0; i < totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}

}
