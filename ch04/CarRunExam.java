package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		// C -> 시동을 건다 (start)
		// R -> 계기판 정보 출력
		// U -> 주행
		// D -> 시동을 끈다 (end)
		Scanner input = new Scanner(System.in);
		
		boolean run = true; //시동을 켠다
		int speed = 0; //차량 속도
		final int MAXSPEED = 300; //최고 속도 대문자 (상수) -> 변경안됨 
		final int MINISPEED = 0; //최저속도 상수 -> 변경안된
			
		//MAXSPEED = 400; //The final local variable MAXSPEED cannot be assigned. It must be blank and not using a compound assignment
		// 상수라 변경이 안 됨
		
		System.out.println("람보르기니가 입고 되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도는 : " + speed + "km/h");
		
		while(run) {
			//무한 반복 중 메뉴가 출력
			System.out.println("=================");
			System.out.println(" 0. 시동종료 ");  //종료 성공
			System.out.println(" 1. 엑셀");      //30키로 가속 +300이하 최대
			System.out.println(" 2. 브레이크");
			System.out.println(" 3. 멀티미디어");
			System.out.println(" 4. 주유하기");
			System.out.println("=================");
			System.out.print("(0~4 숫자입력)>>>>>>");
			int select = input.nextInt();
			
			switch(select){
			case 0:
				System.out.println("시동을 종료합니다.");
				run = false; //while문 종료
				break;
			case 1:
				System.out.println("가속을 진행합니다..");
				speed +=30 ;
				if(speed >= MAXSPEED) { //현재 속도가 최고속도보다 크거나 같으면
					speed = MAXSPEED;
				} // 300 이상 출력 안됨
				System.out.println("현재 속도는 : " + speed + "km/h");
			    break;
			case 2:
				System.out.println("감속.");
				speed -=10;
				if(speed <= MINISPEED) { // 현재 속도가 최저속도보다 낮거나 같으면
					speed = MINISPEED;
				} // 0이하로 안 내려감
				System.out.println("현재 속도는 : " + speed + "km/h");
			    break;
			case 3:
				System.out.println("멀티미디어.");
			    break;
			case 4:
				System.out.println("주유를 시작합니다.");
			    break;			
			
			}// switch문 종료
			System.out.println("람보르기니 자동차가 사라집니다.");
		}// while문 종료
	} // main 문 종료

} // 클래스 종료
