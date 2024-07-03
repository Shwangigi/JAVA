package ch08.extended.promotion;

public class ChildExam {
	
	public static void main(String[] args) {
		
		Child ch = new Child(); // 자식 겍체 생성
		
		ch.method1();
		ch.method2();
		ch.method3();

		Parent pr = ch;
		// Parent pr = new Child();
		
		System.out.println("========자동타입변환=======");
		pr.method1();  // 부모메서드
		pr.method2();  // 자식메서드
		// pr.method3();  부모타입으로 정하면 자식 메서드 사용안됨 
		// 사용하려면 재정의를 해야함
	}
}
