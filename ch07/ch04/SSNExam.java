package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번쨰 글자를 입력받아 남여 파악용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 7번쨰 숫자 입력 : ");
		int ssn = input.nextInt();
		String sex = "남자"; 
		
		if (ssn%2 == 1 && ssn <9) {
			System.out.println("");
			}
		}

}
