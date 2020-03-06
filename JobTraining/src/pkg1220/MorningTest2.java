package pkg1220;

public class MorningTest2 {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public static void methodA() throws MyException{
		throw new MyException("MyExceptionエラーです");
	}
}

class MyException extends Exception{

	MyException(String message) {
		super(message);
	}
	
}