package pkg200114;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Sample03 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.println("本日："+year+"年"+month+"月"+day+"日");
		
		LocalDate firstDayOfNextYear = LocalDate.of(2021, 1, 1);
		System.out.println("来年 お正月:"+firstDayOfNextYear);
		LocalDate lastDayOfThisYear = LocalDate.parse("2020-12-31");
		System.out.println("今年 大晦日:"+lastDayOfThisYear);
		
		System.out.println("今日から10日後は"+today.plusDays(10));
		
		LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("今月の月初め:"+firstDayOfMonth);
		
		int days =(int)(ChronoUnit.DAYS.between(today, firstDayOfNextYear));
		System.out.println("もう"+days+"回寝るとお正月");
	}
}
