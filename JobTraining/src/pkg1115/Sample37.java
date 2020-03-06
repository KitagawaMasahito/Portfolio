package pkg1115;
import java.util.Scanner;

public class Sample37 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Imput Number!：");
		int a = scn.nextInt();
		int count = 0;	//割り切れたパターンをカウントする変数
		
		for(int i =a-1;i>1;i--) {
			if(a%i==0) {
				count++;	//割り切れればカウント加算
			}
		}
		
		System.out.println(count ==0 ? "素数です":"素数ではありません");
		//	countが"0"＝2～aの中で割り切れる数字がない＝素数
	}
}
