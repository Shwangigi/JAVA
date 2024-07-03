package ch08.extended.abstractExam.overading;

public abstract class  Animal { // 조장이 만든 추상 클래스

	// 필드
	public String kind;
	
	
	// 기본생성자
	
	
	//메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상 메서드 {실행코드}; 없이 끝
}
