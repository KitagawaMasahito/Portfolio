package pkg1211;

public class Question {
	public static void main(String[] args) {
//		StudentCard st1 = new StudentCard("sk01","Tom");
//		st1.setId("SK009");
//		st1.setName("Jo");
//		System.out.println(st1.getId()+" "+st1.getName());
	}
}

//Q1
class StudentCard{
	private String id;
	private String name;
	
	StudentCard(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

//Q2
class Food{
	private String name;
	private int cal;
	
	Food(String name, int cal) {
		super();
		this.name = name;
		this.cal = cal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
}

//Q3
class Book{
	private String title;
	private String author;
	
	Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}