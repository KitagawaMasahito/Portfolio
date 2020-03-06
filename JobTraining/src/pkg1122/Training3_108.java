package pkg1122;
import java.util.Scanner;

public class Training3_108 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("一つ目の整数を入力：");
		int a = sc.nextInt();
		
		System.out.print("二つ目の整数を入力：");
		int b = sc.nextInt();
		
		System.out.println(a+"と"+b+"の最大公倍数は"+getLCM(a,b)+"です");
	}
	
	public static int getLCM(int a,int b) {
		//最大公約数計算分(最終的にnが最大公約数になる)
		int r;
		int m=a;
		int n=b;
		while((r=m%n)!=0) {
			m=n;
			n=r;
		}
		
		//ここから最小公倍数計算
		int lcm = a*b/n;
		return lcm;
	}
}