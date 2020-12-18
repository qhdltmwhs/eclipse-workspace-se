package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	<<기능>>
	  회원정보출력 
	 */
	
	private int no;
	private String name;
	private String hp;
	private Book brBook;
	
	public void print( ) {
		System.out.print(this.no this.name this.hp + " ");
		this.brBook.print();
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

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public Book getBrBook() {
		return brBook;
	}

	public void setBrBook(Book brBook) {
		this.brBook = brBook;
	}
	
	
}