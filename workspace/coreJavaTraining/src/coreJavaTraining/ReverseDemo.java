package coreJavaTraining;

public class ReverseDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s="madam";
		String t="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
			System.out.println(t.getClass().getName());
			
		}
System.out.println(t);
System.out.println(s);

      if(s.equals(t))
      {
    	  System.out.println("This is Palindrome");
      }
      else
      {
    	  System.out.println("This is not Palindrome");
      }
	}

}
