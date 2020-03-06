package pkg1122;
import java.util.Scanner;

public class Training1_002 {
	public static void main(String[] args) {
		printToday();
	}
	
	public static void printToday() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("年：");
		int year = scn.nextInt();
		
		System.out.print("月：");
		int month = scn.nextInt();
		
		System.out.print("日：");
		int day = scn.nextInt();
		
		System.out.println("今日は20"+year+"年"+month+"月"+day+"日");
	}
}
