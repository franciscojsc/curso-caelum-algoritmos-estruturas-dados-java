package br.com.caelum.ed.listasligadas;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	
	private int totalDeElementos;
	
	public void adicionarNoComeco(Object elemento){
		Celula nova = new Celula(this.primeira,elemento);
		
		if(this.totalDeElementos == 0){
			this.ultima = this.primeira;
		}
		
		totalDeElementos++;
	}
	
}
