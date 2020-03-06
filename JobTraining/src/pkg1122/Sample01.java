package pkg1122;

public class Sample01 {
	public static void main(String[] args) {
		
		System.out.println("呼び出し前");
		
		printHello();
		
		System.out.println("呼び出し後");
	}
	
	public static void printHello() {
		System.out.println("Hello!");
	}
}
