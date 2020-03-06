package pkg1205;

public class Sample01 {
	public static void main(String[] args) {
		KoClass ko = new KoClass();
		KoClass2 ko2 = new KoClass2();
	}
}

class OyaClass{
	int n;
	public OyaClass() {
		n=1;
		System.out.println("親クラスのメソッドです"+n);
	}
}
class KoClass extends OyaClass{
	public KoClass() {
		System.out.println("子クラスのメソッドです"+(n+1));
	}
}
class KoClass2 extends OyaClass{
	public KoClass2() {
		System.out.println(n+3);
	}
}