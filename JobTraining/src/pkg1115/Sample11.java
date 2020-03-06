package pkg1115;

public class Sample11 {
	public static void main(String[] args) {
		String str = "あいうえお";
		int len = str.length();
		System.out.println("長さ"+len);
		
		int index = str.indexOf("う");
		System.out.println("「う」は"+(index+1)+"番目");
		
		boolean boo = str.contains("え");
		System.out.println(boo);
		
		String str2 = str.replace("う", "す");
		System.out.println(str2);
		
		char c = str.charAt(1);
		System.out.println(c);
	}
}
