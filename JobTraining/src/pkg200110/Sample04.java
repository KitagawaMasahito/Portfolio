package pkg200110;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<StudentCard> stlist = new ArrayList<StudentCard>();
		
		stlist.add(new StudentCard(101, "山本"));
		stlist.add(new StudentCard(103, "内村"));
		stlist.add(new StudentCard(102, "村上"));
		
		stlist.forEach(st -> st.showInfo());
		
		stlist.sort((st1,st2)->st1.id-st2.id);
		
		System.out.println();
		stlist.forEach(st -> st.showInfo());
	}
}

class StudentCard{
	int id;
	String name;
	
	StudentCard(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void showInfo() {
		System.out.println(id+" "+name);
	}
}