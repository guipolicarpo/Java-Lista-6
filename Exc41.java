/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc41 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int fatorial = 1;
		int valor;
		
		System.out.printf("Calcule o fatorial de: ");
		valor = ler.nextInt();
		

		for( int i = 2; i <= valor; i++ ){	
		fatorial *= i;
		}

		System.out.println( "O fatorial de " + valor + " é igual a " + fatorial );
		
	}
}
