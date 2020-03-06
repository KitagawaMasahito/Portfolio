package pkg1108;
import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("任意の小数を入力してください：");
		double inputNumber = scn.nextDouble();
		System.out.println("入力された小数は"+inputNumber+"です");
	}
}
