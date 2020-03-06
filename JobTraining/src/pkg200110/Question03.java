package pkg200110;

public class Question03 {
	public static void main(String[] args) {
		IntProcessing sqrAndAdd = (int a, int b) -> {return a*a+b*b;};
		System.out.println(sqrAndAdd.calculaltion(3, 5));
	}
}

interface IntProcessing{
	int calculaltion(int a,int b);
}