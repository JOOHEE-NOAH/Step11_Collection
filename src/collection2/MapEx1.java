package collection2;
//map-> Ű :value ������ ���� ����� ������ �����̳�(dictionary,json)
	//	->�ε������ ������ ���� Ű ���� ������ ����
import java.util.HashMap;
import java.util.Map;

//���ͷ����� ��� ����
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String/*��������*/>();
		map.put(101, "�ظ�����");//����ϰ����ϴ� �� ����
		map.put(201, "�츣�̿´�");
		map.put(301, "������");
		map.put(401, "�����Ʈ");
		map.put(201, "��������"); //�ߺ� Ű�� �ش��ϴ� ���� ���� �����
		
		System.out.println("key : "+101+" value : "+map.get(101));
		System.out.println("key : "+201+" value : "+map.get(201));
		System.out.println("key : "+301+" value : "+map.get(301));
		System.out.println("key : "+401+" value : "+map.get(401));
		
//		for(int i=1;i<5;i++) {
//			System.out.println("key : "+i+" value : "+map.get(i));
//		}
		
		map.remove(401);
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

}
