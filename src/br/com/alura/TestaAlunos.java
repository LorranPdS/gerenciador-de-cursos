package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		/*
		 * Uma diferença entre um Set e uma List é que um Set não é como um list que vai
		 * pegando elementos em ordem. O Set nós poderíamos comparar a uma sacola de elementos
		 * que sai pegando o que tiver lá dentro. Podemos ver por exemplo com alunos que um Set é
		 * mais bem aplicável que List porque, não há necessidade de você saber qual aluno veio 
		 * primeiro, basta ter um aluno e pronto. Por esse motivo não tem "métodos de acesso" (um get
		 * pedindo o elemento de um índice porque não tem índice, é uma sacola)
		 * 
		 * Outra coisa que o Set não aceita são elementos repetidos, como ocorre de fato num
		 * conjunto
		 * 
		 * Duas vantagens dos Sets são velocidade e performance
		 * 
		 * Outra vantagem é a remoção porque ele não procura pelo índice mas vai direto no elemento. Ele 
		 * não fica entrando em cada elemento e perguntando se o elemento a ser removido ou se contém ele 
		 * está por ali. É muito mais rápido trabalhar com HashSet
		 * 
		 * ENTÃO PARA LISTAS MUITO GRANDES (100 conteúdos por exemplo), INTERESSANTE USAR O "SET"
		 */
		Set<String> alunos = new HashSet<>(); // HashSet = Tabela de Espalhamento
//		Collection<String> alunos = new HashSet<>(); -> Eu poderia ser genérico e usar o Collection e usar Set ou List
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza"); // como esse elemento já existe, ele será desconsiderado

		/*
		 * Um método interessante que todas as coleções do Java possuem é o "contains()", pertencente 
		 * à interface mãe "Collection", e por isso as coleções possuem esse "contains()". Nos Sets, o 
		 * método "contains()" é muito mais rápido que no List 
		 */
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		
		// Vantagem de remover mais rápido um conteúdo
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);
		
		// Veja que o tamanho do Set não são todos os adicionados acima porque ele não repete valores
		System.out.println(alunos.size());
		
		// forma feia
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		// forma bonita (apesar de existirem formas mais curtas)
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		// Repare a seguir que não existe método .sort() para Set, apenas para List, porque Set não ordena 1° ou 2°
//		Collections.sort(alunos);
		
		/*
		 * Caso você realmente precise de um List em vez de Set, você pode fazer o seguinte e então 
		 * você conseguirá pegar o elemento que você quiser a partir dela
		 */
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println("Resultado de Set para List: " + alunosEmLista);
		
	}
}
