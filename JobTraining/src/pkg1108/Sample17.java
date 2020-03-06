package pkg1108;

public class Sample17 {
	public static void main(String[] args) {
		int a =9;
		double b =4;
		System.out.println("a/b(そのまま):"+(a/b));
		
		int intB = (int)b;
		System.out.println("a/b(bキャスト済):"+(a/intB));
	}
}
