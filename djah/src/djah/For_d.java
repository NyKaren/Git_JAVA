package djah;
import java.util.Scanner;

public class For_d {
	
	
	public static void main (String [] args){
        int[] numero = new int[4];
        double soma = 0;
        System.out.print("Digite 5 n�meros e descubra a soma dos m�ltiplos de 3 que h� no conjunto.");
        for (int i = 0; i <= 4; i++){
        	 System.out.print("Digite o valor "+(i+1));
        	numero [i] = new Scanner(System.in).nextInt();
			if (i % 3 == 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}
}
