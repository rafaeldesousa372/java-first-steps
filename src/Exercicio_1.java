import java.util.Locale;

public class Exercicio_1 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5291;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		double measurePrice = 71.2346784567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %s", age, code, gender);	
		System.out.printf("%n%n Measue with eight decimal places: %.8f", measure);
		System.out.printf("%n Rouded (three decimal places): %.3f", measurePrice);
		Locale.setDefault(Locale.US);
		System.out.printf("%n%nUS decimal point: %.3f", measurePrice);
		
		
		}
	

}