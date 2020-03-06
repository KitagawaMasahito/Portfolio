package pkg1224;
import java.util.ArrayList;
import java.util.List;

public class Question03 {
	public static void main(String[] args) {
		List<StudentCard> students = new ArrayList<StudentCard>();

		students.add(new StudentCard("190101","相川翔"));
		students.add(new StudentCard("190102","井上貴"));
		students.add(new StudentCard("190203","内海桜"));

		System.out.println("学生数:"+(students.size())+"名");

		for(StudentCard stu:students) {
			stu.showProfile();
		}

		String deleteId = "190102";
		for(int i=0;i<students.size();i++) {
			if(students.get(i).id.equals(deleteId)) {
				students.remove(i);
			}
		}

//		students.remove(1);

		System.out.println("学生数:"+(students.size())+"名");

		for(StudentCard stu:students) {
			stu.showProfile();
		}

		for(StudentCard stu:students) {
			System.out.println(stu.id);
			System.out.println(stu.name);
		}
	}
}

class StudentCard{
	String id;
	String name;
	StudentCard(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void showProfile() {
		System.out.println(id+" "+name);
	}
}