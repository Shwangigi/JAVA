package ch13.generic;

public class BoxExam {

	public static void main(String[] args) {
		// 제네릭은 <String> 문자열만 처리함
		// <Integer> 정수만 처리, <Apple>만 처리
		
		Box<String> boxS = new Box<String>();// <> 타입 체크용
		boxS.setT("문자열");
		String name = boxS.getT();
		System.out.println(name);
		
		Box<Integer> boxI = new Box<Integer>(); //Integer 정수를 문자열로 바꿈
		boxI.setT(1234);
		Integer age = boxI.getT();
		System.out.println(age);
	}
}
