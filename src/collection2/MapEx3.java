package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String/*생략가능*/>();
		map.put(3, "해리포터");
		map.put(1, "헤르미온느");
		map.put(4, "론위즐리");
		map.put(2, "볼드모트");
		map.put(5, "지니위즐리"); 
	
//		System.out.println(map);//map은 원칙적으로 순서가 없다.
	
//		for(int i=0;i<=5;i++) {
//			System.out.println("key : "+i+"value : "+map.get(i));
//		}
		
//		Set<Integer> keyset=map.keySet(); //메소드 이용해 객체생성
//		for(Integer n:keyset )
//			System.out.println(map.get(n));
		
	//	Set<Integer> keyset=map.keySet();
	
		List<Integer> list=new ArrayList<Integer>(map.keySet());
		Collections.sort(list);
		
		for(Integer n:list )
		System.out.println(map.get(n));
		
		//---출력하는 기법의 차이 일뿐
		
	}

}
