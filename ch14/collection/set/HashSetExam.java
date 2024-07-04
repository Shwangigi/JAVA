package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 인터페이스에는 HashSet, LinkedHashSet, TreeSet 등이 있다.
		// Set은 중복되지 않는 인덱스가 없는 객체를 담아 넣은 구슬 주머니임
		
		Set<String> setHashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		setHashSet.add("java");
		setHashSet.add("oracle");
		setHashSet.add("jdbc");
		setHashSet.add("html");
		setHashSet.add("css");
		setHashSet.add("javaScript");
		setHashSet.add("jdbc"); // 위와 같아서 안들어감
		
		int size = setHashSet.size(); // 객체 수를 반환
		System.out.println("set 객체 수 : " + size);
		
		System.out.println("------인덱스가 없어서 for문으로 전체 출력 안됨------");
		Iterator<String> iterator = setHashSet.iterator(); // 반복자 타입에 set 타입을 연결
		
		int i = 0;
		while(iterator.hasNext()) { // .hasNext() 다음 객체가 있으면 true, 없으면 false
			String element = iterator.next(); // next() 가져온 값을 element 에 넣음
			System.out.println(i++ + "객체 : " + element);
		}
		
		setHashSet.remove("css");
		
		System.out.println("-----인덱스가 없어서 for each 문으로 출력해보자");
		for(String entity : setHashSet) {
			System.out.println(++i + "객체 : " + entity);
		}
	}
}
