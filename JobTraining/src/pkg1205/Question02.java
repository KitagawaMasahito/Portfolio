package pkg1205;

public class Question02 {
	public static void main(String[] args) {
		
		StudentList[] student = new StudentList[3];
		
		student[0] = new StudentList("チャチャ","神奈川県横浜市","Sk11","優");
		student[1] = new StudentList("コテツ","東京都町田市","Sk12","良");
		student[2] = new StudentList("クロ","神奈川県川崎市","Sk13","良");
		
		for(StudentList stl:student) {
			stl.printInfo();
		}
	}
}

class StudentList extends List{
	String id;
	String record;
	
	StudentList(String name,String address,String id,String record){
		super(name,address);
		this.id=id;
		this.record=record;
	}
	
	public void printInfo(){
		System.out.print("学籍番号："+id+" ");
		super.printInfo();
		System.out.println(" 成績："+record);
	}
}

class StaffList extends List{
	String id;
	String subject;
	
	StaffList(String name,String address,String id,String subject){
		super(name,address);
		this.id=id;
		this.subject=subject;
	}
}

class AlumniList extends List{
	String placeOfWork;
	
	AlumniList(String name,String address,String placeOfWork){
		super(name,address);
		this.placeOfWork=placeOfWork;
	}
}

class List{
	String name;
	String address;
	
	List(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	public void printInfo() {
		System.out.print("名前："+name+" 住所："+address);
	}
}
