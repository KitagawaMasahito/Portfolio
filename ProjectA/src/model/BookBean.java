package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookBean implements Serializable {
	private int id;
	private String title;
	private String author;
	private LocalDate release;
	private String isbn;
	private int price;
	private int stock;

	public BookBean() {
		super();
	}

	public BookBean(int id, String title, String author, String release, String isbn, int price, int stock) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.setRelease(release);
		this.isbn = isbn;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getRelease() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/M/d");
		return release.format(dtf).toString();
	}

	public void setRelease(String release) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/M/d");
		this.release = LocalDate.parse(release, dtf);
	}

	@Override
	public String toString() {
		return id + "," + title + "," + author + ","
				+ release.getYear() + "/" + release.getMonthValue() + "/" + release.getDayOfMonth()
				+ "," + isbn + "," + price + "," + stock;
	}
}
