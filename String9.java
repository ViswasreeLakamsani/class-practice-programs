package stringspractice;

public class String9 {

	public static void main(String[] args) {
		String name=new String("Raja Ram Mohan Roy");
		System.out.println(name);
		System.out.println("==========================="); 
		System.out.println(name.toUpperCase());
		System.out.println("================================");
		System.out.println(name.toLowerCase());
		System.out.println("======================");
		System.out.println(name.charAt(3));
		System.out.println("====================");
		System.out.println(name.indexOf('a'));
		System.out.println("===================");
		System.out.println(name.contains("Ram"));
		System.out.println("=================");
		System.out.println(name.contains("Aam"));
		System.out.println("====================");
		System.out.println(name.substring(9));
		System.out.println("===================");
		System.out.println(name.substring(9,14));
		
		



	}

}
