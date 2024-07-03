package ch08.lineage;

import java.util.Scanner;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.ElfDTO;
import ch08.lineage.DTO.HumanDTO;
import ch08.lineage.DTO.KnightDTO;
import ch08.lineage.service.CharacterService;
import ch08.lineage.service.LoginService;

public class LineageExam {

	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10]; //로그인용 배열
	public static Account LoginAccount; // 로그인 성공시 객체(세션역할)
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	public static HumanDTO humanDTO = null;
	static {
		
		knightDTO.setSword("양손검");
		knightDTO.setArmor("징박힌갑옷");
		knightDTO.setShield("징박힌방패");
		knightDTO.setName("양기사");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);
		

	
		elfDTO.setBow("양손활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(333333333);

		Account account = new Account(); // 태스트용 계정생성
		account.setId("kkk");
		account.setPw("kkk");
		account.setNickName("kkk");
		accounts[0] = account; // 배열 0번에 계정객체를 연결
	} // db 대신 초기값 지정 (생성자 대신)

	public static void main(String[] args) {
		// 객체 간의 상속을 알아보자
		// 부모 객체 자식 객체에게 모든 정보를 상속한다.
		// 자식 객체는 부모 객체의 정보를 받아 사용하며 추가적인 정보를 생성하여 활용함

		System.out.println("========리니지 게임을 시작합니다.========");
		boolean run = true;
		while (run) {
			System.out.println("1.로그인 | 2.캐릭터 선택 | 3.게임실행 | 4.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("로그인을 시작합니다.");
				LoginAccount = LoginService.menu(scanner, accounts, LoginAccount);
				break;
			case 2:
				System.out.println("캐릭터 선택을합니다.");
				CharacterService.menu(scanner, LoginAccount, knightDTO, elfDTO,humanDTO);
				break;
			case 3:
				System.out.println("게임을 실행합니다");
				break;
			case 4:
				System.out.println("게임을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("1~4번 까지만 선택해주세요.");
			} // switch문 종료
		} // while문 종료
	} // main() 메서드 종료

} // 클래스 종료
