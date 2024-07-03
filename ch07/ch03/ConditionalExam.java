package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 3항 연산자는 if를 간단히 처리하기 위해 활용된다.
		// (조건식)  ?  참 : 거짓;
		
		
		
		int score1 = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("당신의 점수를 입력하세요 :");
		score1 = input.nextInt();
		
		char grade1  = (score1 > 90 ) ? 'A' : (score1 > 80) ? 'B' : (score1 > 70) ? 'C' : (score1 > 60) ? 'D' : 'F';
		System.out.println(score1 + " 점은 " + grade1 + "입니다.");

	}

}
