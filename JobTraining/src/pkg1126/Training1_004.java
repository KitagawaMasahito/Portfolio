package pkg1126;

public class Training1_004 {
	public static void main(String[] args) {
		
		Product product01 = new Product();
		product01.name="アクオス";
		product01.kind="携帯電話";
		product01.price=30000;
		
		Product product02 = new Product();
		product02.name="ブラビア";
		product02.kind="TV";
		product02.price=128000;
		
		System.out.println(product01.kind+" "+product01.name+" \\"+product01.price);
		System.out.println(product02.kind+" "+product02.name+" \\"+product02.price);
	}
}

class Product{
	String name;
	String kind;
	int price;
}