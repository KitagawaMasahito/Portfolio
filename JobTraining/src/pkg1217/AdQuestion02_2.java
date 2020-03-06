package pkg1217;
import java.util.Scanner;

public class AdQuestion02_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("パスワードを入力：");
		String pass = sc.next();
		
		try {
			checkPassword(pass);
		} catch (TooShortPasswordException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void checkPassword(String str) throws TooShortPasswordException{
		if(str.length()>=8) {
			System.out.println("パスワードを登録しました！");
		}else {
			throw new TooShortPasswordException("パスワードが短すぎます");
		}
	}
}

class TooShortPasswordException extends Exception{

	TooShortPasswordException(String message) {
		super(message);
	}
	
}