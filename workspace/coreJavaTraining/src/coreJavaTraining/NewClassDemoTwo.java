package coreJavaTraining;

public class NewClassDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String: it is one of the pre-built class in java
		
				/*How many ways you can define a string?
				 1. String Literal
				 2. by creating object of String*/
				
				String a =" java/training"; //String literal defining
				
				//System.out.println(a.charAt(0));
				/*System.out.println(a.indexOf("a"));
				System.out.println(a.substring(2,6));
				System.out.println(a.substring(2));
				System.out.println(a.concat("online"));
				System.out.println(a.length());*/
				System.out.println(a);
				
				System.out.println(a.trim());
				a.toUpperCase();
				a.toLowerCase();
				//split
				String arr[]=a.split("t");
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(a.replace("t", "s"));
				
				
	}

}
