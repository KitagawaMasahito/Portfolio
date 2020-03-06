package pkg1213;

public class Sample01 {
	public static void main(String[] args) {
		IncludeMethodB instance01 = new ClassA();
		instance01.methodB();
		System.out.println(instance01.strs);
	}
}

interface IncludeMethodB{
	void methodB();
	String strs="インターフェース";
}

class ClassA implements IncludeMethodB{
	public void methodB() {
		System.out.println("クラスAに実装した、メソッドBが実行されました");
	}
}