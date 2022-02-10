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
		
		//å�̸� : java  å���� : kim  ������ : 2000
		
		//for���� �̿��ؼ� ����ϼ���
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		//���ͷ����͸� �̿��Ͽ� ����ϼ���
		System.out.println();
		
		Iterator<Book> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
