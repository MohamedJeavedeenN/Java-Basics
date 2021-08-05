package Arraydemo;

public class minNumMatrixInterview {
	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub
		//print smallest in 3 *3 matrix
		2 3 4
		5 6 7
		1 9 8*/
		
		int abc[][]={{2,3,4},{5,6,7},{1,9,8}};
		int min=abc[0][0];//assume that first number 2 is compared
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)//compare 2<2,3<2,4<2 until it finds small number
				{
					min=abc[i][j];
					
					
				}
			}
		}
		System.out.println("The smallest number in the given matrix is "+ min);
		
	}

}
