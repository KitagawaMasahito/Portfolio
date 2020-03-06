package pkg200110;

import java.util.function.Consumer;

public class AdQuestion01 {
	public static void main(String[] args) {
		Consumer<String> hello = name -> System.out.println("こんにちは！"+name+"さん");
		hello.accept("Tom");
	}
}
