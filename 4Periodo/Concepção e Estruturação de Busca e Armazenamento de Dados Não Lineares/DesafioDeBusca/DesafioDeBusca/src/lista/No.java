package lista;

public class No {
	public String nome;
	public String email;
	public String telefone;


	No prox;
	No ant;

	public No(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;

		this.prox = null;
		this.ant = null;
	}
}
