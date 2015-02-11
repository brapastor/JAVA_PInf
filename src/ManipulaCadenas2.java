
public class ManipulaCadenas2 {

	public static void main(String[] args) {
		String frase = "hoy es un estupendo dia para aprender a programar en java";
		int ultima=frase.length();
		System.out.println(ultima);
		String fraseResumen = frase.substring(29, ultima) + "irnos a la playa";
		
		System.out.println(fraseResumen);
		

	}

}
