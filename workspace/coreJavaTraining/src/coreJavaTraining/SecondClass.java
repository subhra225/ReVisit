package coreJavaTraining;

public class SecondClass {
	public int setData()
	{
		System.out.println("I am in second class method");
		return 23;
	}
	
	public int setData2()
	{
		System.out.println("I am in second class method");
		return 23;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	 SecondClass sc= new SecondClass();
	//SecondClass sc1= new SecondClass();
	 System.out.println(sc.setData());

	}

}
