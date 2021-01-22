/* Guilherme Policarpo de Carvalho*/
public class Exc29 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++){		
		 System.out.print("\n" +i + ", ");
		 
			for (int n = 1; n <= 10; n++){
				if(i % 2 == 0){
					n++;
					System.out.print( n + " ");
				}
				else{
					System.out.print( n + " ");
					n++;
				}
			}
		}
	}
}
