package ch09.interfaceExam;

public class Television implements RemoteControl{

	// 리모컨 인터페이스를 사용하는 구현체
	// 필드
	private int voulume; // 숫자로 된 볼륨 값
	
	// 생성자 (기본 생성자 Television television = new Television(); )
	
	
	// 메서드
	@Override // 재정의 (위에서 만든 메서드를 동작시킨다,)
	public void turnOn() {
		// 전원을 켠다.
		System.out.println("tv의 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// 전원을 끔
		System.out.println("tv의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨 조절용
		if(volume > RemoteControl.MAX_VOLUME) {
			this.voulume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.voulume = RemoteControl.MIN_VOLUME;
		}else {
			this.voulume = volume;
		}
		System.out.println("현재 tv의 볼륨 : " + volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("tv를 무음 처리합니다.");
		}else {
			System.out.println("tv를 무음 처리 해제");
		}
	}

}
