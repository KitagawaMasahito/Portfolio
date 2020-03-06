package pkg1128;

public class AdQuestion02_2 {
	public static void main(String[] args) {
		Book[] book = new Book[5];
		
		book[0] = new Book("星の王子様");
		book[1] = new Book("ハリーポッターと賢者の石","J ・K・ ローリング",1997);
		book[2] = new Book("赤毛のアン","L・M・モンゴメリ");
		book[3] = new Book("ノルウェイの森","村上春樹",1987);
		book[4] = new Book("名探偵コナン");
		
		for(Book books:book) {
			books.printInfo();
		}
		System.out.println("現在、本は"+Book.getSumOfBooks()+"冊あります");
		
		book[0].setYear(1943);
		book[4].setAuthor("青山剛昌");
		book[4].setYear(1994);
		
		System.out.println("\n----------入力後----------\n");
		for(Book books:book) {
			books.printInfo();
		}
	}
}

class Book{
	static int sum = 0;
	String title;
	int yearOfIssue;
	String author;
	
	Book(String title){
		this.title=title;
		sum++;
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		sum++;
	}
	Book(String title,String author,int yearOfIssue){
		this.title=title;
		this.author=author;
		this.yearOfIssue=yearOfIssue;
		sum++;
	}

	public static int getSumOfBooks() {
		return sum;
	}

	public void printInfo() {
		System.out.println(title+" "+author+" "+yearOfIssue);
	}
	public void setYear(int year) {
		yearOfIssue=year;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
}