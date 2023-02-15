package estudos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite quantos notas serão lançadas!");
		int n = Integer.parseInt(numero);
		
		int c = 0;
		while(c<n) {
			Notas.adicionarNota();
			c++;
		}
	}

}
