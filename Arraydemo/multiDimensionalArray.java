package Arraydemo;

public class multiDimensionalArray {
	/*
	 * multidimensional array
1 2 3
4 5 6

2*2matrix) x axis and y axis. viewing the array
so we have to put int a[][]=new int[3][5]
we have to give 2 bracket x and y axis



	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][2]=3;
		a[1][0]=4;
		
		a[1][1]=5;
		a[1][2]=6;
		//or we can declare like this
		//int b[][]={{1,2,3},{4,5,6}};
		
		//if i need the 2 nd row frst column value output
		//1 2 3
		//4 5 6
		System.out.println(a[1][0]);
		
		

	}

}
