package banco;

public class Funcionario {
	private static String nome;
	public Funcionario() {
		// construtor sem argumentos
	}
	private static void nome(String string) {
		// TODO Auto-generated method stub
		Funcionario.nome = ("Pedro");
	}
	public Funcionario(String nome) {
		
	}
	private double salario;
	private double salarioAnual;	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;		
	}
	public static void empregados(String[] array) {
		for (int i=1; i<array.length;i++){
			System.out.println("Funcionário na posição: " + array[i]);
		}
	}
	void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	public double calculaGanhoAnual() {
		salarioAnual = salario * 12;
		return salarioAnual;
	}
	static void mostra(){
		System.out.println("O nome do Cliente é " + Funcionario.nome);;
	}
	public static void main(String[] args){
		Funcionario f = new Funcionario();
		f.setSalario(100);
		f.recebeAumento(20);
		Funcionario.nome("Pedro");
		mostra();
		System.out.println("O salário atual é de " + f.getSalario());
		System.out.println("O ganho anual é de " + f.calculaGanhoAnual());
	}
}
