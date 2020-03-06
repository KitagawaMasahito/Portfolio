package pkg1113;

public class Sample09 {
	public static void main(String[] args) {
		int num = 9;
		num = -8;
		num = 0;
		
		if( num >0 ) {
			System.out.println("numは正の整数です");
		}else if( num < 0) {
			System.out.println("numは負の整数です");
		}else {
			System.out.println("numは0です");
		}
	}
}
