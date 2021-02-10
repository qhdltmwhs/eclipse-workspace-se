package chapter13.collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		boolean b;
		b = set.add(new Member("홍길동", 20));
		System.out.println(b);
		b = set.add(new Member("홍길동", 20));
		System.out.println(b);
		
		System.out.println("총 객체수: " + set.size());
		
	}

}
