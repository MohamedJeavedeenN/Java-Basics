

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		 a=3;
		 b=5;
		 sum= a+b;
         System.out.println(sum);
         System.out.println("Sum is " + sum);
         
         
         //class invoke
         Methods m= new Methods();
         //m.validateHeader();
         //want to print some return type
         System.out.println(m.validateHeader());
         
	}

}
