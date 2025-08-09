 import java.util.Scanner;

import javax.swing.JOptionPane;

public class JuegoAdivinar {

	public static void main(String[] args) {

		int contraseñaReal = (int)(Math.random() * 100) +1;
		//JOptionPane.showMessageDialog(null, contraseñaReal );
		JOptionPane.showMessageDialog(null, "Bienvenido al juego de adivinar numeros");

		int intentoUser = Integer.parseInt(JOptionPane.showInputDialog("Por favor introdusca un digito: "));


		int contador = 1;



		while (!(intentoUser == contraseñaReal)) {


		int pasosAlCierto = Math.abs(contraseñaReal - intentoUser) + 5;

		++contador;

			if (intentoUser > contraseñaReal) {
				JOptionPane.showMessageDialog(null, "Te pasaste, esta aproximadamente a " + pasosAlCierto + " digitos");
			}
			else if (intentoUser < contraseñaReal) {
				JOptionPane.showMessageDialog(null, "Te quedaste corto, esta aproximadamente a " + pasosAlCierto + " digitos");
			}
			intentoUser = Integer.parseInt(JOptionPane.showInputDialog("Por favor introdusca un digito: "));


			if (contador >= 10) {
				JOptionPane.showMessageDialog(null, "Te pasaste de intentos, bye");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "Acertaste en " + contador + " intentos");
				System.exit(0);
			}



		}











	}

}

