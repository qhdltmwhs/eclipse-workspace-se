package com.itwill04.array;


public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd[] dvds;//빌린dvd들[최대3개]
	public DvdMember() {
		
	}
	public static void headerPrint() {
		System.out.println("=====================================");
		System.out.printf("%s %s %s%n", "회원번호", "   회원이름   ", "     전화번호     ");
			
	}
	public void print() {
		System.out.printf("%8d %10s %17s%n",this.no, this.name, this.tel);
		Dvd.headerPrint();
		for (int i = 0; i < 3; i++) {
			this.dvds[i].print();
		}
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Dvd[] getDvds() {
		return dvds;
	}
	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}
}