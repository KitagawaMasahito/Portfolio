package pkg1113;
import java.util.Scanner;

public class Sample23 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("何月ですか？：");
		int month = scn.nextInt();

		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"月は31日間あります");
			break;
		case 2:
			System.out.println("2月は28～29日間あります");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"月は30日間あります");
			break;
		default:
			System.out.println("入力が間違っています");
		}
	}
}
