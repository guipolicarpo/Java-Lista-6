/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc23 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner lers = new Scanner(System.in);
		
		char a = 'S';
		int filho, c = 1, totalf=0, pop = 0;
		double total = 0, sal = 0, maior = 0, salm = 0;
		
		while(a == 'S' || a == 's'){
			System.out.printf("Insira o salário: R$");
			sal = ler.nextDouble();
			
			System.out.printf("Insira o número de filhos: ");	
			filho = ler.nextInt();
			
			totalf += filho;
			pop++;
			total += sal;
			
			if(sal < 150){
				salm++;
			}
			
			if(c == 0){
			
				maior = sal;
			}
			
			if(sal > maior){
			
				maior = sal;
			}
			
			System.out.printf("\nDeseja adicionar mais? (S/N): \n");
			a = lers.nextLine().charAt(0);
			
		}
		
		System.out.println("\nMédia de salário da populção: R$" + total/pop);
		System.out.println("Média de número de filhos: " + totalf/pop);
		System.out.println("Maior salário dos habitantes: R$" + maior);
		System.out.println("Média de número de filhos: " + (salm/pop)*100 + "%");
		
	}
}

