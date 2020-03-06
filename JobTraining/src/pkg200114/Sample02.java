package pkg200114;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sample02 {
	public static void main(String[] args) {
		LocalDateTime todayAndTime = LocalDateTime.now();
		System.out.println("LocalDateTimeクラス:"+todayAndTime);
		
		LocalDate today = LocalDate.now();
		System.out.println("LocalDateクラス:"+today);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println("LocalTimeクラス:"+nowTime);
	}
}
