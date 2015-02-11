import javax.swing.*;
public class AccesoAplication {

	public static void main(String[] args) {
		String clave="brayan";
		String pass="";
		while (clave.equals(pass)==false){
			pass=JOptionPane.showInputDialog("Introduce la conraseña");
			
			if(clave.equals(pass)==false){
				System.out.println("Contraseña mal");
			}
		
		}
		System.out.println("Contraseña correcta acceso a sistema");

	}

}
