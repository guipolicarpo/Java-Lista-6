/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc9 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, n, intervalo=0;
		
		for(c=1; c <=10; c++){
			System.out.printf("Digite um valor: ");
			n = ler.nextInt();
		
			if(n >= 10 && n <= 20){
				intervalo++;
			}
		}
		
		System.out.println("\nQntd. de valores entre 10 e 20: " + intervalo);
	}
}

