package br.com.caelum.ed.pilhas.opcional;

import java.util.Scanner;

import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TesteMsgCriptografada {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		PilhaParametrizada<Character> criptografa = new PilhaParametrizada<>();

		System.out.println("Entre com a mensagem");
		String msg = teclado.nextLine();

		for (int i = 0; i < msg.length(); i++) {
			criptografa.insere(msg.charAt(i));
		}

		
		String msgCriptogafada = "";

		for (int i = 0; i < msg.length(); i++) {
			msgCriptogafada += criptografa.remove();
		}
		
		System.out.println("Mensagem criptografada");
		System.out.println(msgCriptogafada);
		
		
		
	    PilhaParametrizada<Character> descriptografa = new PilhaParametrizada<>();

		for (int i = 0; i <msgCriptogafada.length(); i++) {
			descriptografa.insere(msgCriptogafada.charAt(i));
		}
		
		String msgDescriptogafada = "";

		for (int i = 0; i < msgCriptogafada.length(); i++) {
			msgDescriptogafada += descriptografa.remove();
		}
		
		System.out.println("Mensagem Descriptografada");
		System.out.println(msgDescriptogafada);
		
		

	}

}
