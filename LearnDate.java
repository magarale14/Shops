import java.util.Date;
//Date & Calendar

import java.text.DateFormat;
import java.text.SimpleDateFormat; //HH:MM

public class LearnDate {
	
public static void main(String[] args) {
	//Milliseconds since midnight January 1st, 1970
	
	Date d = new Date();
	System.out.println(d.getTime());
	
	Date date = new Date();
	DateFormat format = new SimpleDateFormat("HH:MM");
	System.out.println(format.format(date));

	
	
}
}
