package coreJavaTraining;

public class MDAMinimumNumber {
	/*
	 * 2 4 5 
	 * 3 4 7 
	 * 0 2 9
	 * 
	 * 
	 */
	int a[][]={{2,4,5},{3,4,7},{0,2,9}};
	int max=a[0][0];
	int min=a[0][0];
	public void FindingMaximumNumber()
	{


		

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}				
		}

		System.out.println(max);

	}
	
	public void FindingMinimumNumber()
	{
		

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
					min=a[i][j];
			}				
		}

		System.out.println(min);

	}
	
	public void FindingMaximumNumberInColumnOfMinimumNumberRow()
	{
		int minColumnNumber=0;
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				minColumnNumber=j;
				}
				
			}
			
			
		}
		System.out.println(min);
		int k = 0;
		int max=a[0][minColumnNumber];
		while(k<3)
		{
			if(a[k][minColumnNumber]>max){
			max=a[k][minColumnNumber];
			}
			k++;
			
		}
		
		System.out.println(max);

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		MDAMinimumNumber obj=new MDAMinimumNumber();
		
		//obj.FindingMaximumNumber();
		//obj.FindingMinimumNumber();
		obj.FindingMaximumNumberInColumnOfMinimumNumberRow();
		
	}
}





