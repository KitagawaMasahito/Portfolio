package pkg1126;

public class Training2_004 {
	public static void main(String[] args) {
		Humans human01 = new Humans("田中太郎",24);
		Humans human02 = new Humans();
		
		System.out.println(human01.name+"("+human01.age+")");
		System.out.println(human02.name+"("+human02.age+")");
	}
}
class Humans{
	String name;
	int age;
	public Humans() {
		name="未設定";
		age=-1;
	}
	public Humans(String name,int age){
		this.name=name;
		this.age=age;
	}
}