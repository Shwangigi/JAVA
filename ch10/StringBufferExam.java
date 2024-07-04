package ch10;

public class StringBufferExam {

	public static void main(String[] args) { // 구형
		// String 으로 만든 문자열은 객체로 주거나 변경이 안되고 새로운 객체로 만듬
		// StringBuffer는 문자열을 수정과 변경 할 수 있다.
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드 환경에서 안정적이지 않음
		// StringBuilder는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐
		
		StringBuffer stringBuffer = new StringBuffer(); // 16개 문자열
		StringBuffer stringBuffer1 = new StringBuffer("Hello "); // 6개 문자열
		StringBuffer stringBuffer2 = new StringBuffer("Hello "); // 50개 문자열 배열
		
		stringBuffer1.append("Programming"); // Hello Programming
		System.out.println(stringBuffer1);
		
		stringBuffer1.insert(6, "JAVA "); // 6번재 자리에 넣음
		System.out.println(stringBuffer1);
		
		stringBuffer1.replace(1, 4, "Good"); // 1번쨰에 부터 4번쪠까지
		System.out.println(stringBuffer1);
		
		stringBuffer1.delete(1, 5); // 1에서 5번쨰 자리까지 삭제
		System.out.println(stringBuffer1);
		
		stringBuffer1.reverse();
		System.out.println(stringBuffer1);
		
		System.out.println(stringBuffer1.equals(stringBuffer2));  // equals 재정의 안됨
	}

	@Override
	public boolean equals(Object obj) {  
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
