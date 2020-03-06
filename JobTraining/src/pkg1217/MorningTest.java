package pkg1217;

public class MorningTest {
	public static void main(String[] args) {
		Solid[] sld = new Solid[5];

		sld[0] = new Cube("立方体","青",6);
		sld[1] = new Ball("球","白",6);
		sld[2] = new Polyhedron("正16面体","赤",16);
		sld[3] = new Ball("球","緑",10);
		sld[4] = new Polyhedron("正10面体", "紫", 10);

		for(Solid s:sld) {
			System.out.println(s.name+" "+s.color);
		}

		Computable[] com = new Computable[3];
//		com[0] = new Cube("立方体","青",6);
//		com[1] = new Ball("球","白",6);
//		com[2] = new Ball("球","緑",10);
		com[0] = (Computable)sld[0];
		com[1] = (Computable)sld[1];
		com[2] = (Computable)sld[3];

		for(Computable c:com) {
			System.out.println(c.calcVolume()+ " "+c.calcSarface());
		}
	}
}

class Cube extends Solid implements Computable{
	int length;

	Cube(String name, String color, int length) {
		super(name, color);
		this.length=length;
	}

	void draw() {
		System.out.println("立方体を描きます");
	}

	public double calcVolume() {
		return Math.pow(length, 3);
	}

	public double calcSarface() {
		return Math.pow(length, 2);
	}

}

class Ball extends Solid implements Computable{
	int length;

	Ball(String name, String color, int length) {
		super(name, color);
		this.length=length;
	}

	void draw() {
		System.out.println("球を描きます");
	}

	public double calcVolume() {
		return 4.0/3.0*Math.PI*Math.pow(length, 3);
	}

	public double calcSarface() {
		return 4.0*Math.PI*Math.pow(length, 2);
	}
}

class Polyhedron extends Solid{
	int surface;

	Polyhedron(String name, String color, int surface) {
		super(name, color);
		this.surface=surface;
	}

	void draw() {
		System.out.println("多面体を描きます");
	}
}

abstract class Solid{
	String name;
	String color;

	Solid(String name,String color){
		this.name=name;
		this.color=color;
	}

	abstract void draw();
}

interface Computable{
	double calcVolume();
	double calcSarface();
}


//以下Q1回答
interface MyInterface{
}

class NewClass implements MyInterface{
}