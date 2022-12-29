package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {
	public static void main(String[] args) {
		/*
		 * Não há exatamente uma collection melhor para se usar em qualquer ocasião.
		 * Você verá segundo o plano de negócio qual é a melhor. Um exemplo foi para vermos
		 * os alunos, situação em que não importava qual aluno viria primeiro, então optamos
		 * por um HashSet que era rápido e não repetia dados.
		 * 
		 * No começo, é normal nós querermos usar ArrayList para tudo, mas com o tempo você verá
		 * que um HashSet pode ser uma melhor opção. Se precisar mudar, você vai mudando.
		 * 
		 * Se você não souber qual collection usar, use uma collection mesmo.
		 */
		
		Collection<Aluno> alunos = new HashSet<>();
		alunos.size();
//		alunos.get(56); // claro que isso aqui quebra
	}
}
