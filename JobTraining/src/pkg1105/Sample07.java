package pkg1105;

public class Sample07 {
	public static void main(String[] args) {
		int val1=4;
		int val2=5;
		int valx=val1;

		val1=val2;
		val2=valx;
		
		String shape="円";
		int diameter=10;
		double pi=3.14159265359;
		double circle=diameter/2*diameter/2*pi;
		
		System.out.println("今のval1は"+val1+"、val2は"+val2+"です");
		
		System.out.println("\n形状："+shape);
		System.out.println("直径："+diameter);
		System.out.println("円周率："+pi);
		System.out.printf("円の面積:%.2f", circle);
	}
}
