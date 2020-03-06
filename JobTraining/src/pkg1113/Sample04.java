package pkg1113;

public class Sample04 {
	public static void main(String[] args) {
		String str1 = "横浜";
		String str2 = "川崎";
		String str3 = new String("横浜");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals("川崎"));
	}
}
