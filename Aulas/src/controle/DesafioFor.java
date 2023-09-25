package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versao do Desafio
		//Nao pode usar valor numérico para controolar o laço!
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
	}
	
}
