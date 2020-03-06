package pkg1122;
import java.util.Scanner;

public class Training2_102 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("数字を入力：");
		int a = scn.nextInt();
		
		kaijo(a);
	}
	
	public static void kaijo(int x) {
		int n = 1;
		for(int i=1;i<=x;i++) {
			n=n*i;
		}
		System.out.println(n);
	}
}
