package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

public class FilaGenerica {

	private List<Object> object = new LinkedList<>();

	public void insere(Object object) {
		this.object.add(object);
	}

	public Object remove() {
		return this.object.remove(0);
	}

	public boolean vazia() {
		return this.object.size() == 0;
	}
}
