package pkg1108;
import java.util.Scanner;

public class Sample03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数を入力してください：");
		int imputNum = scn.nextInt();
		System.out.println("入力された数を2乗すると"+(imputNum*imputNum)+"です");
	}
}
