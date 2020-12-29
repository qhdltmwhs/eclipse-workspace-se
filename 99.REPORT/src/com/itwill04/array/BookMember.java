package com.itwill04.array;


public class BookMember {
	//회원번호
	private int no;
	//회원이름
	private String name;
	//전화번호
	private String phoneNumber;
	//빌린책들
	private Book[] books;
	
	public BookMember() {
		
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public static void headerPrint() {
		System.out.println("===============도서대여==============");
		System.out.printf("%s %s %s%n", "회원번호", "   회원이름   ", "     전화번호     ");
		System.out.println("-------------------------------------");
	}
	public void print() {
		System.out.printf("%8d %10s %17s%n",this.no, this.name, this.phoneNumber);
		Book.headerPrint();
		for (int i = 0; i < books.length; i++) {
			this.books[i].print();
		}
	}
	
}