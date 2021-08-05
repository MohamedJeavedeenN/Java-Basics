package Arraydemo;

public class bubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={9,1,11,2,5};
		int temp;
		
		
		for (int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
				
			{
				if(a[i]>a[j]){
					
				//swap
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		}
		//gettig the  values as in order
		
        for(int i=0;i<5;i++)
        {
        	System.out.println(a[i]);
        	
        }
	}

}
/*/ TODO Auto-generated method stub
     int a[]= {2,6,1,4,9};
     int temp;
     
// 1,2,3,4,6, 9
     
     for(int i=0;i<5;i++)
     {
    for(int j=i+1;j<5;j++)
    {
    if(a[i] > a[j])
    {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
   
    }
    }
     }
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}

 * 
 */
