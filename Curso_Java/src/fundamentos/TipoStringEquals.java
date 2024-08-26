package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {

		System.out.println("2" == "2");
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.nextLine(); // Next delete spaces, but nextLine no
		System.out.println("2" == s2.trim());// trim delete spaces on the code
		System.out.println("2".equals(s2.trim()));

		entrada.close();
	}
}
