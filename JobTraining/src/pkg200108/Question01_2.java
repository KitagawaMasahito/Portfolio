package pkg200108;

public class Question01_2 {
	public static void main(String[] args) {
		SayHello aisatsu = new SayHello() {
			@Override
			public void hello() {
				System.out.println("こんにちは");
			}
		};
		aisatsu.hello();
	}
}

interface SayHello{
	void hello();
}
