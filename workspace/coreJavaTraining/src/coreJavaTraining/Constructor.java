package coreJavaTraining;

import java.util.Scanner;

public class Constructor {
	
	Constructor(int i, String x)
	{
		
		
		int id=i;
		
		String roll=x;
		
		//System.out.println(id + x);
		
	}
	
	public static int main (int a){
		
		System.out.println("Value is " + a);
		
		return 20;
		
	}
	


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Constructor c1=new Constructor(10,"444");
		
		System.out.println(main(10));
		
		//System.out.println();
		
		
	Scanner sr=new Scanner(System.in);
	
	int value=sr.nextInt();
		
		assert value>=18:"Not greater";
		
		 System.out.println("value is "+value);  	

	}

}
