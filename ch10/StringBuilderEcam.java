package ch10;

public class StringBuilderEcam {

	public static void main(String[] args) {
		// StringBilder는 신형문자열 처리 방법으로 객체의 문자열을 수정, 추가할 수 있다.
		// 동기화되지 않는다는 점을 제외하고는 StringBuilder 클래스와 메서드가 같다. (비동기화)
		// 동기화 : 여러 객체 변수를 같이 쓰는 개념
		// 구현에서 빠르기 때문에 우선적으로 활용한다.
		
		StringBuilder StringBuilder = new StringBuilder(); // 16개 문자열
		StringBuilder StringBuilder1 = new StringBuilder("Hello "); // 6개 문자열
		StringBuilder StringBuilder2 = new StringBuilder("Hello "); // 50개 문자열 배열
		
		StringBuilder1.append("Programming"); // Hello Programming
		System.out.println(StringBuilder1);
		
		StringBuilder1.insert(6, "JAVA "); // 6번재 자리에 넣음
		System.out.println(StringBuilder1);
		
		StringBuilder1.replace(1, 4, "Good"); // 1번쨰에 부터 4번쪠까지
		System.out.println(StringBuilder1);
		
		StringBuilder1.delete(1, 5); // 1에서 5번쨰 자리까지 삭제
		System.out.println(StringBuilder1);
		
		StringBuilder1.reverse();
		System.out.println(StringBuilder1);
		
		System.out.println(StringBuilder1.equals(StringBuilder2));  // equals 재정의 안됨
	}

}
