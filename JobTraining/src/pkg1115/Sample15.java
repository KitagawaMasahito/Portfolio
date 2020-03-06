package pkg1115;

public class Sample15 {
	public static void main(String[] args) {
		String str = "明日は晴れるといいですね";
		boolean boo = str.contains("晴れ");
		System.out.println(boo == true ? "晴れを含みます":"晴れを含みません");
	}
}
