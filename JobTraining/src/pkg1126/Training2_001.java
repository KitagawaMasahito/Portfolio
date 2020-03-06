package pkg1126;

public class Training2_001 {
	public static void main(String[] args) {
		StudentCard2 student1 = new StudentCard2("T0001","高橋さとし");
		StudentCard2 student2 = new StudentCard2("T0002","菊池晶");
		System.out.println(student1.id+" "+student1.name);
		System.out.println(student2.id+" "+student2.name);
	}
}

class StudentCard2{
	String id;
	String name;
	public StudentCard2(String id,String name){
		this.id=id;
		this.name=name;
	}
}