package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

public class FilaParametrizada <T>{

	private List<T> object = new LinkedList<>();

	public void insere(T t) {
		this.object.add(t);
	}

	public T remove() {
		return this.object.remove(0);
	}

	public boolean vazia() {
		return this.object.size() == 0;
	}
}
