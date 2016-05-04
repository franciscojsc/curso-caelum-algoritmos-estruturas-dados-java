package br.com.caelum.ed.listasligadas;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;

	private int totalDeElementos;

	
	
	public String toString(){
		
		if(this.totalDeElementos == 0){
			return"[]";
		}
		
		StringBuilder builder = new StringBuilder();
		Celula atual = primeira;
		
		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}

}
