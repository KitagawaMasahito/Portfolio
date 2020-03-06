package pkg1205;

public class Sample03 {
	public static void main(String[] args) {
		StudentCard2 ist1 = new StudentCard2();
		StudentCard2 ist2 = new InternationalStudentCard();
		System.out.println(ist1 instanceof StudentCard2);
		System.out.println(ist1 instanceof InternationalStudentCard);
		System.out.println(ist2 instanceof StudentCard2);
		System.out.println(ist2 instanceof InternationalStudentCard);
	}
}

class InternationalStudentCard extends StudentCard2{
	String nationality;
}

class StudentCard2{
	String id;
	String name;
}