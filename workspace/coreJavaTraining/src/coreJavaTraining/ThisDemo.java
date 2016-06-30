package coreJavaTraining;

public class ThisDemo {
	
	/**
	 * Let's assume we are using a= 2 across the class, bu in the getData method we need the valus
	 * to change to a=3. In the same method we want to display the value as 2 also.
	 */
	
	
	int a=2;
	
	public void getData()
	{
		int a=3;
		
		//Q. I am declaring a global variable and a local variable, find sum of local variable and global variable?
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.a + a);
		
	}
 // "this" refers to current object - object scope lies in the class level

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td=new ThisDemo();
		
		td.getData();

	}

}
