package Core_Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat s = new SimpleDateFormat();
		
		System.out.println(s.format(cal.getTime()));

	}

}
