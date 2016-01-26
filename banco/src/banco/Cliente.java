package banco;

public class Cliente {
	String nome;
	String sobrenome;
	private String endereco;
	private String cpf;
	private int idade;
	private void validaCPF(String cpf) {
	// série de regras aqui, falha caso não seja válido
	}
	public void mudaCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}
			this.cpf = cpf;
	}
}
