/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc7 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, n;
		
		System.out.print("Digite um número de 1 a 10: ");
		n = ler.nextInt();
		
		if(n >= 1 && n <=10){
			for(c=1; c <=10; c++){
				System.out.println(n + " X " + c + ": " + c*n );
			}
		}
		else{
			System.out.print("Digite um valor de 1 a 10!!!");
		}
	}
}

