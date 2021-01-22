/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc45 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int fatorial = 1;
		int entrada;
		
		System.out.printf("Quantidade de termos: ");
		entrada = ler.nextInt();
						
		for (int i = entrada; i >= 1; i--) {
			fatorial *= i;			
			System.out.println( i + "!= " + fatorial);	
		}		
		
		
	}
}

