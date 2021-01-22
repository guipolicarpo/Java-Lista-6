/* Guilherme Policarpo de Carvalho*/
public class Exc28 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++){		
		 System.out.print("\n" +i + ", ");
		 
			for (int n = 10; n > i; n--){ 
				System.out.print( n + " ");
			}
		}
	}
}

