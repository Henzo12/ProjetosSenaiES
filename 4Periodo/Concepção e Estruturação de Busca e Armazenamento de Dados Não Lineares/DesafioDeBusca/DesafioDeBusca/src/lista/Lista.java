package lista;

public abstract class Lista {
	protected No inicio;
	
	public Lista() {
		// Inicialmente vazia
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio==null;
	}

	public No ultimo() {
		No atual = inicio;
		if (vazia()) {
			return null;
		}
		while (atual.prox != inicio) {  // Percorrer até encontrar o último nó
			atual = atual.prox;
		}
		return atual;
	}
	
	public void inserir(String nome, String email, String telefone) {
		if (vazia()) { // Lista vazia
			inicio = new No(nome, email, telefone);
		}
		else {
			No novo = new No(nome, telefone, email);
			No atual = inicio;
			// Método para buscar o final da lista
			while (atual.prox!=null) {
				atual = atual.prox;
			}
			atual.prox = novo;
		}
	}
	
	/**
	 * Percorre a lista e busca pela existência do elemento
	 * @param
	 * @return retorna null se não existir, e o No se existir
	 */
	public No buscar(String nome) {
		No atual = inicio;
		while (atual != null && !atual.nome.equals(nome)) {  // Comparar pelo nome
			atual = atual.prox;
		}
		return atual;  // Retorna null se não encontrado
	}

	
	/**
	 * 1) Buscar se existe o elemento existe
	 * 2) Caso exista, remover o elemento considerando:
	 *  - O elemento está no início
	 *  - O elemento está no final
	 *  - O elemento está no meio
	 * @param
	 */
	public boolean remover(String nome) {
		No atual = inicio;
		No ant = null;
		if (vazia()) return false;

		while (atual != null && !atual.nome.equals(nome)) {  // Comparar pelo nome
			ant = atual;
			atual = atual.prox;
		}

		// Elemento não encontrado
		if (atual == null) return false;

		// Caso o nó a ser removido seja o primeiro
		if (atual == inicio) {
			if (inicio.prox == inicio) {  // Lista com um único elemento
				inicio = null;
			} else {
				No ult = ultimo();  // Buscar o último nó para rearranjar os apontamentos
				inicio = atual.prox;
				inicio.ant = ult;
				ult.prox = inicio;
			}
		} else if (atual.prox == inicio) {  // Caso o nó seja o último
			ant.prox = inicio;
			inicio.ant = ant;
		} else {  // Nó no meio da lista
			ant.prox = atual.prox;
			atual.prox.ant = ant;
		}

		return true;
	}

	public void imprimir() {
		No atual = inicio;
		if (vazia()) {
			System.out.println("Lista circular vazia!");
		} else {
			do {
				System.out.println("Nome: " + atual.nome + ", Email: " + atual.email + ", Telefone: " + atual.telefone);
				atual = atual.prox;
			} while (atual != inicio);
		}
		System.out.println();
	}

	public abstract void rotacionar();
	
}
