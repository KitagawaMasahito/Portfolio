package pkg1113;
import java.util.Scanner;

public class Sample24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("曜日を入力して下さい：");
		String youbi = scn.next();
		
		switch(youbi) {
		case "日":
			System.out.println("Sunday");
			break;
		case "月":
			System.out.println("Monday");
			break;
		case "火":
			System.out.println("Tuesday");
			break;
		case "水":
			System.out.println("Wednesday");
			break;
		case "木":
			System.out.println("Thursday");
			break;
		case "金":
			System.out.println("Friday");
			break;
		case "土":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("入力が不正です");
		}
	}
}
