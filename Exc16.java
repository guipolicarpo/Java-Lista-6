/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc16 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, total=0;
		
		for(c=15; c <=100; c++){
			total += c;
		}
		
		System.out.println("\n Média Aritimética entra 15 e 100: " + total/85);
	}
}

