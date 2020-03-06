package pkg1217;

public class Question04 {
	public static void main(String[] args) {
		int[] opes = {0,1,2,3,6};
		try {
			int op1 = opes[(int)(Math.random()*7)];
			int op2 = opes[(int)(Math.random()*3)];
			System.out.println(op1+"÷"+op2+"="+(op1/op2));
		} catch (ArithmeticException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("算術処理が不正です");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("op1の配列インデックス指定が不正です");
		} finally {
			System.out.println("finallyブロックの出力処理です");
		}
	}
}
