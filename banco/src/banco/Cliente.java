package banco;

public class Cliente {
	String nome;
	String sobrenome;
	private String endereco;
	private String cpf;
	private int idade;
	private void validaCPF(String cpf) {
	// s�rie de regras aqui, falha caso n�o seja v�lido
	}
	public void mudaCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}
			this.cpf = cpf;
	}
}
