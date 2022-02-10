package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//����Ʈ: ���δٸ� �ڷ����� ���ӵ� ������
//List(�������̽�): �ߺ���� o ��������o
//�迭�� ����, ���� �� �ִ� ���� ������ �ڵ����� ����
public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("one");// ���������� ��ü �ڷ��� �;���
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(Double.valueOf(4));
		list.add("second");
		for(int i=0;i<100000;i++) {
			list.add(i);
		}
	//	System.out.println(list);
		
		//-----Iterator-----
		long start=System.currentTimeMillis();//���۽���
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}	
		long end=System.currentTimeMillis();//�������
		
		
		//-----���� for��-----
		long _start=System.currentTimeMillis();
		for(Object ob:list) 
			System.out.println(ob);
		long _end=System.currentTimeMillis();
		
		//----- for��-----
		long __start=System.currentTimeMillis();
		for(int i=0;i<list.size();i++) 
			System.out.println(list.get(i));
		long __end=System.currentTimeMillis();
		
		System.out.println("====="+(end-start));//iterator���� �ӵ� ����
		System.out.println("====="+(_end-_start));//���� for���� �� �ӵ� ����
		System.out.println("====="+(__end-__start));//for�� �ӵ� ����
		//�׷����� ��Ȳ�� ���� �ӵ� ���� ���� �� �ȳ����� ����.
		
		System.out.println(list.get(2)); //get(index) �ε����� �ش��ϴ� ���� ����
		System.out.println(list.size()); //size(): list�� ������ ��������
		System.out.println(list.remove("second"));
		list.remove("second1");
		list.remove(0);
		
		System.out.println(list.remove(0)); //�ش� �ε����� ���� ����
		list.clear(); //����Ʈ�� ���� �����͸� ��� ����
		System.out.println(list);
	}

}
