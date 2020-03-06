package pkg1217;

public class Sample02 {
	public static void main(String[] args) {
		int age = -6;
		
		try {
			if(age<0) {
				throw new InvalidAgeException("年齢がマイナスです");
			}
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}

class InvalidAgeException extends Exception{

	InvalidAgeException(String message) {
		super(message);
	}
	
}