package Fundamentos.Operadores;

import java.util.Scanner;

public class Relacionais {
	public static void main(String[] args) {

		int a = 97;
		int b = 'a';

		System.out.println(a == b);

		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);

		double nota = 9.9;
		boolean bom_comportamento = !true;
		boolean passou_por_media = nota >= 7;
		boolean tem_desconto = bom_comportamento && passou_por_media;

		System.out.println("Tem desconto\n" + tem_desconto);

		// My idea

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digit a nota de matemática do Aluno:");
		double nota_matematica = entrada.nextDouble();
		System.out.println("Digit a nota de matemática do Aluno:");
		double nota_portugues = entrada.nextDouble();
		System.out.println("Digit a nota de matemática do Aluno:");
		double nota_fisica = entrada.nextDouble();
		System.out.println("Digit a nota de matemática do Aluno:");
		double nota_quimica = entrada.nextDouble();

		double media = 7;
		boolean passou_fisica = nota_fisica >= media;
		boolean passou_quimica = nota_quimica >= media;
		boolean passou_matematica = nota_matematica >= media;
		boolean passou_portugues = nota_portugues >= media;
		System.out.println("Ele(a) passou em matemática? " + passou_matematica);
		System.out.println("Ele(a) passou em portugues? " + passou_portugues);
		System.out.println("Ele(a) passou em fisica? " + passou_fisica);
		System.out.println("Ele(a) passou em quimica? " + passou_quimica);

		entrada.close();
	}
}
