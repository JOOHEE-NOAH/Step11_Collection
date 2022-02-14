package collection2;
//map-> 키 :value 형식의 저장 방식을 가지는 컨테이너(dictionary,json)
	//	->인데스라는 개념이 없고 키 값을 가지고 접근
import java.util.HashMap;
import java.util.Map;

//이터레이터 기능 없음
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String/*생략가능*/>();
		map.put(101, "해리포터");//사용하고자하는 값 지정
		map.put(201, "헤르미온느");
		map.put(301, "론위즐리");
		map.put(401, "볼드모트");
		map.put(201, "지니위즐리"); //중복 키에 해당하는 값이 들어가면 덮어쓰기
		
		System.out.println("key : "+101+" value : "+map.get(101));
		System.out.println("key : "+201+" value : "+map.get(201));
		System.out.println("key : "+301+" value : "+map.get(301));
		System.out.println("key : "+401+" value : "+map.get(401));
		
//		for(int i=1;i<5;i++) {
//			System.out.println("key : "+i+" value : "+map.get(i));
//		}
		
		map.remove(401);
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

}
