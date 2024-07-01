package ch04;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문은 횟수가 정해진 반복문이다.
		// for(초기값; 조건식; 증감식) {실행문 1 ; 실행문2;}실행블럭
		
		int sum = 0; //총합의 누적 계산용

		for (int i = 1; // 최기값
				i <= 100; // 조건식
				i++ // 증감식
				) {// 실행문
			sum+=i; //sum = sum + i
		} //for 문 종료   

	}

}
