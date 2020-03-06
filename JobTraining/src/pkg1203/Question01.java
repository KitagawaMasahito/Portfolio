package pkg1203;

public class Question01 {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.name="稲垣";
		w1.age=40;
		w1.salary=300000;
		
		Student st1 = new Student();
		st1.name="木村";
		st1.age=20;
		st1.specialty="情報科学";
		
		w1.work();
		st1.study();
		System.out.println(st1.name+"さんの専門分野は\""+st1.specialty+"\"です");
	}
}


class Worker extends Person{
	int salary;
	public void work() {
		System.out.println(name+"さんはもりもり働きます");
	}
}

class Student extends Person{
	String specialty;
	public void study() {
		System.out.println(name+"さんはバリバリ勉強します");
	}
}

class Person{
	String name;
	int age;
	
	public void showInfo() {
		System.out.println(name+" "+age);
	}
}