/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc21 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, a = 0, maior = 0, quant;
		double total = 0;
		
		System.out.printf("Quantidade de valores que deseja adicionar: ");
		quant = ler.nextInt();
		
		for(c = 1; c <= quant; c++){
		
			System.out.printf("Insira um valor: ");
			a = ler.nextInt();
			
			total += a;
		
			if(c == 0){
			
				maior = a;
			}
			
			if(a > maior){
			
				maior = a;
			}
		}
		
		System.out.println("\nMaior valor: " + maior + " e média: " + total/quant);
	}
}

