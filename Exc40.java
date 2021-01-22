/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc40 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, c, meio=0, elemento;
		String inicio = "", centro = "", termino = "";
		do{
			System.out.printf("Quantidade de termos: ");
			numero = ler.nextInt();
			
			if(numero < 0){
				System.out.printf("\nValor invalido!");
			}
			
			if(numero > 0){
				c=1;
				meio = numero / 2;
				elemento=1;
				
				if(numero % 2 == 1){
					centro = (meio + 1) + " ";
				}
				
				while(c <= meio){
					
					inicio += c + " ";
					termino = c + " " + termino;
					
					c++;
				}
				
				System.out.println(inicio + centro + termino);
			}
		}while(numero != 0);
	}
}

