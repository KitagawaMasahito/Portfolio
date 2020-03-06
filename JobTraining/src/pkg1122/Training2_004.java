package pkg1122;

public class Training2_004 {
	public static void main(String[] args) {
		int a=4;
		int b=18;
		printLargeValue(a,b);
	}
	
	public static void printLargeValue(int x,int y) {
		System.out.println(x+"と"+y+"で大きいのは"+Math.max(x, y)+"です");
	}
}
