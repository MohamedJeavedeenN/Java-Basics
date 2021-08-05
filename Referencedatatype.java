import java.util.Arrays;

public class Referencedatatype {
	
	public static void main(String[] args) {
		//array
		//new keyword we have to use in this
		
		/*int[] numbers=new int[5];
		//we can call by reference as object using . 
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		numbers[3]=13;
		numbers[4]=14;*/
		
		//we can assign through this way also
		//int[]numbers2={10,11,12,13,14};
		/*
		//we can assign through this way also
				int[]numbers1= new int[] {10,11,12,13,14};
		
		//we cant give like this since it s an reference data type
		//System.out.println(numbers);
		// we can reference the value by to string
		
		System.out.println(Arrays.toString(numbers1));
		//[10,11,12,13,14]
		
		System.out.println((numbers1[4]));
		*/
		/* Char Array
		 * 
		 */
		char[] a =new char[5];
		//char[] b=new char[]{'a','b','c','d','e'};
		
		//
         char[] c={'a','b','c','d','e'};
         
         //to find length of the char
         int len =c.length;
		System.out.println(c);
		System.out.println(c[3]);
		System.out.println(len);
		char c1[]=c.clone();
		System.out.println(c1);
		
		
		
		
		
		
		
		
		
	}

}
