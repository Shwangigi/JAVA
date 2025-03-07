package cho2;

public class CastingExam {

	public static void main(String[] args) {
		// Casting 은 강제 타입 변환으로 큰타입을 작은 타입 으로 강제 주입할 때 사용
		//단  손실이 발생 -> 2진법에 영향
		//int 변수명 = (int) douvle값;  강제타입 casting
		
		int intValue = 12345678;
		byte byteValue = (byte) intValue; //Type mismatch: cannot convert from int to byte
		
		System.out.println("int 값 : " + intValue);
		System.out.println("byte 값 :" + byteValue);
		
		System.out.println("==============자동 타입 변환========");
		
		int intValue1 = 10;
		double doubleValue1 = 5.5;
		double result1 = intValue1  + doubleValue1;
		System.out.println("int 10 + double 5.5 = " + result1);
		
		System.out.println("========= 정수로 결과를 봄 ====");
		int result2 = (int) (intValue1  + doubleValue1);  //강제 타팁변환
		System.out.println("int 10 + double 5.5 = " + result2);
		
		

	}

}
