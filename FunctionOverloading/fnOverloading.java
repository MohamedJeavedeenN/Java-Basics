package FunctionOverloading;
/*fn overloading
/either argument count should be differnt or /argument data type should be different
same method name with differnet arguments
 public void getData(int a){
}
 public void getData(int a, int b)//same method changed in argument{
}
*/
public class fnOverloading {
	
	public void getPaymentMethod(int a , String b){
		System.out.println(a);
		System.out.println(b);
		
	}
	public void getPaymentMethod(String a){
	
		System.out.println(a);
	}
	public void getPaymentMethod(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	
	//overriding code
	public void carColor(){
		System.out.println("color is blue");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fnOverloading fn=new fnOverloading();
		fn.getPaymentMethod(1,"debit card is accepted");
		fn.getPaymentMethod("credit card is accepted");
		fn.getPaymentMethod(2, 5);

}
}