package fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 9.9;
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "De Recuperacao";
		//String resultadoParcial = 
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 6;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "não";
		
		System.out.println("Tem desconto?" + resultado);
		
	}

}
