package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		//DAO를 통해 VO를 가져와서 main에서 출력
		
		System.out.println("***** 모든 사원 출력하기 *****"); //1
		EmpDao dao=new EmpDao();//3 //->EmpDao에서 알맞는 메소드 만들어야함.
		//다오에 있는 메소드를 이용해서 vo값을 가지고 옴 
		//(메인에 있는 메소드를 이용하는 것이 아님-DAO의 사용 목적이 없어진다)!!!!
		
		List<EmpVo> list=dao.getEmpList();//2 //List의 자료형은 EmpVo 우변 좌변의 자료형이 일치해야함.
		for(EmpVo ob:list) { //리스트를 ob라는 변수 다시
			System.out.println("이름 :"+ob.getEname()+"\t");
			System.out.println("부서 :"+ob.getDept()+"\t");
			System.out.println("급여 :"+ob.getSalary());
		}
		
		System.out.println("***** 뽀로로 사원 출력하기 *****");
		EmpVo vo=dao.getEmp("뽀로로");//--->vo로 와있음.
		// 찾는 사람이 없어요..
		//뽀로로 개발부 1000000
		if(vo==null) {
			System.out.println("찾는 사람이 없어요..");
		}else
			System.out.println(vo.getEname()+"\t"+vo.getDept()+"\t"+vo.getSalary());

		}
	}


