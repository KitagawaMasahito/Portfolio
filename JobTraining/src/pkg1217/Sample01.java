package pkg1217;
import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int input = sc.nextInt();
			System.out.println("入力値は"+input);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("catchブロック内のprintlnメソッドが実行されました");
		}finally {
			System.out.println("finallyブロック内のprintlnメソッドが実行されました");
		}
		
		System.out.println("try～catchの外です");
	}
}
