package Test;
//�Է��� ���̵� ����� ���⼭ �˻��ؼ� vo��ü �������ִ� ��

//����Ͻ� ����
public class UserProc {
/*getLoginUser()�� ������ּ���
 * �Ű������� ���� id�� "pororo",pw��"1234"�� ���Ͽ�
 * ������ entity��ü�� �����(usermain����)
 * setter�� ���� id,pw, "�Ƿη�", 89.97�� �����ϼ���
 * 
 * entity�� �����ϼ���
  */	
	public User getLoginUser(String id,String pw) {
//			User entity=new User(); //--> null�� ���°� �ƴ� ��ü�� ������ ����
//		if(id.equals("pororo")&&pw.equals("1234")) {
//				 
//				entity.setId(id);
//				entity.setPw(pw);
//				entity.setName("�Ƿη�");
//				entity.setPoint(89.97);
//				
//				return entity;
//			}else {
//					System.out.println("ID �Ǵ� PW�� �߸��Ǿ��ų� �������� �ʴ� ID�Դϴ�");
//				}
//				}
//	}				
				User entity=null; //null�� ���·� ���� ����
				if(id.equals("pororo")&&pw.equals("1234")) {
					entity=new User(); //������ null�� ���°� �ƴ�
					entity.setId(id);
					entity.setPw(pw);
					entity.setName("�Ƿη�");
					entity.setPoint(89.97);
				
				}
					return entity;
				
	}
	}
