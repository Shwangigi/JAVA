package ch08.extended.calculator;

public class Computer extends Calculator {

	@Override  // 재정의
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 재정의 경과");
		return super.areaCircle(r);
	}  // 최신형 컴퓨터(자식 클래스)
	
	

}
