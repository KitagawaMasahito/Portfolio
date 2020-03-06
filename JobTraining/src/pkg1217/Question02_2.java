package pkg1217;

public class Question02_2 {
	public static void main(String[] args) {
		try {
			testMethod();
		} catch (InvaidValueException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void testMethod() throws InvaidValueException{
		throw new InvaidValueException("無効な値です");
	}
}

class InvaidValueException extends Exception{

	InvaidValueException(String message) {
		super(message);
	}
	
}