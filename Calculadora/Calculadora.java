	import javax.swing.JOptionPane;
	public class Calculadora {
	
		public static void calcular() {
			
			JOptionPane.showMessageDialog(null, "Opción 1: Sumar\nOpción 2:  Restar\nOpción 3: Multiplicar\nOpción 4: Dividir\nOpción 5: Resto\nOpción 6: Potencia\nOpción 7: Raíces cuadradas");
			int peticion = 100;
			
			while (!(peticion > 0 && peticion <= 7)) {
				
				try {
					peticion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de opción de la operación aritmética que deseas"));
					
					if (peticion == 1) {
						int peticionS1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Sumar, introduce un número"));
						int peticionS2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Sumar, introduce el segundo"));
						int peticionFinal = Math.abs(peticionS1 + peticionS2);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
								
					else if (peticion == 2) {
						int peticionR1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Restar, introduce un número"));
						int peticionR2 = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce el segundo"));
						int peticionFinal = Math.abs(peticionR1 - peticionR2);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
					
					
					else if (peticion == 3) {
						int peticionM1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Multiplicar, introduce un número"));
						int peticionM2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Multiplicar, introduce el segundo"));
						int peticionFinal = Math.abs(peticionM1 * peticionM2);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
					
					else if (peticion == 4) {
						double peticionD1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Dividir, introduce un número"));
						double peticionD2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Dividir, introduce el segundo"));
						double peticionFinal = Math.abs(peticionD1 / peticionD2);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
					
					else if (peticion == 5) {
						int peticionRE1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Resto, introduce un número"));
						int peticionRE2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionaste Resto, introduce el segundo"));
						int peticionFinal = Math.abs(peticionRE1 % peticionRE2);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
					
					else if (peticion == 6) {
						double peticionP1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Potencia, introduce el número BASE"));
						double peticionP2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Potencia, introduce el segundo EXPONENTE"));
						int peticionFinal = (int)Math.pow(peticionP1, peticionP2);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
					
					else if (peticion == 7) {
						double peticionPOE1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Seleccionaste Raíz cuadrada exacta, introduce un número"));
						double peticionFinal = Math.sqrt(peticionPOE1);
						JOptionPane.showMessageDialog(null, "El resultado es : " + peticionFinal);
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Introdujiste algo no adecuado al programa, vuelve a intentarlo");
					}
				} catch (NumberFormatException letrasError) {
			        JOptionPane.showMessageDialog(null, "Escribe solo números.");
			    } 
			}
			
			String guarOP = JOptionPane.showInputDialog("PARA SALIR PULSA 0 (CERO) | SI QUIERES MAS ESCRIBE CUALQUIER COSA");
			
			if (guarOP.equalsIgnoreCase("0")) {
				System.exit(0);
			}
			
			else {
				calcular();
			}
			}
			public static void main(String[] args) {
		        calcular();
			
		}
	
	}
