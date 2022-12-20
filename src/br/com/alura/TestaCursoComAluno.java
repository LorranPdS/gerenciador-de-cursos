package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

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
		
		/*
		 * CURIOSIDADE INTERESSANTE:
		 * Antes do Java 8, percorria-se lista usando o foreach. Mas quando não tinha o foreach, 
		 * como percorrer um Set se ele não usa índices get(n)? Pois bem, os dinossauros antes do
		 * Java 5 usavam o Iterator. Vamos mostrar como é o Iterator porque em algum dia na vida
		 * você vai se deparar com ela
		 */
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator(); // Lembre-se: toda coleção tem iterator (listas, sets, ...)
		/*
		 * O iterator tem 3 métodos, mas são 2 que mais costumamos usar. Esse primeiro diz:
		 * "Iterator, tem mais algum objeto aí dentro pra eu pegar? Tem mais algum objeto pra tirar
		 * da sacola pra eu procurar? Porque se não tiver, eu não quero mais procurar"
		 */
//		iterador.hasNext(); // devolve um boolean
		
		/*
		 * O segundo método mais usado é o "next". Ele diz: "Ele tem um objeto então? Blz, então me dê ele (que seria 
		 * o próximo/next)"
		 */
//		iterador.next();
		
		/*
		 * Normalmente nós colocamos esses valores de Iterator dentro de um "while". A leitura seria a seguinte:
		 * "Enquanto esse iterador tem um próximo pra ler, então eu vou querer que você pegue ele"
		 */
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		/*
		 * Por esse motivo é muito comum você ver código antigo usando esse Iterator, ou mesmo código legado
		 * aceitando Iterators como argumento
		 */
		
		/*
		 * Se você ainda colocar mais um next() como no exemplo abaixo, ele terá um erro chamado
		 * NoSuchElementException (e aparece bastante).
		 * 
		 * É como se ele estivesse falando para você: "Você está pedindo mais um?? Mas eu já tinha 
		 * te dito acima que não tinha mais um!", isso porque o iterator já percorreu toda a sacola
		 * 
		 * Mas se você quisesse uma nova iteração, então você teria que abrir um outro iterator que assim
		 * ele abriria do zero, que seria: Iterator<Aluno> iterador = alunos.iterator();
		 */
//		Aluno depoisDoUltimo = iterador.next();
		
		
		/*
		 * Outra coisa muito legada são as interfaces antigas como o Collector (versão 1.2) e, antes disso,
		 * não havia collections, mas havia uma classe muito velha chamada Vector, veja:
		 */
		
		Vector<Aluno> vetor = new Vector<>();
		/*
		 * O Vector é uma classe muito velha, ninguém mais usa e muito parecida com ArrayList
		 */
		
		/*
		 * Todas as iterações que vimos até agora não são seguras para serem usadas dentro de thread sendo rodadas
		 * simultaneamente porque se forem usadas vários .add e .get simultaneamente, um pode atropelar o outro
		 * e dar a maior confusão. Com a Vector sempre funciona mas mesmo assim ela não é recomendada ser usada, 
		 * até porque tem outras formas de se trabalhar com coleção de maneira "Threadsafe", ou seja, segura com relação
		 * a threads
		 */
		
		// A outra velharia se chama HashTable, mas é uma coisa que veremos na próxima aula.
		
		
	}
}
