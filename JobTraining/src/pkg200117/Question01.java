package pkg200117;

import java.util.stream.Stream;

public class Question01 {
	public static void main(String[] args) {
		Stream<String> dayOfWeek = Stream.of("Sun","Mon","Tues","Wednes","Thurs","Fri","Satur");
		
		dayOfWeek.map(s -> s+"day").filter(s->s.contains("u")).sorted().forEach(s->System.out.println(s));
	}
}
