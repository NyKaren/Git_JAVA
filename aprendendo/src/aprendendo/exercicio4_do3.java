package aprendendo;

public class exercicio4_do3 {
	public static void main (String [] args) {
		long fatorial = 1;
		for(int n = 1; n <= 40; n++) {
			fatorial *= n;
			System.out.println(fatorial);
		}
	}
}
