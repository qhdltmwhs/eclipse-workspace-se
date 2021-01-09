/*
 * 		구분		순차적으로 추가/삭제	중간에 추가/삭제	검색
 * 		ArrayList		빠르다					느리다?			빠르다	
 * 		LinkedList		느리다					빠르다?			느리다
 */
package chapter13.collectionframework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<20; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");
		for (String string : list1) {
			System.out.println(string);
		}
		
		startTime = System.nanoTime();
		for(int i=0; i<20; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
