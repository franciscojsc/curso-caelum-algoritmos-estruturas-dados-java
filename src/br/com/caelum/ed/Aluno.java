package br.com.caelum.ed;

public class Aluno {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return this.nome;
	}
	
	public boolean equals(Object o){
		Aluno outro = (Aluno) o;
		return this.nome.equals(outro.nome);
	}
	
	
}
