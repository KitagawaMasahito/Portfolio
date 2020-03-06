package pkg1126;

public class Sample01 {
	public static void main(String[] args) {
		
		Human hito1 = new Human();
		hito1.name = "田中";
		hito1.age = 16;
		
		Human hito2 = new Human();
		hito2.name = "鈴木";
		hito2.age = 18;
		
		System.out.println("名前:"+hito1.name+" 年齢:"+hito1.age);
		System.out.println("名前:"+hito2.name+" 年齢:"+hito2.age);
	}
}
	
class Human{
	String name;
	int age;
}
