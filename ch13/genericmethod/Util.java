package ch13.genericmethod;

public class Util {
	// 제네릭 메소드 테스트용
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
