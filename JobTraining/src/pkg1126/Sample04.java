package pkg1126;

public class Sample04 {
	public static void main(String[] args) {
		StudentCards st1 = new StudentCards();
		StudentCards st2 = new StudentCards("sk0001","山根");
		
		System.out.println(st1.id+" "+st1.name);
		System.out.println(st2.id+" "+st2.name);
	}
}

class StudentCards{
	String id;
	String name;
	public StudentCards() {
		System.out.println("引数なしのコンストラクタです");
	}
	
	public StudentCards(String id,String name) {
		System.out.println("引数２つのコンストラクタです");
		this.id=id;
		this.name=name;
	}
}