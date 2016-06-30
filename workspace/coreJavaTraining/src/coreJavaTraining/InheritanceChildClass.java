package coreJavaTraining;

public class InheritanceChildClass extends InheritanceParentClass 
{
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void color(){
		System.out.println(color);
	}
	
	/* Function Overriding- inheriting method from parent class and changing the implementation in the child class know as methodOverridin
	 * 
	 * 
	 */
	public void brakes()
	{
		System.out.println("brake code is implememts"); 
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InheritanceChildClass cc=new InheritanceChildClass();
		
		cc.color();
		cc.brakes();
		
		cc.audioSystem();
		

	}

}
