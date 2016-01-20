package aprendendo;
import java.util.Scanner;

public class menu {
	    public static void main(String[] args) {
	        boolean continuar=true;
	        int opcao;
	        Scanner entrada = new Scanner(System.in);
	        do
	        {
	            System.out.println("\t\tMenu de opções:");
	            System.out.println("\t1. Ver o menu");
	            System.out.println("\t2. Ler o menu");
	            System.out.println("\t3. Repetir o menu");
	            System.out.println("\t4. Tudo de novo");
	            System.out.println("\t5. Não li, pode repetir?");
	            System.out.println("\t0. Sair");
	            
	            System.out.print("\nInsira sua opção: ");
	            opcao = entrada.nextInt();
	            
	            if(opcao == 0){
	                continuar = false;
	                System.out.println("Programa finalizado.");
	            }
	            else{
	                System.out.printf("\n\n\n\n\n\n");
	            }
	            
	        } while( continuar );
	    }

	}