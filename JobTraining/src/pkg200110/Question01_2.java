package pkg200110;

import java.util.ArrayList;
import java.util.List;

public class Question01_2 {
	public static void main(String[] args) {
		List<Human> persons = new ArrayList<Human>();
		
		persons.add(new Human("Mike", 39, 1500000));
		persons.add(new Human("Tom ", 25, 400000));
		persons.add(new Human("Lisa", 30, 2000000));
		persons.add(new Human("Ken ", 50, 3500000));
		
		persons.forEach(p->p.showInfo());
		
//		persons.sort((p1,p2)->p1.age-p2.age);
//		persons.sort((p1,p2)->p1.deposit-p2.deposit);
		persons.sort((p1,p2)->p1.name.compareTo(p2.name));
		
		System.out.println();
		persons.forEach(p->p.showInfo());
	}
}

class Human{
	String name;
	int age;
	int deposit;
	
	Human(String name, int age, int deposit) {
		this.name = name;
		this.age = age;
		this.deposit = deposit;
	}
	
	public void showInfo() {
		System.out.println(name+" age:"+age+" Dep:\\"+deposit);
	}
}