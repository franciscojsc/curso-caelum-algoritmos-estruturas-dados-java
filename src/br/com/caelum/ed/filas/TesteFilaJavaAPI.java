package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFilaJavaAPI {

	public static void main(String[] args) {

		Queue<String> filaDeLetras = new LinkedList<>();
		
		String letra = "a";
		filaDeLetras.offer(letra);
		
		String letraRemovida = filaDeLetras.poll();
		
		if(filaDeLetras.isEmpty()){
			System.out.println("A fila está vazia");
		}
	}

}
