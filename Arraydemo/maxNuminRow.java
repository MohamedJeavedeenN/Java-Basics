package Arraydemo;

public class maxNuminRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 3 4
		 * 5 6 0
		 * 1 9 8
		 * find the smallest number then in that colum find the largest no
		 * the output will be 8
		 * 
		 */

		int abc[][]={{2,3,4},{5,6,0},{1,9,8}};
		int min=abc[0][0];//assume that first number 2 is compared
		int mincolumn=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)//compare 2<2,3<2,4<2 until it finds small number
				{
					min=abc[i][j];
					mincolumn=j;
					
					
				}
			}
		}
		System.out.println("The smallest number in the given matrix is "+ min);
		System.out.println("The minimum number in column is "+ mincolumn);
		/*find the smallest number column and print it as j then, initalize k =0, then create for max variable and assign it to
		 *abc[0][2] then using while for single iteration then using if statement to check the max number in each iteration
		 * 
		 * 
		 */
		int k=0;
		int max=abc[0][mincolumn];
		 
		while(k<3)
		{
			if (abc[k][mincolumn]>max){
			max= abc[k][mincolumn];
			}
		k++;
	}
	System.out.println(" The max num in min column is "+ max);
		
		
	
	}
	
	}


