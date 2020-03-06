package pkg1113;
import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("今何時？：");
		int time = scn.nextInt();
//		int time = 12;
		
		if( time < 12 ) {
			System.out.println("午前");
		}else {
			System.out.println("午後");
		}
	}
}
