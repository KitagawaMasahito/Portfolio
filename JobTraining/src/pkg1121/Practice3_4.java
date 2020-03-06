package pkg1121;

public class Practice3_4 {
	public static void main(String[] args) {
		int i=1;
		i=2;
		i=3;
//		i=4;
//		i=5;
		
		switch(i) {
		case 1:
			System.out.println("A");
		case 2:
			break;
		case 3:
			System.out.println("B");
		case 4:
		default:
			System.out.println("C");
		}
	}
}
