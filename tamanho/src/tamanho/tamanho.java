package tamanho;

public class tamanho {
	void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	void mostraEmpregados() {
		for (int i=0; i<this.mostraEmpregados().length;i++){
			System.out.println("Funcionário na posição: " + i);
		}
	}
	public static void main(String[] args){
		imprimeArray(10);
		mostraEmpregados();
		
	}
}
