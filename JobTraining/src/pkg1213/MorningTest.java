package pkg1213;

public class MorningTest {
	public static void main(String[] args) {
		Tool[] tool = new Tool[8];
		
		tool[0] = new Hummer();
		tool[1] = new Saw();
		tool[2] = new Screwdriver();
		tool[3] = new File();
		tool[4] = new Hummer("スレッジハンマー");
		tool[5] = new Saw("チェーンソー");
		tool[6] = new Screwdriver("電動ドライバー");
		tool[7] = new File("グラインダー");
		
		for(Tool tl :tool) {
			tl.use();
		}
	}
}

abstract class Tool{
	String name;
	
	Tool(){}
	Tool(String name){
		this.name=name;
	}
	
	abstract void use() ;
}

class Hummer extends Tool{
	Hummer(){
		name="金槌";
	}
	Hummer(String name){
		super(name);
	}
	
	void use() {
		System.out.println(name+"で釘をたたいて打ち込みます");
	}
}

class Saw extends Tool{
	Saw() {
		name="鋸";
	}
	Saw(String name) {
		super(name);
	}

	void use() {
		System.out.println(name+"で木を切ります");
	}
}

class Screwdriver extends Tool{
	Screwdriver() {
		name="ドライバー";
	}
	Screwdriver(String name) {
		super(name);
	}

	void use() {
		System.out.println(name+"でネジを回します");
	}
}

class File extends Tool{
	File(){
		name="鑢";
	}
	File(String name){
		super(name);
	}
	
	void use() {
		System.out.println(name+"で木を削ります");
	}
}