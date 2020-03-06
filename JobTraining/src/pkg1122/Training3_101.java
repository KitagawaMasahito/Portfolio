package pkg1122;

public class Training3_101 {
	public static void main(String[] args) {
		int h=5;
		int w=7;
		int rec = getRectangleArea(h,w);
		System.out.println(h+"*"+w+"="+rec);
	}
	
	public static int getRectangleArea(int x,int y) {
		int r = x*y;
		return r;
	}
}
