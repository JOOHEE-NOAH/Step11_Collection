package stringex;

public class StringEx {

	public static void main(String[] args) {
		//���ͺ� �ڷ���, ���ڿ� ������ ���뿡 ���� ���� ���� �ڷ���
	StringBuffer st=new StringBuffer();// ���ڿ� ��ü �������	
	st.append("abc");
	st.append(" 123");
	st.append(" ������");
	
	System.out.println(st);
	
	System.out.println("�뷮 : "+st.capacity()); //������ �뷮�� ����
	System.out.println("���� : "+st.length()); //���ڱ���
	
	st.delete(3, 6);// ��Ʈ�����۷� ����� ����Ʈ ���� 3~6�̸���ŭ ����
	System.out.println(st);
	System.out.println(st.reverse());//����
	st.trimToSize();//�뷮 ���� ����
	System.out.println("�뷮 : "+st.capacity());
	
	String buf="abc";//�̹��ͺ� �ڷ���, ���ڿ� ������ ���뿡 ���� ���� �Ұ� �ڷ���// ���� ����Ʈ ��� �Ұ�
	buf+=" 123";
	buf+=" ������";
	System.out.println(buf);
		
		
//-------------------2-------------------------------		
//		String str1="korea";
//		String str2=" fighting";
//		
//		String str3=str1.concat(str2);// concat  str1�� st2�� �����ϴ�.
//		String str4=str3.substring(6); //������ �ε��� ���� ���ڿ��� ������ ����
//		String str5=str3.substring(6,11); // 6�̻�11�̸� �ε������� ����
//		String str6=str3.toUpperCase();//�빮�ڷ� �ٲٱ�
//		String str7=str6.toLowerCase();//�ҹ��ڷ� �ٲٱ�
//		
//		
//		System.out.println(str3);
//		System.out.println(str1+str2);
//		System.out.println(str4);
//		System.out.println(str5);
//		System.out.println(str6);
//		System.out.println(str7);
//		System.out.println(str3.getBytes());//���ڿ��� ���� ũ�� ����
//		System.out.println(str3.lastIndexOf("t"));//ǥ���ϰ����ϴ� ���� ǥ�� t->10��° �ڸ���.4
//		System.out.println(str3.format(str7,args)); //�ʿ��� ���� �����ؼ� ���
//		
//		
		
//----------------1---------------------------------		
//		String s1="hello";
//		String s2="hello";
//		String s3=s2;
//		String s4=new String("hello");
//		String s5=new String("hello");
//		
//		
//		System.out.println(s1==s2);//true�� ��
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));// �� ����� �� ����.
//		System.out.println(s1.equals(s2));
//		System.out.println(s4.hashCode());
//		System.out.println(s5.hashCode());
//		System.out.println(s4==s5);//hello��� ���� ���Ѵ��� �ƴϰ� ����� ��ü�� ��. ��ü�� �������� ��
//		System.out.println(s4.equals(s5));//true. ��ü�� ������ ��
	}

}
