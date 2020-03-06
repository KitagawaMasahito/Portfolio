package pkg1224;
import java.util.ArrayList;
import java.util.List;

public class AdQuestion03 {
	public static void main(String[] args) {

	}
}

class Goods{
	String name;
	int price;

	public Goods() {
		super();
	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price=price;
	}

	public void display() {
		System.out.println("商品名："+name+" 単価："+price);
	}
}

class Cart{
	private String name;
	private List<String> goodsList = new ArrayList<String>();

	public Cart(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	ArrayList<Goods> getGoodsList(){
//		return goodsList;
//	}

	public void add(Goods goods) {

	}

//	public int getAmount() {
//
//	}
}