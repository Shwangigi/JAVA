package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	// 로그인에 관한 부메뉴 용
	
	public static Account menu(Scanner scanner, Account[] accounts, Account LoginAccount) { // 부메뉴 본체
		System.out.println("1.로그인 | 2.회원가입 | 3.회원수정 | 4.빠져나가기");
		System.out.println(">>>");
		int select = scanner.nextInt();
		switch(select) {
		case 1:
			System.out.println("로그인을 시작합니다.");
			System.out.println("id : ");
			String id = scanner.next();
			System.out.println("pw : ");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw); // 새호만든 account 객체에 id,pw 삽입
			
			// 배열에 있는 값과 비교
			for(int i = 0 ; i < accounts.length; i++) {
				if(accounts[i] != null) {
					if(accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 id가 있습니다.");
						if(accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다.");
							LoginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("해당하는 pw가 없습니다.");
						}
					}else {
						System.out.println("해당하는 id가 없습니다.");
					}
				}else{
					System.out.println("해당하는 정보가 없습니다.");
					break;
				}// if문 종료 (빈객체비교)
			} // for문 종료
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.println();
			break;
		case 4:
			System.out.println();
			break;
		}// switch문 종료
		return LoginAccount;
	} // 부메뉴 본체 종료

}
