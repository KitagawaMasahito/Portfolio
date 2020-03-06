package pkg1211;

public class Sample03 {
	public static void main(String[] args) {
//		Shape shape1 = new Shape();
		Circle shape2 = new Circle();
		shape2.draw();
		System.out.println(shape2 instanceof Shape);
		System.out.println(shape2 instanceof Circle);
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("〇");
	}
}

abstract class Shape{
	int thickness;
	String color;
	
	abstract void draw();
}