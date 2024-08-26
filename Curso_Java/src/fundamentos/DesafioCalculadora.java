package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// ler num1
		// ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		
		double soma1 = num1 + num2;
		double sub1 = num1 - num2;
		double mult1 = num1 * num2;
		double div1 = num1 / num2;
		double mod1 = num1 % num2;
		
		System.out.println("Informe a operação(simbolo): ");
		String operacao = entrada.next();
		String soma2 = "+";
		String sub2 = "-";
		String mult2 = "*";
		String div2 = "/";
		String mod2 = "%";
		
		Double resultado_soma = operacao.equals(soma2) ? soma1 : 0;
		Double resultado_sub = operacao.equals(sub2) ? sub1 : resultado_soma;
		Double resultado_mult = operacao.equals(mult2) ? mult1 : resultado_sub;
		Double resultado_div = operacao.equals(div2) ? div1 : resultado_mult;
		Double resultado_mod = operacao.equals(mod2) ? mod1 : resultado_div;

		System.out.printf("O resultado é: %.2f",resultado_mod);
		
 		entrada.close();
	}

}
