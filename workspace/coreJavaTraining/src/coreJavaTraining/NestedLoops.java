package coreJavaTraining;

public class NestedLoops {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<=4;i++)//this block will loop for 4 times
		{
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++)//inner loop 
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}*/
		
		/*Print the following pattern:
		
		1 2 3 4
		5 6 7
		8 9
		10
		
		*/
		/*int k=1;
		for (int i=0;i<4;i++)
		{
			
			for (int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println();*/
			
	//--------------------------------------------------------------------//
			
			/*Print the following pattern:
			
			1
			2 3
			4 5 6
			7 8 9 10
						
			*/
			
		/*int k=1;
			for(int i=1;i<5;i++)
			{
				for (int j=1;j<=i;j++)
				{
					System.out.print(k);
					System.out.print(" ");
					k++;
				}
				System.out.println("\t");*/
				
				//--------------------------------------------------------------------//
				
				/*Print the following pattern:
				
				1
				1 2 
				1 2 3 
				1 2 3 4 
							
				*/
				
			//int k=1;
				/*for(int i=1;i<5;i++)
				{
					for (int j=1;j<=i;j++)
					{
						System.out.print(j);
						System.out.print(" ");
						//k++;
					}
					System.out.println("\t");*/
					
					//--------------------------------------------------------------------//
					
					/*Print the following pattern:
					
					3
					6 9
					12 15 18
								
					*/
					
				int k=3;
				int l=1;
					for(int i=1;i<4;i++)
					{
						for (int j=1;j<=i;j++) 
						{
							
							System.out.print(k*l);
							System.out.print(" ");
							l++;
						}
						System.out.println("\t");
						
							
				
				
				
			}
			
			
		
		}
		

	}


