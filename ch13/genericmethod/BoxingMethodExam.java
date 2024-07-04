package ch13.genericmethod;

public class BoxingMethodExam {

	public static void main(String[] args) {
		// 제네릭 메소드를 사용하여 강한 타입체크
		
		Box<Integer> boxI = Util.<Integer>boxing(100);
		int intValue = boxI.get();
		System.out.println(intValue);
		
		Box<String> boxS = Util./* <String> */boxing("홍길동");
		String str = boxS.get();
		System.out.println(str);
	}
}
