package pkg1122;

public class Training3_104 {
	public static void main(String[] args) {
		int a=5;
		int b=4;
		boolean same = isSameAbsoluteValue(a,b);

		System.out.println(same==true ? "絶対値が等しいです":"絶対値が等しくありません");
	}

	public static boolean isSameAbsoluteValue(int i, int j) {
		boolean sameAbs=false;
		if(Math.abs(i)==Math.abs(j)) {
			sameAbs=true;
		}
		return sameAbs;
	}
}
