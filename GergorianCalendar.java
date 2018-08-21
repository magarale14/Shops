
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
public class GergorianCalendar {
  public static void main(String[] args) {
      String[] ids = TimeZone.getAvailableIDs(-6 * 60 * 60 * 1000);
      SimpleTimeZone stz = new SimpleTimeZone(-6 * 60 * 60 * 1000, ids[0]);
      stz.setStartRule(Calendar.MARCH, 1, Calendar.MONDAY, 3 * 60 * 60 * 1000);
      stz.setEndRule(Calendar.NOVEMBER, -1, Calendar.SUNDAY, 3 * 60 * 60 * 1000);
      Calendar calendar = new GregorianCalendar(stz);
      Date trialTime = new Date();
      calendar.setTime(trialTime);
      System.out.println("UNDECIMBER: " + calendar.get(Calendar.UNDECIMBER));
      System.out.println("ERA: " + calendar.get(Calendar.ERA));
      System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
      System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
      System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
   }
}