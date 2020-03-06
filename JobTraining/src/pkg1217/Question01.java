package pkg1217;

public class Question01 {
	public static void main(String[] args) {
	String[] strs = {"春","夏","秋","冬"};
		try {
			System.out.println(strs[4]);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("範囲外例外です");
		}
	}
}
