package pkg200114;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Question03_2 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate rFirst = LocalDate.of(2020, 5, 1);
		
		System.out.println("令和の始まりの日:"
				+rFirst.getYear()+"年"
				+rFirst.getMonthValue()+"月"
				+rFirst.getDayOfMonth()+"日("
				+rFirst.getDayOfWeek()+")");
		
		System.out.println("　　　　　　今日:"
				+today.getYear()+"年"
				+today.getMonthValue()+"月"
				+today.getDayOfMonth()+"日("
				+today.getDayOfWeek()+")");
		
		System.out.println("元号が「令和」にかわって"+((int)(ChronoUnit.DAYS.between(today, rFirst)))+"日たちました");
	}
}
