package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		Book bk1=new Book("java","kim",200);
		Book bk2=new Book("network","lee",300);
		Book bk3=new Book("programming","park",400);
		
		List<Book> list=new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		//책이름 : java  책저자 : kim  페이지 : 2000
		
		//for문을 이용해서 출력하세요
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		//이터레이터를 이용하여 출력하세요
		System.out.println();
		
		Iterator<Book> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
