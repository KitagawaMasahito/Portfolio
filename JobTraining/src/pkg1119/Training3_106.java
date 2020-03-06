package pkg1119;
import java.util.Scanner;

public class Training3_106 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("入力数を教えてください：");
		int n = scn.nextInt();
		
		int[] num = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+"番目の数字を入力して下さい：");
			num[i] = scn.nextInt();
		}
		int maxNum=0;
		
		for(int j=0;j<num.length-1;j++) {
			int max=Math.max(num[j], num[j+1]);
			if(maxNum<max) {
				maxNum=max;
			}
		}
		System.out.println("数列最大値＝"+maxNum);
	}
}
