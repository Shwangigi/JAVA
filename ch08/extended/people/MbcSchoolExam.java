package ch08.extended.people;

public class MbcSchoolExam {

	public static void main(String[] args) {
		// 상속관계의 객체를 가져와 출력
		// 생성자를 활용햐본다. -> 객체 생성시 초기값을 줌
		
		// 부모 객체를 사용해보자.
		
		People people = new People("부모 ", "엄마 주민번호");
		System.out.println(people.name + people.ssn);
		
		Student student = new Student("자식 ", "자식 주민번호", 15);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Teacher teacher = new Teacher("선생님", "선생님",39);
		System.out.println(teacher.name);
		System.out.println(teacher.ssn);
		System.out.println(teacher.emplioyeeNo);
		
		
		//다향성
		
		People multi = new Student("문지현", "문지현 주번", 2);
		People multi2 = new Teacher("김기원", "김기원 주번", 22);
	}

}
