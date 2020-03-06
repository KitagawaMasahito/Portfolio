package pkg1122;

public class Training4_002 {
	public static void main(String[] args) {
		olTest();
		olTest("a");
		olTest("a","b");
	}
	
	public static void olTest() {
		System.out.println("引数のないメソッドです");
	}
	public static void olTest(String str1) {
		System.out.println("引数が1つのメソッドです");
	}
	public static void olTest(String str1,String str2) {
		System.out.println("引数が2つのメソッドです");
	}
}
