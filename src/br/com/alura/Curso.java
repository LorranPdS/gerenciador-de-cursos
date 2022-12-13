package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	
	/*
	 * Usamos abaixo o List em vez de ArrayList para encapsularmos (escondemos) quem 
	 * estará ali dentro do array. Sendo assim, sempre que eu for criar um List, eu já
	 * vou deixar guardado um espaço para criar as aulas desse curso, e esse é o motivo
	 * de eu ter colocado abaixo o "new ArrayList<>()"
	 * 
	 * Outra coisa é que, se você for usar ArrayList em vez de List e uma classe quiser 
	 * usar um LinkedList, você não conseguirá mudar isso se o tipo do seu atributo for 
	 * ArrayList, mas se for List, você consegue. Por esse motivo, é muito importante 
	 * usar interfaces do que classes porque ela ficou menos acoplada
	 */
	private List<Aula> aulas = new ArrayList<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		// Vamos fazer aqui a programação defensiva, ou seja, que evita que certos problemas comuns ocorram
		// todos os objetos que tentarem modificar (remover, adicionar, ...) essa lista, esse método não vai deixar. Será readOnly
		/*
		 * Portanto, se você quiser modificar essa lista, você será obrigado a usar o do método "adiciona(Aula aula)" porque, se 
		 * você tentar adicionar usando o aulas.add(), ele não deixa.
		 * 
		 * Você consegue fazer buscas, leitura do que tem na lista, PORÉM modificar a lista por aqui você não consegue
		 */
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
}
