package ch03;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);  //키보드에 넣을 객체 생성
		System.out.println("======노땅 판별기ㅣ=======");
		System.out.print("당신의 이름을 입력하세요 : ");
		String x = in.nextLine();
		
		System.out.print("당신의 나이를 입력하세요 : ");
		int y = in.nextInt();
		
		if((y > 0) & (y<20)) {
			System.out.print("애기야 다시 돌아가 ~.~");
		}else if ((y>21) & (y>35)){
			System.out.println("마음의 준비를 시작하세요...");
		}else {
			System.out.println("=======================");
			System.out.println("!!!!!당신은 늙은이입니다!!!!");
            System.out.println("======================="); 
		}
	   

	}

}
