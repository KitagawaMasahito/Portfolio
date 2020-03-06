package pkg1113;
import java.util.Scanner;

public class Sample20 {
	public static void main(String[] args) {
//		int num = 4;
		Scanner scn = new Scanner(System.in);
		System.out.print("いかがでしたか？　");
		int num =scn.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("とても不満");
				break;
			case 2:
				System.out.println("少し不満");
				break;
			case 3:
				System.out.println("どちらとも言えない");
				break;
			case 4:
				System.out.println("少し満足");
				break;
			case 5:
				System.out.println("とても満足");
				break;
			default:
				System.out.println("入力が不正です");
		}
	}
}
