package ch12.priority;

public class PriorityExam {

	public static void main(String[] args) {
		// 스레드를 100개 만든다. 
		// 10번 스레드의 우선순위 값을 10으로 준다
		// 누가 먼저 2000000000을 반복하고 끝나는지 확인한다.
		
		for(int i=0; i<=10; i++) {
			
			Thread th = new CalcThread("스레드" + i); // 객체가 생성되며 이름삽입
			if(i != 10) {
				th.setPriority(Thread.MIN_PRIORITY);
				// Thread.MIN_PRIORITY (우선순위1)
			}else {
				th.setPriority(Thread.MAX_PRIORITY);
				// Thread.MAX_PRIORITY (우선수위 10)
			}
			th.start();
		} // 스레드 10개 및 생성 및 실행
	}
}
