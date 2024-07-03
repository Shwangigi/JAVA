package ch08.extended.people;

public class Teacher extends People {
	// 필드
	public int emplioyeeNo;
	
	
	// 생성자
	public Teacher(String name, String ssn, int emplioyeeNo) {
		super(name,ssn);
		this.emplioyeeNo = emplioyeeNo;
	}
	
	// 메서드

}
