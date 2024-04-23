
public class Strings {
	
	public static void main(String[] args ) {
		
		String vegetables = "potato apple lemon strawberry";
		
		String[] vector = vegetables.split(" ");
		
		System.out.println(vector[0]);
		System.out.println(vector[2]);
		System.out.println(vector[3]);
		System.out.println(vector[1]);
		System.out.printf("%n%n");
		
		
		String original = "Lorem ipsum dolor sit amet,; consectetur adipiscing elit. Fusce....        ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("a", "YYY");
		int i = original.indexOf("amet");
		int j = original.lastIndexOf("or");
		
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03 + "<-->");
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s07);
		System.out.println(i);
		System.out.println(j);
		
	}

}
