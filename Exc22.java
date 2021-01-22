/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc22 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, cod;
		double total = 0, a = 0, maior = 0;
		
		for(c = 1; c <= 15; c++){
		
			System.out.printf("Insira o código do produto: ");
			cod = ler.nextInt();
			
			System.out.printf("Insira o valor do produto: ");
			a = ler.nextDouble();
			
			total += a;
		
			if(c == 0){
			
				maior = a;
			}
			
			if(a > maior){
			
				maior = a;
			}
		}
		
		System.out.println("\nMaior valor: " + maior + " e média: " + total/15);
	}
}

