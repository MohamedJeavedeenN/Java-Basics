package Arraydemo;

public class arrayExample1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create space for a hold the value 5
		int a[]=new int[5];
		a[0]=1;
		a[1]=4;
		a[2]=5;
		a[3]=6;
		a[4]=7;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

}
}