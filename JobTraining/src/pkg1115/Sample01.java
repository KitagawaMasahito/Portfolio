package pkg1115;

public class Sample01 {
	public static void main(String[] args) {
		int a = -5;
		int abs01 = Math.abs(a);
		System.out.println(abs01);
		
		int b = 2;
		int c = 3;
		int pow01 = (int)Math.pow(b, c);
		System.out.println(pow01);
		
		int d = 9;
		int e = 15;
		int max01 = Math.max(d, e);
		System.out.println(max01);
		
		int test = (int)( Math.random()*10+1);
		System.out.println(test);
	}
}
