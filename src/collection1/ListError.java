package collection1;

import java.util.ArrayList;
import java.util.List;

//�����Ͽ����� ������ �߻����� ������ ���� ������ ����ȯ ���� �߻�.
public class ListError {

	public static void main(String[] args) {
		List list=new ArrayList(); 
		
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(Integer.valueOf(10));
		list.add("�ܿ�");
		
		for(int i=0;i<list.size();i++) {
			String season=(String)list.get(i);//15�� ������ �����͸� ������ season�� �����ϴ� ������ �����߻�.
			System.out.println(season);
		}
			
	}

}
