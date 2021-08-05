package inheritance;
//extends keyword for inheritance//
public class childClass extends parentClass {
	
	public void carcolor(){
		System.out.println(color);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       childClass cd=new childClass();
       cd.carcolor();
       cd.brake();
       cd.engine();
	}


}
//multiple inheritance is not possible in java
//we can acquire only one class
/*
class A
{ int i=10;
}
class B
{
	int i=20
			}
public main class(){
A a= new B();(10)
B a = new B();(20)

	
}
*/