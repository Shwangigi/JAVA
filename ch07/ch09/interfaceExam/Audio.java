package ch09.interfaceExam;

public class Audio implements RemoteControl{
	// 리모컨 인터페이스를 사용하는 구현체
	// 필드
	private int volume; // 숫자로 된 볼륨 값
	
	// 생성자 (기본 생성자 Television television = new Television(); )
	
	
	// 메서드
	@Override // 재정의 (위에서 만든 메서드를 동작시킨다,)
	public void turnOn() {
		// 전원을 켠다.
		System.out.println("오디오의 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// 전원을 끔
		System.out.println("오디오의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨 조절용
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오의 볼륨 : " + volume);
	}
	
}
