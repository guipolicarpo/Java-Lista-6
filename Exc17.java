/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc17 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner lers = new Scanner(System.in);
		
		char calc = 'S';
		double a1, a2;
		
		while(calc == 'S' || calc == 's'){
			System.out.printf("Nota da avaliação 1: ");
			a1 = ler.nextDouble();
			
			System.out.printf("Nota da avaliação 2: ");
			a2 = ler.nextDouble();
			
			if(a1 >= 0 && a1 <= 10){
				if(a2 >= 0 && a2 <= 10){
					System.out.println("Média do aluno: " + (a1 + a2)/2);
				}
				else{
				System.out.println("\nApenas valores de 0 a 10!");
				}
			}
			else{
				System.out.println("\nApenas valores de 0 a 10!");
			}
			
			System.out.println("\nDeseja fazer um novo calculo? (S/N): ");
			calc = lers.nextLine().charAt(0);
		}
		
	}
}

