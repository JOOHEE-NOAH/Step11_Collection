package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String/*��������*/>();
		map.put(3, "�ظ�����");
		map.put(1, "�츣�̿´�");
		map.put(4, "������");
		map.put(2, "�����Ʈ");
		map.put(5, "��������"); 
	
//		System.out.println(map);//map�� ��Ģ������ ������ ����.
	
//		for(int i=0;i<=5;i++) {
//			System.out.println("key : "+i+"value : "+map.get(i));
//		}
		
//		Set<Integer> keyset=map.keySet(); //�޼ҵ� �̿��� ��ü����
//		for(Integer n:keyset )
//			System.out.println(map.get(n));
		
	//	Set<Integer> keyset=map.keySet();
	
		List<Integer> list=new ArrayList<Integer>(map.keySet());
		Collections.sort(list);
		
		for(Integer n:list )
		System.out.println(map.get(n));
		
		//---����ϴ� ����� ���� �ϻ�
		
	}

}
