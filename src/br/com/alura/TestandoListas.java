package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		// criando os objetos
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		// adicionando objetos em um arraylist
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		
		// removendo uma aula do arraylist
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		// listando as referências uma ao lado da outra
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		// pegando o conteúdo de um array específico
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		// outra forma para percorrer aulas
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula : " + aulas.get(i));
		}
		
		// verificando tamanho da lista
		System.out.println(aulas.size());
		
		// listando usando foreach pelo 'consumer'
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula: " + aula);
		});
		
		// ordenação da lista
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
		
	}
}