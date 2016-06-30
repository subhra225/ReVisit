package coreJavaTraining;

public class Firstclass {
	
	int a=5;
	
	//Methods
	public void getData()
	
	{
		System.out.println("I am in method");
		//return"hello";
		
	}
	//objects are instances/references of a class

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firstclass fn=new Firstclass();
		SecondClass sn=new SecondClass();
		sn.setData();
		fn.getData();
		System.out.println(fn.a);
		
		//System.out.print(a);
		
		System.out.println("hi");
		System.out.print("hello world");
		//test

	}

}
