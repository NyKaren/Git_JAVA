package banco;

public class TestaContaEstouro3 {
	public static void main (String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.limite = 100;
		minhaConta.saldo = 100;
		double novoSaldo = -200;
		if (novoSaldo < -minhaConta.limite){
			System.out.println("Não posso colocar esse saldo!");
		} else {
			minhaConta.saldo = novoSaldo;
		}
	}
}
