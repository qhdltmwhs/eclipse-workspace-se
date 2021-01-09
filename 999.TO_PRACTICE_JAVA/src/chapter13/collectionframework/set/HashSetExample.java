package chapter13.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		//"Java"는 한번만 저장됨
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		//향상된 for문으로도 전체 출력이 가능하다.
		for (String element : set) {
			System.out.println("for문: " + element);
		}
		
		//Iterator 인터페이스를 이용한 set컬렉센의 객체 전체를 한번씩 반복해서 가져온다.
		Iterator<String> iterator = set.iterator();
		//iterator.hasNext() 와 iterator.next() 는 둘다 메소드임
		//iterator.hasNext() 는 가져올 가져올 객체가 있다면 true 리턴 없다면 false 리턴
		//iterator.next() 는 객체하나를 가져옴
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("Iterator :" + element);
		}
		
		iterator = set.iterator();
		for (String element : set) {
			System.out.println("Iterator for문 :" + element);
		}
		
		
		set.remove("Java");
		set.remove("iBATIS");
		System.out.println("remove() 후 총 객체수: " + set.size());
		
		//모든 객체를 제거하고 비움
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		System.out.println("총 객체수: " + set.size());
	}

}
