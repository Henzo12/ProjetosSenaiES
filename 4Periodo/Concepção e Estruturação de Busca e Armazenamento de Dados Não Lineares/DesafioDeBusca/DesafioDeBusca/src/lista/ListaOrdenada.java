/* package lista;

public class ListaOrdenada extends Lista {
	
	public void inserir(int x) {
		// Inserindo o primeiro elemento
		if (vazia()) {
			inicio = new No(x);
		}
		else {
			No atual = inicio; // No atual do percurso
			No ant = null; // No anterior
			No novo = new No(x);
			while (x>atual.dado && atual.prox!=null) {
				ant = atual;
				atual = atual.prox;
			}
			// O início da lista passa a ser o novo nó
			if (atual==inicio && x<inicio.dado) { // Inicio da lista
				// Insere no início da lista
				inicio = novo;
				inicio.prox = atual;
			}
			else if (atual.prox==null && x>atual.dado) { // Fim da lista
				// Insere no final da lista
				atual.prox = novo;
			}
			else { // Meio da lista
				ant.prox = novo;
				novo.prox = atual;
			}
		}
	}

	public void rotacionar() {
		System.err.println("Operação indisponível para esta lista");
	}
	
}
*/