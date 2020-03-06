package pkg200123;

import java.util.HashMap;

public class AdQuestion01 {
	public static void main(String[] args) {
		CoinCase wallet = new CoinCase();

	}
}

enum CoinType{
	COIN500(500),COIN100(100),COIN50(50),COIN10(10),COIN5(5),COIN1(1);

	private final int intCoin;

	private CoinType(int intCoin) {
		this.intCoin = intCoin;
	}

	public int getValue() {
		return intCoin;
	}
}

class CoinCase{
	HashMap<CoinType, Integer> coinNums = new HashMap<>();

	public void addCoin(CoinType type, int add) {
		coinNums.put(type, this.getNum(type)+add);
	}

	public void takeCoin(CoinType type, int take) {
		coinNums.put(type, this.getNum(type)-take);
	}

	public int getNum(CoinType type) {
		return coinNums.get(type);
	}

	public int getAmount() {
		return coinNums.get(500)+coinNums.get(100)+coinNums.get(50)+coinNums.get(10)+coinNums.get(5)+coinNums.get(1);
	}

}