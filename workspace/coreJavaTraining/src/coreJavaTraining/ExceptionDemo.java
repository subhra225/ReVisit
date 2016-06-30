package coreJavaTraining;

public class ExceptionDemo {
	
	int a=4;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo ed= new ExceptionDemo();
	
		
		System.out.println(ed.a);
		
		
		// 3 lines of code
		
		//try catch mechanism
		
		int b=7;
		
		int c=0;
		
		/**
		 * Try catch real time example, if purchase fails then the failure message is taken to catch block
		 * and custom message is shown to the user
		 * Another example- Automation for christmas popup offer, which stops after 25th, so after 25th,
		 * the error of element not found will be caught in the catch block
		 * 
		 * One try can be followed by multiple catch blocks
		 * try block should be always followed by catch block.
		 * 
		 * Exceptions- Arithmetic Exception- 7/0
		 *             Index Out of bounds exception- trying to retrieve an index in the array which is not yet defined
		 *             
		 */
		
		try{
					
				try{
				
				int arr[]=new int[5];
				
				System.out.println(arr[7]);
					
				}
				catch(IndexOutOfBoundsException iob){
					System.out.println("I catched index bound exception");
				}
				
				int d= b/c;
				System.out.println(d);
					
				
				
				
			
			
			}
		
		   catch(ArithmeticException et){
			   System.out.println("Exception Handled");
		   }
		
			
			
			catch(Exception e){System.out.println(e); 
			/*Exception (above)- This is parent class and accepts all kind of exceptions, it's a generic one*/
			System.out.println("next line of code");}
		
		finally
		
		/**
		 * Q Tell me one way where finally block will not be executed
		 * Will not execute if JVM is stopped forcefully
		 */
		{
			/**
			 * This block is executed irrespective of exception thrown or not
			  Example, browser.quit in the finally block , even if script fails after that the browser will close.
			**/
			
			 
			System.out.println("delete cookies");
		}
		

	}

}
