package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("�ظ�����", 95);
		map.put("������", 83);
		map.put("������", 75);
		map.put("�巹���ڸ�����", 66);
		map.put("�����Ʈ", 83);
		map.put("�׺��չ���", 69);
		map.put("�ٷ����͹���", 73);
		map.put("�糪�����", Integer.valueOf(97));
		map.put("�ٷ����͹���", 93); //���� Ű�� �����
		map.put(null, 73);//Ű �� ����ִ� ���� ����� �͵� ����// null�� ���
		map.put("��ÿ콺������", null);
		
		System.out.println(map);
		
		//�ʿ��� ���� Ű�� ������ �˻�
		System.out.println("�׺��չ����� ������ "+map.get("�׺��չ���")+"��");
		//Ű�� null�̾ �˻�����
		System.out.println("null�� ������ "+map.get(null)+"��");
	}

}
