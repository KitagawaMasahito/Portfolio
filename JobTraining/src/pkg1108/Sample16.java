package pkg1108;

public class Sample16 {
	public static void main(String[] args) {
		int a =5;
		double b = 3;
		System.out.println("a+b(そのまま):"+(a+b));

		int intB = (int)b;
		System.out.println("a+b(bキャスト済):"+(a+intB));
//		System.out.println(a+(int)b);
	}
}
