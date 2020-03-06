package pkg200121;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample03 {
	public static void main(String[] args) {
		
		String postNumber = "123-4567";
		
		String regex = "^[0-9]{3}-?[0-9]{4}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(postNumber);
		boolean b = m.matches();
		
		System.out.println(b);
	}
}
