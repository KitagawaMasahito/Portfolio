package pkg200108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question01 {
	public static void main(String[] args) {
		List<Members> members = new ArrayList<Members>();
		members.add(new Members(1001, "トム", 11));
		members.add(new Members(1003, "フク", 7));
		members.add(new Members(1007, "ミィ", 5));
		members.add(new Members(1002, "マメ", 1));
		members.add(new Members(1005, "ジジ", 4));
		
		outputInfo(members);
		
		Collections.sort(members);
		
		System.out.println("---------ソート後---------");
		outputInfo(members);
	}
	
	public static void outputInfo(List<Members> members) {
		for(Members m:members) {
			System.out.println("["+m.id+","+m.name+","+m.birthMonth+"月生]");
		}
	}
}

class Members implements Comparable<Members>{
	int id;
	String name;
	int birthMonth;
	
	Members(int id, String name, int birthMonth) {
		this.id = id;
		this.name = name;
		this.birthMonth = birthMonth;
	}

	@Override
	public int compareTo(Members member) {
//		return this.id-member.id;
		return this.name.compareTo(member.name);
//		return this.birthMonth-member.birthMonth;
	}
	
}