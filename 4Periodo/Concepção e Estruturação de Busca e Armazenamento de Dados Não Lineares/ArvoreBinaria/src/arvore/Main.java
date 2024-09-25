package arvore;

public class Main {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		arvore.inserir(50);
		arvore.inserir(25);
		arvore.inserir(75);
		arvore.inserir(10);
		arvore.inserir(30);
		arvore.inserir(60);
		arvore.inserir(100);
		arvore.inserir(18);
		arvore.inserir(5);
		arvore.inserir(28);
		arvore.inserir(40);
		arvore.inserir(51);
		arvore.inserir(65);
		arvore.inserir(76);
		arvore.inserir(200);

		arvore.imprimir();
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		arvore.buscar(1000);
	}

}
