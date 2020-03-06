package pkg1122;

public class Sample02 {
	public static void main(String[] args) {
		System.out.println("メソッド前");
		printMessage("hana");
		System.out.println("メソッド後");
	}
	
	public static void printMessage(String name) {
		System.out.println("こんにちは！"+name+"さん");
	}
}
