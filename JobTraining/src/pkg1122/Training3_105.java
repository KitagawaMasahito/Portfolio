package pkg1122;

public class Training3_105 {
	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=9;
		System.out.println(getMaxValue(a,b,c));
	}
	
	public static int getMaxValue(int val1,int val2,int val3) {
		int max12=Math.max(val1, val2);
		int max13=Math.max(val1, val3);
		int maxVal=0;
		if(max12<max13) {
			maxVal=max13;
		}else {
			maxVal=max12;
		}
		return maxVal;
	}
}
