package ch07.getter_setter;

public class Car {
	// 필드에 직접적인 접근을 막는다.(private)
	// 메서드를 통해 검증후에 데이터를 보낸다. (private 제외선언)

	// 필드
	private int speed; // Car 클래스 안에서만 호풀

	// 생성자

	// 메서드
	void setSpeed(int speed) { // 입력용
		// default 메서드로 같은 패키지만 사용
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	} // 세터
	
	double getspeed() { //  출력용
		return this.speed * 0.621731;
	} // 게터
}
