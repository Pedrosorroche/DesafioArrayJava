package estudos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Notas {
	
static int n;
static int c;
private static double notaAluno;
	
	public void entradaNotas() {
		String numero = JOptionPane.showInputDialog("Digite quantos notas serão lançadas!");
		n = Integer.parseInt(numero);
		
		c = 0;
		while(c<n) {
			Notas.adicionarNota();
			c++;
		}
	}

	static ArrayList<Double> notasAluno = new ArrayList<>();
	
	public static void adicionarNota() {
	
		String nota = JOptionPane.showInputDialog("Digite a nota " + (c+1) + " do aluno: " );
		notaAluno = Double.parseDouble(nota);
		
		notasAluno.add(notaAluno);
	}
	
	public static ArrayList<Double> getNotas(){
		return notasAluno;
	}
}
