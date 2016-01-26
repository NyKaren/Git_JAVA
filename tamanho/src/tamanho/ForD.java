package tamanho;
import java.util.Scanner;

public class ForD {
	
	public static void main (String [] args){
		Scanner leitor = new Scanner(System.in);
        double soma = 0;
        System.out.println("Digite 5 números e descubra a soma dos múltiplos de 3 que há no conjunto.");
        for (int i = 0; i <= 4; i++){
        	System.out.println("Digite o valor "+(i+1));
        	int valor = leitor.nextInt();
			if (valor % 3 == 0) {
				soma += valor;
			}
		}
		System.out.println(soma);
	}
	
}
