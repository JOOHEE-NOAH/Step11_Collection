package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String/*��������*/>();
		map.put(3, "�ظ�����");
		map.put(1, "�츣�̿´�");
		map.put(4, "������");
		map.put(2, "�����Ʈ");
		map.put(5, "��������"); 
	
		System.out.println(map);//map�� ��Ģ������ ������ ����.
	}

}
