package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		// TODO Auto-generated method stub
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

}
