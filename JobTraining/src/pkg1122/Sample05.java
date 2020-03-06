package pkg1122;

public class Sample05 {
	public static void main(String[] args) {
		int num=5;
		String str="test";
		
		mehtodA(num);
		methodA(str);
		methodA(num,str);
		
	}

	public static void mehtodA(int num) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("引数int型1つのメソッドAです");
	}
	public static void methodA(String str) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("引数String型1つのメソッドAです");
	}

	public static void methodA(int num, String str) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("引数int型1つ、String型1つのメソッドAです");
	}


	
	
}
