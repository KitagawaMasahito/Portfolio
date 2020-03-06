package pkg1122;
import java.util.Scanner;

public class Training2_101 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("繰り返し回数を入力して下さい：");
		int roop = scn.nextInt();
		
		roopMessage(roop);
	}
	
	public static void roopMessage(int x) {
		for(int i=0;i<x;i++) {
			System.out.println("Hello");
		}
	}
}
