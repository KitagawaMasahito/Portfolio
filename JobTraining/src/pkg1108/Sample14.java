package pkg1108;

public class Sample14 {
	public static void main(String[] args) {
		byte byteNum = 4;
		short shortNum = byteNum;
		int intNum = shortNum;
		long longNum = intNum;
		float floatNum = longNum;
		double doubleNum = floatNum;
		System.out.println("byte:"+byteNum);
		System.out.println("short:"+shortNum);
		System.out.println("int:"+intNum);
		System.out.println("long:"+longNum);
		System.out.println("float:"+floatNum);
		System.out.println("double:"+doubleNum);
	}
}
