package pkg1113;
import java.util.Scanner;

public class Sample17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("身長[cm]を入力して下さい：");
		int tall = scn.nextInt();
		
		System.out.print("年齢を入力して下さい：");
		int age = scn.nextInt();
		
		if( tall >= 120 && age >= 12 ) {
			System.out.println("アトラクションに乗れます");
		}else {
			System.out.println("アトラクションに乗れません");
		}
	}
}
