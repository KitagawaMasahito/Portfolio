package pkg200110;

import java.util.function.Function;

public class Sample02 {
	public static void main(String[] args) {
//		AddFigure number = (int num) -> {return num+100;};
//		System.out.println(number.add(19));
		Function<Integer, Integer> number = (Integer num) -> {return num+100;};
		System.out.println(number.apply(19));
	}
}

//interface AddFigure{
//	int add(int num);
//}