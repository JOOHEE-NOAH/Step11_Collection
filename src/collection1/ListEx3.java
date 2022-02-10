package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		Book bk1=new Book("java","kim",200);
		Book bk2=new Book("network","lee",300);
		Book bk3=new Book("programming","park",400);
		
		List<Book> list=new ArrayList<Book>();//만들어지는 리스트의 자료형이 Book의 자료형.
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		//책이름 : java  책저자 : kim  페이지 : 2000
		System.out.println("-------향상된 for문-------");
		for(Book ob:list) {//여기서 ob를 설정해서 더이상bk를 사용할 수 없음.
			System.out.print("책이름 : "+ob.getTitle()+"\t");
			System.out.print("책저자 : "+ob.getAuthor()+"java\t");
			System.out.println("페이지 : "+ob.getPage()+"");
		}
		System.out.println("------- for문-------");
		for(int i=0;i<list.size();i++) {//여기서는 ob가 없으니 list
			System.out.print("책이름 : "+list.get(i).getTitle()+"\t");
			System.out.print("책저자 : "+list.get(i).getAuthor()+"java\t");
			System.out.println("페이지 : "+list.get(i).getPage()+"");
		}
		System.out.println("-------Iterator-------");
		Iterator<Book> iter=list.iterator();
		while(iter.hasNext()) {//여기서는 ob가 없으니 list
			Book ob=iter.next();
			System.out.print("책이름 : "+ob.getTitle()+"\t");
			System.out.print("책저자 : "+ob.getAuthor()+"java\t");
			System.out.println("페이지 : "+ob.getPage()+"");
		}
//		Iterator<Book> iter=list.iterator();
//		while(iter.hasNext()) {//여기서는 ob가 없으니 list
//			//Book ob=iter.next();
//			//next()를 사용하면 값을 추출하고 다음 포인트로 이동해서 대기. 여기선 원하는대로 출력되지않고 대각선으로 출력됨.
//			System.out.print("책이름 : "+iter.next().getTitle()+"\t");
//			System.out.print("책저자 : "+iter.next().getAuthor()+"java\t");
//			System.out.println("페이지 : "+iter.next().getPage()+"");
//		}
		
		
		
		//----------내가 한거-----------//굳이 Book에 toString을 추가해줄 필요가 없었다.
		//for문을 이용해서 출력하세요
//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));
//		//이터레이터를 이용하여 출력하세요
//		System.out.println();
//		
//		Iterator<Book> iter=list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	}

}

