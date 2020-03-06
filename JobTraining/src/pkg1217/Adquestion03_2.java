package pkg1217;
import java.util.Scanner;

public class Adquestion03_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("IDを入力");
		String id = sc.next();
		
	}
	
	public static void checkId(String id) throws InvaidIdException{
		
	}
}

class InvaidIdException extends Exception{

	InvaidIdException(String message) {
		super(message);
	}
	
}