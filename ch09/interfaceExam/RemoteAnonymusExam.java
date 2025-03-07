package ch09.interfaceExam;

public class RemoteAnonymusExam {

	public static void main(String[] args) {
		// 인터페이스를 구현클래스로 사용하지 않고 인터페이스만으로 실행한다.
		
		RemoteControl remoteControl = new RemoteControl() {
			int volume ;
			@Override
			public void turnOn() {
				System.out.println("익명으로 전원을 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명으로 전원을 켭니다.");
				
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
				System.out.println("현재 익명 개체의 볼륨 : " + volume);
				
			}
		}; // 익명클래스 -> 일회용
	}
}
