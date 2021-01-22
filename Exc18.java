/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc18 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int c, quant;
		double valor, total=0;
		
		System.out.printf("Digite a quantidade do produto em estoque: ");
		quant = ler.nextInt();
			
		for(c=1; c <= quant; c++){
			System.out.printf("Digite o valor do produto "+ c +": R$");
			valor = ler.nextDouble();
				
			total += valor;
		}
		
		System.out.println("\nValor total do estoque: R$" + total);
		System.out.println("Média de valor de produtos: R$" + total/quant);
		
	}
}

