package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Dados do funcionário
		
		// Tipos numéricoa
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario =  11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;//true
		
		//Tipo de caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de vooa
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// id
		System.out.println(id +"Ganha ->" + salario);
		System.out.println("Férias?" + estaDeFerias);
		System.out.println("Status" + status);
		
		
	}

}
