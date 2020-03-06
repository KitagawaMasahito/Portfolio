package pkg1119;

public class Q {
	public static void main(String[] args) {
		//Q1()の中にあてはまるメソッドを答えてください。
		String  str = "Morning";
		//（ 変数strの文字数を戻り値とするメソッド);
		int len  = str.length();
		System.out.println("Q1:" + len);

		//Q2String型の変数 str2がある。このstrの文字列内に"java"という文字列が
		//含まれるかどうかを確認するメソッドを書いてください。
		String str2 = "Study java";
		System.out.println(str2.contains("java"));


		//Q3サイコロを表現するために、変数 sai に1~6までのランダムな数字が入るようにしたい。
		//以下のカッコの中にあてはまる記述をしてください。
		int sai = (int) ( Math.random()*6 +1);
		System.out.println("Q3:" + sai);

		//Q4引数として変数a,bの二つを渡すと、大きいほうが戻り値として戻ってくるメソッドを
		//（）の中に記述してください。
		int a = 6;
		int b = 8;
		int max = Math.max(a, b);
		//( 引数2つで大きいほうが戻り地として戻ってくる );
		System.out.println("Q4:" + max);

		//Q5 おはようと3回繰り返して出力（改行あり）する記述を書いてください。（その部分だけでOKです）
		System.out.println("----------------Q5----------------");
		for(int i = 0; i < 3; i++ ) {
			System.out.println("おはよう");
		}

		System.out.println("----------------Q6----------------");
		//0～9までを順番に出力する記述を書いてください。（その部分だけでOKです）
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(i);
		}
	}
}
