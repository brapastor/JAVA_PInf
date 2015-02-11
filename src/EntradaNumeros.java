import javax.swing.*;
public class EntradaNumeros {

	public static void main(String[] args) {
		//double x= 10000.0;
		//System.out.printf("%1.2f",x/3);
		String num1 = JOptionPane.showInputDialog("introduce numero");
		double numdouble = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + numdouble + " Es ");
		System.out.printf("%1.2f", Math.sqrt(numdouble));
	}

}
