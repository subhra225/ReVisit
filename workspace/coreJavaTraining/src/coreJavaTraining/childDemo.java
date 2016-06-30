package coreJavaTraining;

public class childDemo extends parentDemo {
	
	
	public childDemo(){  //constructor
		super();      // super constructor, this should always be at the first line
		
		System.out.println("child class constructor");
		  
	}
	
	String name= "childDemo";
	
	public void getStringData(){
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData(){
		super.getData();
		System.out.println("I am in cild class");
	}

	public static void main(String[] args) 
	{
		childDemo cd=new childDemo();
		
		cd.getStringData();
		cd.getData();
	}

}
