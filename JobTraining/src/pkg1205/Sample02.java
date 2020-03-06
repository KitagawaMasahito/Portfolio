package pkg1205;

public class Sample02 {
	public static void main(String[] args) {
		IStudentCard ist01 = new IStudentCard(1001,"Lisa","フランス");
		System.out.println("学籍番号"+ist01.id+" 名前："+ist01.name+" 国籍："+ist01.nationality);
	}
}

class StudentCard{
	int id;
	String name;
	public StudentCard(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public StudentCard() {
		this.id=9999;
		this.name="no name";
	}
}
class IStudentCard extends StudentCard{
	String nationality;
	public IStudentCard(int id, String name, String nationality) {
		super(id,name);
		this.nationality=nationality;
	}
}