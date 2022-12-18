package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		/*
		 * Para mantermos o encapsulamento, vou criar esse método abaixo
		 */
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		// Aqui começa a aula 7. Vamos criar esse método usando hashcode e equals
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		// O grande problema de quem trabalha com Set é o Equals
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672); // São Rodrigo diferentes
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
//		System.out.println("O a1 é == ao Turini?");
//		System.out.println(a1 == turini); // vai dar false por serem referências de memória diferentes

		System.out.println("O a1 é equals ao Turini?");
		// Então a partir de agora eu construo o método "equals"
		System.out.println(a1.equals(turini)); // Se você entrar nesse método equals, verá que há um igual também
		
		/*
		 * A regra geral então é: se eu tenho 2 objetos que são equals, OBRIGATORIAMENTE o seguinte é TRUE, veja:
		 */
		System.out.println(a1.hashCode() == turini.hashCode());
		/*
		 * Portanto, para dois conteúdos serem considerados idênticos, ele tem que ter esse mesmo número de espalhamento (hashCode)
		 * Importante estudar o curso "Estrutura de Dados"
		 */
	}
}
