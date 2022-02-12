package emp;
//디폴트 생성자,인자3개 생성자, getter,setter
//vo(value object): 값을 가지고 있는 객체, entity,DTO(data transfer object), bean
//데이터를 하나로 묶어서 전송하는 목적으로 사용하는 클래스
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
