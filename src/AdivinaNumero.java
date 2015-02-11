import java.util.*;


public class AdivinaNumero {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int aleatorio= (int) (Math.random()*100);
		//System.out.println(aleatorio);
		
		int numero=0;
		int intentos=0;
		
		while (numero!=aleatorio){
			intentos++;
			System.out.println("indroduce un numero por favor");
			numero=scanner.nextInt();
			if (aleatorio<numero){
				System.out.println("mas bajo");
			}
			else if(aleatorio>numero)
			{
				System.out.println("mas alto");
			}
			
		}
		System.out.println("correcto");
		System.out.println("numero de intentos "+ intentos);
	}

}
