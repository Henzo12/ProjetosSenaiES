package lista;

import helper.StringHelper;

public class ListaCircular extends Lista {

	public void inserir(String nome, String email, String telefone) {
		No novo = new No(nome, email, telefone);

		if (vazia()) {
			// Se a lista está vazia, o novo nó é o início e aponta para si mesmo
			inicio = novo;
			inicio.prox = inicio;
			inicio.ant = inicio;
		} else {
			No atual = inicio;
			No anterior = null;

			// Procurar a posição correta na lista usando a comparação alfabética
			do {
				anterior = atual;
				atual = atual.prox;

				// Comparar usando StringHelper para garantir a ordem alfabética
			} while (atual != inicio && StringHelper.vemDepois(novo.nome, atual.nome));

			// Inserir o novo nó no lugar correto
			if (anterior == null) { // Inserção no início
				No ultimo = ultimo();
				novo.prox = inicio;
				novo.ant = ultimo;
				inicio.ant = novo;
				ultimo.prox = novo;
				inicio = novo;
			} else if (atual == inicio && StringHelper.vemAntes(novo.nome, inicio.nome)) { // Inserção no início
				No ultimo = ultimo();
				novo.prox = inicio;
				novo.ant = ultimo;
				inicio.ant = novo;
				ultimo.prox = novo;
				inicio = novo;
			} else { // Inserção no meio ou no final
				anterior.prox = novo;
				novo.ant = anterior;
				novo.prox = atual;
				atual.ant = novo;
			}
		}
	}

	/**
	 * Retorna o último No da lista.
	 */




	public void rotacionar() {
		inicio = inicio.prox;
	}
}
