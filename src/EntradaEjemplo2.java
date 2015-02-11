import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		String edad=JOptionPane.showInputDialog("Ingresa tu edad");
		int edadnum= Integer.parseInt(edad);
		edadnum++;
		System.out.println("Hola " + nombre +" edad " + (edadnum+1) + " años");
	}

}
