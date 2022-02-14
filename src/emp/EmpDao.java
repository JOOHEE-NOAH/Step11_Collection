package emp;

import java.util.ArrayList;
import java.util.List;

//DAO:데이터베이스에서 자원을 주고받기 위한 용도로 사용하는 클래스(data access object)
public class EmpDao {
	List<EmpVo> list=null;//5 //초기화-> 습관적으로 이렇게 하자. 꼭 그런건 아니지만 이 리스트를 가지고 무언갈 판단하겠다는 의미.
public EmpDao() {//4
	list=new ArrayList<EmpVo>();//6리스트에 임의의 데이터 넣어주는 것 DB처럼 //null이 아닌 상태
	list.add(new EmpVo("뽀로로", "개발부", 1000000)); //7항상 직접 값을 대입하지 않고 객체로 대입해준다.!!!
	list.add(new EmpVo("패티", "영업부", 1500000));
	list.add(new EmpVo("크롱", "총무부", 2000000));
}	

	public List<EmpVo> getEmpList() {//Vo값을 넘겨줄거라 자료형은 EmpVo 그리고 VO의 리스트 //
		return list;
	}
	public EmpVo getEmp(String ename) {  //메인에서 "뽀로로"의 정보를 받고자하니 변수는 String
		EmpVo vo=null;
		for(EmpVo ob:list) {
			if(ob.getEname().equals(ename))//ob, 즉 리스트의 getEname이 ename과 같다면,
				vo=ob;
		}
		return vo;
	}
}