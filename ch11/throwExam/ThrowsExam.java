package ch11.throwExam;

public class ThrowsExam {

	public static void main(String[] args) {
		// throw는 예외 발생시 예외처리하는 곳으로 떠넘기는 코드
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
//			e.printStackTrace();
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException { // 클래스를 찾아주는 메소드
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz + "가 존재합니다.");
	}
}
