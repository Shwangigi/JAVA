package ch13.multiType;

public class Product<T,M> {
	// 필드
	private T kind; // Car, Tv -> 타입(클래스)
	private M Model; // 

	
	// 생성자
	
	
	// 메서드
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return Model;
	}
	public void setModel(M model) {
		Model = model;
	}
	
}
