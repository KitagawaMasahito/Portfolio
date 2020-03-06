package pkg1128;

public class Question01 {
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.name = "わさび";
		pet1.type = "猫";
		pet1.sleep();
	}
}
class Pet{
	String name;
	String type;
	public void sleep() {
		System.out.println(name+"はすやすや眠る");
	}
}