package ch09.interfaceExam;

public interface RemoteControl {
//     인터페이스 :  상수와 메서드로 나뉨
	// 상수 (변하지 않는 값) -> 초기값이 있다.
	// 타입 성수명 = 값;   static final 을 생략해도 상수처리 됨
	public /* static final */ int MAX_VOLUME = 10;  // 최대 볼륨
	public int MIN_VOLUME = 0;
	
	// 상수 필드 : 인터페이스는 객체 사용설명서
	// 런타임시 데이터를 저장할 수 있는 필드를 선언할 수 있다.
	
	

	
	
	// 메서드(추상, 디폴트, 정적)
	// 추상메서드(기본값) : abstract 생략가능 -> 자식에게 강제로 주입 {실행문 없다.} ; 세미콜론으로 끝내야됌
	public /* abstract */ void turnOn();    // 전원을 켠다
	public void turnOff();                  // 전원을 끔
	public void setVolume(int volume);      // 소리조절
	
	// 디폴트 : 인스턴스 메서드용 new로 객체 생성 가능
	/* public */ default void setMute(boolean mute) {  // mute = true , false
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 처리 해제");
		}
	}
	
	// 정적 : new 없이 사용되는 메서드
	public static void changeBattery() {
		System.out.println("건전지를 교환해야 합니다.");
	}
	

}
