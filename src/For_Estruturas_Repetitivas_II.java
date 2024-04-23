import java.util.Scanner;

public class For_Estruturas_Repetitivas_II {
public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<x; i++) {
			soma = soma + x;
			//soma += x;
			x = sc.nextInt();			
		}
				
		//System.out.printf("O Valor total dos números inseridos é %d", soma);
		System.out.println(soma);
		
		sc.close();
	}
}
