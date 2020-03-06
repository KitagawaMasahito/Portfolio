package pkg1211;

public class MorningTestQ1 {
	public static void main(String[] args) {
		Super sub = new Sub();
	}
}

class Super{
	Super(){
		System.out.print("Oyaクラスのコンストラクタ 呼び出し（実行）");
	}
}

class Sub extends Super{
	Sub(){
		System.out.print("Subクラスのコンストラクタ 呼び出し（実行）");
	}
}