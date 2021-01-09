package chapter13.collectionframework.list;

import java.util.List;
import java.util.Vector;


class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	
}

public class VectorExample {

	public static void main(String[] args) {
		//Vector의 <E>타입 파라미터를 생략(가능하며)하면 왼쪽 List에 지정된 타입<>을 따라감 
		List<Board> list = new Vector<>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//2번 인덱스 객체(제목3) 삭제(뒤의 인덱스 1씩 앞으로 당겨짐) 
		list.remove(2);
		//3번 인덱스 객체(제목5) 삭제
		list.remove(3);
		//항상된 for문 사용 Board 타입의 board 참조변수에 List컬렉션에 저장된 각 객체 주소를 참조 이때 저장된객체수만큼 루핑(Looping)   
		for (Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
		
	}

}
