package interfaces;
//we can add more than one interface just using ,
public class IndianTraffic implements CentralTrafficRules,ContinentalRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IndianTraffic I=new IndianTraffic();(we will not create object for class we have to create it foe interface)
		
		CentralTrafficRules I=new IndianTraffic();
		I.gogreen();
		I.stopred();
		I.readyyellow();
		//own class invoking
		IndianTraffic it=new IndianTraffic();
		it.Newclass();
		
		//another interface
		ContinentalRules cr=new IndianTraffic();
		cr.secondinterface();
		
		
		
		
		
	}

	@Override
	public void gogreen() {
		// TODO Auto-generated method stub
		System.out.println(" gogreen implementation");
		
	}

	@Override
	public void stopred() {
		// TODO Auto-generated method stub
		System.out.println(" StopRed implementation");
		
	}

	@Override
	public void readyyellow() {
		// TODO Auto-generated method stub
		System.out.println(" flashyellow implementation");
		
	}
	// this is own class not an interface class
	public void Newclass(){
		System.out.println("new class implementaiton");
	}

	@Override
	public void secondinterface() {
		// TODO Auto-generated method stub
		System.out.println("2nd class implementaiton");
		
		
	}

}
//interface will have  methods not body like class
/*
* interface : for ex  the traffic rules is green,red, yellow followed by all country
* class:should define and implement method present in interface
* so whatever our country is we have to include the mehtod(signature present in interface)
* add unimplemented methods
* we can create more than one interface and we can simply call using ,
* we can implement some method which is not present in  the class and create a new obj and call it thorugh
*/