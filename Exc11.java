/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc11 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c, alunos;
		double n, total=0;
		
		System.out.printf("Quantos alunos possui na sala: ");
		alunos = ler.nextInt();
		
		for(c=1; c<=alunos; c++){
			System.out.printf("Digite a nota do aluno " + c + ": ");
			n = ler.nextDouble();
			total += n;
		}
		
		System.out.println("\nMédia Aritmética das notas da classe: " + total/alunos);
	}
}

