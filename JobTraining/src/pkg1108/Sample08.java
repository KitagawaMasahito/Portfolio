package pkg1108;

public class Sample08 {
	public static void main(String[] args) {
		int a = 8;
		int b = 0;
		b = a++;
		System.out.println("a:"+a+" b:"+b);
		
		a = 8;
		b = 0;
		b = ++a;
		System.out.println("a:"+a+" b:"+b);
	}
}
