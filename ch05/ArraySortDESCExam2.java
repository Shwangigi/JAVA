package ch05;

public class ArraySortDESCExam2 {

	public static void main(String[] args) {
		// 버블 정렬 오름차순으로 구련
		// 내림차순은 큰 값부터 작은 값으로 배열
		// 필수 항목 : temp 임시방

		int[] scores = new int[] { 79, 88, 91, 33, 100, 55, 95 };
		// score 변수에 int 배열 7칸 생성함며 정수가 들어있음

		System.out.println("=======배열 초기값 출력======");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("=====오름 차순 정렬 시작=======");

		for (int j = 0; j < scores.length - 1; j++) {
			for (int k = 0; k < scores.length - 1 - j; j++) {
				if (scores[k] < scores[k + 1]) { // 작은 지 비교
					int temp = scores[k]; // 큰 값이 temp에 저장
					scores[k] = scores[k + 1]; // 작은 값이 k 번째에 저장
					scores[k + 1] = temp; // temp큰 값이 k + 1번 째에 저장
				} // 옆자리랑 비교하여 큰지 비교하는 if문
				System.out.println("=======배열 정렬 중 출력======");
				for (int i = 0; i < scores.length; i++) {
					System.out.print(scores[i] + " ");
				}
				System.out.println();
				System.out.println("=========================");
				System.out.println("=====오름 차순 정렬 시작=======");
			} // 1싸이클 (0 ~ 6) 2싸이클 (0 ~ 5) 3싸이클 (0 ~ 4) ~~~~
			System.out.println("사이클 종료");
		} // j = 0 ~ 6 까지 반복(싸이클 반복용)
		
		System.out.println("=======배열 정렬 오름차순 결과값 출력======");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.println("=========================");
		System.out.println("=====오름 차순 정렬 시작=======");

	}

}
