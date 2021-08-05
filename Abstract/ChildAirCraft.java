package Abstract;
//using extends keyword to inherit from parentclass then unimplemented methods to be followed
public class ChildAirCraft extends  ParentAirCraft{

	@Override
	public void BodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Blue color ");
		
	}
	public static void main(String[] args){
		ChildAirCraft c=new ChildAirCraft();
		//we can use the properites by the parent class by creating objectss to in it, also but we cant seperately create a object and calll it it will through a error
		c.SafetyGuidelines();
		c.EngineGuidelines();
		c.BodyColor();
		//we can't create the objects for parents class also. ex 
	    //ParentAirCraft p=new ParentAirCraft();(cannot instantiate the class)
		//in parentclass anyof the methods are private we cant access 
		//public protected only applicable
		//partial abstraction is only achieved.100% abstraction achieved in interface
		
	}
	

	
}
