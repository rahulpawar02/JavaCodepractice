package timeandcalendar;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarMain {
	public static void main(String[] args) {
		
		//Calendar is a abstract class so cannot be instantiated
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		
		System.out.println(cal.getTime());
	
		//GregorianCalendar Class being a concrete class, can be instantiated
		GregorianCalendar greCal = new GregorianCalendar();
		System.out.println("GregorianCaledar:"+ greCal.getTime());
		
		//TimeZone
		
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone);
		System.out.println(timeZone.getID());
		
		
		DF df = new DF("M/d/yy h:mm a z");
        String [][] zs = df.getDateFormatSymbols().getZoneStrings();
        for( String [] z : zs ) {
            System.out.println( Arrays.toString( z ) );
        }
	}
	
	
	  private static class DF extends SimpleDateFormat {
	        @Override
	        public DateFormatSymbols getDateFormatSymbols() {
	            return super.getDateFormatSymbols();
	        }

	        public DF(String pattern) {
	            super(pattern);
	        }
	    }
	
}


