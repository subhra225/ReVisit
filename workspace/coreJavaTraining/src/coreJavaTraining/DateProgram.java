package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		/**
		 * This class demonstrates the date functions in java
		 */
		
		Date d=new Date();
		System.out.println(d.toString());
		
		/**
		 * mm/dd/yyyy format or HH:MM:SS format
		 */
		//SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(d));
		

	}

}
