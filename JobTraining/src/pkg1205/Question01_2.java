package pkg1205;

public class Question01_2 {
	public static void main(String[] args) {
		
		Person[] psn = new Person[3];
		psn[0] = new Person("サクラ");
		psn[1] = new Student("マロン");
		psn[2] = new Teacher("レン");
		
		for(Person p:psn) {
			p.work();
		}
		
		for(Person p:psn) {
			if(p instanceof Teacher) {
				((Teacher)p).manageClub();
			}
		}
	}
}

class Student extends Person{
	
	Student(String name){
		super(name);
	}
	
	public void work() {
		System.out.println(name+"は勉強します");
	}
	
	public void manageClub() {
		System.out.println(name+"は部活の顧問をします");
	}
}

class Teacher extends Person{
	
	Teacher(String name){
		super(name);
	}
	
	public void work() {
		System.out.println(name+"は授業をします");
	}
	
	public void manageClub() {
		System.out.println(name+"は部活の顧問をします");
	}
}

class Person{
	String name;
	
	Person(String name){
		this.name=name;
	}
	
	public void work() {
		System.out.println(name+"は働きます");
	}
}