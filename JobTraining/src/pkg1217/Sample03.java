package pkg1217;

public class Sample03 {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	static void methodA() throws MyException{
		throw new MyException("自分で作成した例外を投げました、");
	}
}



class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}
	
}