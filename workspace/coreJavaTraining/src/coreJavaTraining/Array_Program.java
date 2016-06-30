package coreJavaTraining;

public class Array_Program {
	
	/**
	 * Array is a collection of similar type of elements that have a contigious memory location.
	 * A container which stores multiple values of same data type.
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int a[]= new int[5]; // new allocates 5 integer value space into the Array "a" OR Declares an array and allocates memory for the values
		
		a[0]=2;
		a[1]=6;
		a[2]=7;
		a[3]=0;
		a[4]=34;
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//Retrieve values present in the array
		}
			

		int b[]={1,4,7,9,10}; //directly passing the values to the array, memory is dynamically allocated
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);//Retrieve values present in the array
		}

	}

}
