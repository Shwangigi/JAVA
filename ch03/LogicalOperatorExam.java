package ch03;

import java.util.Scanner;

public class LogicalOperatorExam {

	public static void main(String[] args) {
		// 논리연산자는 곱과 합과 부정으로 이루어진다.
		// 논리 곱은 &, &&으로 비교하며 boolean 타입으로 겨로가를 산출한다.  
		
		Scanner input = new Scanner(System.in); // 키보드 입역을 받을 객체 생성
		System.out.print("정수를 입력하시면 대소문자나 숫자응 판단합니다. : ");
		
		int charCode = input.nextInt(); // 키보드로 입력받은 값을 charCode 변수에 넣음
		
		if( (charCode >=65) & (charCode<=90) ) { //charCode 값이 65 이상이고 90 이하이면
			System.out.println("입력값은 대문자입니다. : " + ((char)charCode));
			// 위 조건이 참일 떄 출력 값
		} else if( (charCode >=97 ) && (charCode <=122)    ) {  // charCode 값이 97이상이고 122이하이면 (빠름)
			System.out.println("입력값은 소문자입니다. : " + (char)charCode );
			
		}else if (  !(charCode < 48) &&! (charCode > 57)         ) { // AND
           // 48보다 작지않고 57보다 크지 않은
			System.out.println("입력값은 숫자입니다. :" + (char)charCode);
			// 48~ 57 값은 유니코드표에 숫자임을 판단
		}else {
	
		System.out.println("대소문자나 숫자가 아닙니다. ");
		}

	}

}
