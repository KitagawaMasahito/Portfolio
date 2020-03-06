package pkg1227;
import java.util.HashMap;
import java.util.Map;

public class Question03 {
	public static void main(String[] args) {
		
		Map<String, Human> members = new HashMap<>();
		
		members.put("yse001", new Human("相川",19,"男"));
		members.put("yse002", new Human("浅井",21,"女"));
		members.put("yse003", new Human("雨宮",25,"女"));
		members.put("yse004", new Human("阿波野",20,"男"));
		
		for(Map.Entry<String, Human> mem:members.entrySet()) {
			System.out.println(mem.getKey()+" "+mem.getValue().name+" "+mem.getValue().age+" "+mem.getValue().sex);
//			System.out.print(mem.getKey()+" ");
//			mem.getValue().showProfile();
		}
		
		members.get("yse002").showProfile();
		
		members.remove("yse002");
		
		System.out.println("学生数："+members.size()+"名");
		
		for(Map.Entry<String, Human> mem:members.entrySet()) {
			System.out.print(mem.getKey()+" ");
			mem.getValue().showProfile();
		}
	}
}

class Human{
	String name;
	Integer age;
	String sex;
	
	Human(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void showProfile() {
		System.out.println("名前；"+name+" 年齢："+age+" 性別："+sex);
	}
}
