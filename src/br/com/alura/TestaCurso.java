package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso(
				"Dominando as coleções do Java", "Paulo Silveira");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
		
		// FORMAS DE ADICIONAR UM OBJETO NA LISTA
		// forma 1
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		// forma 2 - como o "getAulas()" devolve uma lista, então eu consigo usar o ".add()"
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		// forma 3 - usando o que foi feito no objeto "Curso"
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		/*
		 * Diferença entre ArrayList e LinkedList = performance
		 * ArrayList = usará algo parecido com um array, ou seja, se for pegar o valor de um determinado vetor, ela buscará bem rápido
		 * no vetor que você quer, independente da posição. Já o GRANDE PROBLEMA do ArrayList é quando precisamos deletar/inserir elementos
		 * no meio ou no começo do array, ou seja, se você tiver um ArrayList de 100 elementos e quer remover o elemento 50, você removerá
		 * o elemento 50 e o elemento 51 ocupará o espaço do elemento 50, o 52 o espaço do 51, e assim sucessivamente, e isso perde performance. A 
		 * mesma ideia se aplica ao adicionarmos: ela pegará o valor 100 e colocará no índice 101, o valor 99 no 100, até ser colocado o valor que 
		 * você queria adicionar no índice desejado.
		 * 
		 * LinkedList = se você for adicionar/remover o início da lista (veja documentação do Java), então o LinkedList é muito mais rápido, PORÉM onde
		 * o linkedlist é lento quando você vai pegar um valor que está num determinado índice (aulas.get(100) por exemplo), e diferente do ArrayList, 
		 * o LinkedList não vai direto no índice 100, mas começa do índice 0, depois 1, depois 2, ... até o 100, e isso demora demais
		 * 
		 * Esse é o tipo de aula que aprendemos em "Estrutura de Dados"
		 */
		
//		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas()); // vai dar no mesmo porque "aulas" é uma referência do getAulas()
		// veja abaixo que são iguais, tanto é que o resultado é "true"
//		System.out.println(aulas == javaColecoes.getAulas());
	}
}
