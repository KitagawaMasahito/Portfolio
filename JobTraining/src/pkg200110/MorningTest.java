package pkg200110;

public class MorningTest {
	public static void main(String[] args) {
		AddSomething AddBrackets = new AddSomething() {
			public String add(String str) {
				String strBrk = "【"+str+"】";
				return strBrk;
			}
		};
		
		System.out.println(AddBrackets.add("ABCDE"));
	}
}

interface AddSomething{
	String add(String str);
}