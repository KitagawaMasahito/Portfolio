package pkg1126;

public class Training1_003 {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title="博士の愛した数式";
		book1.author="小川洋子";
		book1.price=600;
		
		Book book2 = new Book();
		book2.title="ドラえもん";
		book2.author="藤子不二雄";
		book2.price=470;
		
		System.out.println(book1.title+" "+book1.author+"著 \\"+book1.price);
		System.out.println(book2.title+" "+book2.author+"著 \\"+book2.price);
	}
}

class Book{
	String title;
	String author;
	int price;
}