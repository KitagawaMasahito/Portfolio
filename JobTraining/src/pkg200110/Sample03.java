package pkg200110;

public class Sample03 {
	public static void main(String[] args) {
		DoSomething addNum = (int a,int b)->{System.out.println("合計："+(a+b));};
		addNum.dosome(5, 6);
	}
}

interface DoSomething{
	void dosome(int a ,int b);
}