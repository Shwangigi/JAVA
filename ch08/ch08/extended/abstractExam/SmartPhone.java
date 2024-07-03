package ch08.extended.abstractExam;

public class SmartPhone extends Phone { // 구현메서드 (추상클래스를 상속받음)
	

	public SmartPhone(String owner) {
		super(owner);
		// 추상메서드에서 만든 생성자를 강제로 주입받음.
	} 
	
	// 메서드
	public void internetSearch() {
		System.out.println("인터멧 검색을 합니다.");
	}

}
