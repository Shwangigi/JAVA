package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100 까지의 합을 구하시오!!!
		
		int sum = 0;  // 합을 구하는 상자
		int i =1;  // 반복용 상자
		while(i <= 100) { // 1 ~ 100까지 반복
			
			sum += i; //sum = sum + i -> i값이 1~100까지 나오니까 sum이랑 더함
			i++; // i = i + 1 -> 1~100R까지 증가
			
			
		}
		System.out.println("1부터 100까지의 합 : " + sum);

	}

}
