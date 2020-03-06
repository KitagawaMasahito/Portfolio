package pkg1113;
import java.util.Scanner;

public class Sample25 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("西暦を入力して下さい：");
		int year = scn.nextInt();
		int eto = year % 12;
		
		switch(eto) {
		case 0:
			System.out.println("申");
			break;
		case 1:
			System.out.println("酉");
			break;
		case 2:
			System.out.println("戌");
			break;
		case 3:
			System.out.println("亥");
			break;
		case 4:
			System.out.println("子");
			break;
		case 5:
			System.out.println("丑");
			break;
		case 6:
			System.out.println("寅");
			break;
		case 7:
			System.out.println("卯");
			break;
		case 8:
			System.out.println("辰");
			break;
		case 9:
			System.out.println("巳");
			break;
		case 10:
			System.out.println("午");
			break;
		case 11:
			System.out.println("未");
			break;
		}
	}
}
