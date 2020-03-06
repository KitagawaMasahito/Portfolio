package pkg200117;

import java.util.stream.Stream;

public class Sample01 {
	public static void main(String[] args) {
		Stream<String> strm = Stream.of("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		
		strm.map(s -> "["+s+"]").filter(s -> s.contains("s")).sorted().forEach(s -> System.out.println(s));
	}
}
