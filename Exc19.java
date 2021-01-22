/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc19 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner lers = new Scanner(System.in);
		
		char rep = 'S';
		int mediaq=0;
		double valor, total=0, mediav=0;
		
		while(rep == 'S' || rep == 's'){	
			System.out.printf("Digite o valor do produto: R$");
			valor = ler.nextDouble();
			
			mediaq++;
			
			total += valor;
			
			System.out.printf("Deseja adicionar outro produto? (S/N): ");
			rep = lers.nextLine().charAt(0);
		}
		
		System.out.println("\nValor total do estoque: R$" + total);
		System.out.println("\nMédia de valor do estoque: R$" + total/mediaq);
	}
}

