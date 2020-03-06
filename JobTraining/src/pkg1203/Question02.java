package pkg1203;

public class Question02 {
	public static void main(String[] args) {
		StudentCard st1 = new StudentCard("11sk01","山本");
		IStudentCard ist1 = new IStudentCard("11sk02","中村","日本");
		IStudentCard ist2 = new IStudentCard("11sk03","チャン","ベトナム");
		st1.showInfo();
		ist1.showInfo();
		ist2.showInfo();
	}
}

class IStudentCard extends StudentCard{
	String nationality;
	IStudentCard(String id,String name,String nationality){
		super(id,name);
//		this.id=id;
//		this.name=name;
		this.nationality=nationality;
	}
	
	public void showInfo() {
		System.out.println(id+" "+name+" "+nationality);
	}
}

class StudentCard{
	String id;
	String name;
	
	StudentCard(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println(id+" "+name);
	}
}