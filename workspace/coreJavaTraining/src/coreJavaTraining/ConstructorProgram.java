package coreJavaTraining;

public class ConstructorProgram {
	
	/**
	 * Constructor is invoked by default when an object is created.
	 * Method returns values, constructor cannot have return type.
	 *Name of constructor should be same as the class name
	 * @param args
	 */
	
	public ConstructorProgram()
	{
		System.out.println("I am in the constructor");
		int a;
	}
	
	public void getData(){
		System.out.println("I am the method");
	
	}
	
	//Parameterized Constructor
   
	public ConstructorProgram(int a, int b)
	{
		System.out.println(a + b);
	}
	
	public void display(){
		
	}

	public static void main(String[] args) {
		
		ConstructorProgram cp= new ConstructorProgram(2, 3);
		// TODO Auto-generated method stub
	   
		
		
		
	}

	
}
