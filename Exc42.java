/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc42 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int fatorial = 1;
		int entrada = 10;
						
		for (int i = 1; i <= entrada; i++) {
			
			fatorial *= i;			
			System.out.println( i + "!= " + fatorial);	
		}		
		
		
	}
}


