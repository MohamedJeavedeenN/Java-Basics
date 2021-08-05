package FunctionOverloading;

public class functionOverriding extends fnOverloading {
	
	public void carColor(){
		System.out.println (" this class function is printed so overriden achieved");
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		functionOverriding fn=new functionOverriding();
		fn.getPaymentMethod("debit card");
		
		//the carColor method in both the classes but in this class overriden that class so overridden is achived
		//same function name or method name same parameter as well and same argument but it will run on the current class onlyy not the prevous class
		
		fn.carColor();
		

}
}
