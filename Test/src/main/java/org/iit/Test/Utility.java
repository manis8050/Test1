package org.iit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.FileHandler;

public class Utility {
	


	public static String getFutureDate(int days,String pattern)
	{
		//Adding a comment
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String date=sdf.format(d);
		return date;
		
	}
}