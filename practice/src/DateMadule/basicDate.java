package DateMadule;

import java.util.Calendar;
import java.util.Date;

public class basicDate {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(1993, 9, 10);
		
		System.out.println(cal.getTime());
	}

}
