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
