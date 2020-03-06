package pkg1119;
import java.util.Scanner;

public class Training2_006 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("数値を入力：");
			int n = scn.nextInt();
			
			if(n == 10) {
				break;
			}
			System.out.println(n);
		}
	}
}
