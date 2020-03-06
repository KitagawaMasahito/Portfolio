package pkg200117;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MorningTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("過去の日付を入力(書式：yyyy-MM-dd)：");
		String input = sc.next();
		
		LocalDate nowDate = LocalDate.now();
		LocalDate inputDate = LocalDate.parse(input);
		
		int days = (int)(ChronoUnit.DAYS.between(inputDate, nowDate))+1;
		
		if(days<1) {
			System.out.println("今日までの日付を入力してください");
		}else {
			System.out.println("今日まで"+days+"日間です");
		}
	}
}
