package collection1;

import java.util.ArrayList;
import java.util.List;

//���׸���(generics)
public class ListEx2 {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>(); //<String>:�޾ƾ��¾ִ� String�ڷ����̾���Ѵٴ� �ǹ�//object�ڷ����� ����
		
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(Integer.valueOf(10));//  �ٵ� �׷��� �̰� �ڷ����� �ȸ¾Ƽ� ������ ���� ���� <String>�� <Object>�� �ٲ��ָ� �ƹ��ų� ��밡��(�θ� Ŭ������ �ڷ����̸� �ٸ� �ڷ����� ��� �����ϴ�.)
		list.add(4.0f);
		list.add(10.0);
		
		System.out.println(list);
	}

}
