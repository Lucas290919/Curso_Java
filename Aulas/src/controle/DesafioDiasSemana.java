package controle;

import java.util.Scanner;

public class DesafioDiasSemana {
public static void main(String[] args) {
	
	//Domingo 1
	// quarta 4
	//terça - > 3 
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Dia da semana: ");
	String diaDaSemana = entrada.next();
	 
	// Ignorecase Ignora letras minusculas ou maiusculas.
	if(diaDaSemana.equalsIgnoreCase("domingo")) {
		System.out.println("1");
	}
	if(diaDaSemana.equalsIgnoreCase("Segunda")) {
		System.out.println("2");
	}
	if(diaDaSemana.equalsIgnoreCase("Terça") || diaDaSemana.equalsIgnoreCase("Terca") ) {
		System.out.println("3");
	}
	if(diaDaSemana.equalsIgnoreCase("Quarta")) {
		System.out.println("4");
	}
	if(diaDaSemana.equalsIgnoreCase("Quinta")) {
		System.out.println("5");
	}
	if(diaDaSemana.equalsIgnoreCase("Sexta")) {
		System.out.println("6");
	}
	if(diaDaSemana.equalsIgnoreCase("Sabado") || diaDaSemana.equalsIgnoreCase("Sábado")) {
		System.out.println("7");
	}
	entrada.close();
}
}
