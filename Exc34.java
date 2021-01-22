/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc34 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner ( System.in );
		
		int termos = 0, c=1, contador = 0, soma =0;
		
		
		do {
			System.out.print("\nEntre com a quantidade de termos da sequencia: ");
			termos = ler.nextInt();
			
			if ( termos < 0 ) {
				System.out.println("\n\tErro! Valor invalido...");
			}
			
			if ( termos > 0 ) {
				while ( c <= termos ) {
					
					contador += soma;
					System.out.print( contador );
					
					if ( c < termos ) {
						System.out.print( " , " );
					} else {
						System.out.print( " , " );
					}
					soma++;
					c++;
				}
			}
			
		} while ( termos != 0 );
		
		System.out.println("\n\tFim do programa...\n");
		
	}
}

