package ch05;

import java.util.Scanner;

public class GradeExam {
	// 학생이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주메뉴 구현용

		Scanner mainSC = new Scanner(System.in);
		System.out.println("초기작업 : 학생수를 입력하세요");
		int count = mainSC.nextInt(); // 학생수 등록완료
		String[] name = new String[count];
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] avgScores = new double[count];
		boolean run = true;

		while (run) {
			System.out.println("========ㅡMBC 교육센터 성적 관리 프로그램========");
			System.out.println("1.학생관리 | 2.성적관리 | 3.통계 | 4.종료");
			System.out.println("=========================================");
			System.out.print(">>>");
			int select = mainSC.nextInt(); /// 1~4까지 정수입력 후에 분기

			switch (select) {
			case 1:
				System.out.println("학생관리 메소드로 진입하니다.");
				student(name);
				break;
			case 2:
				System.out.println("성적관리 메소드로 진입합니다.");
				scores(engScores, korScores);
				break;
			case 3:
				System.out.println("통계관리 메소드로 진입합니다.");
				Object total;
				avg(totalScores,avgScores,korScores,engScores,name);
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;

			} // 주 메뉴switch믄 종료
		} // 주 while문 종료
	}// 주 main 메서드 종료

	
	private static void avg(int[] totalScores, double[] avgScores, byte[] korScores, byte[] engScores ,String[] name) { //통게 , 평균 메소드
		Scanner avgSC = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("==========통계 관리=========");
			System.out.println("1.평균 2.통계 ");
			System.out.println(">>>");
			int var1 = avgSC.nextInt();
			switch(var1) {
			case 1:
				System.out.println("몇 번 학생의 평균 :");
				int sum = avgSC.nextInt();
				System.out.println("");
				break;
			case 2:
				System.out.println("번 학생의 통계 : ");
				
				break;
			}
		}
	}

	private static void scores(byte[] engScores, byte[] korScores) { // 점수 관리 메소드
		// 성적관리용 crud
		Scanner scoreSC = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("==========성적 관리========");
			System.out.println("1.등록 | 2.보기 | 3.수정 | 4.삭제");
			System.out.println(">>>");
			int scoreNum = scoreSC.nextInt();

			switch (scoreNum) {

			case 1:
				System.out.println("성적 등록을 시작합니다.");
				for (int i = 0; i < engScores.length || i < korScores.length; i++) {
					System.out.print((i + 1) + "번쨰 학생의 영어 점수는 : ");
					engScores[i] = scoreSC.nextByte();
					System.out.print((i + 1) + "번쨰 학생의 수학 점수는 : ");
					korScores[i] = scoreSC.nextByte();
				}
				System.out.println("점수입력이 완료되었습니다.");
				break;

			case 2:
				System.out.println("성적 리스트 출력");
				for (int i = 0; i < engScores.length || i < korScores.length; i++) {
					System.out.println((i + 1) + "번쨰 학생의 영어 점수 :" + engScores[i]);
					System.out.println((i + 1) + "번째 학생의 국어 점수 :" + korScores[i]);
				}
				break;

			case 3:
				System.out.println("수정할 학생의 번호를 입력하시오 :");
				int scorevar1 = scoreSC.nextInt();
				System.out.printf("학생의 현재 영어 점수 %d 수학점수 %d 입니다.", engScores[scorevar1 - 1], korScores[scorevar1 - 1]);
				System.out.println("학생의 수정 과목을 입력하시오.\n1.영어\t2.수학 :");
				int scoreC = scoreSC.nextInt();
				switch (scoreC) {
				case 1:
					System.out.print("변경할 점수를 입력하시오 : ");
					int scoreM = scoreSC.nextInt();
					engScores[scorevar1 - 1] = (byte) scoreM;
					System.out.printf("학생의 변경된 국어 점수는 " + scoreM + "점 입니다.");
					break;
				case 2:
					System.out.print("변경할 점수를 입력하시오 : ");
					int scoreA = scoreSC.nextInt();
					korScores[scorevar1 - 1] = (byte) scoreA;
					System.out.printf("학생의 변경된 국어 점수는 " + scoreA + "점 입니다.");
					break;
				default:
					System.out.println("다시 입력해주세요.");
				} // case 3안의 switch 믄 정료

			case 4:
				System.out.println("삭제할 학생의 번호르 입력해주세요 : ");
				int deleteNum = scoreSC.nextInt();
				System.out.println("삭제 할 학생의 과목을 선택해주세요.\n1. 영어 | 2.국어");
				int deleteM = scoreSC.nextInt();
				switch (deleteM) {
				case 1:
					System.out.print("영어 점수를 삭제하겠습니다.");
					engScores[deleteNum - 1] = 0;
					break;
				case 2:
					System.out.print("국어 점수를 삭제하겠습니다.");
					korScores[deleteNum - 1] = 0;
					break;
				default:
					System.out.println("다시 입력해주세요.");
				}

			}// switch 문 종료
		} // while문 종료
	}

	public static String[] student(String[] name) { // 학생관리 메소드
		// 학생관리용 crud
		Scanner studentSC = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("======학생관리메뉴===============");
			System.out.println("1.등록 | 2.보기 | 3.수정 | 4.삭제 ");
			System.out.println("==============================");
			System.out.print(">>>");
			int select = studentSC.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생등록을 시작합니다.");
				System.out.println("총 학생 수는 : " + name.length);
				for (int i = 0; i < name.length; i++) { // 학생이름 반복문
					System.out.println((i + 1) + " 번 학생 이름을 등록하세요.");
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다.
				}
				System.out.println("학생등록완료");
				break;
			case 2:
				System.out.println("학생 리스트 출력");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번 " + name[i]);
				}
				break;
			case 3:
				System.out.println("학생 이름 수정");
				System.out.println("수정할 학생 번호를 입력하세요 : ");
				int namrNum = studentSC.nextInt();
				System.out.println("수정할 학생 이름을 입력하세요 : ");
				String nameMOD = studentSC.next();
				name[namrNum - 1] = nameMOD;
				System.out.println("수정완료");
				break;
			case 4:
				System.out.println("삭제할 학생 이름 번호를 입력하세요");
				int deleteNum = studentSC.nextInt();
				name[deleteNum - 1] = null;
				break;

			default:
				System.out.println("입력값 오류 : 1 ~ 4번만 입력하세요 .");

			}// switch문 종료
		} // while문 종료
		return name;
	} // student() 종료

} // class 종료
