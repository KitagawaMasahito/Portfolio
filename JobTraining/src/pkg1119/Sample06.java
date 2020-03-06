package pkg1119;
import java.util.Scanner;

public class Sample06 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		for(;;) {
			System.out.print("数字を入力：");
			int input = scn.nextInt();
			if(input > 10 || input < 0) {
				System.out.println("処理を終了します");
				break;
			}
			System.out.println("入力は"+input);
		}
	}
}
