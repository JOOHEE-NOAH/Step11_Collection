package Test;

import java.util.ArrayList;
import java.util.List;

//db연동, 비즈니스 로직
public class BookProc {

	public List<Book> getList() {
		
		Book bk1=new Book("java","kim",200);
		Book bk2=new Book("network","lee",300);
		Book bk3=new Book("programming","park",400);
		//list에 bk1,bk2,bk3를 추가하고 리턴하세요.
		
		List<Book> list=new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		return list;
	

}
}
