package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.ElfDTO;
import ch08.lineage.DTO.HumanDTO;
import ch08.lineage.DTO.KnightDTO;

public class CharacterService {
	// 객체를 이용하여 캐릭터 선택용 부메뉴

	public static void menu(Scanner scanner, Account LoginAccount, KnightDTO knightDTO, ElfDTO elfDTO,HumanDTO humanDTO) {
		System.out.println("1.기사 | 2.요정 | 3.마법사 | 4.도적 | 5.군주 | 6.총사 | 7.종료");
		System.out.print(">>>");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("기사를 선택하셨습니다.");
			LoginAccount.setHumanDTO(knightDTO);
			//humanDTO = knightDTO; 
			//System.out.println(LoginAccount.getNickName() + "님" + LoginAccount.getKnightDTO().getName() + "캐릭터를 선택하셨습니");
			System.out.println(LoginAccount.getNickName() + "님" + LoginAccount.getHumanDTO().getName() + "캐릭터를 선택하셨습니");
			break;
		case 2:
			System.out.println("요정를 선택하셨습니다.");
			LoginAccount.setHumanDTO(elfDTO);
			break;
		case 3:
			System.out.println("마법사를 선택하셨습니다.");
			break;
		case 4:
			System.out.println("도적을 선택하셨습니다.");
			break;
		case 5:
			System.out.println("군주를 선택하셨습니다.");
			break;
		case 6:
			System.out.println("총사를 선택하셨습니다.");
			break;
		case 7:
			System.out.println("종료를 선택하셨습니다.");
			break;
		default:
			System.out.println("1~7 사이 값만 입력하세요.");
		} // select 종료
	}// 캐릭터 부메뉴 종료
} // 클래스 종료
