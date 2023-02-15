package estudos;

import javax.swing.JOptionPane;

public class DesafioArray {

	public static void main(String[] args) {
		
		
		String numero = JOptionPane.showInputDialog("Digite quantos números terá seu Array!");
		int n = Integer.parseInt(numero);
		
		double[]notas = new double[n];
		
		for ( int i = 0; i<n; i++ ) {
			int index = i+1;
			String nota = JOptionPane.showInputDialog("Digite a nota " + index);
			double notaAluno = Double.parseDouble(nota);
			notas[i] = notaAluno;
		}
		
		double somaNotas = 0;
		
		for (double notaAluno : notas) {
			somaNotas = somaNotas + notaAluno;
		}

		double media = somaNotas/n;
		
		String msg = String.format("A média do aluno é = %.2f", media);
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
