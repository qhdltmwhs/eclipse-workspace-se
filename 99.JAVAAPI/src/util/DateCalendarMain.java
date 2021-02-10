package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class DateCalendarMain {

	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		String nowStr = now.toString();
		System.out.println(nowStr);
		String nowlocaleStr = now.toLocaleString();
		System.out.println(nowlocaleStr);
		
		System.out.println("-------------------------시간저장형식--------------------------");
		long currentTimeMilliSecond = now.getTime();
		/*
		 * the number of milliseconds since January 1, 1970, 00:00:00 GMTrepresented by this date.
		 */
		System.out.println(currentTimeMilliSecond);
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
		System.out.println("---------------SimpleDateFormat[Date ---> String]---------------");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		sdf1.applyPattern("yyyy년 MM월 dd일");
		String formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS");
		formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(now);
		System.out.println(yearStr);
		System.out.println(Integer.parseInt(yearStr));
		
		System.out.println("---------------SimpleDateFormat[String --->Date]---------------");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBrithDay = sdf2.parse("1983-07-23");
		System.out.println(myBrithDay);
		sdf2.applyLocalizedPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBrithDay = sdf2.parse("2000/03/04 12:23:33");
		System.out.println(yourBrithDay);
		System.out.println("##################### Calendar ##################################");
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getCalendarType());
		long currentMillis3 = c1.getTimeInMillis();
		System.out.println(currentMillis3);
		int year = c1.get(Calendar.YEAR);
		int month= c1.get(Calendar.MONTH) + 1;
		int day= c1.get(Calendar.DAY_OF_MONTH);
		int hour= c1.get(Calendar.HOUR);
		int minute= c1.get(Calendar.MINUTE);
		int sec= c1.get(Calendar.SECOND);
		int msec= c1.get(Calendar.MILLISECOND);
		System.out.println(year + "/" + month + "/" + day + "/" + hour + ":" + minute + ":" + sec + "." + msec);
		
		Calendar c2 = Calendar.getInstance();
		c2.clear();
		c2.set(Calendar.YEAR, 2019);
		c2.set(Calendar.MONTH, Calendar.JANUARY);
		c2.set(Calendar.DAY_OF_MONTH, 31);
		c2.set(Calendar.HOUR, 11);
		c2.set(Calendar.MINUTE, 30);
		c2.set(Calendar.SECOND, 59);
		c2.set(Calendar.MILLISECOND, 999);
		
		System.out.println("--------------- Date <<---->> Calendar ---------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date1 = sdf.parse("2020/05/05 11:30");
		Calendar cal1 = Calendar.getInstance();
		cal1.setTimeInMillis(date1.getTime());
		Date date2 = new Date(cal1.getTimeInMillis());
		
		System.out.println("--------------- ---------------");
		Calendar c3 = Calendar.getInstance();
		c3.clear();
		c3.set(2019, 5, 21);
		
		Calendar c4 = Calendar.getInstance();
		c4.clear();
		c4.set(2019, 5, 20);
		
		Calendar c5 = Calendar.getInstance();
		c5.clear();
		c5.set(2020, Calendar.JANUARY, 9, 11, 13, 20);
		
		int result = c3.compareTo(c4);
		System.out.println("c3.compareTo(c4)---> " + result);
		result = c3.compareTo(c5);
		System.out.println("c3.compareTo(c5)---> " + result);
		result = c5.compareTo(c3);
		System.out.println("c5.compareTo(c3)---> " + result);
		boolean sameDate = c3.equals(c4);
		System.out.println("c3.equals(c4)---> " + sameDate);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date3 = sdf3.parse("2020-03-01 10:40:23");
		Calendar cal3 = Calendar.getInstance();
		cal3.clear();
		cal3.setTimeInMillis(date3.getTime());
		System.out.println("원날짜 : " + sdf3.format(cal3.getTime()));
		cal3.add(Calendar.DATE, 5);
		System.out.println("5일후 : " + sdf3.format(cal3.getTime()));
		cal3.add(Calendar.DATE, -10);
		System.out.println("10일전 : " + sdf3.format(cal3.getTime()));
		cal3.add(Calendar.YEAR, 1);
		System.out.println("1년후 : " + sdf3.format(cal3.getTime()));
		cal3.add(Calendar.MONTH, 6);
		System.out.println("6개월후 : " + sdf3.format(cal3.getTime()));
		cal3.add(Calendar.HOUR, -3);
		System.out.println("3시간전 : " + sdf3.format(cal3.getTime()));
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("took " + duration + " ms");
		
		
		
	}	

}
