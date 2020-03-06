package pkg200123;


public class Sample01 {
	public static void main(String[] args) {
		Human h1 = new Human("モモ", 7, Gender.MALE);
		h1.showInfo();
	}
}

enum Gender{
	MALE("男性"), FEMALE("女性"),OTHER("その他");
	private final String jpGender;
	
	private Gender(String jpGender) {
		this.jpGender=jpGender;
	}
	
	public String getValue() {
		return this.jpGender;
	}
}

class Human{
	String name;
	int age;
	Gender gender;
	
	public Human(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void showInfo() {
		System.out.println("名前："+name+" 年齢："+age+" 性別："+gender.getValue());
	}
}