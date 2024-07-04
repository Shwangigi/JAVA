package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 ArrayList, Vector, LinkedList 세 가지를 주로 사용한다.
		// list 컬렉션은 배열 대신 활용도가 높다.(길이가 자유로움)
		// list<String> 는 강한타입체크로 String만 들어간다.
		// List<String> list = new ArrayList<String>(); -> 10게가 기본값
		
		List<String> listS = new ArrayList<String>();
		listS.add("java"); // 0번 인덱스
		listS.add("oracle"); // 데이터베이스
		listS.add("jdbc"); // java + db 연동
		listS.add("HTML, CSS, JS"); // 프론트
		listS.add("jsp"); // java + db + 프론트
		listS.add("tomcat"); // 서버 프로그래밍 (servlet)
		listS.add("리눅스"); // 배포서버
		listS.add(5,"servlet"); // jsp + java
		listS.add("AWS"); // 가상 배포서버
		
		int size = listS.size();
		System.out.println("총 객체 수 : " +  size);
		System.out.println("----------------------");
	
		String skill = listS.get(2); // 2번쩨 인덱스 값을 가져와 skill 변수에 넣음
		System.out.println("2번째 인덱스 값 : " + skill);
		System.out.println("--------------------------");
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("jsp");
		
		System.out.println("----------for 전체 출력------------");
		for(int i =0; i<listS.size(); i++) {
			System.out.println(i + "번쨰 값 : " + listS.get(i));
		}
		
		System.out.println("-------for each 전체 출력(index 사용안함)---------");
		for(String str : listS) {
			System.out.println(str);
		}
	}

}
