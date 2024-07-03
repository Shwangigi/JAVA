package ch09.interfaceExam.extended;

public class BirdExam {

	public static void main(String[] args) {
		// 다중 상속 인터페이스 테스트
		
		Flamingo flamingo = new Flamingo();
		flamingo.eat();
		flamingo.flying();
		flamingo.sound();
		
		System.out.println("--------------------------");
		Fly fly = flamingo; // 업캐스팅
		fly.flying();
		fly.land();
		fly.takeOff();
		
		Animal animal = flamingo; // 플라밍고 타고 애니멀로 올라감(업캐스팅)
		animal.eat();
		animal.breath();
		animal.dispose();

	}

}
