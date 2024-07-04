package ch14.collection.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 id와 pw를 이용한 로그안 성공 테스트
		
		Map<String , String> login = new Hashtable<String, String>();
		
		login.put("kkk1", "1");
		login.put("kkk2", "12");
		login.put("kkk3", "123");
		login.put("kkk4", "1234");
		login.put("kkk5", "12345"); // <id,pw>
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("id : ");
			String id = scanner.next();
			System.out.println("pw : ");
			String pw = scanner.next();
			
			if(login.containsKey(id)) { // 테이블에 k가 id 와 같은 것을 활용
				if(login.get(id).equals(pw)) { // id와 pw가 같은 것을 찾음
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} // 패스워드 일치 if문
			}else {
				System.out.println("입력된 id가 없습니다.");
			}
		}
	}

}
