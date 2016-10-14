package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {

	private List<List<String>> tabela = new ArrayList<List<String>>();

	public ConjuntoEspalhamento() {
		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<>();
			tabela.add(lista);
		}
	}

	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo = 1;
		for (int i = 0; i < palavra.length(); i++) {
			codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
	}

	private int calculaIndiceTabela(String palavra) {
		int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % tabela.size();
	}

	public void adiciona(String palavra) {
		if (!this.contem(palavra)) {
			int indice = this.calculaIndiceTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
			tamanho++;
		}

	}

	public void remove(String palavra) {
		if (this.contem(palavra)) {
			int indice = this.calculaIndiceTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			tamanho--;
		}
	}

	public boolean contem(String palavra) {
		int indice = this.calculaIndiceTabela(palavra);
		List<String> lista = this.tabela.get(indice);

		return lista.contains(palavra);
	}

	public List<String> pegaTodas() {
		List<String> palavras = new ArrayList<>();

		for (int i = 0; i < tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}

	private int tamanho = 0;

	public int tamanho() {
		return this.tamanho;
	}

	public void imprimeTabela() {
		for (List<String> lista : this.tabela) {

			System.out.print("[");
			for (int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
}
