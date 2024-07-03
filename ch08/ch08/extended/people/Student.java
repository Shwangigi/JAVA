package ch08.extended.people;

public class Student extends People{
	// 필드
	public int studentNo;
	
	
	// 생성자
	public Student(String name, String ssn, int studentNo) {
		//            부모          부모            자식
		super(name,ssn); 
		//this.name = name; 커스텀 생성자가 있어서 못 씀
		//this.ssn = ssn;
		
		this.studentNo = studentNo;
	}// 커스텀 생성자 Student student = new Student("김기원", "주민번호", "2406")
	
	
	// 메서드
}
