package ch01;

public class VariablExam {

	public static void main(String[] args) {
		// 리터럴 값을 변수로 출력하는 학습
		
		int mach;
		int distance;
		mach = 340;
		distance = mach * 60 *60 ;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m/s");
		// 정수 리터럴 계산 후 출력 -> 정수는 21억까지 계산 가능함
		
		double radius ; // double -> 실수 표현 변수(소수점계산용)
		double area ;
		radius = 10;
		area = radius * radius * 3.14 ;
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
		
		char firstName ; // 믄자표현 타입 -> "(문자열) '(문자)
		char midName ;
		char lastName ;
		firstName = '김';
		midName = '기';
		lastName = '원';
		System.out.print(firstName);
		System.out.print(midName);  // print는 뒤에 연속적으로 출력(개행 안됨)
		System.out.print(lastName);  // println은 줄바꿈 기능 추가
		
		
				
	}

}
