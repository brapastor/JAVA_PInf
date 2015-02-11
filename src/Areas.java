
import java.util.*;

import javax.swing.*;
public class Areas {
	public static Scanner entrada;
	
	public static void main(String[] args) {
	 entrada = new Scanner(System.in);
	 System.out.println("Elije una opcion:\n1: Cuadrado \n2: Rectangulo \n3: triangulo  \n4: circulo");
	
	int figura= entrada.nextInt();
	
	switch (figura)
		{
		case 1:
			int lado= Integer.parseInt(JOptionPane.showInputDialog("indroduce el lado"));
			System.out.println("El area del cuadrado es"+ Math.pow(lado, 2));
		break;
		case 2: 
			double base= Double.parseDouble(JOptionPane.showInputDialog("ingresa base"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura"));
			double resultado = base*altura;
			System.out.println("el area del rectangulo es"+ resultado);
			
		break;
		case 3:
			double base2= Double.parseDouble(JOptionPane.showInputDialog("ingresa base"));
			double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura"));
			double resultado2 = (base2*altura2)/2;
			System.out.println("el area del triangulo es"+ resultado2);
			break;
		case 4:
			double radio= Double.parseDouble(JOptionPane.showInputDialog("ingresa radio"));
			System.out.print("El area del circulo");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("la opcion no es valida");
			
		}
		
	}
}
