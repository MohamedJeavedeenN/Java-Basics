/* *String is a class in java and it is a prebuild class in java
	 * String decalaration -2 types:
	 * 1.By string literal
	 * String a= "Mohamed";
	 * again we cant create same value to b
	 * string b="Mohamed";
	 * 2. by creating object of string
	 * String a=new String("Mohamed");
	 * again we can create 
	 * String b=new String("Mohamed");
	 */

public class stringclassdemo {
	public static void main(String args[]){
		
		String a=" Mohamed Ziavudeen";
		 
		System.out.println(a.charAt(13));
		System.out.println(a.indexOf("n"));
		
		/**
		 * Substring
		 */
		System.out.println(a.substring(8,16));
		System.out.println(a.substring(10));
		System.out.println(a.concat( " is a cricket Player"));
		
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		
		
		 String arr[]=a.split("d");
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 
		System.out.println( a.replace("Z", "J"));
		 
		
		
	}
	
}
