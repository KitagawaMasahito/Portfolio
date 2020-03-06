package pkg1113;
import java.util.Scanner;

public class Sample03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("テストは何点でしたか？：");
		int score = scn.nextInt();
//		int score = 85;
		
		if( score >= 90 ) {
			System.out.println("大変よく出来ました");
		}else if( score >= 70 ) {
			System.out.println("よく出来ました");
		}else {
			System.out.println("がんばりました");
		}
	}
}
