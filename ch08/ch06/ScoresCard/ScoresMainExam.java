package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 멤버 변수로 main에서 사용할 배열이나 객체등을 생성
	private static Scanner input = new Scanner(System.in); // 현 class 내에 메소드에서 호출되어 사용함
	private static Student[] st = new Student[5]; // 학생 객체용으로 5칸 배열 생성
	// String[] string = new String[5];
	// 생성자 -> main일 경우 new를 사용하지 않음 (정적 static으로 사용하지 않음)

	// 메서드
	public static void main(String[] args) {
		// 주 실행 클래스로 메뉴와 클래스.메소드 호출용으로 작업
		// 객체 : 학생, 성적, 통계.....

		boolean run = true; // 반복실행 시작

		while (run) { // 종료 run = false
			System.out.println("=========학생관리프로그램v2(객체)============");
			System.out.println("1.학생관리 | 2.성적입력 | 3.통계 | 4.종료");
			System.out.println("=======================================");
			System.out.print(">>>");
			int select = input.nextInt(); // 객체 사용 전에 private static 확인 필수
			switch (select) {
			case 1:
				System.out.println("학생관리 클래스로 진입합니다.");
				boolean strun = true;

				while (strun) {
					System.out.println("1.학생등록 | 2.학생보기 | 3.학생수정 | 4.학생삭제 | 5.메인메뉴 복귀");
					System.out.print(">>>");
					int stSelect = input.nextInt();
					switch (stSelect) {
					case 1:
						System.out.println("학생등록 메뉴입니다.");
						Student regStudent = new Student();

						System.out.println("이름 : ");
						regStudent.name = input.next(); // 키보드로 받은 이름
						System.out.println("학번 : ");
						regStudent.num = input.nextInt();
						System.out.println("성별 : ");
						regStudent.sex = input.next();
						System.out.println("학년 :");
						regStudent.grade = input.nextInt();
						System.out.println("반 :  ");
						regStudent.classrom = input.nextInt();
						System.out.println("========객체 생성 -> 입력 완료=========");
						System.out.println("======배열 빈칸을 찾아 저장=======");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) { // st배열에 빈칸인지 찾음
								st[i] = regStudent; // 위에 만든 객체를 넣음
								System.out.println("저장 성공!!!");
								break; // 저장 후 종료
							} // if문 종료
						} // for문 종료 null을 찾음
						break; // 학생등록용 정지
					case 2:
						System.out.println("전체 학생 보기");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) { // st 배열 칸이 null아니면
								System.out.println("---------------------");
								System.out.println("이름 : " + st[i].name);
								System.out.println("학번 : " + st[i].num);
								System.out.println("성별 : " + st[i].sex);
							}
						} // for st배열 전체 반복
						break; // 학생보기 정지
					case 3:
						System.out.println("수정할 학생명을 입력하세요");
						System.out.println(">>>");
						String searchName = input.next();
						Student findstudent = find(searchName); // 아래 만든 메서드로 찾아옴
						if (findstudent == null) {
							System.out.println("찾은 학생이 없습니다.");
						} else { // 찾은 학생이 있으면
							System.out.println("수정할 학생 번호를 입력하세요.");
							findstudent.num = input.nextInt();
							System.out.println("학생 정보 수정 완료");
						}
						break;
					case 4:
						System.out.println("삭제할 학생명을 입력하세요.");
						System.out.print(">>>");
						String deleteName = input.next();
						Student deleteStudent = find(deleteName); // 아래 만든 메서드가 객체를 찾아옴
						if (deleteStudent == null) {
							System.out.println("삭제할 학생이 없습니다.");
						} else { // 삭제할 학생이 있으면
							for (int i = 0; i < st.length; i++) {
								System.out.println(st[i].name);
								System.out.println(deleteStudent.name);
								if (st[i].name.equals(deleteStudent.name)) {
								    st[i] = null;//삭제
									System.out.println("삭제 완료!!!!");
									break;
								}
							}
						}
						break;
					case 5:
						System.out.println("메인 메뉴로 복귀합니다.");
						strun = false;
					default:
						System.out.println("1~4까지 입력해주세요");
					}// switch 종료
				} // case while문 종료
				break;
			case 2:
				System.out.println("성적관리 클래스로 진입합니다.");
				break;
			case 3:
				System.out.println("통계관리 클래스로 진입합니다.");
				break;
			case 4:
				System.out.println("성적표 프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("1~4번 값만 입력하세요.");
				// break를 작성하면 꺼짐.
			} // switch 문 종료(주메뉴용)

		} // while문 종료

	} // main 메서드 종료

	private static Student find(String name) {
		// 이름으로 객체를 찾아오는 메서드 -> 리턴은 Student 객체
		Student student = null; // 빈객체 생성
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name; // 배열에 있는 이름을 가져옴
				if (arrayName.equals(name)) { // 배열 name과 키보드 name 비교
					student = st[i]; // 찾은 객체를 빈객체에 널음
					break;
				}

			} // if문 종료
		} // for 문 종료

		return student; // 리턴 객체
	}// find 메서드 종료

} // 클래스 종료
