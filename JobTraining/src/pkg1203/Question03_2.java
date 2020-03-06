package pkg1203;

public class Question03_2 {
	public static void main(String[] args) {
		Polygon shape1 = new Polygon();
		Circle shape2 = new Circle();
		Square shape3 = new Square();
		Triangle shape4 = new Triangle();

		System.out.println("――――Polygonクラスのdrewメソッド―――――");
		shape1.drew();

		System.out.println("――――Circleクラスのdrewメソッド―――――");
		shape2.drew();

		System.out.println("――――Squareクラスのdrewメソッド―――――");
		shape3.drew();

		System.out.println("――――Triangleクラスのdrewメソッド―――――");
		shape4.drew();
	}
}

class Shape{
	String lineColor;
	int lineDiameter;

	public void drew() {
		System.out.println("図を描きます！");
	}
}

class Polygon extends Shape{

	@Override
	public void drew() {
		super.drew();
		System.out.println("☆");
	}

}

class Circle extends Shape{

	@Override
	public void drew() {
		super.drew();
		System.out.println("〇");
	}

}

class Square extends Polygon{

	@Override
	public void drew() {
		super.drew();
		System.out.println("□");
	}

}

class Triangle extends Polygon{

	@Override
	public void drew() {
		super.drew();
		System.out.println("△");
	}

}