package ch4.coreAPIs;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringManipulation {

	public static void main(String[] args) {
		
		//
		String country = "Morocco";
		/*  ------  charAt(int index) ------*/
		System.out.println("**** public char charAt(int index)  ****");
		System.out.println(country.charAt(0));//M
		System.out.println(country.charAt(2));//r
		//System.out.println(country.charAt(-1));//Exception StringIndexOutOfBoundsException
		//System.out.println(country.charAt(7));//Exception StringIndexOutOfBoundsException
		
		/*  ------  indexOf(int ch) ------*/
		System.out.println("**** public int indexOf(String str, int fromIndex)  ****");
		System.out.println(country.indexOf('o')); //1
		System.out.println(country.indexOf('p')); // -1
		System.out.println(country.indexOf('o',4)); //6
		
		/*  ------  substring(int beginIndex) ------*/
		System.out.println("**** public String substring(int beginIndex)  ****");
		System.out.println(country.substring(0));
		System.out.println(country.substring(2,3));
		
		/*  ------  strip() -- stripLeading() -- stripTrailing() ------*/
		String city = " CASABLANCA \t";
		System.out.println(city+" | "+city.length());// CASABLANCA 	 | 13
		System.out.println(city.strip()+" | "+city.strip().length());//CASABLANCA | 10
		System.out.println(city.stripLeading()+" | "+city.stripLeading().length());//CASABLANCA 	 | 12
		System.out.println(city.stripTrailing()+" | "+city.stripTrailing().length());// CASABLANCA | 11
		
		/*  ------  boolean startsWith(String prefix) -- endsWith(String suffix) -- contains(CharSequence charSeq) ------*/
		String customer = "El houcine";
		System.out.println("**** public boolean startsWith(String prefix)  ****");
		System.out.println(customer.startsWith("El") + " | "+ customer.startsWith("el")); //true | false
		System.out.println(customer.endsWith("ine")+" | "+ customer.endsWith("ne ")); //true | false
		System.out.println(customer.contains("ouci")+" | "+customer.contains("avc"));//true | false
		
		/*  ------  indent() -- stripIdent() ------*/
		String student = ""
				+ "kdfj"
						+ "kdjf";
	    System.out.println("|"+student.indent(1)+"|");
	    System.out.println("|"+student.stripIndent()+"|");
	    /*  ------  isEmpty() -- isBlank() ------*/
	    System.out.println("**** public boolean isEmpty()  ****"); 
	    String word1= "", word2="  ";
	    System.out.println(word1.isEmpty()+" | "+word1.isBlank());
	    System.out.println(word2.isEmpty()+" | "+word2.isBlank());
	    /*  ------  format() -- formatted() ------*/
	    System.out.println("**** public static String format(String format, Object args...)  ****");
	    String name="El houcine";
	    int orderId = 14;
	    System.out.println(String.format("Hello %s, Order %d is ready :)",name,orderId));//Hello El houcine, Order 14 is ready :)
	    System.out.println(String.format("Hello %s:%nOrder %d is ready :)",name,orderId));//Hello El houcine:
	                                                                                      //Order 14 is ready :)
	    System.out.println("Hello %s, Order %d is ready :)".formatted(name,orderId));
	    double pi = 3.14159265359;
	    System.out.println(String.format("[%f]", pi));//[3,141593]
	    System.out.println(String.format("[%05.2f]", pi));//[03,14]
	    System.out.println(String.format("[%12.5f]", pi));//[     3,14159]	    
	    System.out.println(String.format("[%2.4f]", pi));//[3,1416]
	}

}
