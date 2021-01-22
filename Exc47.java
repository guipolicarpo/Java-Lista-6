/* Guilherme Policarpo de Carvalho*/
public class Exc47 {
	
	public static void main (String[] args) {
		System.out.println("Numeros primos de 1 a 100");

		for(int i=1; i < 100; i++){

			boolean primo = true;

			for(int j=2; j < i ; j++){

				if(i % j == 0){
					primo = false;
					break;
				}
			}
		
			if(primo){
				System.out.print(i + " ");
			}
		}
	}
}

