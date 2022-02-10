package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		Book bk1=new Book("java","kim",200);
		Book bk2=new Book("network","lee",300);
		Book bk3=new Book("programming","park",400);
		
		List<Book> list=new ArrayList<Book>();//��������� ����Ʈ�� �ڷ����� Book�� �ڷ���.
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		//å�̸� : java  å���� : kim  ������ : 2000
		System.out.println("-------���� for��-------");
		for(Book ob:list) {//���⼭ ob�� �����ؼ� ���̻�bk�� ����� �� ����.
			System.out.print("å�̸� : "+ob.getTitle()+"\t");
			System.out.print("å���� : "+ob.getAuthor()+"java\t");
			System.out.println("������ : "+ob.getPage()+"");
		}
		System.out.println("------- for��-------");
		for(int i=0;i<list.size();i++) {//���⼭�� ob�� ������ list
			System.out.print("å�̸� : "+list.get(i).getTitle()+"\t");
			System.out.print("å���� : "+list.get(i).getAuthor()+"java\t");
			System.out.println("������ : "+list.get(i).getPage()+"");
		}
		System.out.println("-------Iterator-------");
		Iterator<Book> iter=list.iterator();
		while(iter.hasNext()) {//���⼭�� ob�� ������ list
			Book ob=iter.next();
			System.out.print("å�̸� : "+ob.getTitle()+"\t");
			System.out.print("å���� : "+ob.getAuthor()+"java\t");
			System.out.println("������ : "+ob.getPage()+"");
		}
//		Iterator<Book> iter=list.iterator();
//		while(iter.hasNext()) {//���⼭�� ob�� ������ list
//			//Book ob=iter.next();
//			//next()�� ����ϸ� ���� �����ϰ� ���� ����Ʈ�� �̵��ؼ� ���. ���⼱ ���ϴ´�� ��µ����ʰ� �밢������ ��µ�.
//			System.out.print("å�̸� : "+iter.next().getTitle()+"\t");
//			System.out.print("å���� : "+iter.next().getAuthor()+"java\t");
//			System.out.println("������ : "+iter.next().getPage()+"");
//		}
		
		
		
		//----------���� �Ѱ�-----------//���� Book�� toString�� �߰����� �ʿ䰡 ������.
		//for���� �̿��ؼ� ����ϼ���
//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));
//		//���ͷ����͸� �̿��Ͽ� ����ϼ���
//		System.out.println();
//		
//		Iterator<Book> iter=list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	}

}

