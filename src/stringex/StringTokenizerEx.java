package stringex;

import java.util.StringTokenizer;

//��ū token:���̻� ������ �� ���� �ǹ̸� ������ ����
public class StringTokenizerEx {

	public static void main(String[] args) {
		String str="�б�,��,�п�,pc��,�Ĵ�,������";
		String [] values=str.split(",");//-->�����ڸ� �ϳ��� ���.
		for(int x=0;x<values.length;x++) {
			System.out.println(values[x]);
		}
		
//-------------------1------------------------------------		
//		String str="�б�,��,�п�,,pc��#�Ĵ�$������";
//		
//		StringTokenizer tokens=new StringTokenizer(str, ",#$"); //-->������: ,#$�� �ϰڴ�.
//		//�Ľ�: �����ڷ� �̾Ƴ��°�
//		System.out.println("�Ľ��� ���ڿ��� �� : "+tokens.countTokens()); //���� ���ڿ��� ��ū�� ����
////		while(tokens.hasMoreTokens()) {//���ͷ���Ʈ�� hasNext�� ���� ���. �ѹ��� ������ ��
////			System.out.println(tokens.nextToken());
////		}
//		while(tokens.hasMoreElements()) {//���ͷ���Ʈ�� hasNext�� ���� ���. �ѹ��� ������ ��
//			System.out.println(tokens.nextElement());
//		}
	}

}
