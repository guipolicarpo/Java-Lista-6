/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc39 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner ( System.in );
		
		int termos = 0, contador = 1, divisor = 0;
		
		
		do {
			System.out.print("\nEntre com a quantidade de termos da sequencia: ");
			termos = ler.nextInt();
			
			if ( termos < 0 ) {
				System.out.println("\n\tErro! Valor invalido...");
			}
			
			if ( termos > 0 ) {		
				
				while ( contador <= termos ) {
					
					divisor = (termos - contador) + 1;
					
					System.out.print( contador + "/" + divisor );
					
					if ( contador < termos ) {
						System.out.print( " + " );
					} else {
						System.out.print( ", ... " );
					}
					
					contador++;
				}
			}
			
		} while ( termos != 0 );
		
		System.out.println("\n\tFim do programa...\n");
		
	}
}

