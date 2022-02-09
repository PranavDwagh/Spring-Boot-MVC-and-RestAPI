package study;




import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {

	public static void main(String[] args) {


		Calendar cal = Calendar.getInstance(); 
		cal.set(2022, 0, 7); 
		java.util.Date date = cal.getTime(); 
		java.sql.Date date2 =new java.sql.Date(cal.getTimeInMillis());
		
		System.out.println(date2);
		
		
		
		
		GregorianCalendar obj = new GregorianCalendar();
		obj.set(2022, 01, 31);
		
		long time = obj.getTimeInMillis();
	
		Date date1 = new Date(time);  // java util date         
		
		System.out.println(date1);  // outout--> Thu Mar 03 08:11:50 IST 2022


		java.sql.Date d = new java.sql.Date(time);

		System.out.println(d);  // java sql date-> 2022-03-03
	}
}
