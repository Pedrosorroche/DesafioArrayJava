package estudos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Notas notas = new Notas();
		notas.entradaNotas();
		
		Operacoes operacoes = new Operacoes();
		String msg = String.format("A média do aluno é = %.2f pontos", operacoes.media());
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
