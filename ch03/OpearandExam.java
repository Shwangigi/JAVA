package ch03;

public class OpearandExam {

	public static void main(String[] args) {
		// 단항 연산자는 항이 1개로 처리하는 연산 기법 
		// 부호 연산자(+ , -) -> 양수 , 음수
		// 증감연산자(++, --) -> 값을 증가나 감소
		// 논리부정연산자(!) -> true -> false
		// 비트반전연산자( ~ ) -> 0 -> 1 ; 1 _> 0
		
		int x = -100;
		int result1 = +x;  // + 는 피연산자의 부호를 유지 -> -100
		int result2 = -x;  // _는 피연산자의 부호를 변경 -> +100		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("========================================");
		
		int  a = 10;
		int b = 10;
		int c = 0;
		
		a++;   // a= 10+1
		++a;   //a= 11+1
		
		System.out.println("a = " + a );
		System.out.println("=============================");
		
		b--;   // 10-1
		--b;     //9-1
		
		System.out.println(" b =  " + b );
		System.out.println("==============================");
		
		c = a++;   // c = a  ->  a= a + 1
		System.out.println(" a =  " + a );   // a = a + 1(후행)
		System.out.println(" c =  " + c );  // c = a (선행)
		System.out.println("==============================");
		
		c = ++a;  // a = a + 1 -> c = a
		System.out.println(" a =  " + a );   // a = a + 1(후행)
		System.out.println(" c =  " + c );  // c = a (선행)
		System.out.println("==============================");
		
		c = ++a + b++;
		System.out.println(" a =  " + a );   // 15  a = a + 1      선행  1
		System.out.println(" b =  " + b );   //	9  b = b + 1       후행  3
		System.out.println(" c =  " + c );  // 23  앞에 ++ 이 붙어서 b++하기전에 a++ 과 b를 더함   차행   2
		System.out.println("==============================");
		
		
		boolean play = true;
		System.out.println("실행중 : " + play );
		
		play = !play;  //!는 true 와 false가 뒤집힘
		System.out.println("실행중 : " + play );
		
		play = !play;  
		System.out.println("실행중 : " + play );
		
		
		

	}

}
