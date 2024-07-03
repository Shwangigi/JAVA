package cho2;

public class BooleanExam {

	public static void main(String[] args) {
		// 1byte(8bit) 값을 갖는다 . (true)참/false(거짓) 처리용 
		// 컴퓨터는 if문을 이용해서 참과 거짓을 처리하는데 활용됨
		//"false" 는 문자열이고 false는 거짓 값을 표현
		boolean stop = false ; // stop 변스에 거짓 값을 갖는다
		boolean start = true ;// start 변수에 참 값을 갖는다
		
		if(stop) {  // if(조건) { 참처리 }  else { 거짓처리 }
			//참값
			System.out.println("정지합니다.");
			
		}else {
			//거짓값
			System.out.println("달립니다.");
		}
		
		if(start) {
			System.out.println("출발합니다."); // true
		}else {
			System.out.println("증지합니다."); // false
		}

	}

}
