package pkg1115;
import java.util.Scanner;

public class Sample10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("整数を入力して下さい:");
		int a = scn.nextInt();

		System.out.print("もう一つ整数を入力して下さい:");
		int b = scn.nextInt();

		int pow = (int)Math.pow(a, b);
		System.out.println(a+"の"+b+"乗＝"+pow);
	}
}
