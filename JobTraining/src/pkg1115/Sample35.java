package pkg1115;
import java.util.Scanner;

public class Sample35 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("nを入力：");
		int n = scn.nextInt();
		int sum = 0;
		
		for(int i =1;i<=n;i++) {
			sum=sum+i;
		}
		
		System.out.println("1～"+n+"までの合計："+sum);
	}
}
