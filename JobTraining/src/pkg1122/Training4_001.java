package pkg1122;

public class Training4_001 {
	public static void main(String[] args) {
		methodTest(1);
		methodTest("a");
	}
	
	public static void methodTest(int a) {
		System.out.println("引数がint型のmethodTestです");
	}
	public static void methodTest(String l) {
		System.out.println("引数がString型のmethodTestです");
	}
}
