package cho2;

public class ByteExam {

	public static void main(String[] args) {
		// byte 타입은 8bit 처리용 타입으로 -128 ~ +127까지(0포함) 범위를 처리한다.
		// 색상정보 rgb , cmk 등 처리용
		// 파일 업로드 다운로드 그림, 영상, 사운드 등 ....
		
		
		byte var1 = -128;
		byte var2 = 127;
		byte var3 = 0;
		/*
		byte var4 = -129; //범위가 넘어가면 int로 바꿔야함 
		byte var5 = 128;
		*/
		
		
		
		//127 값이 초과되는 계산을 하게 되면 -128부터 로테이션 된다.
		byte var6 = 125;
		int var7 = 125;
		for(int i = 0 ; i < 5 ; i ++) { // 0부터 5까지 1씩 증가 0 
			var6++ ;  // var 6값에 1증가
			var7++ ;  // var7값에 1증가
			System.out.println("var6 값 : " + var6 + " var7 값" + var7 );
			
		}
		}

	}
