package pkg200108;

public class Sample02 {
	public static void main(String[] args) {
//		new ImplClass().method();

		class ImplClass implements Test01{

			@Override
			public void method() {
				System.out.println("抽象メソッドをオーバーライドしています");
			}
		}
		new ImplClass().method();
	}
}

interface Test01{
	void method();
}

/*class ImplClass implements Test01{

	@Override
	public void method() {
		System.out.println("抽象メソッドをオーバーライドしています");
	}

}*/