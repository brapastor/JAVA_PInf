
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Brayan";
		
		System.out.println("Mi nombre es "+ nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " Caracteres");
		
		System.out.println("La primera letra de mi nombre es "
				+ nombre.charAt(0)
				);
		
		int ultimaLetra;
		ultimaLetra=nombre.length();
		
		System.out.println("la ultima letra de " + nombre + " es " + nombre.charAt(ultimaLetra-1));
		
	}

}
