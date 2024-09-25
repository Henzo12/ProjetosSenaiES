package lista;

import java.util.Scanner;

import view.InterfaceLista;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lista lista = new ListaCircular();
		InterfaceLista il = new InterfaceLista(lista);
		int opcao=0;
		do {
			System.out.println("1) Inserir");
			System.out.println("2) Remover");
			System.out.println("3) Buscar");
			System.out.println("4) Rotacionar para direita");
			// TODO método de editar um número da lista
			
			il.imprimir();
			
			System.out.print("Opcao: ");
			opcao = scan.nextInt();
			switch (opcao) {
				case 1: 
					il.inserir();
					break;
				case 2:
					il.remover();
					break;
				case 3:
					il.buscar();
					break;
				case 4:
					il.rotacionar();
					break;
			}
			
			
			
		} while (opcao!=0);
	}

}
