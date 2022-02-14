package emp;

import java.util.ArrayList;
import java.util.List;

//DAO:�����ͺ��̽����� �ڿ��� �ְ�ޱ� ���� �뵵�� ����ϴ� Ŭ����(data access object)
public class EmpDao {
	List<EmpVo> list=null;//5 //�ʱ�ȭ-> ���������� �̷��� ����. �� �׷��� �ƴ����� �� ����Ʈ�� ������ ���� �Ǵ��ϰڴٴ� �ǹ�.
public EmpDao() {//4
	list=new ArrayList<EmpVo>();//6����Ʈ�� ������ ������ �־��ִ� �� DBó�� //null�� �ƴ� ����
	list.add(new EmpVo("�Ƿη�", "���ߺ�", 1000000)); //7�׻� ���� ���� �������� �ʰ� ��ü�� �������ش�.!!!
	list.add(new EmpVo("��Ƽ", "������", 1500000));
	list.add(new EmpVo("ũ��", "�ѹ���", 2000000));
}	

	public List<EmpVo> getEmpList() {//Vo���� �Ѱ��ٰŶ� �ڷ����� EmpVo �׸��� VO�� ����Ʈ //
		return list;
	}
	public EmpVo getEmp(String ename) {  //���ο��� "�Ƿη�"�� ������ �ް����ϴ� ������ String
		EmpVo vo=null;
		for(EmpVo ob:list) {
			if(ob.getEname().equals(ename))//ob, �� ����Ʈ�� getEname�� ename�� ���ٸ�,
				vo=ob;
		}
		return vo;
	}
}