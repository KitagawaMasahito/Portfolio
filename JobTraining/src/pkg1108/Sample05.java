package pkg1108;
import java.util.Scanner;

public class Sample05 {
	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);
		System.out.print("一つ目の数字を入力して下さい：");
		int imput1 = scn1.nextInt();
		System.out.print("二つ目の数字を入力して下さい：");
		int imput2 = scn2.nextInt();
		System.out.println("["+imput1+"×"+imput2+"＝"+(imput1*imput2)+"]");
	}
}
