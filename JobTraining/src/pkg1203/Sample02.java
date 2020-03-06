package pkg1203;

public class Sample02 {
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		sup.methodA();
		SubClass sub = new SubClass();
		sub.methodA();
	}
}

class SuperClass{
	public void methodA() {
		System.out.println("スーパークラス内のメソッドです");
	}
}

class SubClass extends SuperClass{
	public void methodA() {
		super.methodA();
		System.out.println("サブクラス内のメソッドです");
	}
}