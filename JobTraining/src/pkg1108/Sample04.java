package pkg1108;
import java.util.Scanner;

public class Sample04 {
	public static void main(String[] args) {
		Scanner scnStr = new Scanner(System.in);
		System.out.print("任意の文字を入力してください：");
		String imputStr = scnStr.next();
		System.out.println("["+imputStr+"]");
	}
}
