/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc20 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a = 0, maior = 0, menor = 0;
		
		for(int x = 0; x < 100; x++){
		
			System.out.printf("Insira um valor: ");
			a = ler.nextInt();
		
			if(x == 0){
			
				maior = a;
				menor = a;
			}
			
			if(a > maior){
			
				maior = a;
			}
		
			if(a < menor){
				
				menor = a;
			}
		}
		
		System.out.print("\nMaior: "+ maior +". Menor: "+ menor);
	}
}

