
public class nestedloop {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			System.out.println("outerloop is started");
			for(int j=1;j<=4;j++)
			{
				System.out.println("innerloopstarted");	
			}
			System.out.println("outerloop is finished");
		}
		//triangle syntax
		for(int i=0;i<4;i++){
			System.out.println("outerloop is started");
			for(int j=1;j<=4-i;j++)
			{
				System.out.println(j);	
			}
			System.out.println("outerloop is finished");
		}
	}

}
