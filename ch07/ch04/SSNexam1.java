package ch04;

import java.util.Scanner;

public class SSNexam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); //키보드 객체
		System.out.println("주민등록번호를 입력하세요(~생략) : " );
		
		String ssn = input.next();
		
		char ssn2 = ssn.charAt(6); // 0123456번쨰 자리를 가져옴 성별 확인
		int num = Character.getNumericValue(ssn2); // char 형태의 ssn2를 int 형태로 변환
		
		if (num %2 ==0 ) {  //2를 나눠서 0이면 여자
			System.out.println("당신은 여자입니다.");
		}else if(num%2 ==1) {// 2를 나눠서 1이 남으면 남자
			System.out.println("당신은 남자입니다.");
		}else {
			System.out.println("시스템 오류입니다.");
		}
		
		int year = Integer.parseInt(ssn.substring(0,2));  //태어난 년도 추출   012중 2전인 01 자리 추출
		
		if(num ==1 || num ==2 || num == 5 || num==6) {
			System.out.println("e");
		}
		
		

	}

}
