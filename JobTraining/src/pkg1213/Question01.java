package pkg1213;

public class Question01 {
	public static void main(String[] args) {

	}
}

interface CloseShape{
	double getArea();
}

class Rectangle implements CloseShape{
	double x;
	double y;

	public double getArea() {
		double s = x*y;
		return s;
	}
}