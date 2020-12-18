
package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 *
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	private int bookNo;
	private String bookTitle;
	private char bookType;
	private String bookDescription;
	public Book() {
		
	}
	public Book(int bookNo, String bookTitle, char bookType, String bookDescription) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookType = bookType;
		this.bookDescription = bookDescription;
	}
	public void print() {
		System.out.println(this.bookNo, this.bookTitle this.bookType this.bookDescription);
	}
	
	
	
	
	
}