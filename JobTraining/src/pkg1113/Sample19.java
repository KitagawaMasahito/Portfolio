package pkg1113;
import java.util.Scanner;

public class Sample19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("気温（きおん）:");
		int temp = scn.nextInt();

		System.out.print("湿度（しつど）：");
		int moi = scn.nextInt();

		if( (temp<=25 && moi<=100) || (temp<=30 && moi<=50) ) {
			System.out.println("安全です");
		}else if( (temp<=30 && moi<=100) || (temp<=35&&moi<=50) ) {
			System.out.println("要注意です");
		}else {
			System.out.println("危険です");
		}
	}
}
