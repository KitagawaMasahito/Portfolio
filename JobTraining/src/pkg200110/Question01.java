package pkg200110;

public class Question01 {
	public static void main(String[] args) {
		SayHello konnichiwa = () -> {
			System.out.println("こんにちは");
		};
		konnichiwa.hello();
	}
}

interface SayHello{
	void hello();
}