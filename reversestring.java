
public class reversestring {
	
	public static void main(String args[]){
		
		String s= "MADAM";
		String t= "";
		
		for(int i = s.length()-1;i>=0;i--)
		{
			t= t+s.charAt(i);
		}
		System.out.println(t);
	
	
	   if(s.equals(t)){
		System.out.println("it is palindrome");
	   }
	   else
	   {
		
	System.out.println("it is not an palindrome");
	}

}
	}


