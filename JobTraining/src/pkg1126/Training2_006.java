package pkg1126;

public class Training2_006 {
	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("桃",300);
		Fruit fruit2 = new Fruit();
		
		System.out.println(fruit1.name+"("+fruit1.price+"円)");
		System.out.println(fruit2.name+"("+fruit2.price+"円)");
	}
}
class Fruit{
	String name;
	int price;
	public Fruit() {
		name="【食べられました】";
		price=-1;
	}
	public Fruit(String name,int price) {
		this.name=name;
		this.price=price;
	}
}