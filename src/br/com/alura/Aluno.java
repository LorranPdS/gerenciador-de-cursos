package br.com.alura;

/*
 * Vamos começar criando uma nova classe Aluno nesta aula
 * 
 * Algo interessante no modo do professor programar é que ele somente cria os setters 
 * se ele realmente precisar, e talvez cria algum getter caso queira mesmo pegar algum 
 * atributo
 */
public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
		public String toString() {
			return "[Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
		}

}
