/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc5 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, c;
		
		System.out.print("Digite um numero (maior que zero): ");
		n = ler.nextInt();
		
		if(n > 0){
			for(c=1; c <= n; c++){
				System.out.println("--> " + c);
			}
		}
		else{
			System.out.println("\nO VALOR PRECISA SER MAIOR QUE ZERO");
			
			System.out.print("Digite um numero (maior que zero): ");
			n = ler.nextInt();
			
			for(c=1; c <= n; c++){
				System.out.println("--> " + c);
			}	
		}
	}
}

