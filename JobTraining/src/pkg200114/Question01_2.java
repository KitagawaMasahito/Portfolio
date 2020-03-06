package pkg200114;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Question01_2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate xDay = LocalDate.of(2020, 7, 24);
		LocalDate xDay2 = LocalDate.parse("2020-08-25");
		
		System.out.println("今日:"+now.getYear()+"年"+now.getMonthValue()+"月"+now.getDayOfMonth()+"日 "
				+"オリンピック開会式："+xDay.getYear()+"年"+xDay.getMonthValue()+"月"+xDay.getDayOfMonth()+"日 "
				+"パラリンピック開会式："+xDay2.getYear()+"年"+xDay2.getMonthValue()+"月"+xDay2.getDayOfMonth()+"日 ");
		
		int toXDay = (int)(ChronoUnit.DAYS.between(now, xDay));
		int toXDay2 = (int)(ChronoUnit.DAYS.between(now, xDay2));
		
		System.out.println("オリンピックまであと"+toXDay+"日 パラリンピックまであと"+toXDay2+"日");
	}
}
