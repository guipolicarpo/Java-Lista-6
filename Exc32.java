/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc32 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int t;
		
		System.out.printf("Quant de termos: ");
		t = ler.nextInt();
		
		if(t <= 0){
			System.out.println("\nA quantidade deve ser positiva!!!");
			System.out.printf("Quant de termos: ");
			t = ler.nextInt();
			if(t <= 0){
				System.out.println("\nA quantidade deve ser positiva!!!");
				System.out.printf("Programa Finalizado.");
				System.exit(0);
			}
			else{
				for (int n = 0; n <= n++;){ 			
				System.out.print( n*2 + ", ");
				}
			}
		}
		else{
			for (int n = 0; n <= t; n++){ 
				System.out.print( n*2 + ", ");
			}
		}
	}
}

