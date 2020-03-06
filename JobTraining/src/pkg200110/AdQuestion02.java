package pkg200110;

import java.util.function.Function;

public class AdQuestion02 {
	public static void main(String[] args) {
		Function<String, String> call = name ->{return name+"さん";};
		System.out.println(call.apply("Taro"));
	}
}
