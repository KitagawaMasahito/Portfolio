package pkg1108;

public class Sample07 {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		int c = 5;
		int add = a+b;		System.out.println("足し算："+add);
		int sub = a-b;		System.out.println("引き算："+sub);
		int mul = a*b;		System.out.println("掛け算："+mul);
		int div = a/b;		System.out.println("割り算："+div);
		int sur = a%b;		System.out.println("余り："+sur);
		int sur2 = a%c;		System.out.println("余り2："+sur2);
		a++;				System.out.println("aのインクリメント："+a);
		b--;				System.out.println("bのデクリメント："+b);

		int sub2 = a-b;		System.out.println("\n引き算2："+sub2);
	}
}
