package pkg1122;
import java.util.Scanner;

public class Training3_106 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("数字を入力：");
		int a = scn.nextInt();
		
		boolean even = isEvenNumber(a);
		
		System.out.println(even==true ? "偶数です":"奇数です");
	}
	
	public static boolean isEvenNumber(int value) {
		boolean evn = false;
		if(value%2==0) {
			evn=true;
		}
		return evn;
	}
}
