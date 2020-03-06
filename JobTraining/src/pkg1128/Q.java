package pkg1128;

public class Q {
	public static void main(String[] args) {
		int x = 0;
		new MyClass(x);

	}
}

class MyClass{
	MyClass(String x){
		System.out.println("A");
	}
	MyClass(int x){
		System.out.println("B");
	}
}
