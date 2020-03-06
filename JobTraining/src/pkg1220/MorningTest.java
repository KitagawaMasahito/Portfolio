package pkg1220;
import java.util.Scanner;

public class MorningTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ユーザー名？");
		String userName = sc.next();

		try {
			if(userName.equals("Admin") ||
					userName.equals("Administrator")||
					userName.equals("root") ||
					userName.equals("masahito")) {
				System.out.println("管理者としてログインします");
			}else {
				throw new UserNotFoundException("このユーザー名は登録されていません");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class UserNotFoundException extends Exception{

	UserNotFoundException(String message){
		super(message);
	}

}