package pkg1217;

public class Question05 {
	public static void main(String[] args) {
		int a =10;
		int b = 0;
		try {
			int result = div(a,b);
			System.out.println(result);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("例外が発生しました。ログを確認してください。");
		}
	}
	
	public static int div(int a, int b) {
		int result = a/b;
		return result;
	}
}
