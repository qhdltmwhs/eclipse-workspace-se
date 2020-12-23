package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember();
		/*
		 * 책객체들생성
		 */
		Book[] books = {
			new Book(11111, "책제목1", "문학", "좋은책1"),
			new Book(22222, "책제목2", "과학", "좋은책2"),
			new Book(33333, "책제목3", "철학", "좋은책3"),
			new Book(44444, "책제목4", "교양", "좋은책4"),
			new Book(55555, "책제목5", "소설", "좋은책5")
			};
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setNo(1);
		bookMember.setName("LEE");
		bookMember.setPhoneNumber("010-1111-1111");
		bookMember.setBooks(books);
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.headerPrint();
		bookMember.print();
		
	}
}