package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		//DAO�� ���� VO�� �����ͼ� main���� ���
		
		System.out.println("***** ��� ��� ����ϱ� *****"); //1
		EmpDao dao=new EmpDao();//3 //->EmpDao���� �˸´� �޼ҵ� ��������.
		//�ٿ��� �ִ� �޼ҵ带 �̿��ؼ� vo���� ������ �� 
		//(���ο� �ִ� �޼ҵ带 �̿��ϴ� ���� �ƴ�-DAO�� ��� ������ ��������)!!!!
		
		List<EmpVo> list=dao.getEmpList();//2 //List�� �ڷ����� EmpVo �캯 �º��� �ڷ����� ��ġ�ؾ���.
		for(EmpVo ob:list) { //����Ʈ�� ob��� ���� �ٽ�
			System.out.println("�̸� :"+ob.getEname()+"\t");
			System.out.println("�μ� :"+ob.getDept()+"\t");
			System.out.println("�޿� :"+ob.getSalary());
		}
		
		System.out.println("***** �Ƿη� ��� ����ϱ� *****");
		EmpVo vo=dao.getEmp("�Ƿη�");//--->vo�� ������.
		// ã�� ����� �����..
		//�Ƿη� ���ߺ� 1000000
		if(vo==null) {
			System.out.println("ã�� ����� �����..");
		}else
			System.out.println(vo.getEname()+"\t"+vo.getDept()+"\t"+vo.getSalary());

		}
	}


