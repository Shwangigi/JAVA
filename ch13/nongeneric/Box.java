package ch13.nongeneric;

public class Box /* extends Object */{
	// 필드
	private Object object; // 최상위 객체를 필드로 사용 - > 다 불러와서 굉장히 힘듬
	// 실무에서는 사용안 함 cpu 힘들어함
	
	// 기본생성자
	
	
	// 메서드
	public Object getObject() { // 게터
		return object;
	}

	public void setObject(Object object) { // 세터
		this.object = object;
	}
	
}
