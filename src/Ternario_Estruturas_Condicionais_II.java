
public class Ternario_Estruturas_Condicionais_II {
	
	public static void main(String[] args) {
		
		
		double preco = 50;
		double precoTotal = 100;
		double desconto = 0;
				
		if (preco < 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		//usando a notação ternária
		
		double descontoTernario = (precoTotal < 20.0) ? precoTotal * 0.1 : precoTotal * 0.05;
		
		System.out.printf("O valor do desconto é R$ %.2f. %n", desconto);
		System.out.printf("O valor do desconto é R$ %.2f. %n -->", descontoTernario);
	}

}
