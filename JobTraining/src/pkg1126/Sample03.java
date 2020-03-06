package pkg1126;

public class Sample03 {
	public static void main(String[] args) {
		Human2 hito = new Human2("tom",18);
//		hito.name="tom";
//		hito.age=18;
		System.out.println(hito.name+" "+hito.age);
	}
}
class Human2{
	String name;
	int age;
	Human2(String name,int age){
//		System.out.println("何か処理");
		this.name = name;
		this.age = age;
	}
}