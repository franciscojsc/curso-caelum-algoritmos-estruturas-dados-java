package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

public class PilhaParametrizada<T> {

private List<T> objetos = new LinkedList<>();
	
	public void insere(T t){
		this.objetos.add(t);
	}
	
	public T remove(){
		return this.objetos.remove(this.objetos.size()-1);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
