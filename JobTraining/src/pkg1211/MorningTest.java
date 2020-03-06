package pkg1211;

public class MorningTest {
	public static void main(String[] args) {
		WorkingPerson person1 = new WorkingPerson("Ai");
		WorkingPerson person2 = new Programmer("Mai");
		WorkingPerson person3 = new SystemEngineer("Mie");
		
		person1.work();
		person2.work();
		person3.work();
	}
}


class Programmer extends WorkingPerson{
	
	Programmer(String name){
		super(name);
	}
	public void work() {
		System.out.println(name+"はプログラミングをします");
	}
}

class SystemEngineer extends WorkingPerson{
	
	SystemEngineer(String name){
		super(name);
	}
	
	public void work() {
		System.out.println(name+"はシステム設計をします");
	}
}

class WorkingPerson{
	
	String name;
	
	WorkingPerson(){
		super();
	}
	
	WorkingPerson(String name){
		this.name=name;
	}
	
	public void work(){
		System.out.println(name+"は働きます");
	}
}