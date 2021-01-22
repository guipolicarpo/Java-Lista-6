/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc46 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, resultado=0;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();
 
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				resultado++;
				break;
			}
		}
 
		if (resultado == 0){
		System.out.println("É um número primo");
		}else{
		System.out.println("Não é um número primo");
		}
	}
}

