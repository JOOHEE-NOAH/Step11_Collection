package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx5 {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("�ظ�����", "����4");
		map.put("������", "����1");
		map.put("������", "����3");
		map.put("�巹���ڸ�����", "����2");
		map.put("�����Ʈ", "����5");
		
	//	System.out.println(map.get("�ظ�����"));
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ��ȣ�� �Է��ϼ���(����1 ~ ����5) : ");
		String room=sc.next();
//		
//		Set<String> col=map.keySet();
//	//	System.out.println(col);
//		for(String key:col) {
//			String rroom=map.get(key);
//			
//			if(rroom.equals(room))
//				System.out.println(room+"�� ������ ���� "+key+"�Դϴ�");
//		}
		
		//���ͷ����͸� �̿��Ͽ� ����� ������ּ���.
		Set<String> col=map.keySet();//Ű �κ��� ��� �̱�
	//	System.out.println(col);
		Iterator<String> iter=col.iterator();
		while(iter.hasNext()){//iter�� ���� �Ѵٸ�,
			String key=iter.next();
			String rroom=map.get(key); //���Ϳ��� ���� �����ͷ� ����� �̰ڴ�.
			if(rroom.equals(room))
				System.out.println(room+"�� ������ ���� "+key+"�Դϴ�");
		}
		
		
		
		//		Iterator<String> col=map.keySet();
	//	System.out.println(col);
//		while(rroom.hasNext()) {
//			String key=rroom.next();
//			System.out.println(room+"�� ������ ���� "+rroom.next()+"�Դϴ�");
//		}
	}

}
