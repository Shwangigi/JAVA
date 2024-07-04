package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
		// 문자로 입력받은 숫자를 정수로 변환
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번쪠 숫자를 입력하세요");
		System.out.print(">>>");
		String data1 = scanner.next();
		
		System.out.println("두번쪠 숫자를 입력하세요");
		System.out.print(">>>");
		String data2 = scanner.next();
		
		System.out.println("두 개의 숫자를 더하겠습니다.");
		
		try {
			int value1 = Integer.parseInt(data1); // 문자로된 숫자를 정수로 변환
			int value2 = Integer.parseInt(data1); // 문자로된 숫자를 정수로 변환
			int result = value1 +value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요.");
//			e.printStackTrace();
		}
	}
}
