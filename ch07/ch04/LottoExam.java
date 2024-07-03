package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇 개가 맞았는지 파악
		
		Scanner input = new Scanner(System.in);
		System.out.println("로또 번호 1부터 45까지의 숫자를 입력하세요 : ");
		
		int myNum1 = input.nextInt();
		System.out.println("첫 번쨰 번호 : " + myNum1 );
		int myNum2 = input.nextInt();
		System.out.println("두 번쨰 번호 : " + myNum2 );
		int myNum3 = input.nextInt();
		System.out.println("세 번쨰 번호 : " + myNum3 );
		int myNum4 = input.nextInt();
		System.out.println("네 번쨰 번호 : " + myNum4 );
		int myNum5 = input.nextInt();
		System.out.println("다섯 번쨰 번호 : " + myNum5 );
		int myNum6 = input.nextInt();
		System.out.println("여섯 번쨰 번호 : " + myNum6 );
		
		int num1 = (int)(Math.random()*45 ) +1;
		int num2 = (int)(Math.random()*45 ) +1;
		int num3 = (int)(Math.random()*45 ) +1;
		int num4 = (int)(Math.random()*45 ) +1;
		int num5 = (int)(Math.random()*45 ) +1;
		int num6 = (int)(Math.random()*45 ) +1;
		
		int x = 0;
		
		if(myNum1 == num1 || myNum1 == num2 ||myNum1 == num3 || myNum1 == num4 || myNum1 == num5 || myNum1 == num6 ) {
			++x;
		}
		if(myNum2 == num1 || myNum2 == num2 ||myNum2 == num3 || myNum2 == num4 || myNum2 == num5 || myNum2 == num6 ) {
			++x;
		}
		if(myNum3 == num1 || myNum3 == num2 ||myNum3 == num3 || myNum3 == num4 || myNum3 == num5 || myNum3 == num6 ) {
			++x;
		}
		if(myNum4 == num1 || myNum4 == num2 ||myNum4 == num3 || myNum4 == num4 || myNum4 == num5 || myNum4 == num6 ) {
			++x;
		}
		if(myNum5 == num1 || myNum5 == num2 ||myNum5 == num3 || myNum5 == num4 || myNum5 == num5 || myNum5 == num6 ) {
			++x;
		}
		if(myNum6 == num1 || myNum6 == num2 ||myNum6 == num3 || myNum6 == num4 || myNum6 == num5 || myNum6 == num6 ) {
			++x;
		}
		
		System.out.println(" 이번 주 당첨번호 ");
		System.out.println(num1 + " "+ num2 + " " + num3 + " " + num3 + " " + num4 + " " + " "+num5 +" " + " " + num6+ " ");
		
		if(x==0) {
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}
		else if(x==1) {
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}
		else if(x==2) {
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}
		else if (x==3){
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}
		else if(x==4) {
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}
		else if(x==5) {
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}

		else if(x==6) {
			System.out.println("축하드립니다. 0개 맞으셨습나다.");
		}
		else {
		System.out.println("시스템 오류입니다.");	
		}
		
		

	}

}
