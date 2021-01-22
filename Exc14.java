/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc14 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, n1, n2, total=0;
		
		System.out.printf("Digite o valor 1: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o valor 2: ");
		n2 = ler.nextInt();
		
		if(n2 > n1){
			for(c=n1; c <= n2; c++){
				total += c;
			}
		}
		else{
			System.out.printf("O valor 2 precisa ser maior que o 1!");
		}
		
		System.out.println("\nSoma dos valores:" + total);
	}
}

