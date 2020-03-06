package pkg200114;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Question04_2 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("今日："+today);
		System.out.println("月初："+firstDayOfMonth+"("+firstDayOfMonth.getDayOfWeek()+")");
		System.out.println("月末："+lastDayOfMonth+"("+lastDayOfMonth.getDayOfWeek()+")");
	}
}
