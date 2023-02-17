package estudos;

public class Operacoes {

	double somaNotas, mediaNotas;
	
	public double soma() {
		
		somaNotas = 0;
		for(Double not: Notas.getNotas()) {
			somaNotas += not;
		}
		
		return somaNotas;
	}
	
	public double media() {
		
		mediaNotas = soma()/Notas.n;
		return mediaNotas;
	}
	
}
