package pkg1108;
import java.util.Scanner;

public class Sample06 {
	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		
		System.out.print("1つ目の文字を入力して下さい：");
		String str1 = scn1.next();
		
		System.out.print("2つ目の文字を入力して下さい：");
		String str2 = scn1.next();
		
		System.out.println("["+str1+str2+"]");
	}
}
