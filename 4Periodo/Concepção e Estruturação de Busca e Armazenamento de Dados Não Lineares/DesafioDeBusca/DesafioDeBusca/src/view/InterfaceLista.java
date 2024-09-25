package view;

import java.util.Scanner;

import lista.Lista;
import lista.No;

public class InterfaceLista {
	private Lista lista;
	private Scanner scan;

	public InterfaceLista(Lista lista) {
		this.lista = lista;
		scan = new Scanner(System.in);
	}

	public void inserir() {
		System.out.print(" > Nome: ");
		String nome = scan.nextLine();
		System.out.print(" > E-mail: ");
		String email = scan.nextLine();
		System.out.print(" > Telefone: ");
		String telefone = scan.nextLine();
		lista.inserir(nome, email, telefone);  // Agora insere uma pessoa
	}


	public void imprimir() {
		lista.imprimir();
	}

	public void buscar() {
		System.out.print(" > Buscar pessoa pelo nome: ");
		String nome = scan.nextLine();
		No item = lista.buscar(nome);
		if (item != null) {
			System.out.println("Pessoa encontrada: Nome - " + item.nome + ", Email - " + item.email + ", Telefone - " + item.telefone);
		} else {
			System.out.println("Pessoa não encontrada!");
		}
	}

	public void remover() {
		System.out.print(" > Nome da pessoa a remover: ");
		String nome = scan.nextLine();
		boolean sucesso = lista.remover(nome);
		if (sucesso) {
			System.out.println("Pessoa removida com sucesso!");
		} else {
			System.out.println("Erro ao remover a pessoa!");
		}
	}


	public void rotacionar() {
		lista.rotacionar();
	}
}
