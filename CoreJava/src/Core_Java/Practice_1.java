package Core_Java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice_1 {

	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		
		System.out.println(s.format(d));
		//System.out.println(d.toString());

	}

}
