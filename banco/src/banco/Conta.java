package banco;

public class Conta {
	int numero;
	static double saldo;
	double limite;
	private Cliente titular;
	private static int totalDeContas=0;
	public double getSaldo() {
	return Conta.saldo;
	}
	public void setSaldo(double saldo) {
	Conta.saldo = saldo;
	}
	public double getLimite() {
	return this.limite;
	}
	public void setLimite(double limite) {
	this.limite = limite;
	}
	public Cliente getTitular() {
	return this.titular;
	}
	public void setTitular(Cliente titular) {
	this.titular = titular;
	}
	void deposita(double quantidade){
		Conta.saldo+= quantidade;
	}
	public void saca(double quantidade) {
		//posso sacar até saldo+limite
		if (quantidade > Conta.saldo + this.limite){
		System.out.println("Não posso sacar fora do limite! Nada feito");
		} else {
		Conta.saldo = Conta.saldo - quantidade;
		}
	}
	// construtor
	Conta(Cliente titular) {
	this.titular = titular;
	}
	Conta (int numero, Cliente titular) {
		this(titular); // chama o construtor que foi declarado acima
		this.numero = numero;
	}
	static void somaConta() {
		int i =1;
		do{ 
			totalDeContas +=1;
			i++;
		}while(i<6);
	}
	public static int getTotalDeContas() {
		return totalDeContas;
	}
	public static void main(String[] args){
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos";
		Conta c = new Conta(carlos);
		System.out.println(c.titular.nome);
		somaConta();
		int total = Conta.getTotalDeContas();
		Conta.saldo=1000;
		c.saca(200);
		c.deposita(500);
		System.out.println("Saldo atual: " + saldo);
		System.out.println(total);
	}
}
