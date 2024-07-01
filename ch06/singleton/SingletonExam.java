package ch06.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤 사용해보자
		
		// 생성자에 private 을 붙여서 안됨
		//Singletion obj1 = new Singletion():
	    //Singletion obj2 = new Singletion():
		
		Singletion obj3 = Singletion.getInstance(); // 객체 생성
		Singletion obj4 = Singletion.getInstance();
		
		if(obj3 == obj4) {
			System.out.println("같은 싱글톤 객체입니다.");
		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		}

	}

}
