import javax.swing.JOptionPane;
public class Calculadora {

	public static void main(String[] args) {
		System.out.println("");
		JOptionPane.showMessageDialog(null, "Opción 1: Sumar\nOpción 2:  Restar\nOpción 3: Multiplicar\nOpción 4: Dividir\nOpción 5: Resto\nOpción 6: Potencia\nOpción 7: Raíces cuadradas enteras\nOpción 8: Raíces cuadradas exactas");
		int peticion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de opción de la operación aritmética que deseas: "));
		
		if (peticion == 1) {
			int peticionS1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Sumar, introduce el dígito"));
			int peticionS2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Sumar, introduce el segundo"));
			int peticionFinal = Math.abs(peticionS1 + peticionS2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 2) {
			int peticionR1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Restar, introduce el dígito"));
			int peticionR2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Restar, introduce el segundo"));
			int peticionFinal = Math.abs(peticionR1 - peticionR2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 3) {
			int peticionM1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Multiplicar, introduce el dígito"));
			int peticionM2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Multiplicar, introduce el segundo"));
			int peticionFinal = Math.abs(peticionM1 * peticionM2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 4) {
			int peticionD1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Dividir, introduce el dígito"));
			int peticionD2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Dividir, introduce el segundo"));
			int peticionFinal = Math.abs(peticionD1 / peticionD2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 5) {
			int peticionRE1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Resto, introduce el dígito"));
			int peticionRE2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Resto, introduce el segundo"));
			int peticionFinal = Math.abs(peticionRE1 % peticionRE2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 6) {
			double peticionP1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Potencia, introduce el dígito BASE"));
			double peticionP2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Potencia, introduce el segundo EXPONENTE"));
			int peticionFinal = (int)Math.pow(peticionP1, peticionP2);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 7) {
			double peticionPO1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Raíz cuadrada, introduce el dígito"));
			int peticionFinal = (int)Math.sqrt(peticionPO1);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		if (peticion == 8) {
			double peticionPOE1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Raíz cuadrada exacta, introduce el dígito"));
			double peticionFinal = Math.sqrt(peticionPOE1);
			JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
		}
		
		
		
		
		
		
	}

}
