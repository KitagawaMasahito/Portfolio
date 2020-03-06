package pkg200114;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Question03 {
	public static void main(String[] args) {
		Calendar birthday = Calendar.getInstance();
		Calendar birthAfter10mDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		birthday.set(1981, 8, 28);
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd(E)");
		System.out.println("誕生日:"+date.format(birthday.getTime()));
		
		birthAfter10mDay.set(1981, 8, 28);
		birthAfter10mDay.add(Calendar.DATE, 10000-1);
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy年MM月dd日(E曜日)");
		System.out.println("生まれてから10000日後は"+date2.format(birthAfter10mDay.getTime())+"です");
		
		today.get(Calendar.YEAR);
		today.get(Calendar.MONTH);
		today.get(Calendar.DATE);
		System.out.println("今日は"+date2.format(today.getTime())+"です");
		long diffTime = today.getTimeInMillis()-birthday.getTimeInMillis();
		int diffDayMills = 1000*60*60*24;
		int diffDays = (int)(diffTime/diffDayMills)+1;
		System.out.println("今日は生まれてから"+diffDays+"日目です");
	}
}
