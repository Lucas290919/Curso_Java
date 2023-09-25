package fundamentos;

public class tipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.printf(s.concat("!!!"));
		System.out.printf(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.printf("Nome:" + nome + "\nSobrenome:" + sobrenome + "\nIdade:" + idade + "\nSalario:" + salario + "\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha %f", nome, sobrenome, idade, salario);
		
	}

}
