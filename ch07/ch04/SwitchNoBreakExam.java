package ch04;

public class SwitchNoBreakExam {

	public static void main(String[] args) {
		// switch 문은 의도에 따라서 break를 생략할 스 있다.
		// 시간에 따라서 스케쥴 제공 프로그램
		
		int time = (int)(Math.random()* 10) + 8 ; // 8시 ~ 18시까지
		System.out.println("현재 시간 : " + time + "시");
		
		switch(time) {
		case 9 :
			System.out.println( "1교시 출석을 부르고 어제 배운 내용을 복습합니다. ");
		
		case 10:	
			System.out.println("2교시 다음 내용을 교사와 함꼐 실습을 진행합니다.");
		case 11:
			System.out.println( "3교시 다음 내용을 교사와 함꼐 실습을 진행합니다. ");
		
		case 12:
			System.out.println( "4교시 응용 실습을 진행 합니다, ");
		
		case 13:
			System.out.println(" 점식식사를 하고 오세요. ");
		
		case 14:
			System.out.println(" 5교시 오후 수업을 시작합니다. ");
		
		case 15:
			System.out.println("6교시 오후 수업 응용을 진행합니다 ");
		
		case 16:
			System.out.println("7교시 오후 응용 수업을 진행합니다. ");
		
		case 17:
			System.out.println("8교시 실습한 내용을 github에 올리세요");
		    break;
		default:
			System.out.println((time ) +"시 현재 일과시간이 아닙니다. 휴식하세요.");
		
		
		
		} // switch문 종료
	}// main 종료

}// classs 종료
