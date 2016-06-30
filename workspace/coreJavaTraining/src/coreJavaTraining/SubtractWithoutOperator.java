package coreJavaTraining;

public class SubtractWithoutOperator {
	static int a=20;
	static int b=10;
	
	/*public static int subtract(int a, int b) {
        if(b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            
        }
		return b;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubtractWithoutOperator swo=new SubtractWithoutOperator();
		
		//System.out.println(swo.subtract(20, 10));
		
	int borrow= (~a) & (~b);
	
	System.out.println(borrow);
		
		
	

	}

}
