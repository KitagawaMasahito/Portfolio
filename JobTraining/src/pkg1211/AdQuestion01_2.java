package pkg1211;

public class AdQuestion01_2 {
	public static void main(String[] args) {
		Store[] stores = new Store[3];
		stores[0] = new ConvenienceStore("ローソン");
		stores[1] = new SuperMarket("ローゼン");
		stores[2] = new FastFoodStore("箱根そば");
		
//		stores[0].payment();
//		stores[1].payment();
//		stores[2].payment();
		
		for(Store str :stores) {
			str.payment();
		}
	}
}

abstract class Store {
	String name;
	Store(String name){
		this.name=name;
	}
	abstract void payment();
}

class ConvenienceStore extends Store{
	ConvenienceStore(String name){
		super(name);
	}
	public void payment() {
		System.out.println(name+"では、商品をカウンターに持っていき店員さんに会計をしてもらいます。");
	}
}

class SuperMarket extends Store{
	SuperMarket(String name){
		super(name);
	}
	public void payment() {
		System.out.println(name+"では、セルフレジを使い自分で会計をします");
	}
}

class FastFoodStore extends Store{
	FastFoodStore(String name){
		super(name);
	}
	public void payment() {
		System.out.println(name+"では、食券を購入し、店員さんに渡します");
	}
}