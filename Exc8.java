/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc8 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, n, negativo=0;
		
		for(c=1; c <=10; c++){
			System.out.printf("Digite um valor: ");
			n = ler.nextInt();
		
			if(n < 0){
				negativo++;
			}
		}
		
		System.out.println("\nQntd. de valores negativos: " + negativo);
	}
}

