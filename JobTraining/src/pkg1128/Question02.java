package pkg1128;

public class Question02 {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.material = "木";
		box1.content = "小さなメダル";
		box1.open();
	}
}
class Box{
	String material;
	String content;
	
	public void open() {
		System.out.println(material+"でできた箱を開けると"+content+"が入っていた");
	}
}