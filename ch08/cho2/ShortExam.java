package cho2;

public class ShortExam {

	public static void main(String[] args) {
		// short은 char와 같이 16bit로 처리되는데 양수 , 음수 처리가 됨 (-32,768 ~32767까지 표현)
		
		short sh1 = -32768;
		int sh2 = -32769; //빨간 밑 줄 쳐지면 타입 올리기
		short sh3 = 32767;
		int sh4 = 32768;  //Type mismatch: cannot convert from int to short (int로 비꿔라)
		

	}

}
