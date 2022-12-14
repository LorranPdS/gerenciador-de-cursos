package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		/*
		 * Ela vai quebrar abaixo porque o ".getAulas()" lá na classe está com o método
		 * unmodifiableList, e como ao ordenar há modificação, ele estourou a exceção.
		 * 
		 * Isso é correto porque quem está tentando modificar a ordem das coisas tem que me
		 * pedir, não é chegando a hora que quer e sair mudando método privado.
		 * 
		 * Lembrando que, se eu não coloco abaixo qual ordem eu quero, ele ordenará pelo
		 * Comparable que estendemos na classe, e lá está dizendo que será pelo título
		 */
//		Collections.sort(aulasImutaveis);
//		System.out.println(aulasImutaveis);
		
		/*
		 * Portanto eu passo no construtor do ArrayList abaixo o aulasImutaveis e agora você
		 * conseguirá imprimir ordenando da forma como você quer
		 * 
		 * Importante manter aquela programação defensiva
		 */
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		// MUITO IMPORTANTE ir na documentação do Java e ver as opções que tem esse Collections, VEJA!! NÃO REINVENTE A RODA!
		Collections.sort(aulas);
		System.out.println(aulas);
		
		/*
		 * Agora eu quero saber: qual é o total de tempos das aulas desse curso?
		 * Vou fazer esse método encapsulado lá na classe Curso e imprimir abaixo
		 */
		System.out.println(javaColecoes.getTempoTotal());
		
		// Encapsulei também o toString
		System.out.println(javaColecoes);
	}
}
