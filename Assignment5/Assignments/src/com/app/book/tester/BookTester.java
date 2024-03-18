package com.app.book.tester;

import java.util.Scanner;

import com.app.book.Book;

public class BookTester {
	
private static  Book book=new Book();
private static Scanner sc=new Scanner(System.in);
public static void acceptBook() {
	System.out.println("enter title,  author, publisher, isbn,  year,  price,  quantity");
	book.setTitle(sc.next());
	book.setAuthor(sc.next());
	book.setPublisher(sc.next());
	book.setIsbn(sc.next());
	book.setYear(sc.nextInt());
	book.setPrice(sc.nextDouble());
	book.setQuantity(sc.nextInt());
}
public static void displayBook() {
	System.out.println("books details :"+book.getTitle()+":"+book.getAuthor()+":"+book.getIsbn()+":"+book.getQuantity()+":"+book.getInventoryValue());
}
public static void incQuantity(int qty) {
book.incQuantity(qty);
}
public static void decQuantity(int qty) {
book.decQuantity(qty);
}
public static double getInventoryValue() {
	return book.getInventoryValue();
}
public static int menu() {
	System.out.println("1:accept book\n2:display books\n3:incQty\n4:decQty\n5:getInvValue");
	return sc.nextInt();
}




}
