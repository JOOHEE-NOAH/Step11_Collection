package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import collection1.Book;

public class MapEx4 {

	public static void main(String[] args) {
		Book bk1=new Book("java","kim",200);
		Book bk2=new Book("network","lee",300);
		Book bk3=new Book("programming","park",400);
		
		Map<String, Book> map=new HashMap<String, Book>();
		map.put(bk1.getTitle(),bk1);
		map.put(bk2.getTitle(),bk2);
		map.put(bk3.getTitle(),bk3);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("찾는 도서를 입력하세요 : ");
		String title=sc.next();
	
		//도서를 검색해서 출력하세요
		//찾는 도서를 입력하세요 : java
		// 책이름 : java 책저자 : kim 페이지 : 200
		
		//도서를 검색해서 출력하세요
				//찾는 도서를 입력하세요 : javascript
				// 찾는 도서가 없어요..
		
		if(map.get(title)==null) { //자주 사용하게 될 형식
			System.out.println("찾는 도서가 없어요..");
		}else {
			System.out.print("책이름 : "+map.get(title).getTitle()+"\t");
			System.out.print("책저자 : "+map.get(title).getAuthor()+"\t");
			System.out.println("페이지 : "+map.get(title).getPage()+"");
		}
	}

}
