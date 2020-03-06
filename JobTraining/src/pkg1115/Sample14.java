package pkg1115;

public class Sample14 {
	public static void main(String[] args) {
		String str = "一期一会";
		int index = str.indexOf("二");
		System.out.println(index == -1 ? "ありません":(index+1)+"番目です");
	}
}
