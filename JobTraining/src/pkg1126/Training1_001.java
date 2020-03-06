package pkg1126;

public class Training1_001 {
	public static void main(String[] args) {
		
		StudentCard student1 = new StudentCard();
		student1.number = "sk0001";
		student1.name = "佐藤 蓮";
		
		StudentCard student2 = new StudentCard();
		student2.number = "sk0002";
		student2.name = "鈴木 結月";
		
		System.out.println(student1.number+" "+student1.name);
		System.out.println(student2.number+" "+student2.name);
	}
}

class StudentCard{
	String number;
	String name;
}
