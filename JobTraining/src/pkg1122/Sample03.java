package pkg1122;

public class Sample03 {
	public static void main(String[] args) {
		int value1=5;
		int value2=7;
		System.out.println("メソッド前");
		printAddResult(value1,value2);
		System.out.println("メソッド後");
	}
	
	public static void printAddResult(int x,int y) {
		System.out.println("結果："+(x+y));
	}
}
