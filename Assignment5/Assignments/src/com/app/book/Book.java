package com.app.book;

public class Book {
private String title;
private String author;
private String publisher;
private String isbn;
private int year;
private double price;
private int quantity;
public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
	super();
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.isbn = isbn;
	this.year = year;
	this.price = price;
	this.quantity = quantity;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
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
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Book() {
	super();
}
public void incQuantity(int qty) {
	setQuantity(getQuantity()+qty);
}
public void decQuantity(int qty) {
	setQuantity(getQuantity()-qty);
}
public double getInventoryValue() {
	return getPrice()*getQuantity();
}


}
//increaseQuantity(int quantity ): A method to increase the quantity of
//the book in the inventory by the specified amount.
//II. decreaseQuantity(int quantity): A method to decrease the quantity of
//the book in the inventory by the specified amount.
//III. getInventoryValue(): A method to calculate the total value of the
//inventory of the book, which is the product of the price and the
//quantity of the book.
//a. title: A string field to store the title of the book.
//b. author: A string field to store the name of the author of the book.
//c. publisher: A string field to store the name of the publisher of the book.
//d. isbn: A string field to store the ISBN number of the book.
//e. year: An integer field to store the year in which the book was published.
//f. price: A double field to store the price of the book.
//g. quantity: An integer field to store the quantity of the book in the inventory