package ch07.getter_setter;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		// myCar.speed =10;
		// private 접근제한자의 영향으로 직접 접근 불가
		
		// 검증된 동작인 메소드로 접근하여 데이터를 삽입
		myCar.setSpeed(10);
		//System.out.println("현재 속도 : " + myCar.speed);
        System.out.println("현재 km를 마일로 변환 : " + myCar.getspeed());  
	}

}
