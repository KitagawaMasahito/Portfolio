package pkg1217;

public class Question01_2 {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (InvaidNumberException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void methodA() throws InvaidNumberException{
		throw new InvaidNumberException("無効な数字です");
	}
}

class InvaidNumberException extends Exception{

	InvaidNumberException(String message) {
		super(message);
	}
	
}
