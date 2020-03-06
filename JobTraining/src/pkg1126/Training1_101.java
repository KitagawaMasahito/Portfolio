package pkg1126;

public class Training1_101 {
	public static void main(String[] args) {
		
		Channel[] kanagawa = new Channel[8];
		
		kanagawa[0]=new Channel();
		kanagawa[0].number="1";
		kanagawa[0].name="NHK総合";
		
		kanagawa[1]=new Channel();
		kanagawa[1].number="2";
		kanagawa[1].name="NHKEテレ";
		
		kanagawa[2]=new Channel();
		kanagawa[2].number="3";
		kanagawa[2].name="テレビ神奈川";
		
		kanagawa[3]=new Channel();
		kanagawa[3].number="4";
		kanagawa[3].name="日本テレビ";
		
		kanagawa[4]=new Channel();
		kanagawa[4].number="5";
		kanagawa[4].name="テレビ朝日";
		
		kanagawa[5]=new Channel();
		kanagawa[5].number="6";
		kanagawa[5].name="TBS";
		
		kanagawa[6]=new Channel();
		kanagawa[6].number="7";
		kanagawa[6].name="テレビ東京";
		
		kanagawa[7]=new Channel();
		kanagawa[7].number="8";
		kanagawa[7].name="フジテレビ";

		for(int i=0;i<kanagawa.length;i++) {
			System.out.println(kanagawa[i].number+" "+kanagawa[i].name);
		}
	}
}

class Channel{
	String number;
	String name;
	
}