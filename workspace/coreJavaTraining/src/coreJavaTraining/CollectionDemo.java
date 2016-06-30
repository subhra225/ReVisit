package coreJavaTraining;

import java.util.ArrayList;

public class CollectionDemo {

	// Printing unique number from the list

	public static void main(String[] args) 
	{

		int a[]={4,5,5,5,4,6,6,9,4};

		//Output- 4 3 times, 5 3 times, 6 2 times, 9 1 time

		/**
		 * First prepare one empty array list and pass 4 to it.
		 * Before passing whether there is already number 4 in the array list.
		 * If not present number will be pushed. If present increase counter by 1
		 */

		ArrayList<Integer> al= new ArrayList<Integer>();



		for (int i=0;i<a.length;i++)
		{
			int k=0;

			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;

				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i] + " is present" + k + "times");
				if(k==1)
				{
					System.out.println(a[i] + " is the unique number.");
				}
			}

		}



	}

}


