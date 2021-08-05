
public class triangle {

	public static void main(String[] args) {
		
		int k=1;
		//triangle syntax
		for(int i=0;i<4;i++){
			//System.out.println("outerloop is started");
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				
				k++;
			}
			System.out.println("");//giving spaces
		}
	}

}


