package pkg1113;
import java.util.Scanner;

public class Sample16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("ガス使用量[㎥]を入力して下さい：");
		int gasUse = scn.nextInt();
		
		if( gasUse < 20 ) {
			int gasMoney = 745+172*gasUse;
			System.out.println("料金は"+gasMoney+"円です");
		}else {
			int gasMoney = 745+157*gasUse;
			System.out.println("料金は"+gasMoney+"円です");
		}
	}
}
