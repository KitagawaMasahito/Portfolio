package pkg1122;

public class Training3_102 {
	public static void main(String[] args) {
		double b=5.6;
		double h=6.2;
		double triArea=getTriangleArea(b,h);
		System.out.println(triArea);
	}
	
	public static double getTriangleArea(double height,double base) {
		double area = base*height/2;
		return area;
	}
}
