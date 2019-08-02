package mm.assignment.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	
	public static String getTwoYearsBackDate(){
		String twoYearsBackDate ="";
		 Calendar now = Calendar.getInstance();
		    now.add(Calendar.YEAR,-2);
		    twoYearsBackDate = now.get(Calendar.DATE) + "-" + (now.get(Calendar.MONTH) + 1)   + "-"  + now.get(Calendar.YEAR);
          
		 return twoYearsBackDate;
	}
	
	public static boolean compareDate(Date registerDate) throws ParseException {
		boolean isTwoYearsOld = false;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        Date twoYearsBackDate = sdf.parse(getTwoYearsBackDate());
	      
	        if (registerDate.compareTo(twoYearsBackDate) <= 0) {
	        	isTwoYearsOld = true;
	            System.out.println("registerDate is  before or equal twoYearsBackDate");
	        } 
	        
	        return isTwoYearsOld;
	     
	}
	public static Date convertStringToDate(String strDate) throws ParseException {
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");  
		Date date =formatter.parse(strDate);
		return date;
		
		
	}

}
