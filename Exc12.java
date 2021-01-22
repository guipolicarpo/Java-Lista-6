/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc12 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c;
		double n, total=0;
		
		for(c=1; c<=10; c++){
			System.out.printf("Digite o valor " + c + ": ");
			n = ler.nextDouble();
			total += n;
		}
		
		System.out.println("\nSoma total: " + total);
	}
}

