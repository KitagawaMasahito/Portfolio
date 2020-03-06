package pkg1121;

public class Practice3_3 {
	public static void main(String[] args) {
		int a=10;
		int b=10;

		for(int i=11;i<=20;i++) {
			a=a+i;
//			a+=i;
		}
		System.out.println(a+"(for文計算)");

		int j=11;
		while(j<=20) {
			b=b+j;
//			b+=j;
			j++;
		}
		System.out.println(b+"(while文計算)");
	}
}
