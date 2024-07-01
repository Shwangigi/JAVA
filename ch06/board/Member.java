package ch06.board;

import java.util.Scanner;

public class Member {// 회원에 대한 CRUD
	// 필드 -> 멤버변수
	String id;
	String pw;
	String nickName;
	String email;

	// 생성자 -> NEW로 객체 생성 시 사용 (생략시 기본 생성자가 만들어지짐)
	// Member member = new Member();

	// 메소드 -> 동작(CRUD)
	public Member register(Scanner input) {
		Member newMember = new Member();
		// 새로운 객체 멤버를 생성하여 키보드로 넣은 필드값을 삽입하고 객체로 리턴
		System.out.println("아이디를 입력하세요 : ");
		newMember.id = input.next();
		System.out.println("암호를 입력하세요 : ");
		newMember.pw = input.next();
		System.out.println("닉네임을 입력하세요 : ");
		newMember.nickName = input.next();
		System.out.println("이메일을 입력하세요 : ");
		newMember.email = input.next();
		return newMember;
	}

	public Member login(Scanner input, Member[] members) {
		// 매개값 키보등 입력 , 회원배열
		System.out.println("로그인을 시작합니다.");
		Member loginMember = new Member(); // 키보드로 입력한 객체 생성
		System.out.println("아이디를 입력하세요");
		System.out.println(">>>");
		loginMember.id = input.next(); // 키보드로 입력받은 id를 새로만든 객체에 생성
		System.out.println("암호를 입력하세요");
		System.out.println(">>>");
		loginMember.pw = input.next(); // 키보드로 입력받은 pw를 새로만든 객체에 넣음

		// 배열에 있는 객체와 새로만든 객체 비교 시작
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 베열에 빈칸이 아니면
				if (members[i].id.equals(loginMember.id) && members[i].pw.equals(loginMember.pw)) {
					// 배열에 있는 id와 키보드로 입력한 id가 같고 배열에 있는 pw와 입력한 pw와 같다.
					// loginMember 두 개의 값 member[i] 4개의 값을 가지고 있다.
					loginMember = members[i]; // 교체
				} // if문 종료 (id, pw 비교 -> 객체 치환)
			} else {
				System.out.println("회원정보가 없습니다.");
				System.out.println("id /pw를 확인하세요.");
				break;
			} // if~else문 종료
		} // for문 종료
		return loginMember;
	}

	public Member modify(Scanner input, Member[] members) {
		Member modifyMember = new Member();
		System.out.println("회원 정보를 수정할 아이디를 입력하세요.");
		modifyMember.id = input.next();
		System.out.print("비밀번호를 입력하시오");
		modifyMember.pw = input.next();
		for(int i = 0 ; i < members.length; i++) {
			if(members[i] != null) {
				if(members[i].id.equals(modifyMember.id) && members[i].pw.equals(modifyMember.pw)) {
					System.out.print("수정할 비밀번호를 입력하시오.\n >>>");
					modifyMember.pw = input.next();
					
					System.out.println("비밀번호가 수정되었습니다.");
				    modifyMember = members[i];
				}else {
					System.out.println("회원정보가 없습니다.");
					System.out.println("id/pw를 다시 입력해 주세요.");
				}
			} // if문 종료
		}// for문 종료	
		return modifyMember;
	}

	public void delete() {
		System.out.println("회원탈퇴를 시작합니다.");
	}

	public void menu(Scanner input, Member[] members) {
		// 매개값 스캐너 멤버배열
		System.out.println("--------회원 전용 메뉴입니다.-------");
		boolean run = true;
		while (run) {
			System.out.println("1.가입 | 2.로그인 | 3.수정 | 4.탈퇴 | 5.종료");
			System.out.print(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("회원가입을 진행합니다.");
				Member newMember = register(input);
				// 키보드로 입력받을 필드 완성 후 객체로 받음
				// 멤버배열 null을 찾아 삽입
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						System.out.println(newMember.nickName + "객체가 배열에 저장됨");
						break; // for문이 끝나야 됨
					}
				} // for문 종료 (null을 찾아 객체를 삽입)

				break;
			case 2:
				System.out.println("로그인을 진행합니다.");
				Member loginMember = login(input, members); // 호출 시 스케너와 배열 객체 전달
				System.out.println(loginMember.nickName + "님 환영합니다.");
				break;
			case 3:
				System.out.println("회원수정을 진행합니다.");
				modify(input, members);
				break;
			case 4:
				System.out.println("탈퇴를 진행합니다.");
				delete();
				break;
			case 5:
				System.out.println("회원전용 메뉴를 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1 ~ 5사이 값만 입력하세요");
			} // menu switch 문 종료
		}
	}// menu메소드 종료
}
