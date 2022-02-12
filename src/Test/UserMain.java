package Test;

import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id,pw;
		
		System.out.print("ID를 입력하세요 : "); id=sc.next(); //vo가 가지고 있는 변수랑 최대한 맞춰주기
		System.out.print("PW를 입력하세요 : "); pw=sc.next();
		
		UserProc up=new UserProc(); //초기화
		User entity=up.getLoginUser(id,pw);//유저프록이 가지고  있는 메소드 호출
	
		if(entity==null) {
			System.out.println("ID 또는 PW가 잘못되었거나 존재하지 않는 ID입니다");
			
		}else {System.out.println(entity.getName()+"이 입장하셨습니다"); //값의 검사
			System.out.println("현재 포인트는 "+entity.getPoint()+"점입니다.");}	
			
			BookProc book=new BookProc(); //BookProc에서 book 객체 생성
			List<Book> list=book.getList();//book 정보를  가져오는 역할
			
			System.out.println("***** Book의 정보 보기 *****");
			for(Book ob:list) {
				System.out.print("책이름 : "+ob.getTitle()+"\t");
				System.out.print("책이름 : "+ob.getAuthor()+"\t");
				System.out.println("책이름 : "+ob.getPage());
			}
	}

}

/*ID를 입력하세요 : proro
 *PW를 입력하세요 : 1234
 *
 *뽀로로님이 입장하셨습니다
 *현재 포인트는 89.97점입니다.
 *
 * ***** Book의 정보 보기 *****
 * 책이름 : java	책저자 : kimjava	페이지 : 200
책이름 : network	책저자 : leejava	페이지 : 300
책이름 : programming	책저자 : parkjava	페이지 : 400
----------------------------------------------

ID를 입력하세요 : proro
PW를 입력하세요 : 1111

ID 또는 PW가 잘못되었거나 존재하지 않는 ID입니다
 */