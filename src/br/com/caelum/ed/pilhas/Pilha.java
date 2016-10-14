package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;



public class Pilha {
	
	private List<Object> objetos = new LinkedList<>();
	
	public void insere(Object object){
		this.objetos.add(object);
	}
	
	public Object remove(){
		return this.objetos.remove(this.objetos.size()-1);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}

}
