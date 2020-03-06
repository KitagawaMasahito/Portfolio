package pkg200114;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AdQuestion01_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("日付を入力して下さい(表記方法:yyyy-MM-dd)");
		
		System.out.print("日付1：");
		String d1 = sc.next();
		LocalDate date1 = LocalDate.parse(d1);
		
		System.out.print("日付2：");
		String d2 = sc.next();
		LocalDate date2 = LocalDate.parse(d2);
		
		int dateBetween = (int)(ChronoUnit.DAYS.between(date2, date1));
		
		System.out.println(date2+"～"+date1+"・・・"+Math.abs(dateBetween)+"日間");
	}
}
