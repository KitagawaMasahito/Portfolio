package pkg1203;

public class MorningTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog("チャチャ","チワワ",2);
		Dog dog2 = new Dog("ムギ","秋田犬",5);
		dog1.showProfile();
		dog2.showProfile();
		dog1.grow(2);
		dog2.grow(2);
		dog1.showProfile();
		dog2.showProfile();
	}
}
class Dog{
	String name;
	String kind;
	int age;
	
	public Dog(String name,String kind,int age) {
		this.name=name;
		this.kind=kind;
		this.age=age;
	}
	
	public void showProfile() {
		System.out.println(name+" "+kind+" "+age);
	}
	
	public void grow(int year) {
		age+=year;
	}
}