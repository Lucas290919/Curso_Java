package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informaçoes do funcionario
		
		// tipos numéricos inteiros
		byte anosDeEmpresas = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo boleano
		//olean estaDeFerias = false; // True
		
		// tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresas * 365);
		
		// Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha -> " + salario);
		//stem.out.println("Férias? " + estaDeFerias);
		System.out.println("status: " + status);
		
	}
}
