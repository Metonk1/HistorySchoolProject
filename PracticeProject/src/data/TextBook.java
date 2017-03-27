package data;

import java.io.Serializable;

public class TextBook implements Serializable {
//Book title , author name,  publisher, book price, isbn, and year publish (note price should be double)
	String bookTitle;
	String author;
	String publisher;
	double price;
	String isbn;
	String year;

	public TextBook(String bookTitle, String author, String publisher, String isbn, String year, double price) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "TextBook Title: " + bookTitle + " , Author: " + author + " , Publisher: " + publisher + " , Price: "
				+ price + " , Isbn: " + isbn + " , Year: " + year + "\n";
	}



}

