package emp;
//����Ʈ ������,����3�� ������, getter,setter
//vo(value object): ���� ������ �ִ� ��ü, entity,DTO(data transfer object), bean
//�����͸� �ϳ��� ��� �����ϴ� �������� ����ϴ� Ŭ����
public class EmpVo {
	private String ename;
	private String dept;
	private int salary;
	public EmpVo() {
		// TODO Auto-generated constructor stub
	}
	public EmpVo(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
