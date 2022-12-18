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
		/*
		 * Veja que, verificando se o nome é null ou não, eu estou fazendo uma programação defensiva, 
		 * ou seja, "eu não quero que o nome corra o risco de ser null, então lanço a Exceção".
		 * 
		 * É interessante que, fazer essa conferência aqui no construtor é bem melhor que fazer no método "equals"
		 */
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	/*
	 * Vamos criar no equals então, o que é considerado para você quando um aluno é igual ao outro. 
	 * Um aluno é igual quando apenas o nome é igual? Ou quando a matrícula é igual? Ou quando o nome
	 * e a matrícula são iguais?? Então veja que, quem define quem é igual ao quê não é o Java mas sim você (o negócio)
	 * 
	 * O Java dirá quando uma String é igual é se cada letra é a mesma
	 */
	@Override
		public boolean equals(Object obj) {
		/*
		 * Entenda que o equals usado pelo Set faz a busca, mas não olhando de objeto em objeto, mas sim através de um
		 * "número mágico" que é criado para cada objeto adicionado. Sempre que o método "equals" foge do padrão (como fizemos
		 * agora com este equals aqui), nós precisamos mudar também esse número mágico. Esse número mágico é chamado de "hashcode", 
		 */
		
			Aluno outro = (Aluno) obj;
			return this.nome.equals(outro.nome);
		}
	
	/*
	 * O hashCode é um identificador único do objeto, mas iremos calcular ele
	 */
	@Override
	public int hashCode() {
		/*
		 * Essa maneira que está em comentário abaixo por exemplo não é uma boa forma de se criar hashCode porque ele colocará
		 * os nomes de alunos que começam com uma determinada letra para que sejam buscados, então fazer essa busca ainda será
		 * demorada, já que o Set vai procurar em grupos de hashCode com iniciais iguais.
		 */
//		return this.nome.charAt(0);
		
		/*
		 * A forma criada abaixo é interessante de fazer hashCode porque, todos os caracteres que tiverem as somas iguais serão
		 * buscados, o que diminui bastante a busca por qual nome é igual ao que se busca.
		 * 
		 * Saiba também que o hashCode da classe String funciona muito bem também, basta entrar no método dele para você ver como é montado.
		 */
		return this.nome.hashCode();
	}

	@Override
		public String toString() {
			return "[Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
		}

}
