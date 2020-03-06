package pkg1217;

public class Question02 {
	public static void main(String[] args) {
		int op1 = 6;
		int op2 = 0;
		try {
			System.out.println(op1+"÷"+op2+"="+(op1/op2));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("0除算です");
		}
	}
}
