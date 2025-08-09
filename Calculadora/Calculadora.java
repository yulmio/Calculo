import javax.swing.JOptionPane;
public class Calculadora {

	public static void main(String[] args) {
		System.out.println("");
		JOptionPane.showMessageDialog(null, "Opcion 1: Sumar\nOpcion 2:  Restar\nOpcion 3: Multiplicar\nOpcion 4: Dividir\nOpcion 5: Resto\nOpcion 6: Potencia");
		int peticion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de opcion de la operacion ritmetica que deseas: "));
		
		if (peticion == 1) {
			int peticionS1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Sumar, introduce el digito"));
			int peticionS2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Sumar, introduce el segundo"));
			int peticionFinal = Math.abs(peticionS1 + peticionS2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 2) {
			int peticionR1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Restar, introduce el digito"));
			int peticionR2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Restar, introduce el segundo"));
			int peticionFinal = Math.abs(peticionR1 - peticionR2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 3) {
			int peticionM1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Multiplicar, introduce el digito"));
			int peticionM2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Multiplicar, introduce el segundo"));
			int peticionFinal = Math.abs(peticionM1 * peticionM2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 4) {
			int peticionD1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Dividir, introduce el digito"));
			int peticionD2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Dividir, introduce el segundo"));
			int peticionFinal = Math.abs(peticionD1 / peticionD2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 5) {
			int peticionRE1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Resto, introduce el digito"));
			int peticionRE2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Resto, introduce el segundo"));
			int peticionFinal = Math.abs(peticionRE1 % peticionRE2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 6) {
			double peticionP1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Potencia, introduce el digito BASE"));
			double peticionP2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Potencia, introduce el segundo EXPONENTE"));
			int peticionFinal = (int)Math.pow(peticionP1, peticionP2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		
		
		
		
		
		
		
		
	}

}
