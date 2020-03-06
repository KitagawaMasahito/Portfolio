package pkg1119;

public class Training1_101 {
	public static void main(String[] args) {
		int saifu = 100;
		int dagasi = 5;
		System.out.println("財布の中身は"+saifu+"円です");
		while(saifu > 0) {
			dagasi=(int)(Math.random()*5+1)*10;
			saifu = saifu - dagasi;
			if(saifu >= 0) {
				System.out.println(dagasi+"円の駄菓子を買いました。残りは"+saifu+"円です");
			}else {
				saifu += dagasi;	//財布の中身＜代金の時、買わずに「代金を返金」
			}
		}
	}
}
