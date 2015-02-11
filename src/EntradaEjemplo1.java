import java.util.*;


public class EntradaEjemplo1 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre= Entrada.nextLine();
		
		System.out.println("Ingrese su edad:");
		int edad=Entrada.nextInt();
		
		System.out.println("Hola " + nombre+ " su edad es " + edad);
		Entrada.close();
	}

}
