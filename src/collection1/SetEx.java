package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : ����, �ߺ���� x, ��������x
//�Է°��� �߿��� ������ �� 1���� �����ϴ� Ư���� ������ �÷���
public class SetEx {
		@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		Set set=new HashSet();//Set �� �ڵ��ϼ����� ����
		set.add("one");//add(Object)�� ����.�ݵ�� �����ڷ����̾����
		set.add(Double.valueOf(2));
		set.add(2);//int-->Integer�� ��ȯ �� ���� (Boxing)
		set.add(new Float(3));//������ ��.
		set.add(Integer.valueOf(4));
		set.add(2.0);
		
		System.out.println(set);
		
		if(set.contains("one"))
			System.out.println("���� ����");
		else
		System.out.println("����� ����..");
		
		System.out.println(set.size());
		
		Iterator iter=set.iterator();//���ͷ����� �޼ҵ�:set�� ���� ������ iterator  ������ Ÿ���� �ν��Ͻ� iter
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		}

}
