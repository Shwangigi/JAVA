package ch08.extended.car;

public class Car { // 부모 자동차
	
	// 필드
	public int speed;
	
	// 생성자
	public Car() { // 기본 생성자, 자동으로 생성됨
		//Car car = new Car();
	}
	
	// 메서드
	public void speedUP() {
		speed +=1;
	} // 메서드 호출 시 속도가 1씩 증가됨
	
	public final void stop() { // final 최종적
		System.out.println("자동차가 멈춤니다.");
		speed = 0;
	}
}
