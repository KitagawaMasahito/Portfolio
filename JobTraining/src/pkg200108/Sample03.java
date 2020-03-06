package pkg200108;

public class Sample03 {
	public static void main(String[] args) {
		Test newClass = new Test() {
			@Override
			public void method() {
				System.out.println("抽象メソッドをオーバーライドしています");
			}
		};
		newClass.method();
	}
}

interface Test {
	void method();
}