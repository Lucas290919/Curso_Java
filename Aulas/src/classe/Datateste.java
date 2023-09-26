package classe;
public class Datateste {
public static void main(String[] args) {
	
	var d1 = new Data();
	d1.dia = 23;
	d1.mês = 7;
	d1.Ano = 2023;
	
	System.out.printf("%d/%d/%d\n", d1.dia, d1.mês,d1.Ano);
	
	var d2 = new Data();
	d2.dia = 10; 
	d2.mês = 10;
	d2.Ano = 11;
	System.out.printf("%d/%d/%d", d2.dia, d2.mês,d2.Ano);
	
}
}
