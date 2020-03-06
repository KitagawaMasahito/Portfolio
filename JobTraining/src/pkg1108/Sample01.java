package pkg1108;
import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("何か数字を入力してください：");
		int inputNumber = sc.nextInt();	//int型変数に取り込む
		System.out.println("キーボードから入力された数値："+inputNumber);

		System.out.print("何か文字を入力してください：");
		String inputStr = sc.next();		//String型変数に取り込む
		System.out.println("キーボードから入力された文字："+inputStr);
	}
}
