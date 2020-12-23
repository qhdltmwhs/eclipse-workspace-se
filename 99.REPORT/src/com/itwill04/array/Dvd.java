package com.itwill04.array;


public class Dvd {
	private int no;//번호
	private String title;//타이틀
	private String genre;//쟝르
	public Dvd() {
		// TODO Auto-generated constructor stub
	}
	public Dvd(int no, String title, String genre) {
	
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	public static void headerPrint() {
		System.out.println("=====================================");
		System.out.printf("%s %s %s%n", " DVD번호", "     DVD타이틀    ", "  DVD종류  ");
	}
	public void print() {
		System.out.printf("%8d %10s %13s%n",this.no, this.title, this.genre);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}