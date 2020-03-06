package pkg200110;

public class Sample01 {
	public static void main(String[] args) {
		Greeting hello = () -> {System.out.println("こんにちは");};
		hello.hello();
	}
}

interface Greeting{
	void hello();
}