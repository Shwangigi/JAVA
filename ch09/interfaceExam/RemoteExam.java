package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현클래스를 이용해본다.
		RemoteControl.changeBattery();
		
		System.out.println("리모컨 인터이스를 사용합니다.");
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		
		RemoteControl rc = null; // 인터페이스를 변수에 넣음
		
		while (condition) {
			System.out.println("-------------------------");
			System.out.println("1.tv | 2.오디오 | 3.스마트TV |4..종료");
			System.out.println("--------------------------");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television(); // RemoteControl rc = new Television();
				rc.turnOn();
				
				rc.turnOff();
				rc.setMute(true); // 음소거 ok
				rc.setMute(false); // 음소거 off
				break;
			case 2:
				rc = new Audio(); // RemoteControl rc = new Audio();
				rc.turnOn();
				rc.turnOff();
				break;
			case 3:
				rc = new SmartTelevision();
				rc.turnOn();
				Searchable se = new SmartTelevision(); // 다른 인터페이스 연동
				System.out.println("인터넷 검색을 시작합니다.");
				System.out.print(">>>");
				String sc = scanner.next();
				se.search(sc);
				rc.turnOff();
				break;
			case 4:
				System.out.println("종료합니다");
				condition = false;
			default:
				System.out.println("1~2 값만 넣어주세요.");
			}// switch 종료
//			rc.turnOn();
//			rc.turnOff();
		}

	}// main 종료
}
