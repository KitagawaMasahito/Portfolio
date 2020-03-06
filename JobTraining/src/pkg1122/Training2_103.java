package pkg1122;
import java.util.Scanner;

public class Training2_103 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("整数x：");
		int x=scn.nextInt();
		
		System.out.print("整数y：");
		int y=scn.nextInt();
		
		calAdd(x,y);
		calSub(x,y);
		calMulti(x,y);
		calDiv(x,y);
	}
	
	public static void outResult(int m,int n,String q,int r) {
		System.out.println(m+q+n+"="+r);
	}
	
	public static void calAdd(int a,int b) {
		int result=a+b;
		outResult(a,b,"+",result);
	}
	
	public static void calSub(int a,int b) {
		int result=a-b;
		outResult(a,b,"-",result);
	}
	
	public static void calMulti(int a, int b) {
		int result=a*b;
		outResult(a,b,"×",result);
	}
	
	public static void calDiv(int a, int b) {
		int result=a/b;
		outResult(a,b,"÷",result);
	}
}
