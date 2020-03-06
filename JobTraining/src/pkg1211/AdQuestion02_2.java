package pkg1211;

public class AdQuestion02_2 {
	public static void main(String[] args) {
		Bird bird1 = new Sparrow("アズキ");
		Bird bird2 = new Crow("リク");
		
		bird1.sing();
		bird2.sing();
	}
}

abstract class Bird{
	String name;
	
	Bird(String name){
		this.name=name;
	}
	
	abstract void sing() ;
}

class Sparrow extends Bird{
	
	Sparrow(String name){
		super(name);
	}
	void sing() {
		System.out.println("すずめの"+name+"は、ちゅんちゅんと鳴きます。");
	}
}

class Crow extends Bird{
	
	Crow(String name){
		super(name);
	}
	
	void sing() {
		System.out.println("カラスの"+name+"は、カーカーと鳴きます。");
	}
}