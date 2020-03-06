package pkg1113;
import java.util.Scanner;

public class Sample13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数を入力してください：");
		int num = scn.nextInt();
		
		if( num % 2 == 0) {
			System.out.println("入力値は偶数です");
		}else {
			System.out.println("入力値は奇数です");
		}
	}
}
