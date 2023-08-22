package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(18, 05, 1989);
		
		
		Data d2 = new Data();		
		d2.dia = 24;
		d2.mes = 01;
		d2.ano = 1991;
		
		Data d3 = new Data();
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}
	
}
