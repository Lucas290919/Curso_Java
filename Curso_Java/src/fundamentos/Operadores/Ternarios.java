package Fundamentos.Operadores;

public class Ternarios {
	public static void main(String[] args) {

		double media = 8.6;
		String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "REPROVADO";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;

		System.out.println("O aluno está: " + resultado);
	}
}
