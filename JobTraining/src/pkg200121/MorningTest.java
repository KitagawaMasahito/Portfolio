package pkg200121;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MorningTest {
	public static void main(String[] args) {
		//Q2-1
		List<Item> itemList = new ArrayList<Item>();

		//Q2-2
		itemList.add(new Item("鉛筆　　", "エンピツ", 50));
		itemList.add(new Item("消しゴム", "ケシゴム", 70));
		itemList.add(new Item("クレヨン", "クレヨン", 500));
		itemList.add(new Item("下敷き　", "シタジキ", 100));
		itemList.add(new Item("定規　　", "ジョウギ", 80));
		itemList.add(new Item("はさみ　", "ハサミ　", 200));
		itemList.add(new Item("のり　　", "ノリ　　", 150));

		//Q2-3
		for(Item i:itemList) {
			i.showInfo();
		}

		//Q2-4
		System.out.println("-----100円以上のものを抽出-----");
		Stream<Item> itemPrice100 = itemList.stream();
		itemPrice100.filter(i -> i.price>=100).forEach(i -> i.showInfo());

		//Q2-5
		System.out.println("-----名前（カナ）で並び替え-----");
		Stream<Item> itemKanaSort = itemList.stream();
		itemKanaSort.sorted((i1,i2) -> i1.nameKana.compareTo(i2.nameKana)).forEach(i -> i.showInfo());

		//Q2-6
		System.out.println("-----価格の高い順に並び替え-----");
		Stream<Item> itemPriceSort = itemList.stream();
		itemPriceSort.sorted((i1,i2) -> i2.price-i1.price).forEach(i -> i.showInfo());

		//Q3-1
		itemList.sort((i1,i2)->i1.nameKana.compareTo(i2.nameKana));

		//Q3-2
		Path path = Paths.get("C:\\Users\\1911sk08\\Desktop\\files\\itemList200121.txt");
		try {
			System.out.println("itemList出力中・・・");
			BufferedWriter bw = Files.newBufferedWriter(path,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			PrintWriter pw = new PrintWriter(bw);
			for(int i=1;i<=itemList.size();i++) {
				pw.println(i+":"+itemList.get(i-1).name+"("+itemList.get(i-1).nameKana+") \\"+itemList.get(i-1).price);
			}
			pw.close();
		}catch(Exception e) {
		}finally {
			System.out.println("itemListを出力しました");
		}
	}
}

//Q1
class Item{
	String name;
	String nameKana;
	int price;

	Item(String name, String nameKana, int price) {
		super();
		this.name = name;
		this.nameKana = nameKana;
		this.price = price;
	}

	void showInfo() {
		System.out.println(name+"("+nameKana+") \\"+price);
	}


}