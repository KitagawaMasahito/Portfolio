package pkg1126;

public class Training1_102 {
	public static void main(String[] args) {
		PlayingCards card = new PlayingCards();
		
		String[] mark= {"♥","♦","♣","♠"};
		int markShuffle = (int)(Math.random()*4);
		card.mark=mark[markShuffle];
		
		int numShuffle=(int)(Math.random()*13+1);
		card.number=String.valueOf(numShuffle);
		
		System.out.println(card.mark+card.number);
	}
}

class PlayingCards{
	String mark;
	String number;
}