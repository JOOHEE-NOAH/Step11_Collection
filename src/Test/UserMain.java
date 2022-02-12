package Test;

import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id,pw;
		
		System.out.print("ID�� �Է��ϼ��� : "); id=sc.next(); //vo�� ������ �ִ� ������ �ִ��� �����ֱ�
		System.out.print("PW�� �Է��ϼ��� : "); pw=sc.next();
		
		UserProc up=new UserProc(); //�ʱ�ȭ
		User entity=up.getLoginUser(id,pw);//���������� ������  �ִ� �޼ҵ� ȣ��
	
		if(entity==null) {
			System.out.println("ID �Ǵ� PW�� �߸��Ǿ��ų� �������� �ʴ� ID�Դϴ�");
			
		}else {System.out.println(entity.getName()+"�� �����ϼ̽��ϴ�"); //���� �˻�
			System.out.println("���� ����Ʈ�� "+entity.getPoint()+"���Դϴ�.");}	
			
			BookProc book=new BookProc(); //BookProc���� book ��ü ����
			List<Book> list=book.getList();//book ������  �������� ����
			
			System.out.println("***** Book�� ���� ���� *****");
			for(Book ob:list) {
				System.out.print("å�̸� : "+ob.getTitle()+"\t");
				System.out.print("å�̸� : "+ob.getAuthor()+"\t");
				System.out.println("å�̸� : "+ob.getPage());
			}
	}

}

/*ID�� �Է��ϼ��� : proro
 *PW�� �Է��ϼ��� : 1234
 *
 *�Ƿηδ��� �����ϼ̽��ϴ�
 *���� ����Ʈ�� 89.97���Դϴ�.
 *
 * ***** Book�� ���� ���� *****
 * å�̸� : java	å���� : kimjava	������ : 200
å�̸� : network	å���� : leejava	������ : 300
å�̸� : programming	å���� : parkjava	������ : 400
----------------------------------------------

ID�� �Է��ϼ��� : proro
PW�� �Է��ϼ��� : 1111

ID �Ǵ� PW�� �߸��Ǿ��ų� �������� �ʴ� ID�Դϴ�
 */