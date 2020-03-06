package pkg1128;

public class Question03 {
	public static void main(String[] args) {
		StudentCard std = new StudentCard();
		std.id="SK20";
		std.name="佐々木";
		System.out.println("学籍番号"+std.id+" "+std.name);
		std.changingName("青木");
		System.out.println("学籍番号"+std.id+" "+std.name);
	}
}
class StudentCard{
	String id;
	String name;
	
	public void changingName(String newName) {
		name=newName;
	}
}