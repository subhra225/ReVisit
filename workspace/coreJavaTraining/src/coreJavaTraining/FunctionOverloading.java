package coreJavaTraining;

public class FunctionOverloading {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, String b)
	{
		System.out.println(a + b);
	}

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		
		FunctionOverloading fv=new FunctionOverloading();
		
		fv.getData(10, "Test");
		fv.getData(10);

	}

}
