package arvore;

public class Arvore {
	private No raiz;
	
	public Arvore() {

		raiz = null;

	}
	
	public void inserir(int x) {
		if (raiz==null) {
			raiz = new No(x);
		}
		else {
			No novo = new No(x); // Cria um novo nó
			No atual = raiz;
			// Percorre a árvore para encontrar alguma posição
			while (atual.esq!=null && 
					atual.dir!=null) {
				if (x<atual.dado) { // se for menor
					// percorre para esquerda
					atual = atual.esq;
				}
				else if (x>atual.dado) { // se for maior
					// percorre para direita
					atual = atual.dir;
				}
			}
			if (x<atual.dado) {
				atual.esq = novo;
			}
			else if (x>atual.dado) {
				atual.dir = novo;
			}
		}
	}

	public void imprimir() {
		No atual = raiz;
		imprimir(atual, 0);
		/*System.out.println(atual.dado);
		System.out.println(" - esq: " + atual.esq.dado);
		System.out.println(" - dir: " + atual.dir.dado);*/
	}

	public void imprimir(No raiz, int nivel) {
		if (raiz!=null) {
			imprimir(raiz.dir, nivel+1);

			for (int i=0; i<nivel; i++) System.out.print("\t");
			System.out.println(raiz.dado);
			imprimir(raiz.esq, nivel+1);

		}
	}

	public void buscar(int x) {
		try {
			No atual = raiz;
			while (atual.esq != null || atual.dir != null) {
				if (x < atual.dado) {
					atual = atual.esq;
				} else if (x > atual.dado) {
					atual = atual.dir;
				}
				if (atual.dado == x) {
					System.out.println("Encontrou: " + atual.dado);
					return;
				}
			}
		} catch (NullPointerException ignored) {

		}
		System.out.println("Não encontrou.");
	}
}
