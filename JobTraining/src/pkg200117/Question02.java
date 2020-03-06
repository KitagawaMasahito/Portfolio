package pkg200117;

import java.util.stream.Stream;

public class Question02 {
	public static void main(String[] args) {
		Stream<String> dayOfWeek = Stream.of("January","February","March","April","May","June",
				"July","August","September","October","November","December");
		
		dayOfWeek.filter(s->s.contains("ber")).sorted().forEach(s->System.out.println(s));
	}
}
