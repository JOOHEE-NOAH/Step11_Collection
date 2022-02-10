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
		System.out.print("ã�� ������ �Է��ϼ��� : ");
		String title=sc.next();
	
		//������ �˻��ؼ� ����ϼ���
		//ã�� ������ �Է��ϼ��� : java
		// å�̸� : java å���� : kim ������ : 200
		
		//������ �˻��ؼ� ����ϼ���
				//ã�� ������ �Է��ϼ��� : javascript
				// ã�� ������ �����..
		
		if(map.get(title)==null) { //���� ����ϰ� �� ����
			System.out.println("ã�� ������ �����..");
		}else {
			System.out.print("å�̸� : "+map.get(title).getTitle()+"\t");
			System.out.print("å���� : "+map.get(title).getAuthor()+"\t");
			System.out.println("������ : "+map.get(title).getPage()+"");
		}
	}

}
