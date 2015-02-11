import java.util.*;
public class EvaluaEdad {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		System.out.println("introduce tu edad");
		int edad = entrada.nextInt();
	
		
		/*if(edad>= 18){
			System.out.println("Eres mayor de edad");
		}
		else{System.out.println("no eres mayor de edad");}
		
		entrada.close();*/
		
		if (edad<18)
		{
			System.out.println("ERes un Adolescente");
		}
		else if(edad<40)
		{
			System.out.println("eres joven");
		}
		else if (edad<60)
		{
			System.out.println("eres maduro");
			
		}
		else
		{System.out.println("Cuidate");}
	}

}
