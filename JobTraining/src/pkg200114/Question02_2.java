package pkg200114;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question02_2 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
//		LocalDate myBirth = LocalDate.of(1981, 9, 28);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの誕生日は？");
		System.out.print("年：");
		int birthYear = sc.nextInt();
		System.out.print("月：");
		int birthMonth = sc.nextInt();
		System.out.print("日：");
		int birthDay = sc.nextInt();		
		
		LocalDate myBirth = LocalDate.of(birthYear, birthMonth, birthDay);
		
		System.out.println("誕生日："+myBirth.getYear()+"年"
				+myBirth.getMonthValue()+"月"+myBirth.getDayOfMonth()+"日("+myBirth.getDayOfWeek()+")");
		System.out.println("　今日："+today.getYear()+"年"
				+today.getMonthValue()+"月"+today.getDayOfMonth()+"日("+today.getDayOfWeek()+")");
		
		System.out.println("あなたが生まれてから"+(int)(ChronoUnit.DAYS.between(myBirth, today)+1)+"日目です");
		
	}
}
